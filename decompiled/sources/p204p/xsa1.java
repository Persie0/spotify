package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xsa1 {

    /* JADX INFO: renamed from: a */
    public final String f265552a;

    /* JADX INFO: renamed from: b */
    public final String f265553b;

    /* JADX INFO: renamed from: c */
    public final String f265554c;

    /* JADX INFO: renamed from: d */
    public final int f265555d;

    public xsa1(String str, String str2, int i, String str3) {
        this.f265552a = str;
        this.f265553b = str2;
        this.f265554c = str3;
        this.f265555d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsa1)) {
            return false;
        }
        xsa1 xsa1Var = (xsa1) obj;
        return wj50.m88271j(this.f265552a, xsa1Var.f265552a) && wj50.m88271j(this.f265553b, xsa1Var.f265553b) && wj50.m88271j(this.f265554c, xsa1Var.f265554c) && this.f265555d == xsa1Var.f265555d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f265555d) + s571.m77243b(s571.m77243b(this.f265552a.hashCode() * 31, 31, this.f265553b), 31, this.f265554c);
    }
}
