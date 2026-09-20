package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i1v extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f97607a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rlv0 f97608b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ neu f97609c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1v(rlv0 rlv0Var, neu neuVar, int i) {
        super(1);
        this.f97607a = i;
        this.f97608b = rlv0Var;
        this.f97609c = neuVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f97607a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                rlv0 rlv0Var = this.f97608b;
                nob1 nob1Var = (nob1) rlv0Var.f200373a;
                if (nob1Var.f156654f != 0) {
                    nob1 nob1VarM65234a = nob1.m65234a(nob1Var, false, !zBooleanValue, 47);
                    rlv0Var.f200373a = nob1VarM65234a;
                    this.f97609c.f153111c.mo2820d(nob1VarM65234a);
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                rlv0 rlv0Var2 = this.f97608b;
                nob1 nob1VarM65234a2 = nob1.m65234a((nob1) rlv0Var2.f200373a, zBooleanValue2, false, 59);
                rlv0Var2.f200373a = nob1VarM65234a2;
                this.f97609c.f153111c.mo2820d(nob1VarM65234a2);
                break;
        }
        return w2a1.f247311a;
    }
}
