package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class y981 {

    /* JADX INFO: renamed from: a */
    public final float f270532a;

    /* JADX INFO: renamed from: b */
    public final float f270533b;

    /* JADX INFO: renamed from: c */
    public final float f270534c;

    /* JADX INFO: renamed from: d */
    public final float f270535d;

    public y981(float f, float f2, float f3, float f4) {
        this.f270532a = f;
        this.f270533b = f2;
        this.f270534c = f3;
        this.f270535d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y981)) {
            return false;
        }
        y981 y981Var = (y981) obj;
        return Float.compare(this.f270532a, y981Var.f270532a) == 0 && Float.compare(this.f270533b, y981Var.f270533b) == 0 && Float.compare(this.f270534c, y981Var.f270534c) == 0 && Float.compare(this.f270535d, y981Var.f270535d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f270535d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f270532a) * 31, 31, this.f270533b), 31, this.f270534c);
    }
}
