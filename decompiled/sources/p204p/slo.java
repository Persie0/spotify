package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class slo extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210447a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xlo f210448b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ slo(xlo xloVar, int i) {
        super(1);
        this.f210447a = i;
        this.f210448b = xloVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f210447a) {
            case 0:
                mpz0 mpz0Var = (mpz0) obj;
                xlo xloVar = this.f210448b;
                String strM78018b = AbstractC2375sg.m78018b(xloVar.f263206c);
                if (xloVar.f263207d == null) {
                    strM78018b = null;
                }
                jpz0.m54000n(mpz0Var, g6f.m43753y0(bk5.m29582E0(new String[]{strM78018b, xloVar.f263208e}), "\n", null, null, null, 62));
                break;
            default:
                jpz0.m54000n((mpz0) obj, this.f210448b.f263208e);
                break;
        }
        return w2a1.f247311a;
    }
}
