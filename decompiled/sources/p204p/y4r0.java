package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class y4r0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f269210a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a4e0 f269211b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4r0(a4e0 a4e0Var, int i) {
        super(2);
        this.f269210a = i;
        this.f269211b = a4e0Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f269210a) {
            case 0:
                st91 st91Var = (st91) obj2;
                Integer numValueOf = Integer.valueOf(((Number) obj).intValue());
                a4e0 a4e0Var = this.f269211b;
                return new gag0(a4e0Var.mo24692a().f64460b, numValueOf, a4e0Var.mo24692a().f64462d, st91Var, 22);
            default:
                st91 st91Var2 = (st91) obj2;
                Integer numValueOf2 = Integer.valueOf(((Number) obj).intValue());
                a4e0 a4e0Var2 = this.f269211b;
                return new gag0(a4e0Var2.mo24692a().f64460b, numValueOf2, a4e0Var2.mo24692a().f64462d, st91Var2, 22);
        }
    }
}
