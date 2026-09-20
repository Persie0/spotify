package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class t05 extends w05 {

    /* JADX INFO: renamed from: a */
    public float f215761a;

    /* JADX INFO: renamed from: b */
    public float f215762b;

    public t05(float f, float f2) {
        this.f215761a = f;
        this.f215762b = f2;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: a */
    public final float mo76847a(int i) {
        if (i == 0) {
            return this.f215761a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f215762b;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: b */
    public final int mo76848b() {
        return 2;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: c */
    public final w05 mo76849c() {
        return new t05(0.0f, 0.0f);
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: d */
    public final void mo76850d() {
        this.f215761a = 0.0f;
        this.f215762b = 0.0f;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: e */
    public final void mo76851e(float f, int i) {
        if (i == 0) {
            this.f215761a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.f215762b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t05)) {
            return false;
        }
        t05 t05Var = (t05) obj;
        return t05Var.f215761a == this.f215761a && t05Var.f215762b == this.f215762b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f215762b) + (Float.hashCode(this.f215761a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f215761a + ", v2 = " + this.f215762b;
    }
}
