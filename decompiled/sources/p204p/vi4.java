package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class vi4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f241610a;

    /* JADX INFO: renamed from: b */
    public final boolean f241611b;

    /* JADX INFO: renamed from: c */
    public final boolean f241612c;

    /* JADX INFO: renamed from: d */
    public final bji f241613d;

    /* JADX INFO: renamed from: e */
    public final wg61 f241614e = new wg61(new si4(this, 2));

    public vi4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f241610a = z;
        this.f241611b = z2;
        this.f241612c = z3;
        this.f241613d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m85583a() {
        vi4 vi4Var = (vi4) this.f241614e.getValue();
        return vi4Var != null ? vi4Var.m85583a() : this.f241610a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m85584b() {
        vi4 vi4Var = (vi4) this.f241614e.getValue();
        return vi4Var != null ? vi4Var.m85584b() : this.f241611b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m85585c() {
        vi4 vi4Var = (vi4) this.f241614e.getValue();
        return vi4Var != null ? vi4Var.m85585c() : this.f241612c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("destroy_page_lifecycle_on_mode_switch_enabled", "android-nowplaying-core", m85583a()), new k8a("mode_switch_without_fade_enabled", "android-nowplaying-core", m85584b()), new k8a("slower_progress_updates_enabled", "android-nowplaying-core", m85585c()));
    }
}
