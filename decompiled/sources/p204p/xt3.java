package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xt3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f265739a;

    /* JADX INFO: renamed from: b */
    public final wy91 f265740b;

    /* JADX INFO: renamed from: c */
    public final wg61 f265741c = new wg61(new w62(this, 24));

    public xt3(boolean z, saw0 saw0Var) {
        this.f265739a = z;
        this.f265740b = saw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m92002a() {
        xt3 xt3Var = (xt3) this.f265741c.getValue();
        return xt3Var != null ? xt3Var.m92002a() : this.f265739a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_account_switching", "android-accountswitching", m92002a()));
    }
}
