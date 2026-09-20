package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ihs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final String f102353a;

    /* JADX INFO: renamed from: b */
    public final String f102354b;

    /* JADX INFO: renamed from: c */
    public final List f102355c;

    /* JADX INFO: renamed from: d */
    public final String f102356d;

    /* JADX INFO: renamed from: e */
    public final List f102357e;

    /* JADX INFO: renamed from: f */
    public final List f102358f;

    /* JADX INFO: renamed from: g */
    public final String f102359g;

    /* JADX INFO: renamed from: h */
    public final Boolean f102360h;

    public ihs0(String str, String str2, List list, String str3, List list2, List list3, String str4, Boolean bool) {
        this.f102353a = str;
        this.f102354b = str2;
        this.f102355c = list;
        this.f102356d = str3;
        this.f102357e = list2;
        this.f102358f = list3;
        this.f102359g = str4;
        this.f102360h = bool;
    }

    /* JADX INFO: renamed from: a */
    public static ihs0 m50672a(ihs0 ihs0Var, String str, List list, int i) {
        if ((i & 1) != 0) {
            str = ihs0Var.f102353a;
        }
        String str2 = str;
        String str3 = ihs0Var.f102354b;
        if ((i & 4) != 0) {
            list = ihs0Var.f102355c;
        }
        String str4 = ihs0Var.f102356d;
        List list2 = ihs0Var.f102357e;
        List list3 = ihs0Var.f102358f;
        String str5 = ihs0Var.f102359g;
        Boolean bool = ihs0Var.f102360h;
        ihs0Var.getClass();
        return new ihs0(str2, str3, list, str4, list2, list3, str5, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihs0)) {
            return false;
        }
        ihs0 ihs0Var = (ihs0) obj;
        return wj50.m88271j(this.f102353a, ihs0Var.f102353a) && wj50.m88271j(this.f102354b, ihs0Var.f102354b) && wj50.m88271j(this.f102355c, ihs0Var.f102355c) && wj50.m88271j(this.f102356d, ihs0Var.f102356d) && wj50.m88271j(this.f102357e, ihs0Var.f102357e) && wj50.m88271j(this.f102358f, ihs0Var.f102358f) && wj50.m88271j(this.f102359g, ihs0Var.f102359g) && wj50.m88271j(this.f102360h, ihs0Var.f102360h);
    }

    public final int hashCode() {
        int iHashCode = this.f102353a.hashCode() * 31;
        String str = this.f102354b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f102355c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f102356d;
        int iM77244c = s571.m77244c(s571.m77244c((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f102357e), 31, this.f102358f);
        String str3 = this.f102359g;
        int iHashCode4 = (iM77244c + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f102360h;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }
}
