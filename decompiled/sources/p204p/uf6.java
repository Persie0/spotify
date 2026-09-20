package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uf6 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f229689a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f229690b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f229691c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f229692d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f229693e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f229694f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f229695g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ eh00 f229696h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ eh00 f229697i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf6(String str, eh00 eh00Var, boolean z, boolean z2, String str2, String str3, boolean z3, eh00 eh00Var2, eh00 eh00Var3) {
        super(1);
        this.f229689a = str;
        this.f229690b = eh00Var;
        this.f229691c = z;
        this.f229692d = z2;
        this.f229693e = str2;
        this.f229694f = str3;
        this.f229695g = z3;
        this.f229696h = eh00Var2;
        this.f229697i = eh00Var3;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        mpz0 mpz0Var = (mpz0) obj;
        String str = this.f229689a;
        if (str != null) {
            jpz0.m54010x(mpz0Var, str);
        }
        ro80 ro80VarM44508o = geg1.m44508o();
        eh00 eh00Var = this.f229690b;
        if (eh00Var != null && this.f229691c && this.f229692d) {
            ro80VarM44508o.add(new d9m(this.f229693e, new as2(11, eh00Var)));
        }
        ro80VarM44508o.add(new d9m(this.f229694f, new tf6(this.f229695g, this.f229696h, this.f229697i, 0)));
        jpz0.m54002p(mpz0Var, geg1.m44506m(ro80VarM44508o));
        return w2a1.f247311a;
    }
}
