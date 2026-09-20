package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class v05 extends w05 {

    /* JADX INFO: renamed from: a */
    public float f235917a;

    /* JADX INFO: renamed from: b */
    public float f235918b;

    /* JADX INFO: renamed from: c */
    public float f235919c;

    /* JADX INFO: renamed from: d */
    public float f235920d;

    public v05(float f, float f2, float f3, float f4) {
        this.f235917a = f;
        this.f235918b = f2;
        this.f235919c = f3;
        this.f235920d = f4;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: a */
    public final float mo76847a(int i) {
        if (i == 0) {
            return this.f235917a;
        }
        if (i == 1) {
            return this.f235918b;
        }
        if (i == 2) {
            return this.f235919c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f235920d;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: b */
    public final int mo76848b() {
        return 4;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: c */
    public final w05 mo76849c() {
        return new v05(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: d */
    public final void mo76850d() {
        this.f235917a = 0.0f;
        this.f235918b = 0.0f;
        this.f235919c = 0.0f;
        this.f235920d = 0.0f;
    }

    @Override // p204p.w05
    /* JADX INFO: renamed from: e */
    public final void mo76851e(float f, int i) {
        if (i == 0) {
            this.f235917a = f;
            return;
        }
        if (i == 1) {
            this.f235918b = f;
        } else if (i == 2) {
            this.f235919c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.f235920d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v05)) {
            return false;
        }
        v05 v05Var = (v05) obj;
        return v05Var.f235917a == this.f235917a && v05Var.f235918b == this.f235918b && v05Var.f235919c == this.f235919c && v05Var.f235920d == this.f235920d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f235920d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f235917a) * 31, 31, this.f235918b), 31, this.f235919c);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f235917a + ", v2 = " + this.f235918b + ", v3 = " + this.f235919c + ", v4 = " + this.f235920d;
    }
}
