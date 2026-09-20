package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wy00 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f256168a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f256169b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f256170c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f256171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy00(int i, String str, gh00 gh00Var) {
        super(1);
        this.f256170c = i;
        this.f256169b = str;
        this.f256171d = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f256168a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i = this.f256170c;
                String str = this.f256169b;
                gh00 gh00Var = this.f256171d;
                if (zBooleanValue) {
                    gh00Var.invoke(new ky00(i, str));
                } else {
                    gh00Var.invoke(new fy00(i, str));
                }
                break;
            case 1:
                mpz0 mpz0Var = (mpz0) obj;
                String str2 = this.f256169b;
                jpz0.m54000n(mpz0Var, str2);
                jpz0.m54010x(mpz0Var, str2);
                jpz0.m54006t(mpz0Var, new i4s0(this.f256170c, new ete(0.0f, 5.0f), 4));
                mpz0Var.mo62511a(toz0.f222354i, new C1811ee(null, new ons0(14, this.f256171d)));
                break;
            default:
                mpz0 mpz0Var2 = (mpz0) obj;
                jpz0.m54007u(mpz0Var2, 0);
                jpz0.m53993g(mpz0Var2, this.f256169b, new yi0(this.f256171d, this.f256170c, 19));
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy00(String str, int i, gh00 gh00Var) {
        super(1);
        this.f256169b = str;
        this.f256170c = i;
        this.f256171d = gh00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy00(String str, gh00 gh00Var, int i) {
        super(1);
        this.f256169b = str;
        this.f256171d = gh00Var;
        this.f256170c = i;
    }
}
