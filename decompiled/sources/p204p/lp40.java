package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lp40 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135614a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f135615b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z00 f135616c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lp40(gh00 gh00Var, z00 z00Var, int i) {
        super(0);
        this.f135614a = i;
        this.f135615b = gh00Var;
        this.f135616c = z00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        String str;
        String str2;
        switch (this.f135614a) {
            case 0:
                this.f135615b.invoke(this.f135616c);
                break;
            case 1:
                this.f135615b.invoke(this.f135616c);
                break;
            case 2:
                z00 z00Var = this.f135616c;
                if (z00Var == null || (str = z00Var.f277928e) == null) {
                    str = "";
                }
                this.f135615b.invoke(new jbo0(str));
                break;
            case 3:
                z00 z00Var2 = this.f135616c;
                if (z00Var2 == null || (str2 = z00Var2.f277928e) == null) {
                    str2 = "";
                }
                this.f135615b.invoke(new ibo0(str2));
                break;
            default:
                this.f135615b.invoke(this.f135616c.f277928e);
                break;
        }
        return w2a1.f247311a;
    }
}
