package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class kxk {

    /* JADX INFO: renamed from: a */
    public final float f127516a;

    /* JADX INFO: renamed from: b */
    public final float f127517b;

    /* JADX INFO: renamed from: c */
    public final float f127518c;

    public kxk(float f, float f2, float f3) {
        this.f127516a = f;
        this.f127517b = f2;
        this.f127518c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxk)) {
            return false;
        }
        kxk kxkVar = (kxk) obj;
        return ybs.m93301b(this.f127516a, kxkVar.f127516a) && ybs.m93301b(this.f127517b, kxkVar.f127517b) && ybs.m93301b(this.f127518c, kxkVar.f127518c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f127518c) + AbstractC0000a.m8g(Float.hashCode(this.f127516a) * 31, 31, this.f127517b);
    }
}
