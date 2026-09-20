package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xn4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f263512a;

    /* JADX INFO: renamed from: b */
    public final bji f263513b;

    /* JADX INFO: renamed from: c */
    public final wg61 f263514c = new wg61(new cn4(this, 15));

    public xn4(boolean z, bji bjiVar) {
        this.f263512a = z;
        this.f263513b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m91491a() {
        xn4 xn4Var = (xn4) this.f263514c.getValue();
        return xn4Var != null ? xn4Var.m91491a() : this.f263512a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("renewal_tooltips_enabled", "android-reinvent-free-awareness", m91491a()));
    }
}
