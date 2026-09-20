package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xw4 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f266570a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f266571b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rv41 f266572c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw4(float f, int i, rv41 rv41Var) {
        super(1);
        this.f266570a = i;
        this.f266571b = f;
        this.f266572c = rv41Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f266570a) {
            case 0:
                fdx0 fdx0Var = (fdx0) obj;
                fdx0Var.m41390m(1.33f);
                float fFloatValue = ((Number) this.f266572c.getValue()).floatValue();
                fdx0Var.m41380b(fFloatValue <= 0.5f ? fFloatValue * 2.0f : (1.0f - fFloatValue) * 2.0f);
                fdx0Var.m41397w((-fFloatValue) * this.f266571b * 2.0f);
                break;
            default:
                fdx0 fdx0Var2 = (fdx0) obj;
                rv41 rv41Var = this.f266572c;
                fdx0Var2.m41380b(((Number) rv41Var.getValue()).floatValue());
                fdx0Var2.m41397w((1.0f - ((Number) rv41Var.getValue()).floatValue()) * this.f266571b);
                break;
        }
        return w2a1.f247311a;
    }
}
