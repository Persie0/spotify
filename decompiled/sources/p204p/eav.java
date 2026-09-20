package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class eav implements iav {

    /* JADX INFO: renamed from: a */
    public final int f57729a;

    /* JADX INFO: renamed from: b */
    public final float f57730b;

    /* JADX INFO: renamed from: c */
    public final float f57731c;

    /* JADX INFO: renamed from: d */
    public final float f57732d;

    /* JADX INFO: renamed from: e */
    public final float f57733e;

    public eav(float f, float f2, float f3, float f4, int i) {
        this.f57729a = i;
        this.f57730b = f;
        this.f57731c = f2;
        this.f57732d = f3;
        this.f57733e = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eav)) {
            return false;
        }
        eav eavVar = (eav) obj;
        return this.f57729a == eavVar.f57729a && Float.compare(this.f57730b, eavVar.f57730b) == 0 && Float.compare(this.f57731c, eavVar.f57731c) == 0 && Float.compare(this.f57732d, eavVar.f57732d) == 0 && Float.compare(this.f57733e, eavVar.f57733e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f57733e) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Integer.hashCode(this.f57729a) * 31, 31, this.f57730b), 31, this.f57731c), 31, this.f57732d);
    }
}
