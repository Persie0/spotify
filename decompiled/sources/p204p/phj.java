package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class phj implements vhm0 {

    /* JADX INFO: renamed from: a */
    public final float f177669a;

    /* JADX INFO: renamed from: b */
    public final int f177670b;

    /* JADX INFO: renamed from: c */
    public final ybs f177671c;

    public phj(float f, int i, ybs ybsVar) {
        this.f177669a = f;
        this.f177670b = i;
        this.f177671c = ybsVar;
    }

    @Override // p204p.vhm0
    /* JADX INFO: renamed from: b */
    public final int mo30690b(lv70 lv70Var, int i) {
        int i2;
        zr51 zr51Var = lv70Var.f137253b;
        float fMo35987O0 = zr51Var.mo35987O0(i) + this.f177669a;
        if (ybs.m93300a(fMo35987O0, 768) < 0) {
            i2 = 1;
        } else {
            i2 = ybs.m93300a(fMo35987O0, (float) 1024) < 0 ? 2 : 3;
        }
        float f = (fMo35987O0 - (this.f177670b <= i2 ? 0 : khj.f122671a)) / i2;
        ybs ybsVar = this.f177671c;
        if (ybsVar != null) {
            float f2 = ybsVar.f271238a;
            if (ybs.m93300a(f2, f) < 0) {
                return zr51Var.mo35990l0(f2);
            }
        }
        return zr51Var.mo35990l0(f);
    }
}
