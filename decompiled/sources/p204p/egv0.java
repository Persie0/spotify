package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class egv0 {

    /* JADX INFO: renamed from: a */
    public final String f59407a;

    /* JADX INFO: renamed from: b */
    public final String f59408b;

    /* JADX INFO: renamed from: c */
    public final String f59409c;

    public egv0(String str, String str2, String str3) {
        this.f59407a = str;
        this.f59408b = str2;
        this.f59409c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egv0)) {
            return false;
        }
        egv0 egv0Var = (egv0) obj;
        return wj50.m88271j(this.f59407a, egv0Var.f59407a) && wj50.m88271j(this.f59408b, egv0Var.f59408b) && wj50.m88271j(this.f59409c, egv0Var.f59409c);
    }

    public final int hashCode() {
        int iHashCode = this.f59407a.hashCode() * 31;
        String str = this.f59408b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59409c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
