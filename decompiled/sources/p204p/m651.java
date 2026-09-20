package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class m651 extends j1i0 {

    /* JADX INFO: renamed from: a */
    public final n651 f140392a;

    /* JADX INFO: renamed from: b */
    public qg41 f140393b;

    /* JADX INFO: renamed from: c */
    public k651 f140394c;

    public m651() {
        n651 n651Var = new n651();
        n651Var.f150712k = false;
        this.f140392a = n651Var;
        this.f140394c = n651Var;
    }

    @Override // p204p.j1i0
    /* JADX INFO: renamed from: a */
    public final float mo52165a() {
        return this.f140394c.mo55583a();
    }

    /* JADX INFO: renamed from: b */
    public final void m60946b(float f, float f2, float f3, float f4, float f5, float f6) {
        n651 n651Var = this.f140392a;
        this.f140394c = n651Var;
        n651Var.f150713l = f;
        boolean z = f > f2;
        n651Var.f150712k = z;
        if (z) {
            n651Var.m63760d(-f3, f - f2, f5, f6, f4);
        } else {
            n651Var.m63760d(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.f140394c.getInterpolation(f);
    }
}
