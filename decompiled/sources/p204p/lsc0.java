package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lsc0 implements msc0 {

    /* JADX INFO: renamed from: a */
    public final String f136497a;

    /* JADX INFO: renamed from: b */
    public final String f136498b;

    /* JADX INFO: renamed from: c */
    public final gtc0 f136499c;

    public lsc0(String str, String str2, gtc0 gtc0Var) {
        this.f136497a = str;
        this.f136498b = str2;
        this.f136499c = gtc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsc0)) {
            return false;
        }
        lsc0 lsc0Var = (lsc0) obj;
        return wj50.m88271j(this.f136497a, lsc0Var.f136497a) && wj50.m88271j(this.f136498b, lsc0Var.f136498b) && wj50.m88271j(this.f136499c, lsc0Var.f136499c);
    }

    public final int hashCode() {
        String str = this.f136497a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f136498b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        gtc0 gtc0Var = this.f136499c;
        return iHashCode2 + (gtc0Var != null ? gtc0Var.hashCode() : 0);
    }
}
