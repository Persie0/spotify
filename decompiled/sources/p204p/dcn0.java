package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class dcn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f47585c;

    /* JADX INFO: renamed from: d */
    public final float f47586d;

    /* JADX INFO: renamed from: e */
    public final float f47587e;

    /* JADX INFO: renamed from: f */
    public final float f47588f;

    /* JADX INFO: renamed from: g */
    public final float f47589g;

    /* JADX INFO: renamed from: h */
    public final float f47590h;

    public dcn0(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f47585c = f;
        this.f47586d = f2;
        this.f47587e = f3;
        this.f47588f = f4;
        this.f47589g = f5;
        this.f47590h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcn0)) {
            return false;
        }
        dcn0 dcn0Var = (dcn0) obj;
        return Float.compare(this.f47585c, dcn0Var.f47585c) == 0 && Float.compare(this.f47586d, dcn0Var.f47586d) == 0 && Float.compare(this.f47587e, dcn0Var.f47587e) == 0 && Float.compare(this.f47588f, dcn0Var.f47588f) == 0 && Float.compare(this.f47589g, dcn0Var.f47589g) == 0 && Float.compare(this.f47590h, dcn0Var.f47590h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f47590h) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f47585c) * 31, 31, this.f47586d), 31, this.f47587e), 31, this.f47588f), 31, this.f47589g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f47585c);
        sb.append(", y1=");
        sb.append(this.f47586d);
        sb.append(", x2=");
        sb.append(this.f47587e);
        sb.append(", y2=");
        sb.append(this.f47588f);
        sb.append(", x3=");
        sb.append(this.f47589g);
        sb.append(", y3=");
        return ms2.m62684i(sb, this.f47590h, ')');
    }
}
