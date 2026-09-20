package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x840 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f259047a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f259048b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f259049c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f259050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x840(int i, eh00 eh00Var, kqi0 kqi0Var, int i2) {
        super(1);
        this.f259047a = i2;
        this.f259048b = i;
        this.f259049c = eh00Var;
        this.f259050d = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f259047a) {
            case 0:
                jo70 jo70Var = (jo70) obj;
                kqi0 kqi0Var = this.f259050d;
                if (!((Boolean) kqi0Var.getValue()).booleanValue() && Float.intBitsToFloat((int) (jo70Var.mo30029m(0L) & 4294967295L)) < this.f259048b + 500.0f) {
                    kqi0Var.setValue(Boolean.TRUE);
                    this.f259049c.invoke();
                }
                break;
            default:
                if (((Number) obj).intValue() >= this.f259048b) {
                    kqi0 kqi0Var2 = this.f259050d;
                    if (!((Boolean) kqi0Var2.getValue()).booleanValue()) {
                        this.f259049c.invoke();
                        kqi0Var2.setValue(Boolean.TRUE);
                    }
                }
                break;
        }
        return w2a1.f247311a;
    }
}
