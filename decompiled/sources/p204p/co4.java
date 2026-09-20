package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class co4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f40177a;

    /* JADX INFO: renamed from: b */
    public final boolean f40178b;

    /* JADX INFO: renamed from: c */
    public final bji f40179c;

    /* JADX INFO: renamed from: d */
    public final wg61 f40180d = new wg61(new cn4(this, 19));

    public co4(boolean z, boolean z2, bji bjiVar) {
        this.f40177a = z;
        this.f40178b = z2;
        this.f40179c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m33487a() {
        co4 co4Var = (co4) this.f40180d.getValue();
        return co4Var != null ? co4Var.m33487a() : this.f40177a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33488b() {
        co4 co4Var = (co4) this.f40180d.getValue();
        return co4Var != null ? co4Var.m33488b() : this.f40178b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("use_product_composer", "android-reinventfree-smartshufflerecommednationsimpl", m33487a()), new k8a("use_unbrand_smart_shuffle_recs_copy_in_external_integration", "android-reinventfree-smartshufflerecommednationsimpl", m33488b()));
    }
}
