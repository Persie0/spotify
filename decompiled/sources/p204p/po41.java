package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class po41 {

    /* JADX INFO: renamed from: a */
    public final String f179597a;

    /* JADX INFO: renamed from: b */
    public final String f179598b;

    /* JADX INFO: renamed from: c */
    public final String f179599c;

    public po41(String str, String str2, String str3) {
        this.f179597a = str;
        this.f179598b = str2;
        this.f179599c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po41)) {
            return false;
        }
        po41 po41Var = (po41) obj;
        return wj50.m88271j(this.f179597a, po41Var.f179597a) && wj50.m88271j(this.f179598b, po41Var.f179598b) && wj50.m88271j(this.f179599c, po41Var.f179599c);
    }

    public final int hashCode() {
        String str = this.f179597a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f179598b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f179599c;
        return (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
    }
}
