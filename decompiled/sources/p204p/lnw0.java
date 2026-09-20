package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lnw0 {

    /* JADX INFO: renamed from: a */
    public final String f135238a;

    /* JADX INFO: renamed from: b */
    public final String f135239b;

    public lnw0(String str, String str2) {
        this.f135238a = str;
        this.f135239b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnw0)) {
            return false;
        }
        lnw0 lnw0Var = (lnw0) obj;
        return wj50.m88271j(this.f135238a, lnw0Var.f135238a) && wj50.m88271j(this.f135239b, lnw0Var.f135239b);
    }

    public final int hashCode() {
        return this.f135239b.hashCode() + (this.f135238a.hashCode() * 31);
    }
}
