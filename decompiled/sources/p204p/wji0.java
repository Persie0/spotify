package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wji0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f251975a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tji0 f251976b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f251977c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wji0(gh00 gh00Var, tji0 tji0Var) {
        super(0);
        this.f251977c = gh00Var;
        this.f251976b = tji0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f251975a) {
            case 0:
                this.f251977c.invoke(new lji0(this.f251976b.f220917a));
                break;
            default:
                tji0 tji0Var = this.f251976b;
                int i = tji0Var.f220924h;
                String str = tji0Var.f220917a;
                this.f251977c.invoke(i == 2 ? new mji0(str) : new lji0(str));
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wji0(tji0 tji0Var, gh00 gh00Var) {
        super(0);
        this.f251976b = tji0Var;
        this.f251977c = gh00Var;
    }
}
