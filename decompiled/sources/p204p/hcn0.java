package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class hcn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f89847c;

    /* JADX INFO: renamed from: d */
    public final float f89848d;

    /* JADX INFO: renamed from: e */
    public final float f89849e;

    /* JADX INFO: renamed from: f */
    public final float f89850f;

    public hcn0(float f, float f2, float f3, float f4) {
        super(1);
        this.f89847c = f;
        this.f89848d = f2;
        this.f89849e = f3;
        this.f89850f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcn0)) {
            return false;
        }
        hcn0 hcn0Var = (hcn0) obj;
        return Float.compare(this.f89847c, hcn0Var.f89847c) == 0 && Float.compare(this.f89848d, hcn0Var.f89848d) == 0 && Float.compare(this.f89849e, hcn0Var.f89849e) == 0 && Float.compare(this.f89850f, hcn0Var.f89850f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f89850f) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f89847c) * 31, 31, this.f89848d), 31, this.f89849e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f89847c);
        sb.append(", y1=");
        sb.append(this.f89848d);
        sb.append(", x2=");
        sb.append(this.f89849e);
        sb.append(", y2=");
        return ms2.m62684i(sb, this.f89850f, ')');
    }
}
