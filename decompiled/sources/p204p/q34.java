package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f184787a;

    /* JADX INFO: renamed from: b */
    public final wy91 f184788b;

    /* JADX INFO: renamed from: c */
    public final wg61 f184789c = new wg61(new u14(this, 22));

    public q34(boolean z, saw0 saw0Var) {
        this.f184787a = z;
        this.f184788b = saw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72043a() {
        q34 q34Var = (q34) this.f184789c.getValue();
        return q34Var != null ? q34Var.m72043a() : this.f184787a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("allow_cdn_domain_access", "android-external-integration-service", m72043a()));
    }
}
