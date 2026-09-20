package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class aiz implements qhz {

    /* JADX INFO: renamed from: a */
    public final float f16113a;

    /* JADX INFO: renamed from: b */
    public final og41 f16114b;

    public aiz(float f, float f2, float f3) {
        this.f16113a = f3;
        og41 og41Var = new og41();
        og41Var.f164993a = 1.0f;
        og41Var.f164994b = Math.sqrt(50.0d);
        og41Var.f164995c = 1.0f;
        if (f < 0.0f) {
            nfq0.m64362a("Damping ratio must be non-negative");
        }
        og41Var.f164995c = f;
        double d = og41Var.f164994b;
        if (((float) (d * d)) <= 0.0f) {
            nfq0.m64362a("Spring stiffness constant must be positive.");
        }
        og41Var.f164994b = Math.sqrt(f2);
        this.f16114b = og41Var;
    }

    @Override // p204p.qhz
    /* JADX INFO: renamed from: b */
    public final float mo26119b(float f, float f2, float f3, long j) {
        og41 og41Var = this.f16114b;
        og41Var.f164993a = f2;
        return Float.intBitsToFloat((int) (og41Var.m66862a(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // p204p.qhz
    /* JADX INFO: renamed from: c */
    public final float mo26120c(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // p204p.qhz
    /* JADX INFO: renamed from: d */
    public final long mo26121d(float f, float f2, float f3) {
        og41 og41Var = this.f16114b;
        double d = og41Var.f164994b;
        float f4 = og41Var.f164995c;
        float f5 = f - f2;
        float f6 = this.f16113a;
        return ljf1.m59158j((float) (d * d), f4, f3 / f6, f5 / f6) * 1000000;
    }

    @Override // p204p.qhz
    /* JADX INFO: renamed from: e */
    public final float mo26122e(float f, float f2, float f3, long j) {
        og41 og41Var = this.f16114b;
        og41Var.f164993a = f2;
        return Float.intBitsToFloat((int) (og41Var.m66862a(f, f3, j / 1000000) >> 32));
    }
}
