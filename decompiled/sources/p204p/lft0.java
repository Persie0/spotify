package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lft0 {

    /* JADX INFO: renamed from: a */
    public final mft0 f133011a;

    /* JADX INFO: renamed from: b */
    public final int f133012b;

    public lft0(mft0 mft0Var, int i) {
        this.f133011a = mft0Var;
        this.f133012b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lft0)) {
            return false;
        }
        lft0 lft0Var = (lft0) obj;
        return this.f133011a == lft0Var.f133011a && this.f133012b == lft0Var.f133012b;
    }

    public final int hashCode() {
        mft0 mft0Var = this.f133011a;
        return edb.m38547C(this.f133012b) + ((mft0Var == null ? 0 : mft0Var.hashCode()) * 31);
    }
}
