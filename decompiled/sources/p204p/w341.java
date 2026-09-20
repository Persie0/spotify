package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w341 extends crs {

    /* JADX INFO: renamed from: b1 */
    public final float f247483b1;

    /* JADX INFO: renamed from: c1 */
    public final int f247484c1;

    public w341(float f, int i) {
        super(0);
        this.f247483b1 = f;
        this.f247484c1 = i;
    }

    @Override // p204p.crs
    /* JADX INFO: renamed from: a */
    public final void mo33746a(float f, float f2, float f3, wh01 wh01Var) {
        int i = this.f247484c1;
        float f4 = this.f247483b1;
        wh01Var.m88082c((f2 - i) - (f4 * f3), 0.0f);
        wh01Var.m88082c(f2 - i, (-f4) * f3);
        wh01Var.m88082c((f4 * f3) + (f2 - i), 0.0f);
        wh01Var.m88082c(f, 0.0f);
    }
}
