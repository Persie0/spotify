package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class twm0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f224450a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f224451b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pqm0 f224452c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ twm0(kqi0 kqi0Var, pqm0 pqm0Var, int i) {
        super(1);
        this.f224450a = i;
        this.f224451b = kqi0Var;
        this.f224452c = pqm0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f224450a) {
            case 0:
                ny51 ny51Var = ((sm6) obj).f210571b;
                p340 p340Var = ny51Var.f159718a;
                p340 p340Var2 = ny51Var.f159718a;
                this.f224451b.setValue((p340Var.mo68988d() == -1 || p340Var2.mo68986b() == -1) ? this.f224452c : new pqm0(Float.valueOf(p340Var2.mo68988d()), Float.valueOf(p340Var2.mo68986b())));
                break;
            case 1:
                ny51 ny51Var2 = ((sm6) obj).f210571b;
                p340 p340Var3 = ny51Var2.f159718a;
                p340 p340Var4 = ny51Var2.f159718a;
                this.f224451b.setValue((p340Var3.mo68988d() == -1 || p340Var4.mo68986b() == -1) ? this.f224452c : new pqm0(Float.valueOf(p340Var4.mo68988d()), Float.valueOf(p340Var4.mo68986b())));
                break;
            default:
                ny51 ny51Var3 = ((sm6) obj).f210571b;
                p340 p340Var5 = ny51Var3.f159718a;
                p340 p340Var6 = ny51Var3.f159718a;
                this.f224451b.setValue((p340Var5.mo68988d() == -1 || p340Var6.mo68986b() == -1) ? this.f224452c : new pqm0(Float.valueOf(p340Var6.mo68988d()), Float.valueOf(p340Var6.mo68986b())));
                break;
        }
        return w2a1.f247311a;
    }
}
