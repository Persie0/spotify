package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r7r0 {

    /* JADX INFO: renamed from: a */
    public final boolean f196640a;

    /* JADX INFO: renamed from: b */
    public final boolean f196641b;

    /* JADX INFO: renamed from: c */
    public final long f196642c;

    public /* synthetic */ r7r0() {
        this(-1L, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7r0)) {
            return false;
        }
        r7r0 r7r0Var = (r7r0) obj;
        return this.f196640a == r7r0Var.f196640a && this.f196641b == r7r0Var.f196641b && this.f196642c == r7r0Var.f196642c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f196642c) + s571.m77245d(Boolean.hashCode(this.f196640a) * 31, 31, this.f196641b);
    }

    public r7r0(long j, boolean z, boolean z2) {
        this.f196640a = z;
        this.f196641b = z2;
        this.f196642c = j;
    }
}
