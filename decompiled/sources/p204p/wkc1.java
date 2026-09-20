package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wkc1 {

    /* JADX INFO: renamed from: a */
    public final boolean f252204a;

    /* JADX INFO: renamed from: b */
    public final boolean f252205b;

    /* JADX INFO: renamed from: c */
    public final String f252206c;

    /* JADX INFO: renamed from: d */
    public final boolean f252207d;

    /* JADX INFO: renamed from: e */
    public final boolean f252208e;

    public wkc1(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f252204a = z;
        this.f252205b = z2;
        this.f252206c = str;
        this.f252207d = z3;
        this.f252208e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkc1)) {
            return false;
        }
        wkc1 wkc1Var = (wkc1) obj;
        return this.f252204a == wkc1Var.f252204a && this.f252205b == wkc1Var.f252205b && wj50.m88271j(this.f252206c, wkc1Var.f252206c) && this.f252207d == wkc1Var.f252207d && this.f252208e == wkc1Var.f252208e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f252208e) + s571.m77245d(s571.m77243b(s571.m77245d(Boolean.hashCode(this.f252204a) * 31, 31, this.f252205b), 31, this.f252206c), 31, this.f252207d);
    }
}
