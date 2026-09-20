package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class ww4 {

    /* JADX INFO: renamed from: a */
    public final float f255692a;

    /* JADX INFO: renamed from: b */
    public final float f255693b;

    /* JADX INFO: renamed from: c */
    public final boolean f255694c;

    public ww4(float f, float f2, boolean z) {
        this.f255692a = f;
        this.f255693b = f2;
        this.f255694c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww4)) {
            return false;
        }
        ww4 ww4Var = (ww4) obj;
        return Float.compare(this.f255692a, ww4Var.f255692a) == 0 && ybs.m93301b(this.f255693b, ww4Var.f255693b) && this.f255694c == ww4Var.f255694c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255694c) + AbstractC0000a.m8g(Float.hashCode(this.f255692a) * 31, 31, this.f255693b);
    }
}
