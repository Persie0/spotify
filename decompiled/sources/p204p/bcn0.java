package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class bcn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f25918c;

    /* JADX INFO: renamed from: d */
    public final float f25919d;

    /* JADX INFO: renamed from: e */
    public final float f25920e;

    /* JADX INFO: renamed from: f */
    public final boolean f25921f;

    /* JADX INFO: renamed from: g */
    public final boolean f25922g;

    /* JADX INFO: renamed from: h */
    public final float f25923h;

    /* JADX INFO: renamed from: i */
    public final float f25924i;

    public bcn0(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.f25918c = f;
        this.f25919d = f2;
        this.f25920e = f3;
        this.f25921f = z;
        this.f25922g = z2;
        this.f25923h = f4;
        this.f25924i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcn0)) {
            return false;
        }
        bcn0 bcn0Var = (bcn0) obj;
        return Float.compare(this.f25918c, bcn0Var.f25918c) == 0 && Float.compare(this.f25919d, bcn0Var.f25919d) == 0 && Float.compare(this.f25920e, bcn0Var.f25920e) == 0 && this.f25921f == bcn0Var.f25921f && this.f25922g == bcn0Var.f25922g && Float.compare(this.f25923h, bcn0Var.f25923h) == 0 && Float.compare(this.f25924i, bcn0Var.f25924i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25924i) + AbstractC0000a.m8g(s571.m77245d(s571.m77245d(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f25918c) * 31, 31, this.f25919d), 31, this.f25920e), 31, this.f25921f), 31, this.f25922g), 31, this.f25923h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f25918c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f25919d);
        sb.append(", theta=");
        sb.append(this.f25920e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f25921f);
        sb.append(", isPositiveArc=");
        sb.append(this.f25922g);
        sb.append(", arcStartX=");
        sb.append(this.f25923h);
        sb.append(", arcStartY=");
        return ms2.m62684i(sb, this.f25924i, ')');
    }
}
