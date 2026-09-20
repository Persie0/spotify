package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class fid1 {

    /* JADX INFO: renamed from: a */
    public final float f69851a;

    /* JADX INFO: renamed from: b */
    public final float f69852b;

    /* JADX INFO: renamed from: c */
    public final float f69853c;

    /* JADX INFO: renamed from: d */
    public final float f69854d;

    /* JADX INFO: renamed from: e */
    public final float f69855e;

    /* JADX INFO: renamed from: f */
    public final float f69856f;

    /* JADX INFO: renamed from: g */
    public final float f69857g;

    /* JADX INFO: renamed from: h */
    public final float f69858h;

    /* JADX INFO: renamed from: i */
    public final float f69859i;

    /* JADX INFO: renamed from: j */
    public final float f69860j;

    /* JADX INFO: renamed from: k */
    public final float f69861k;

    public fid1(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f69851a = f;
        this.f69852b = f2;
        this.f69853c = f3;
        this.f69854d = f4;
        this.f69855e = f5;
        this.f69856f = f6;
        this.f69857g = f7;
        this.f69858h = f8;
        this.f69859i = f9;
        this.f69860j = f10;
        this.f69861k = f11;
    }

    /* JADX INFO: renamed from: a */
    public final float m41715a(float f) {
        float f2 = this.f69857g;
        if (f2 > 0.0f) {
            float f3 = this.f69852b;
            if (f3 > 0.0f) {
                return (f / f2) * f3;
            }
        }
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fid1)) {
            return false;
        }
        fid1 fid1Var = (fid1) obj;
        return Float.compare(this.f69851a, fid1Var.f69851a) == 0 && Float.compare(this.f69852b, fid1Var.f69852b) == 0 && Float.compare(this.f69853c, fid1Var.f69853c) == 0 && Float.compare(this.f69854d, fid1Var.f69854d) == 0 && Float.compare(this.f69855e, fid1Var.f69855e) == 0 && Float.compare(this.f69856f, fid1Var.f69856f) == 0 && Float.compare(this.f69857g, fid1Var.f69857g) == 0 && Float.compare(this.f69858h, fid1Var.f69858h) == 0 && Float.compare(this.f69859i, fid1Var.f69859i) == 0 && Float.compare(this.f69860j, fid1Var.f69860j) == 0 && Float.compare(this.f69861k, fid1Var.f69861k) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f69861k) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f69851a) * 31, 31, this.f69852b), 31, this.f69853c), 31, this.f69854d), 31, this.f69855e), 31, this.f69856f), 31, this.f69857g), 31, this.f69858h), 31, this.f69859i), 31, this.f69860j);
    }
}
