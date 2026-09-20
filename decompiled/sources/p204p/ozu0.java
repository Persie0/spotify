package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ozu0 {

    /* JADX INFO: renamed from: a */
    public final long f172370a;

    /* JADX INFO: renamed from: b */
    public final int f172371b;

    public ozu0(int i, long j) {
        this.f172370a = j;
        this.f172371b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozu0)) {
            return false;
        }
        ozu0 ozu0Var = (ozu0) obj;
        return this.f172370a == ozu0Var.f172370a && this.f172371b == ozu0Var.f172371b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f172371b) + (Long.hashCode(this.f172370a) * 31);
    }
}
