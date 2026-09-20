package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class p05 {

    /* JADX INFO: renamed from: a */
    public final float f172485a;

    /* JADX INFO: renamed from: b */
    public final float f172486b;

    /* JADX INFO: renamed from: c */
    public final float f172487c;

    /* JADX INFO: renamed from: d */
    public final float f172488d;

    /* JADX INFO: renamed from: e */
    public final float f172489e;

    /* JADX INFO: renamed from: f */
    public final float f172490f;

    /* JADX INFO: renamed from: g */
    public final float f172491g;

    /* JADX INFO: renamed from: h */
    public final float f172492h;

    /* JADX INFO: renamed from: i */
    public final float f172493i;

    public p05(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f172485a = f;
        this.f172486b = f2;
        this.f172487c = f3;
        this.f172488d = f4;
        this.f172489e = f5;
        this.f172490f = f6;
        this.f172491g = f7;
        this.f172492h = f8;
        this.f172493i = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p05)) {
            return false;
        }
        p05 p05Var = (p05) obj;
        return Float.compare(this.f172485a, p05Var.f172485a) == 0 && Float.compare(this.f172486b, p05Var.f172486b) == 0 && Float.compare(this.f172487c, p05Var.f172487c) == 0 && Float.compare(this.f172488d, p05Var.f172488d) == 0 && Float.compare(this.f172489e, p05Var.f172489e) == 0 && Float.compare(this.f172490f, p05Var.f172490f) == 0 && Float.compare(this.f172491g, p05Var.f172491g) == 0 && Float.compare(this.f172492h, p05Var.f172492h) == 0 && Float.compare(this.f172493i, p05Var.f172493i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f172493i) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f172485a) * 31, 31, this.f172486b), 31, this.f172487c), 31, this.f172488d), 31, this.f172489e), 31, this.f172490f), 31, this.f172491g), 31, this.f172492h);
    }
}
