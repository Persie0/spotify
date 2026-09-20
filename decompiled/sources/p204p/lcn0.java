package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class lcn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f131955c;

    /* JADX INFO: renamed from: d */
    public final float f131956d;

    /* JADX INFO: renamed from: e */
    public final float f131957e;

    /* JADX INFO: renamed from: f */
    public final float f131958f;

    /* JADX INFO: renamed from: g */
    public final float f131959g;

    /* JADX INFO: renamed from: h */
    public final float f131960h;

    public lcn0(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f131955c = f;
        this.f131956d = f2;
        this.f131957e = f3;
        this.f131958f = f4;
        this.f131959g = f5;
        this.f131960h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcn0)) {
            return false;
        }
        lcn0 lcn0Var = (lcn0) obj;
        return Float.compare(this.f131955c, lcn0Var.f131955c) == 0 && Float.compare(this.f131956d, lcn0Var.f131956d) == 0 && Float.compare(this.f131957e, lcn0Var.f131957e) == 0 && Float.compare(this.f131958f, lcn0Var.f131958f) == 0 && Float.compare(this.f131959g, lcn0Var.f131959g) == 0 && Float.compare(this.f131960h, lcn0Var.f131960h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f131960h) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f131955c) * 31, 31, this.f131956d), 31, this.f131957e), 31, this.f131958f), 31, this.f131959g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f131955c);
        sb.append(", dy1=");
        sb.append(this.f131956d);
        sb.append(", dx2=");
        sb.append(this.f131957e);
        sb.append(", dy2=");
        sb.append(this.f131958f);
        sb.append(", dx3=");
        sb.append(this.f131959g);
        sb.append(", dy3=");
        return ms2.m62684i(sb, this.f131960h, ')');
    }
}
