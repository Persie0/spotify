package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e0v extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55041a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ udu f55042b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0v(udu uduVar, int i) {
        super(1);
        this.f55041a = i;
        this.f55042b = uduVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f55041a) {
            case 0:
                mpz0 mpz0Var = (mpz0) obj;
                udu uduVar = this.f55042b;
                if (uduVar instanceof qdu) {
                    jpz0.m54010x(mpz0Var, ((qdu) uduVar).f187755a);
                    jpz0.m53987a(mpz0Var);
                }
                break;
            default:
                mpz0 mpz0Var2 = (mpz0) obj;
                udu uduVar2 = this.f55042b;
                if (uduVar2 instanceof qdu) {
                    jpz0.m54010x(mpz0Var2, ((qdu) uduVar2).f187755a);
                    jpz0.m53987a(mpz0Var2);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
