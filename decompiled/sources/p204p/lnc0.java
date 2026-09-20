package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class lnc0 {

    /* JADX INFO: renamed from: a */
    public final float f135136a;

    /* JADX INFO: renamed from: b */
    public final float f135137b;

    /* JADX INFO: renamed from: c */
    public final float f135138c;

    public lnc0(float f, float f2, float f3) {
        this.f135136a = f;
        this.f135137b = f2;
        this.f135138c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnc0)) {
            return false;
        }
        lnc0 lnc0Var = (lnc0) obj;
        return Float.compare(this.f135136a, lnc0Var.f135136a) == 0 && Float.compare(this.f135137b, lnc0Var.f135137b) == 0 && Float.compare(this.f135138c, lnc0Var.f135138c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f135138c) + AbstractC0000a.m8g(Float.hashCode(this.f135136a) * 31, 31, this.f135137b);
    }
}
