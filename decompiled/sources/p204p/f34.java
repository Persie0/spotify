package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f65345a;

    /* JADX INFO: renamed from: b */
    public final wy91 f65346b;

    /* JADX INFO: renamed from: c */
    public final wg61 f65347c = new wg61(new u14(this, 15));

    public f34(boolean z, saw0 saw0Var) {
        this.f65345a = z;
        this.f65346b = saw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m40634a() {
        f34 f34Var = (f34) this.f65347c.getValue();
        return f34Var != null ? f34Var.m40634a() : this.f65345a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_signin_request", "android-engagesdk-engagesigninrequest", m40634a()));
    }
}
