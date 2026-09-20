package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class clx0 {

    /* JADX INFO: renamed from: a */
    public final String f39419a;

    /* JADX INFO: renamed from: b */
    public final long f39420b;

    public clx0(String str, long j) {
        this.f39419a = str;
        this.f39420b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clx0)) {
            return false;
        }
        clx0 clx0Var = (clx0) obj;
        return wj50.m88271j(this.f39419a, clx0Var.f39419a) && this.f39420b == clx0Var.f39420b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39420b) + (this.f39419a.hashCode() * 31);
    }
}
