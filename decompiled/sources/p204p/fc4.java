package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class fc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f67994a;

    /* JADX INFO: renamed from: b */
    public final boolean f67995b;

    /* JADX INFO: renamed from: c */
    public final boolean f67996c;

    /* JADX INFO: renamed from: d */
    public final boolean f67997d;

    /* JADX INFO: renamed from: e */
    public final bji f67998e;

    /* JADX INFO: renamed from: f */
    public final wg61 f67999f = new wg61(new sb4(this, 11));

    public fc4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f67994a = z;
        this.f67995b = z2;
        this.f67996c = z3;
        this.f67997d = z4;
        this.f67998e = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m41285a() {
        fc4 fc4Var = (fc4) this.f67999f.getValue();
        return fc4Var != null ? fc4Var.m41285a() : this.f67994a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m41286b() {
        fc4 fc4Var = (fc4) this.f67999f.getValue();
        return fc4Var != null ? fc4Var.m41286b() : this.f67995b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m41287c() {
        fc4 fc4Var = (fc4) this.f67999f.getValue();
        return fc4Var != null ? fc4Var.m41287c() : this.f67996c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m41288d() {
        fc4 fc4Var = (fc4) this.f67999f.getValue();
        return fc4Var != null ? fc4Var.m41288d() : this.f67997d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("detect_autoplay", "android-libs-nowplaying-free-tier-mode", m41285a()), new k8a("enable_playback_control_switcher", "android-libs-nowplaying-free-tier-mode", m41286b()), new k8a("smart_shuffle_icon_enabled", "android-libs-nowplaying-free-tier-mode", m41287c()), new k8a("use_element_api", "android-libs-nowplaying-free-tier-mode", m41288d()));
    }
}
