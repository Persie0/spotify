package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ird1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f104960a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f104961b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f104962c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f104963d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f104964e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ gh00 f104965f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f104966g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f104967h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ird1(String str, boolean z, String str2, boolean z2, String str3, gh00 gh00Var, int i, int i2) {
        super(1);
        this.f104960a = str;
        this.f104961b = z;
        this.f104962c = str2;
        this.f104963d = z2;
        this.f104964e = str3;
        this.f104965f = gh00Var;
        this.f104966g = i;
        this.f104967h = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        d9m d9mVar;
        mpz0 mpz0Var = (mpz0) obj;
        jpz0.m54000n(mpz0Var, this.f104960a);
        boolean z = this.f104961b;
        d9m d9mVar2 = null;
        int i = this.f104967h;
        int i2 = this.f104966g;
        gh00 gh00Var = this.f104965f;
        if (z) {
            d9mVar = new d9m(this.f104962c, new cug(i2, i, 3, gh00Var));
        } else {
            d9mVar = null;
        }
        if (this.f104963d) {
            d9mVar2 = new d9m(this.f104964e, new cug(i2, i, 4, gh00Var));
        }
        jpz0.m54002p(mpz0Var, bk5.m29582E0(new d9m[]{d9mVar, d9mVar2}));
        return w2a1.f247311a;
    }
}
