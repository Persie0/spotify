package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class imx0 extends fem {
    @Override // p204p.fem
    /* JADX INFO: renamed from: n */
    public final void mo41475n(wh01 wh01Var, float f, float f2) {
        wh01Var.m88083d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        sh01 sh01Var = new sh01(0.0f, 0.0f, f3, f3);
        sh01Var.f208973f = 180.0f;
        sh01Var.f208974g = 90.0f;
        wh01Var.f251221f.add(sh01Var);
        qh01 qh01Var = new qh01(sh01Var);
        wh01Var.m88080a(180.0f);
        wh01Var.f251222g.add(qh01Var);
        wh01Var.f251219d = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        wh01Var.f251217b = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        wh01Var.f251218c = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
