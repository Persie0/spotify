package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class w8d1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f248910a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ko70 f248911b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmx0 f248912c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8d1(ko70 ko70Var, fmx0 fmx0Var, int i) {
        super(1);
        this.f248910a = i;
        this.f248911b = ko70Var;
        this.f248912c = fmx0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f248910a) {
            case 0:
                fdx0 fdx0Var = (fdx0) obj;
                fdx0Var.m41389l(this.f248911b == ko70.f124557b ? -8.0f : 8.0f);
                fdx0Var.m41393r(this.f248912c);
                fdx0Var.m41384f(true);
                break;
            case 1:
                fdx0 fdx0Var2 = (fdx0) obj;
                fdx0Var2.m41389l(this.f248911b == ko70.f124557b ? -6.0f : 6.0f);
                fdx0Var2.m41393r(this.f248912c);
                fdx0Var2.m41384f(true);
                break;
            default:
                fdx0 fdx0Var3 = (fdx0) obj;
                fdx0Var3.m41389l(this.f248911b == ko70.f124557b ? -6.0f : 6.0f);
                fdx0Var3.m41393r(this.f248912c);
                fdx0Var3.m41384f(true);
                break;
        }
        return w2a1.f247311a;
    }
}
