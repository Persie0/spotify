package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hds implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f90180a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f90181b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ hds(int i, th00 th00Var) {
        this.f90180a = i;
        this.f90181b = (qe70) th00Var;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r1v0, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.qe70, p.th00] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f90180a) {
            case 0:
                k6q0 k6q0Var = (k6q0) obj;
                this.f90181b.invoke(k6q0Var, new Offset(ex60.m40190x(k6q0Var, false)));
                k6q0Var.m55602a();
                return w2a1.f247311a;
            case 1:
                k6q0 k6q0Var2 = (k6q0) obj;
                this.f90181b.invoke(k6q0Var2, Float.valueOf(Float.intBitsToFloat((int) (ex60.m40190x(k6q0Var2, false) >> 32))));
                k6q0Var2.m55602a();
                return w2a1.f247311a;
            case 2:
                k6q0 k6q0Var3 = (k6q0) obj;
                this.f90181b.invoke(k6q0Var3, Float.valueOf(Float.intBitsToFloat((int) (ex60.m40190x(k6q0Var3, false) & 4294967295L))));
                k6q0Var3.m55602a();
                return w2a1.f247311a;
            default:
                return Long.valueOf(njg1.m64607A(((cks) this.f90181b.invoke(obj)).f39083a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ hds(gh00 gh00Var) {
        this.f90180a = 3;
        this.f90181b = (qe70) gh00Var;
    }
}
