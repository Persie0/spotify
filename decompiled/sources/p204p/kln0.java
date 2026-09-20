package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class kln0 {

    /* JADX INFO: renamed from: a */
    public final long f123926a;

    /* JADX INFO: renamed from: b */
    public final long f123927b;

    /* JADX INFO: renamed from: c */
    public final float f123928c;

    public kln0(float f, long j, long j2) {
        this.f123926a = j;
        this.f123927b = j2;
        this.f123928c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kln0)) {
            return false;
        }
        kln0 kln0Var = (kln0) obj;
        long j = kln0Var.f123926a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f123926a, j) && as91.m27074b(this.f123927b, kln0Var.f123927b) && Float.compare(this.f123928c, kln0Var.f123928c) == 0 && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Float.hashCode(1.0f) + AbstractC0000a.m8g(dq60.m36605e(Long.hashCode(this.f123926a) * 31, this.f123927b, 31), 31, this.f123928c);
    }
}
