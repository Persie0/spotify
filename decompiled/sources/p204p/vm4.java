package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class vm4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f242693a;

    /* JADX INFO: renamed from: b */
    public final boolean f242694b;

    /* JADX INFO: renamed from: c */
    public final bji f242695c;

    /* JADX INFO: renamed from: d */
    public final wg61 f242696d;

    public vm4(boolean z, boolean z2, bji bjiVar) {
        this.f242693a = z;
        this.f242694b = z2;
        this.f242695c = bjiVar;
        this.f242696d = new wg61(new jk4(this, 25));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m85984a() {
        vm4 vm4Var = (vm4) this.f242696d.getValue();
        return vm4Var != null ? vm4Var.m85984a() : this.f242693a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m85985b() {
        vm4 vm4Var = (vm4) this.f242696d.getValue();
        return vm4Var != null ? vm4Var.m85985b() : this.f242694b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_permission_dialog_on_presave", "android-prerelease-card-now-playing-widget", m85984a()), new k8a("enable_prerelease_countdown_widget", "android-prerelease-card-now-playing-widget", m85985b()));
    }

    public vm4(bji bjiVar) {
        this(false, true, bjiVar);
    }
}
