package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lw5 {

    /* JADX INFO: renamed from: a */
    public final pw5 f137449a;

    /* JADX INFO: renamed from: b */
    public final String f137450b;

    /* JADX INFO: renamed from: c */
    public final String f137451c;

    public lw5(pw5 pw5Var, String str, String str2) {
        this.f137449a = pw5Var;
        this.f137450b = str;
        this.f137451c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw5)) {
            return false;
        }
        lw5 lw5Var = (lw5) obj;
        return this.f137449a == lw5Var.f137449a && wj50.m88271j(this.f137450b, lw5Var.f137450b) && wj50.m88271j(this.f137451c, lw5Var.f137451c);
    }

    public final int hashCode() {
        int iHashCode = this.f137449a.hashCode() * 31;
        String str = this.f137450b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f137451c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
