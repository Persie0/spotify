package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d36 {

    /* JADX INFO: renamed from: a */
    public final String f44777a;

    /* JADX INFO: renamed from: b */
    public final String f44778b;

    /* JADX INFO: renamed from: c */
    public final String f44779c;

    /* JADX INFO: renamed from: d */
    public final String f44780d;

    public d36(String str, String str2, String str3, String str4) {
        this.f44777a = str;
        this.f44778b = str2;
        this.f44779c = str3;
        this.f44780d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d36)) {
            return false;
        }
        d36 d36Var = (d36) obj;
        return wj50.m88271j(this.f44777a, d36Var.f44777a) && wj50.m88271j(this.f44778b, d36Var.f44778b) && wj50.m88271j(this.f44779c, d36Var.f44779c) && wj50.m88271j(this.f44780d, d36Var.f44780d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f44777a.hashCode() * 31, 31, this.f44778b);
        String str = this.f44779c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f44780d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
