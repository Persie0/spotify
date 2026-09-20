package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xtc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final String f265835a;

    /* JADX INFO: renamed from: b */
    public final String f265836b;

    /* JADX INFO: renamed from: c */
    public final Long f265837c;

    /* JADX INFO: renamed from: d */
    public final String f265838d;

    /* JADX INFO: renamed from: e */
    public final String f265839e;

    /* JADX INFO: renamed from: f */
    public final d850 f265840f;

    public xtc0(String str, String str2, Long l, String str3, String str4, d850 d850Var) {
        this.f265835a = str;
        this.f265836b = str2;
        this.f265837c = l;
        this.f265838d = str3;
        this.f265839e = str4;
        this.f265840f = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtc0)) {
            return false;
        }
        xtc0 xtc0Var = (xtc0) obj;
        return wj50.m88271j(this.f265835a, xtc0Var.f265835a) && wj50.m88271j(this.f265836b, xtc0Var.f265836b) && wj50.m88271j(this.f265837c, xtc0Var.f265837c) && wj50.m88271j(this.f265838d, xtc0Var.f265838d) && wj50.m88271j(this.f265839e, xtc0Var.f265839e) && wj50.m88271j(this.f265840f, xtc0Var.f265840f);
    }

    public final int hashCode() {
        int iHashCode = this.f265835a.hashCode() * 31;
        String str = this.f265836b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f265837c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f265838d;
        int iM77243b = s571.m77243b((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f265839e);
        d850 d850Var = this.f265840f;
        return iM77243b + (d850Var != null ? d850Var.hashCode() : 0);
    }
}
