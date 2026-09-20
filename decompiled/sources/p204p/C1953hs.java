package p204p;

/* JADX INFO: renamed from: p.hs */
/* JADX INFO: loaded from: classes4.dex */
public final class C1953hs {

    /* JADX INFO: renamed from: a */
    public final boolean f94568a;

    /* JADX INFO: renamed from: b */
    public final boolean f94569b;

    /* JADX INFO: renamed from: c */
    public final boolean f94570c;

    public C1953hs(boolean z, boolean z2, boolean z3) {
        this.f94568a = z;
        this.f94569b = z2;
        this.f94570c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1953hs)) {
            return false;
        }
        C1953hs c1953hs = (C1953hs) obj;
        return this.f94568a == c1953hs.f94568a && this.f94569b == c1953hs.f94569b && this.f94570c == c1953hs.f94570c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94570c) + s571.m77245d(Boolean.hashCode(this.f94568a) * 31, 31, this.f94569b);
    }
}
