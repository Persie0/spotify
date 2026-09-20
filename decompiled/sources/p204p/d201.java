package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class d201 {

    /* JADX INFO: renamed from: a */
    public final String f44401a;

    /* JADX INFO: renamed from: b */
    public final String f44402b;

    /* JADX INFO: renamed from: c */
    public final String f44403c;

    /* JADX INFO: renamed from: d */
    public final int f44404d;

    public /* synthetic */ d201() {
        this(null, null, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public static d201 m34679a(d201 d201Var, String str, int i, int i2) {
        String str2 = d201Var.f44401a;
        if ((i2 & 2) != 0) {
            str = d201Var.f44402b;
        }
        String str3 = d201Var.f44403c;
        d201Var.getClass();
        return new d201(str2, str, i, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d201)) {
            return false;
        }
        d201 d201Var = (d201) obj;
        return wj50.m88271j(this.f44401a, d201Var.f44401a) && wj50.m88271j(this.f44402b, d201Var.f44402b) && wj50.m88271j(this.f44403c, d201Var.f44403c) && this.f44404d == d201Var.f44404d;
    }

    public final int hashCode() {
        String str = this.f44401a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f44402b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f44403c;
        return edb.m38547C(this.f44404d) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public d201(String str, String str2, int i, String str3) {
        this.f44401a = str;
        this.f44402b = str2;
        this.f44403c = str3;
        this.f44404d = i;
    }
}
