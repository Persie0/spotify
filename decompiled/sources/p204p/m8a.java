package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class m8a extends i5j {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f140995b = 1;

    public /* synthetic */ m8a(Object obj) {
        super(obj);
    }

    @Override // p204p.i5j
    /* JADX INFO: renamed from: a */
    public final gd70 mo26195a(mxh0 mxh0Var) {
        switch (this.f140995b) {
            case 0:
                ib70 ib70VarMo53211g = mxh0Var.mo53211g();
                ib70VarMo53211g.getClass();
                return ib70VarMo53211g.m50166t(her0.BOOLEAN);
            case 1:
                ib70 ib70VarMo53211g2 = mxh0Var.mo53211g();
                ib70VarMo53211g2.getClass();
                return ib70VarMo53211g2.m50166t(her0.DOUBLE);
            default:
                ib70 ib70VarMo53211g3 = mxh0Var.mo53211g();
                ib70VarMo53211g3.getClass();
                return ib70VarMo53211g3.m50166t(her0.FLOAT);
        }
    }

    @Override // p204p.i5j
    public String toString() {
        switch (this.f140995b) {
            case 1:
                return ((Number) this.f98976a).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.f98976a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public m8a(double d) {
        super(Double.valueOf(d));
    }

    public m8a(float f) {
        super(Float.valueOf(f));
    }
}
