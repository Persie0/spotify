package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class v0m {

    /* JADX INFO: renamed from: a */
    public final long f236081a;

    /* JADX INFO: renamed from: b */
    public final float f236082b;

    /* JADX INFO: renamed from: c */
    public final int f236083c;

    /* JADX INFO: renamed from: d */
    public final double f236084d;

    public v0m(long j, float f, int i, double d) {
        this.f236081a = j;
        this.f236082b = f;
        this.f236083c = i;
        this.f236084d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0m)) {
            return false;
        }
        v0m v0mVar = (v0m) obj;
        return this.f236081a == v0mVar.f236081a && Float.compare(this.f236082b, v0mVar.f236082b) == 0 && this.f236083c == v0mVar.f236083c && Double.compare(this.f236084d, v0mVar.f236084d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f236084d) + f710.m40938f(this.f236083c, AbstractC0000a.m8g(Long.hashCode(this.f236081a) * 31, 31, this.f236082b), 31);
    }
}
