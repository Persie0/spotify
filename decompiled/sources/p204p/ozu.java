package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class ozu {

    /* JADX INFO: renamed from: a */
    public final float f172366a;

    /* JADX INFO: renamed from: b */
    public final float f172367b;

    /* JADX INFO: renamed from: c */
    public final float f172368c;

    /* JADX INFO: renamed from: d */
    public final float f172369d;

    public ozu(float f, float f2, float f3, float f4) {
        this.f172366a = f;
        this.f172367b = f2;
        this.f172368c = f3;
        this.f172369d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozu)) {
            return false;
        }
        ozu ozuVar = (ozu) obj;
        return ybs.m93301b(this.f172366a, ozuVar.f172366a) && ybs.m93301b(this.f172367b, ozuVar.f172367b) && ybs.m93301b(this.f172368c, ozuVar.f172368c) && ybs.m93301b(this.f172369d, ozuVar.f172369d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f172369d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f172366a) * 31, 31, this.f172367b), 31, this.f172368c);
    }
}
