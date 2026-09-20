package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j2d0 {

    /* JADX INFO: renamed from: a */
    public final String f108010a;

    /* JADX INFO: renamed from: b */
    public final String f108011b;

    /* JADX INFO: renamed from: c */
    public final String f108012c;

    /* JADX INFO: renamed from: d */
    public final String f108013d;

    public j2d0(String str, String str2, String str3, String str4) {
        this.f108010a = str;
        this.f108011b = str2;
        this.f108012c = str3;
        this.f108013d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2d0)) {
            return false;
        }
        j2d0 j2d0Var = (j2d0) obj;
        return wj50.m88271j(this.f108010a, j2d0Var.f108010a) && wj50.m88271j(this.f108011b, j2d0Var.f108011b) && wj50.m88271j(this.f108012c, j2d0Var.f108012c) && wj50.m88271j(this.f108013d, j2d0Var.f108013d);
    }

    public final int hashCode() {
        return this.f108013d.hashCode() + s571.m77243b(s571.m77243b(this.f108010a.hashCode() * 31, 31, this.f108011b), 31, this.f108012c);
    }
}
