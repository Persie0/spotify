package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class krb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f125605a;

    /* JADX INFO: renamed from: b */
    public final boolean f125606b;

    public krb1(boolean z, boolean z2) {
        this.f125605a = z;
        this.f125606b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krb1)) {
            return false;
        }
        krb1 krb1Var = (krb1) obj;
        return this.f125605a == krb1Var.f125605a && this.f125606b == krb1Var.f125606b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125606b) + (Boolean.hashCode(this.f125605a) * 31);
    }
}
