package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xi81 {

    /* JADX INFO: renamed from: a */
    public final String f261816a;

    /* JADX INFO: renamed from: b */
    public final boolean f261817b;

    public xi81(String str, boolean z) {
        this.f261816a = str;
        this.f261817b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi81)) {
            return false;
        }
        xi81 xi81Var = (xi81) obj;
        return wj50.m88271j(this.f261816a, xi81Var.f261816a) && this.f261817b == xi81Var.f261817b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261817b) + (this.f261816a.hashCode() * 31);
    }
}
