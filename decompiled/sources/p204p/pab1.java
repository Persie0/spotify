package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pab1 {

    /* JADX INFO: renamed from: a */
    public final String f175464a;

    /* JADX INFO: renamed from: b */
    public final String f175465b;

    /* JADX INFO: renamed from: c */
    public final int f175466c;

    /* JADX INFO: renamed from: d */
    public final long f175467d;

    public pab1(int i, String str, String str2, long j) {
        this.f175464a = str;
        this.f175465b = str2;
        this.f175466c = i;
        this.f175467d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pab1)) {
            return false;
        }
        pab1 pab1Var = (pab1) obj;
        return wj50.m88271j(this.f175464a, pab1Var.f175464a) && wj50.m88271j(this.f175465b, pab1Var.f175465b) && this.f175466c == pab1Var.f175466c && this.f175467d == pab1Var.f175467d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f175467d) + mt60.m62800g(this.f175466c, s571.m77243b(this.f175464a.hashCode() * 31, 31, this.f175465b), 31);
    }
}
