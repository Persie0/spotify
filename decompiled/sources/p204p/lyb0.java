package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lyb0 extends enk0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f138025b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ myb0 f138026c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyb0(jez jezVar, myb0 myb0Var) {
        super(jezVar);
        this.f138025b = 0;
        this.f138026c = myb0Var;
    }

    @Override // p204p.enk0
    /* JADX INFO: renamed from: a */
    public final void mo34343a(qr60 qr60Var, Object obj, Object obj2) {
        switch (this.f138025b) {
            case 0:
                tvd1 tvd1Var = (tvd1) obj2;
                if (!wj50.m88271j((tvd1) obj, tvd1Var)) {
                    myb0 myb0Var = this.f138026c;
                    ((wqi0) ((yum0) myb0Var.f148385c.f29480b).getValue()).m88770f(tvd1Var);
                    myb0.m63168b(myb0Var);
                }
                break;
            case 1:
                if (((Number) obj).intValue() != ((Number) obj2).intValue()) {
                    myb0.m63168b(this.f138026c);
                }
                break;
            default:
                if (((Number) obj).intValue() != ((Number) obj2).intValue()) {
                    myb0.m63168b(this.f138026c);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyb0(myb0 myb0Var, int i) {
        super(0);
        this.f138025b = i;
        switch (i) {
            case 2:
                this.f138026c = myb0Var;
                super(0);
                break;
            default:
                this.f138026c = myb0Var;
                break;
        }
    }
}
