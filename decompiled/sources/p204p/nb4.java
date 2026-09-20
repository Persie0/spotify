package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class nb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f152179a;

    /* JADX INFO: renamed from: b */
    public final boolean f152180b;

    /* JADX INFO: renamed from: c */
    public final boolean f152181c;

    /* JADX INFO: renamed from: d */
    public final boolean f152182d;

    /* JADX INFO: renamed from: e */
    public final bji f152183e;

    /* JADX INFO: renamed from: f */
    public final wg61 f152184f = new wg61(new ga4(this, 25));

    public nb4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f152179a = z;
        this.f152180b = z2;
        this.f152181c = z3;
        this.f152182d = z4;
        this.f152183e = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m64061a() {
        nb4 nb4Var = (nb4) this.f152184f.getValue();
        return nb4Var != null ? nb4Var.m64061a() : this.f152179a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m64062b() {
        nb4 nb4Var = (nb4) this.f152184f.getValue();
        return nb4Var != null ? nb4Var.m64062b() : this.f152180b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m64063c() {
        nb4 nb4Var = (nb4) this.f152184f.getValue();
        return nb4Var != null ? nb4Var.m64063c() : this.f152181c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m64064d() {
        nb4 nb4Var = (nb4) this.f152184f.getValue();
        return nb4Var != null ? nb4Var.m64064d() : this.f152182d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_hazmat", "android-libs-newplaying-default-mode", m64061a()), new k8a("enable_music_videos_track_reporting", "android-libs-newplaying-default-mode", m64062b()), new k8a("enable_playback_control_switcher", "android-libs-newplaying-default-mode", m64063c()), new k8a("use_element_api", "android-libs-newplaying-default-mode", m64064d()));
    }
}
