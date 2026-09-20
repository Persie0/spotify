package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class po2 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f179563a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vh00 f179564b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mo2 f179565c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ lo2 f179566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ po2(vh00 vh00Var, mo2 mo2Var, lo2 lo2Var, int i) {
        super(0);
        this.f179563a = i;
        this.f179564b = vh00Var;
        this.f179565c = mo2Var;
        this.f179566d = lo2Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f179563a) {
            case 0:
                String str = this.f179565c.f145548a;
                lo2 lo2Var = this.f179566d;
                this.f179564b.mo24510D0(str, Boolean.valueOf(lo2Var.f135282d), lo2Var.f135279a);
                break;
            default:
                String str2 = this.f179565c.f145548a;
                lo2 lo2Var2 = this.f179566d;
                this.f179564b.mo24510D0(str2, Boolean.valueOf(lo2Var2.f135282d), lo2Var2.f135279a);
                break;
        }
        return w2a1.f247311a;
    }
}
