package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class kcn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f121511c;

    /* JADX INFO: renamed from: d */
    public final float f121512d;

    /* JADX INFO: renamed from: e */
    public final float f121513e;

    /* JADX INFO: renamed from: f */
    public final boolean f121514f;

    /* JADX INFO: renamed from: g */
    public final boolean f121515g;

    /* JADX INFO: renamed from: h */
    public final float f121516h;

    /* JADX INFO: renamed from: i */
    public final float f121517i;

    public kcn0(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.f121511c = f;
        this.f121512d = f2;
        this.f121513e = f3;
        this.f121514f = z;
        this.f121515g = z2;
        this.f121516h = f4;
        this.f121517i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcn0)) {
            return false;
        }
        kcn0 kcn0Var = (kcn0) obj;
        return Float.compare(this.f121511c, kcn0Var.f121511c) == 0 && Float.compare(this.f121512d, kcn0Var.f121512d) == 0 && Float.compare(this.f121513e, kcn0Var.f121513e) == 0 && this.f121514f == kcn0Var.f121514f && this.f121515g == kcn0Var.f121515g && Float.compare(this.f121516h, kcn0Var.f121516h) == 0 && Float.compare(this.f121517i, kcn0Var.f121517i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f121517i) + AbstractC0000a.m8g(s571.m77245d(s571.m77245d(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f121511c) * 31, 31, this.f121512d), 31, this.f121513e), 31, this.f121514f), 31, this.f121515g), 31, this.f121516h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f121511c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f121512d);
        sb.append(", theta=");
        sb.append(this.f121513e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f121514f);
        sb.append(", isPositiveArc=");
        sb.append(this.f121515g);
        sb.append(", arcStartDx=");
        sb.append(this.f121516h);
        sb.append(", arcStartDy=");
        return ms2.m62684i(sb, this.f121517i, ')');
    }
}
