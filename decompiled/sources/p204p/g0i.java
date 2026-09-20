package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g0i extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f75361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wzw0 f75362b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rv41 f75363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0i(wzw0 wzw0Var, rv41 rv41Var, int i) {
        super(1);
        this.f75361a = i;
        this.f75362b = wzw0Var;
        this.f75363c = rv41Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f75361a) {
            case 0:
                fdx0 fdx0Var = (fdx0) obj;
                if (this.f75362b.f256702d) {
                    xj71 xj71Var = (xj71) this.f75363c.getValue();
                    float f = xj71Var.f262060a;
                    float f2 = xj71Var.f262061b;
                    fdx0Var.m41396v(f * 8.0f);
                    fdx0Var.m41397w(8.0f * f2);
                    fdx0Var.m41388k(xj71Var.f262060a * 5.0f);
                    fdx0Var.m41387i((-f2) * 5.0f);
                }
                fdx0Var.m41383e(fdx0Var.f68597Q0.mo24619j() * 12.0f);
                break;
            default:
                fdx0 fdx0Var2 = (fdx0) obj;
                if (this.f75362b.f256702d) {
                    xj71 xj71Var2 = (xj71) this.f75363c.getValue();
                    float f3 = xj71Var2.f262060a;
                    float f4 = xj71Var2.f262061b;
                    fdx0Var2.m41396v(f3 * 4.0f);
                    fdx0Var2.m41397w(4.0f * f4);
                    fdx0Var2.m41388k(xj71Var2.f262060a * 2.0f);
                    fdx0Var2.m41387i((-f4) * 2.0f);
                }
                fdx0Var2.m41383e(fdx0Var2.f68597Q0.mo24619j() * 12.0f);
                break;
        }
        return w2a1.f247311a;
    }
}
