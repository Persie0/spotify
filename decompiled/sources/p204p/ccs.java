package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class ccs {

    /* JADX INFO: renamed from: a */
    public final float f36604a;

    /* JADX INFO: renamed from: b */
    public final float f36605b;

    /* JADX INFO: renamed from: c */
    public final float f36606c;

    /* JADX INFO: renamed from: d */
    public final float f36607d;

    public ccs(float f, float f2, float f3, float f4) {
        this.f36604a = f;
        this.f36605b = f2;
        this.f36606c = f3;
        this.f36607d = f4;
        if (f < 0.0f) {
            mt40.m62789a("Left must be non-negative");
        }
        if (f2 < 0.0f) {
            mt40.m62789a("Top must be non-negative");
        }
        if (f3 < 0.0f) {
            mt40.m62789a("Right must be non-negative");
        }
        if (f4 >= 0.0f) {
            return;
        }
        mt40.m62789a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccs)) {
            return false;
        }
        ccs ccsVar = (ccs) obj;
        return ybs.m93301b(this.f36604a, ccsVar.f36604a) && ybs.m93301b(this.f36605b, ccsVar.f36605b) && ybs.m93301b(this.f36606c, ccsVar.f36606c) && ybs.m93301b(this.f36607d, ccsVar.f36607d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f36604a) * 31, 31, this.f36605b), 31, this.f36606c), 31, this.f36607d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DpTouchBoundsExpansion(start=");
        pi9.m70086k(this.f36604a, sb, ", top=");
        pi9.m70086k(this.f36605b, sb, ", end=");
        pi9.m70086k(this.f36606c, sb, ", bottom=");
        sb.append((Object) ybs.m93302c(this.f36607d));
        sb.append(", isLayoutDirectionAware=true)");
        return sb.toString();
    }
}
