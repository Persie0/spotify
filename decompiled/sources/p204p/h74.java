package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f88336a;

    /* JADX INFO: renamed from: b */
    public final boolean f88337b;

    /* JADX INFO: renamed from: c */
    public final bji f88338c;

    /* JADX INFO: renamed from: d */
    public final wg61 f88339d = new wg61(new f74(this, 1));

    public h74(boolean z, boolean z2, bji bjiVar) {
        this.f88336a = z;
        this.f88337b = z2;
        this.f88338c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m46754a() {
        h74 h74Var = (h74) this.f88339d.getValue();
        return h74Var != null ? h74Var.m46754a() : this.f88336a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m46755b() {
        h74 h74Var = (h74) this.f88339d.getValue();
        return h74Var != null ? h74Var.m46755b() : this.f88337b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_enhanced_share_card", "android-feature-stickers", m46754a()), new k8a("local_search_enabled", "android-feature-stickers", m46755b()));
    }
}
