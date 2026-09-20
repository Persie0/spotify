package p204p;

/* JADX INFO: renamed from: p.pe */
/* JADX INFO: loaded from: classes11.dex */
public final class C2253pe extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f176578a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xom0 f176579b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fcd1 f176580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2253pe(xom0 xom0Var, fcd1 fcd1Var, int i) {
        super(0);
        this.f176578a = i;
        this.f176579b = xom0Var;
        this.f176580c = fcd1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f176578a) {
            case 0:
                xom0 xom0Var = this.f176579b;
                if (xom0Var.m91558p() > 0) {
                    int iM91558p = xom0Var.m91558p() - 1;
                    hb11 hb11Var = this.f176580c.f68098c;
                    if (iM91558p < 0) {
                        iM91558p = 0;
                    }
                    hb11Var.mo46962a(Integer.valueOf(iM91558p));
                }
                break;
            default:
                xom0 xom0Var2 = this.f176579b;
                if (xom0Var2.m91558p() < xom0Var2.mo37269m()) {
                    int iM91558p2 = xom0Var2.m91558p() + 1;
                    hb11 hb11Var2 = this.f176580c.f68098c;
                    if (iM91558p2 < 0) {
                        iM91558p2 = 0;
                    }
                    hb11Var2.mo46962a(Integer.valueOf(iM91558p2));
                }
                break;
        }
        return w2a1.f247311a;
    }
}
