package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class s05 extends w05 {

    /* JADX INFO: renamed from: a */
    public float f204304a;

    public s05(float f) {
        this.f204304a = f;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: a */
    public final float mo76847a(int i) {
        if (i == 0) {
            return this.f204304a;
        }
        return 0.0f;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: b */
    public final int mo76848b() {
        return 1;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: c */
    public final w05 mo76849c() {
        return new s05(0.0f);
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: d */
    public final void mo76850d() {
        this.f204304a = 0.0f;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: e */
    public final void mo76851e(float f, int i) {
        if (i == 0) {
            this.f204304a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s05) && ((s05) obj).f204304a == this.f204304a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f204304a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f204304a;
    }
}
