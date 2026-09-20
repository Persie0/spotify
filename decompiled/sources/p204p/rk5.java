package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class rk5 {

    /* JADX INFO: renamed from: a */
    public final String f199983a;

    /* JADX INFO: renamed from: b */
    public final String f199984b;

    /* JADX INFO: renamed from: c */
    public final mlm0 f199985c;

    /* JADX INFO: renamed from: d */
    public final ohi f199986d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f199987e;

    /* JADX INFO: renamed from: f */
    public final String f199988f;

    /* JADX INFO: renamed from: g */
    public final String f199989g;

    /* JADX INFO: renamed from: h */
    public final String f199990h;

    public rk5(String str, String str2, mlm0 mlm0Var, ohi ohiVar, ArrayList arrayList, String str3, String str4, String str5) {
        this.f199983a = str;
        this.f199984b = str2;
        this.f199985c = mlm0Var;
        this.f199986d = ohiVar;
        this.f199987e = arrayList;
        this.f199988f = str3;
        this.f199989g = str4;
        this.f199990h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk5)) {
            return false;
        }
        rk5 rk5Var = (rk5) obj;
        return wj50.m88271j(this.f199983a, rk5Var.f199983a) && wj50.m88271j(this.f199984b, rk5Var.f199984b) && this.f199985c == rk5Var.f199985c && this.f199986d == rk5Var.f199986d && this.f199987e.equals(rk5Var.f199987e) && wj50.m88271j(this.f199988f, rk5Var.f199988f) && wj50.m88271j(this.f199989g, rk5Var.f199989g) && wj50.m88271j(this.f199990h, rk5Var.f199990h);
    }

    public final int hashCode() {
        String str = this.f199983a;
        int iM59700f = lq51.m59700f(this.f199987e, (this.f199986d.hashCode() + ((this.f199985c.hashCode() + s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f199984b)) * 31)) * 31, 31);
        String str2 = this.f199988f;
        int iHashCode = (iM59700f + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f199989g;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f199990h;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }
}
