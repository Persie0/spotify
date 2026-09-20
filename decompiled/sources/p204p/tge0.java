package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tge0 {

    /* JADX INFO: renamed from: a */
    public final long f220176a;

    /* JADX INFO: renamed from: b */
    public final boolean f220177b;

    /* JADX INFO: renamed from: c */
    public final long f220178c;

    public tge0(long j, long j2, boolean z) {
        this.f220176a = j;
        this.f220177b = z;
        this.f220178c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tge0)) {
            return false;
        }
        tge0 tge0Var = (tge0) obj;
        return this.f220176a == tge0Var.f220176a && this.f220177b == tge0Var.f220177b && this.f220178c == tge0Var.f220178c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f220178c) + s571.m77245d(Long.hashCode(this.f220176a) * 31, 31, this.f220177b);
    }
}
