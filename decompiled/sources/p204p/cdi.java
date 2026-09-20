package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cdi extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36894a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f36895b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j2d0 f36896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cdi(gh00 gh00Var, j2d0 j2d0Var, int i) {
        super(0);
        this.f36894a = i;
        this.f36895b = gh00Var;
        this.f36896c = j2d0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f36894a) {
            case 0:
                this.f36895b.invoke(new cci(this.f36896c.f108010a));
                break;
            case 1:
                this.f36895b.invoke(new hci(this.f36896c.f108013d));
                break;
            case 2:
                this.f36895b.invoke(new xbi(this.f36896c));
                break;
            default:
                this.f36895b.invoke(new aci(this.f36896c));
                break;
        }
        return w2a1.f247311a;
    }
}
