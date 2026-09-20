package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class icn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f100848c;

    /* JADX INFO: renamed from: d */
    public final float f100849d;

    /* JADX INFO: renamed from: e */
    public final float f100850e;

    /* JADX INFO: renamed from: f */
    public final float f100851f;

    public icn0(float f, float f2, float f3, float f4) {
        super(2);
        this.f100848c = f;
        this.f100849d = f2;
        this.f100850e = f3;
        this.f100851f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icn0)) {
            return false;
        }
        icn0 icn0Var = (icn0) obj;
        return Float.compare(this.f100848c, icn0Var.f100848c) == 0 && Float.compare(this.f100849d, icn0Var.f100849d) == 0 && Float.compare(this.f100850e, icn0Var.f100850e) == 0 && Float.compare(this.f100851f, icn0Var.f100851f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f100851f) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f100848c) * 31, 31, this.f100849d), 31, this.f100850e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f100848c);
        sb.append(", y1=");
        sb.append(this.f100849d);
        sb.append(", x2=");
        sb.append(this.f100850e);
        sb.append(", y2=");
        return ms2.m62684i(sb, this.f100851f, ')');
    }
}
