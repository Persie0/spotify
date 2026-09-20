package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p49 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f173869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fb9 f173870b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f173871c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p49(fb9 fb9Var, int i, int i2) {
        super(1);
        this.f173869a = i2;
        this.f173870b = fb9Var;
        this.f173871c = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f173869a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                this.f173870b.invoke(Integer.valueOf(this.f173871c), Integer.valueOf(iIntValue));
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                this.f173870b.invoke(Integer.valueOf(this.f173871c), Integer.valueOf(iIntValue2));
                break;
        }
        return w2a1.f247311a;
    }
}
