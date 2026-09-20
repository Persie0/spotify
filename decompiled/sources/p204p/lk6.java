package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lk6 {

    /* JADX INFO: renamed from: a */
    public final String f134269a;

    /* JADX INFO: renamed from: b */
    public final kyy f134270b;

    public lk6(String str, kyy kyyVar) {
        this.f134269a = str;
        this.f134270b = kyyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk6)) {
            return false;
        }
        lk6 lk6Var = (lk6) obj;
        return wj50.m88271j(this.f134269a, lk6Var.f134269a) && this.f134270b == lk6Var.f134270b;
    }

    public final int hashCode() {
        return this.f134270b.hashCode() + (this.f134269a.hashCode() * 31);
    }
}
