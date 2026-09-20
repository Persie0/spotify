package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vdx0 implements d2s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f240523a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y491 f240524b;

    public /* synthetic */ vdx0(y491 y491Var, int i) {
        this.f240523a = i;
        this.f240524b = y491Var;
    }

    @Override // p204p.d2s
    /* JADX INFO: renamed from: b */
    public final double mo34792b(double d) {
        int i = this.f240523a;
        y491 y491Var = this.f240524b;
        switch (i) {
            case 0:
                double d2 = y491Var.f269103b;
                return d >= y491Var.f269106e ? Math.pow((d2 * d) + y491Var.f269104c, y491Var.f269102a) : y491Var.f269105d * d;
            case 1:
                double d3 = y491Var.f269103b;
                double d4 = y491Var.f269104c;
                double d5 = y491Var.f269105d;
                return d >= y491Var.f269106e ? Math.pow((d3 * d) + d4, y491Var.f269102a) + y491Var.f269107f : y491Var.f269108g + (d5 * d);
            case 2:
                float[] fArr = c9f.f35490a;
                return c9f.m31920b(y491Var, d);
            case 3:
                float[] fArr2 = c9f.f35490a;
                return c9f.m31922d(y491Var, d);
            case 4:
                double d6 = y491Var.f269103b;
                double d7 = y491Var.f269104c;
                double d8 = y491Var.f269105d;
                return d >= y491Var.f269106e * d8 ? (Math.pow(d, 1.0d / y491Var.f269102a) - d7) / d6 : d / d8;
            case 5:
                double d9 = y491Var.f269103b;
                double d10 = y491Var.f269104c;
                double d11 = y491Var.f269105d;
                return d >= y491Var.f269106e * d11 ? (Math.pow(d - y491Var.f269107f, 1.0d / y491Var.f269102a) - d10) / d9 : (d - y491Var.f269108g) / d11;
            case 6:
                float[] fArr3 = c9f.f35490a;
                return c9f.m31919a(y491Var, d);
            default:
                float[] fArr4 = c9f.f35490a;
                return c9f.m31921c(y491Var, d);
        }
    }
}
