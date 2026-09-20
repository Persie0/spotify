package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s84 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f206537a;

    /* JADX INFO: renamed from: b */
    public final boolean f206538b;

    /* JADX INFO: renamed from: c */
    public final bji f206539c;

    /* JADX INFO: renamed from: d */
    public final wg61 f206540d = new wg61(new f30(this, 13));

    public s84(boolean z, boolean z2, bji bjiVar) {
        this.f206537a = z;
        this.f206538b = z2;
        this.f206539c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m77459a() {
        s84 s84Var = (s84) this.f206540d.getValue();
        return s84Var != null ? s84Var.m77459a() : this.f206537a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m77460b() {
        s84 s84Var = (s84) this.f206540d.getValue();
        return s84Var != null ? s84Var.m77460b() : this.f206538b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("dry_run_enabled", "android-gating", m77459a()), new k8a("kill_switch_enabled", "android-gating", m77460b()));
    }
}
