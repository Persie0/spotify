package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zof0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final String f284780a;

    /* JADX INFO: renamed from: b */
    public final String f284781b;

    /* JADX INFO: renamed from: c */
    public final Double f284782c;

    /* JADX INFO: renamed from: d */
    public final String f284783d;

    public zof0(String str, String str2, Double d, String str3) {
        this.f284780a = str;
        this.f284781b = str2;
        this.f284782c = d;
        this.f284783d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zof0)) {
            return false;
        }
        zof0 zof0Var = (zof0) obj;
        return wj50.m88271j(this.f284780a, zof0Var.f284780a) && wj50.m88271j(this.f284781b, zof0Var.f284781b) && wj50.m88271j(this.f284782c, zof0Var.f284782c) && wj50.m88271j(this.f284783d, zof0Var.f284783d);
    }

    public final int hashCode() {
        int iHashCode = this.f284780a.hashCode() * 31;
        String str = this.f284781b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f284782c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f284783d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
