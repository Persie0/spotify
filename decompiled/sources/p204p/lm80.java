package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lm80 {

    /* JADX INFO: renamed from: a */
    public final String f134811a;

    /* JADX INFO: renamed from: b */
    public final String f134812b;

    /* JADX INFO: renamed from: c */
    public final String f134813c;

    /* JADX INFO: renamed from: d */
    public final String f134814d;

    /* JADX INFO: renamed from: e */
    public final String f134815e;

    public lm80(String str, String str2, String str3, String str4, String str5) {
        this.f134811a = str;
        this.f134812b = str2;
        this.f134813c = str3;
        this.f134814d = str4;
        this.f134815e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm80)) {
            return false;
        }
        lm80 lm80Var = (lm80) obj;
        return wj50.m88271j(this.f134811a, lm80Var.f134811a) && wj50.m88271j(this.f134812b, lm80Var.f134812b) && wj50.m88271j(this.f134813c, lm80Var.f134813c) && wj50.m88271j(this.f134814d, lm80Var.f134814d) && wj50.m88271j(this.f134815e, lm80Var.f134815e);
    }

    public final int hashCode() {
        String str = this.f134811a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f134812b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f134813c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f134814d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f134815e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
