/*
 * Spotify timed Skip Ad auto-fire via Frida (root only, no LSPosed needed).
 *
 * Usage (rooted device, Spotify 9.1.84-2205; re-resolve names per release,
 * see ../analysis/adblock-inprocess-hook-spec.md):
 *   adb push frida-server /data/local/tmp/ && adb shell "su -c 'chmod 755 /data/local/tmp/frida-server'"
 *   adb shell "su -c '/data/local/tmp/frida-server &'"
 *   frida -U -f com.spotify.music -l skip.js --no-pause
 * Logs: look for [spotify-autoskip].
 *
 * Logic mirrors ../spotify-autoskip (LSPosed variant):
 * capture p8p0 (hrw instance) -> watch PlayerState.signals() for "skip-ad"
 * -> fire SignalCommand("skip-ad") once per episode, only during real ads.
 */
'use strict';

var fired = false;
var inFlight = false;
var playerCommands = null;
var loggedTrackShape = false;

function log(s) { console.log('[spotify-autoskip] ' + s); }

    // xul0 optional unwrap: c() == isPresent, b() == get in 9.1.84-2205
    // (decompiled p.xul0). Try obfuscated names first, then kept names.
    function zeroArg(obj, names) {
        for (var i = 0; i < names.length; i++) {
            try { return { ok: true, value: obj[names[i]]() }; }
            catch (e) { /* try next */ }
        }
        return { ok: false };
    }
    function isAd(playerState) {
        try {
            var track = playerState.track();
            if (track === null) return false;
        if (!loggedTrackShape) {
            loggedTrackShape = true;
            log('track class: ' + track.getClass().getName());
        }
        var t = track;
            try {
                var present = zeroArg(track, ['c', 'isPresent']);
                if (!present.ok) return false;
                if (present.value === false) return false;
                var got = zeroArg(track, ['b', 'get']);
                if (!got.ok || got.value === null) return false;
                track = got.value;
            } catch (e) {
                return false;
            }
        var metadata = t.metadata();
        if (metadata === null) return false;
        var v = null;
        try { v = metadata.get('is_advertisement'); }
        catch (e) { return false; }
        return v !== null && String(v) === 'true';
    } catch (e) {
        return false;
    }
}

function fire() {
    if (playerCommands === null || inFlight) return;
    inFlight = true;
    try {
        var SC = Java.use('com.spotify.player.model.command.SignalCommand');
        var cmd = SC.create('skip-ad');
        var B8p0 = Java.use('p.b8p0');
        var h8p0 = null;
        var ctors = B8p0.class.getDeclaredConstructors();
        for (var i = 0; i < ctors.length; i++) {
            if (ctors[i].getParameterTypes().length === 1) {
                h8p0 = B8p0.$new(cmd);
                break;
            }
        }
        if (h8p0 === null) { log('no 1-arg b8p0 ctor'); return; }
        playerCommands.mo48412a(h8p0).ignoreElement().subscribe();
        fired = true;
        log('fired skip-ad (genuine Signal path)');
    } catch (e) {
        log('fire failed: ' + e);
    } finally {
        inFlight = false;
    }
}

Java.perform(function () {
    // H1: capture p8p0 — hook every hrw constructor overload (first wins).
    // H1b below upgrades to the decorated xx41 when present.
    try {
        var Hrw = Java.use('p.hrw');
        Hrw.$init.overloads.forEach(function (ctor) {
            ctor.implementation = function () {
                var r = ctor.apply(this, arguments);
                if (playerCommands === null) playerCommands = this;
                return r;
            };
        });
        log('hrw capture installed');
    } catch (e) {
        log('hrw hook failed: ' + e);
    }

    // H1b: prefer decorated p8p0 (p.xx41 wraps hrw + yf41 side effect).
    try {
        var Xx41 = Java.use('p.xx41');
        Xx41.$init.overloads.forEach(function (ctor) {
            ctor.implementation = function () {
                var r = ctor.apply(this, arguments);
                playerCommands = this;
                return r;
            };
        });
        log('xx41 capture installed');
    } catch (e) {
        log('xx41 hook failed (non-fatal): ' + e);
    }

    // H2: readiness observer.
    try {
        var PS = Java.use('com.spotify.player.model.AutoValue_PlayerState');
        PS.signals.implementation = function () {
            var list = this.signals();
            var ready = false;
            try { ready = list !== null && list.contains('skip-ad'); } catch (e) {}
            if (!ready) {
                fired = false;
                return list;
            }
            if (!fired && isAd(this)) fire();
            return list;
        };
        log('signals observer installed');
    } catch (e) {
        log('signals hook failed: ' + e);
    }
});
