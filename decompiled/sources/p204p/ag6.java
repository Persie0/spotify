package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ag6 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uum0 f15298b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag6(uum0 uum0Var, int i) {
        super(2);
        this.f15297a = i;
        this.f15298b = uum0Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15297a) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                this.f15298b.m84032w(fFloatValue);
                break;
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                pyc.m71610e(this.f15298b, fFloatValue2);
                break;
        }
        return w2a1.f247311a;
    }
}
