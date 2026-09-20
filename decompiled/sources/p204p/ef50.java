package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ef50 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58952a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ req f58953b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j9c1 f58954c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef50(req reqVar, j9c1 j9c1Var, int i) {
        super(1);
        this.f58952a = i;
        this.f58953b = reqVar;
        this.f58954c = j9c1Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f58952a) {
            case 0:
                req reqVar = this.f58953b;
                meq meqVar = reqVar.f198409f;
                meqVar.getClass();
                leq leqVar = new leq(meqVar);
                j9c1 j9c1Var = this.f58954c;
                int i = j9c1Var.f110145a;
                int i2 = j9c1Var.f110146b;
                leqVar.f41214a = i;
                leqVar.f41215b = i2;
                reqVar.mo33116c(new meq(leqVar));
                break;
            default:
                req reqVar2 = this.f58953b;
                meq meqVar2 = reqVar2.f198409f;
                meqVar2.getClass();
                leq leqVar2 = new leq(meqVar2);
                j9c1 j9c1Var2 = this.f58954c;
                int i3 = j9c1Var2.f110145a;
                int i4 = j9c1Var2.f110146b;
                leqVar2.f41218e = i3;
                leqVar2.f41219f = i4;
                reqVar2.mo33116c(new meq(leqVar2));
                break;
        }
        return w2a1.f247311a;
    }
}
