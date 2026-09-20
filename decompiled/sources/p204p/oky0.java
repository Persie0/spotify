package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class oky0 {

    /* JADX INFO: renamed from: a */
    public final float f166689a;

    /* JADX INFO: renamed from: b */
    public final float f166690b;

    /* JADX INFO: renamed from: c */
    public final float f166691c;

    /* JADX INFO: renamed from: d */
    public final float f166692d;

    /* JADX INFO: renamed from: e */
    public final float f166693e;

    /* JADX INFO: renamed from: f */
    public final float f166694f;

    public oky0(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f166689a = f;
        this.f166690b = f2;
        this.f166691c = f3;
        this.f166692d = f4;
        this.f166693e = f5;
        this.f166694f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oky0)) {
            return false;
        }
        oky0 oky0Var = (oky0) obj;
        return Float.compare(this.f166689a, oky0Var.f166689a) == 0 && Float.compare(this.f166690b, oky0Var.f166690b) == 0 && Float.compare(this.f166691c, oky0Var.f166691c) == 0 && Float.compare(this.f166692d, oky0Var.f166692d) == 0 && Float.compare(this.f166693e, oky0Var.f166693e) == 0 && Float.compare(this.f166694f, oky0Var.f166694f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f166694f) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f166689a) * 31, 31, this.f166690b), 31, this.f166691c), 31, this.f166692d), 31, this.f166693e);
    }
}
