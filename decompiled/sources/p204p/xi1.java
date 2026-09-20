package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xi1 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f261741a;

    /* JADX INFO: renamed from: b */
    public final String f261742b;

    /* JADX INFO: renamed from: c */
    public final String f261743c;

    /* JADX INFO: renamed from: d */
    public final String f261744d;

    public xi1(String str, String str2, String str3, String str4) {
        this.f261741a = str;
        this.f261742b = str2;
        this.f261743c = str3;
        this.f261744d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi1)) {
            return false;
        }
        xi1 xi1Var = (xi1) obj;
        return wj50.m88271j(this.f261741a, xi1Var.f261741a) && wj50.m88271j(this.f261742b, xi1Var.f261742b) && wj50.m88271j(this.f261743c, xi1Var.f261743c) && wj50.m88271j(this.f261744d, xi1Var.f261744d);
    }

    public final int hashCode() {
        return this.f261744d.hashCode() + s571.m77243b(s571.m77243b(this.f261741a.hashCode() * 31, 31, this.f261742b), 31, this.f261743c);
    }
}
