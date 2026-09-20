package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f161274a;

    /* JADX INFO: renamed from: b */
    public final boolean f161275b;

    /* JADX INFO: renamed from: c */
    public final boolean f161276c;

    /* JADX INFO: renamed from: d */
    public final bji f161277d;

    /* JADX INFO: renamed from: e */
    public final wg61 f161278e = new wg61(new u14(this, 20));

    public o34(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f161274a = z;
        this.f161275b = z2;
        this.f161276c = z3;
        this.f161277d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m66178a() {
        o34 o34Var = (o34) this.f161278e.getValue();
        return o34Var != null ? o34Var.m66178a() : this.f161274a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m66179b() {
        o34 o34Var = (o34) this.f161278e.getValue();
        return o34Var != null ? o34Var.m66179b() : this.f161275b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m66180c() {
        o34 o34Var = (o34) this.f161278e.getValue();
        return o34Var != null ? o34Var.m66180c() : this.f161276c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("show_locked_audiobook_strings_enabled", "android-external-integration-loaders", m66178a()), new k8a("use_episode_access_for_paywall_filtering", "android-external-integration-loaders", m66179b()), new k8a("use_kotlin_list_loader", "android-external-integration-loaders", m66180c()));
    }
}
