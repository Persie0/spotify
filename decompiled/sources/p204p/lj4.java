package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class lj4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f133946a;

    /* JADX INFO: renamed from: b */
    public final boolean f133947b;

    /* JADX INFO: renamed from: c */
    public final boolean f133948c;

    /* JADX INFO: renamed from: d */
    public final boolean f133949d;

    /* JADX INFO: renamed from: e */
    public final boolean f133950e;

    /* JADX INFO: renamed from: f */
    public final boolean f133951f;

    /* JADX INFO: renamed from: g */
    public final bji f133952g;

    /* JADX INFO: renamed from: h */
    public final wg61 f133953h = new wg61(new si4(this, 17));

    public lj4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, bji bjiVar) {
        this.f133946a = z;
        this.f133947b = z2;
        this.f133948c = z3;
        this.f133949d = z4;
        this.f133950e = z5;
        this.f133951f = z6;
        this.f133952g = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final lj4 m59107a() {
        return (lj4) this.f133953h.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m59108b() {
        lj4 lj4VarM59107a = m59107a();
        return lj4VarM59107a != null ? lj4VarM59107a.m59108b() : this.f133946a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m59109c() {
        lj4 lj4VarM59107a = m59107a();
        return lj4VarM59107a != null ? lj4VarM59107a.m59109c() : this.f133947b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m59110d() {
        lj4 lj4VarM59107a = m59107a();
        return lj4VarM59107a != null ? lj4VarM59107a.m59110d() : this.f133948c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m59111e() {
        lj4 lj4VarM59107a = m59107a();
        return lj4VarM59107a != null ? lj4VarM59107a.m59111e() : this.f133949d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m59112f() {
        lj4 lj4VarM59107a = m59107a();
        return lj4VarM59107a != null ? lj4VarM59107a.m59112f() : this.f133950e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m59113g() {
        lj4 lj4VarM59107a = m59107a();
        return lj4VarM59107a != null ? lj4VarM59107a.m59113g() : this.f133951f;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_audio_language_setting", "android-nowplaying-video-settings", m59108b()), new k8a("enable_larger_npb_setting", "android-nowplaying-video-settings", m59109c()), new k8a("enable_pip_setting", "android-nowplaying-video-settings", m59110d()), new k8a("enable_playback_settings", "android-nowplaying-video-settings", m59111e()), new k8a("enable_subtitles_setting", "android-nowplaying-video-settings", m59112f()), new k8a("enable_video_quality_setting", "android-nowplaying-video-settings", m59113g()));
    }
}
