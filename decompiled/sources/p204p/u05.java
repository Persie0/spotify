package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class u05 extends w05 {

    /* JADX INFO: renamed from: a */
    public float f225385a;

    /* JADX INFO: renamed from: b */
    public float f225386b;

    /* JADX INFO: renamed from: c */
    public float f225387c;

    public u05(float f, float f2, float f3) {
        this.f225385a = f;
        this.f225386b = f2;
        this.f225387c = f3;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: a */
    public final float mo76847a(int i) {
        if (i == 0) {
            return this.f225385a;
        }
        if (i == 1) {
            return this.f225386b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f225387c;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: b */
    public final int mo76848b() {
        return 3;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: c */
    public final w05 mo76849c() {
        return new u05(0.0f, 0.0f, 0.0f);
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: d */
    public final void mo76850d() {
        this.f225385a = 0.0f;
        this.f225386b = 0.0f;
        this.f225387c = 0.0f;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: e */
    public final void mo76851e(float f, int i) {
        if (i == 0) {
            this.f225385a = f;
        } else if (i == 1) {
            this.f225386b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.f225387c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u05)) {
            return false;
        }
        u05 u05Var = (u05) obj;
        return u05Var.f225385a == this.f225385a && u05Var.f225386b == this.f225386b && u05Var.f225387c == this.f225387c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f225387c) + AbstractC0000a.m8g(Float.hashCode(this.f225385a) * 31, 31, this.f225386b);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f225385a + ", v2 = " + this.f225386b + ", v3 = " + this.f225387c;
    }
}
