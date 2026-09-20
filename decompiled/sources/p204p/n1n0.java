package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n1n0 {

    /* JADX INFO: renamed from: a */
    public final String f149476a;

    /* JADX INFO: renamed from: b */
    public final String f149477b;

    public n1n0(String str, String str2) {
        this.f149476a = str;
        this.f149477b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1n0)) {
            return false;
        }
        n1n0 n1n0Var = (n1n0) obj;
        return wj50.m88271j(this.f149476a, n1n0Var.f149476a) && wj50.m88271j(this.f149477b, n1n0Var.f149477b);
    }

    public final int hashCode() {
        return this.f149477b.hashCode() + (this.f149476a.hashCode() * 31);
    }
}
