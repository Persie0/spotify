package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nmz0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f156297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f156298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f156299c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nmz0(gh00 gh00Var, kqi0 kqi0Var, int i) {
        super(1);
        this.f156297a = i;
        this.f156298b = gh00Var;
        this.f156299c = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f156297a;
        w2a1 w2a1Var = w2a1.f247311a;
        gh00 gh00Var = this.f156298b;
        kqi0 kqi0Var = this.f156299c;
        switch (i) {
            case 0:
                gh00Var.invoke((rsu0) obj);
                float f = qmz0.f190439c;
                kqi0Var.setValue(Boolean.FALSE);
                break;
            case 1:
                gh00Var.invoke(new ye11((ud11) obj));
                kqi0Var.setValue(Boolean.FALSE);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                kqi0Var.setValue(bool);
                gh00Var.invoke(bool);
                break;
            default:
                ndb1 ndb1Var = (ndb1) obj;
                if (ndb1Var instanceof kdb1) {
                    kqi0Var.setValue(Boolean.FALSE);
                }
                gh00Var.invoke(ndb1Var);
                break;
        }
        return w2a1Var;
    }
}
