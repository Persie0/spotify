package p204p;

import p000.AbstractC0000a;

/* JADX INFO: renamed from: p.r5 */
/* JADX INFO: loaded from: classes9.dex */
public final class C2326r5 {

    /* JADX INFO: renamed from: a */
    public final float f195910a;

    /* JADX INFO: renamed from: b */
    public final float f195911b;

    /* JADX INFO: renamed from: c */
    public final float f195912c;

    /* JADX INFO: renamed from: d */
    public final float f195913d;

    public C2326r5(float f, float f2, float f3, float f4) {
        this.f195910a = f;
        this.f195911b = f2;
        this.f195912c = f3;
        this.f195913d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2326r5)) {
            return false;
        }
        C2326r5 c2326r5 = (C2326r5) obj;
        return Float.compare(this.f195910a, c2326r5.f195910a) == 0 && Float.compare(this.f195911b, c2326r5.f195911b) == 0 && Float.compare(this.f195912c, c2326r5.f195912c) == 0 && Float.compare(this.f195913d, c2326r5.f195913d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f195913d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f195910a) * 31, 31, this.f195911b), 31, this.f195912c);
    }
}
