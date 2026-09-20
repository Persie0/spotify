package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/ArchivePartyMessageJsonAdapter;", "Lp/hk60;", "Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/ArchivePartyMessage;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ArchivePartyMessageJsonAdapter extends hk60<ArchivePartyMessage> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f5146a = xl60.C2578b.m91389a(new String[0]);

    public ArchivePartyMessageJsonAdapter(p0i0 p0i0Var) {
    }

    @Override // p204p.hk60
    public final ArchivePartyMessage fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        while (xl60Var.mo51079i()) {
            if (xl60Var.mo51071K(this.f5146a) == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        return new ArchivePartyMessage();
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, ArchivePartyMessage archivePartyMessage) {
        if (archivePartyMessage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(41, "GeneratedJsonAdapter(ArchivePartyMessage)");
    }
}
