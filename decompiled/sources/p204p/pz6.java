package p204p;

import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pz6 implements hz6 {

    /* JADX INFO: renamed from: a */
    public final AudioManager f183611a;

    /* JADX INFO: renamed from: b */
    public final jz6 f183612b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f183613c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f183614d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f183615e = new ConcurrentHashMap();

    public pz6(AudioManager audioManager, jz6 jz6Var) {
        this.f183611a = audioManager;
        this.f183612b = jz6Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m71690a(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = (AudioManager.OnAudioFocusChangeListener) this.f183614d.remove(new lz6(i, onAudioFocusChangeListener));
        if (onAudioFocusChangeListener2 == null) {
            return 0;
        }
        this.f183612b.m54839b(i);
        return this.f183611a.abandonAudioFocus(onAudioFocusChangeListener2);
    }

    /* JADX INFO: renamed from: b */
    public final int m71691b(dy0 dy0Var, int i) {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = (AudioManager.OnAudioFocusChangeListener) this.f183614d.remove(new lz6(i, dy0Var.m37305r()));
        if (onAudioFocusChangeListener == null) {
            return 0;
        }
        AudioFocusRequest audioFocusRequestM43155k = fz6.m43155k(dy0Var, onAudioFocusChangeListener);
        this.f183612b.m54839b(i);
        return this.f183611a.abandonAudioFocusRequest(audioFocusRequestM43155k);
    }

    /* JADX INFO: renamed from: c */
    public final jw6[] m71692c() {
        AudioDeviceInfo[] devices = this.f183611a.getDevices(2);
        ArrayList arrayList = new ArrayList(devices.length);
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            wj50.m88279p(audioDeviceInfo);
            arrayList.add(new kw6(audioDeviceInfo));
        }
        return (jw6[]) arrayList.toArray(new jw6[0]);
    }

    /* JADX INFO: renamed from: d */
    public final int m71693d() {
        try {
            return this.f183611a.getStreamVolume(3);
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m71694e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT < 26) {
            int iRequestAudioFocus = this.f183611a.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) this.f183614d.computeIfAbsent(new lz6(i3, onAudioFocusChangeListener), new nz6(this, i3, onAudioFocusChangeListener)), i, i2);
            this.f183612b.m54841d(iRequestAudioFocus, i, i2, i3);
            return iRequestAudioFocus;
        }
        fw40 fw40Var = new fw40(27);
        fw40Var.m42919F();
        fw40Var.m42918E();
        pgq0 pgq0VarM42921g = fw40Var.m42921g();
        zk1 zk1Var = new zk1(i2, 4);
        zk1Var.m96267K(pgq0VarM42921g);
        if (onAudioFocusChangeListener != null) {
            zk1Var.m96270N(onAudioFocusChangeListener);
        }
        return m71695f(zk1Var.m96281g(), i3);
    }

    /* JADX INFO: renamed from: f */
    public final int m71695f(dy0 dy0Var, int i) {
        int iRequestAudioFocus;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListenerM37305r = dy0Var.m37305r();
        try {
            iRequestAudioFocus = this.f183611a.requestAudioFocus(fz6.m43155k(dy0Var, (AudioManager.OnAudioFocusChangeListener) this.f183614d.computeIfAbsent(new lz6(i, onAudioFocusChangeListenerM37305r), new nz6(this, i, onAudioFocusChangeListenerM37305r))));
        } catch (NullPointerException unused) {
            iRequestAudioFocus = 0;
        }
        this.f183612b.m54842e(iRequestAudioFocus, dy0Var, i);
        return iRequestAudioFocus;
    }

    /* JADX INFO: renamed from: g */
    public final void m71696g(int i) {
        this.f183611a.setMode(i);
    }
}
