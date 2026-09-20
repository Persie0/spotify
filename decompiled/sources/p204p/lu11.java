package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lu11 {

    /* JADX INFO: renamed from: a */
    public final String f136957a;

    /* JADX INFO: renamed from: b */
    public final String f136958b;

    /* JADX INFO: renamed from: c */
    public final int f136959c;

    public lu11(String str, String str2, int i) {
        this.f136957a = str;
        this.f136958b = str2;
        this.f136959c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu11)) {
            return false;
        }
        lu11 lu11Var = (lu11) obj;
        return wj50.m88271j(this.f136957a, lu11Var.f136957a) && wj50.m88271j(this.f136958b, lu11Var.f136958b) && this.f136959c == lu11Var.f136959c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f136959c) + s571.m77243b(this.f136957a.hashCode() * 31, 31, this.f136958b);
    }
}
