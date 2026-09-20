package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xz4 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f267516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jj20 f267517b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xz4(jj20 jj20Var, int i) {
        super(1);
        this.f267516a = i;
        this.f267517b = jj20Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f267516a) {
            case 0:
                fdx0 fdx0Var = (fdx0) obj;
                jj20 jj20Var = this.f267517b;
                fdx0Var.m41380b(1.0f - ((Number) jj20Var.f112871a.m45912e()).floatValue());
                fdx0Var.m41397w(Float.intBitsToFloat((int) (fdx0Var.f68596P0 & 4294967295L)) * ((Number) jj20Var.f112873c.m45912e()).floatValue());
                break;
            default:
                fdx0 fdx0Var2 = (fdx0) obj;
                jj20 jj20Var2 = this.f267517b;
                fdx0Var2.m41380b(((Number) jj20Var2.f112871a.m45912e()).floatValue());
                fdx0Var2.m41397w(Float.intBitsToFloat((int) (fdx0Var2.f68596P0 & 4294967295L)) * ((Number) jj20Var2.f112872b.m45912e()).floatValue());
                break;
        }
        return w2a1.f247311a;
    }
}
