package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d02 {

    /* JADX INFO: renamed from: a */
    public final String f43696a;

    /* JADX INFO: renamed from: b */
    public final String f43697b;

    /* JADX INFO: renamed from: c */
    public final String f43698c;

    /* JADX INFO: renamed from: d */
    public final String f43699d;

    /* JADX INFO: renamed from: e */
    public final String f43700e;

    /* JADX INFO: renamed from: f */
    public final String f43701f;

    /* JADX INFO: renamed from: g */
    public final String f43702g;

    /* JADX INFO: renamed from: h */
    public final String f43703h;

    /* JADX INFO: renamed from: i */
    public final List f43704i;

    /* JADX INFO: renamed from: j */
    public final List f43705j;

    /* JADX INFO: renamed from: k */
    public final boolean f43706k;

    /* JADX INFO: renamed from: l */
    public final boolean f43707l;

    /* JADX INFO: renamed from: m */
    public final boolean f43708m;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d02(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = (i & 1) != 0 ? "" : str;
        String str9 = (i & 2) != 0 ? "" : str2;
        String str10 = (i & 4) != 0 ? "" : str3;
        String str11 = (i & 8) != 0 ? "" : str4;
        String str12 = (i & 16) != 0 ? "" : str5;
        String str13 = (i & 32) != 0 ? "" : str6;
        String str14 = (i & 64) != 0 ? "" : str7;
        boolean z = (i & 1024) == 0;
        lau lauVar = lau.f131415a;
        this(str8, str9, str10, str11, str12, str13, str14, "", lauVar, lauVar, z, false, false);
    }

    /* JADX INFO: renamed from: a */
    public static d02 m34487a(d02 d02Var, String str, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, boolean z3, int i) {
        String str2 = d02Var.f43696a;
        String str3 = d02Var.f43697b;
        String str4 = d02Var.f43698c;
        String str5 = d02Var.f43699d;
        String str6 = d02Var.f43700e;
        String str7 = d02Var.f43701f;
        String str8 = d02Var.f43702g;
        if ((i & 128) != 0) {
            str = d02Var.f43703h;
        }
        String str9 = str;
        List list = (i & 256) != 0 ? d02Var.f43704i : arrayList;
        List list2 = (i & 512) != 0 ? d02Var.f43705j : arrayList2;
        boolean z4 = (i & 2048) != 0 ? d02Var.f43707l : z2;
        boolean z5 = (i & 4096) != 0 ? d02Var.f43708m : z3;
        d02Var.getClass();
        return new d02(str2, str3, str4, str5, str6, str7, str8, str9, list, list2, z, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d02)) {
            return false;
        }
        d02 d02Var = (d02) obj;
        return wj50.m88271j(this.f43696a, d02Var.f43696a) && wj50.m88271j(this.f43697b, d02Var.f43697b) && wj50.m88271j(this.f43698c, d02Var.f43698c) && wj50.m88271j(this.f43699d, d02Var.f43699d) && wj50.m88271j(this.f43700e, d02Var.f43700e) && wj50.m88271j(this.f43701f, d02Var.f43701f) && wj50.m88271j(this.f43702g, d02Var.f43702g) && wj50.m88271j(this.f43703h, d02Var.f43703h) && wj50.m88271j(this.f43704i, d02Var.f43704i) && wj50.m88271j(this.f43705j, d02Var.f43705j) && this.f43706k == d02Var.f43706k && this.f43707l == d02Var.f43707l && this.f43708m == d02Var.f43708m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43708m) + s571.m77245d(s571.m77245d(s571.m77244c(s571.m77244c(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f43696a.hashCode() * 31, 31, this.f43697b), 31, this.f43698c), 31, this.f43699d), 31, this.f43700e), 31, this.f43701f), 31, this.f43702g), 31, this.f43703h), 31, this.f43704i), 31, this.f43705j), 31, this.f43706k), 31, this.f43707l);
    }

    public d02(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, boolean z, boolean z2, boolean z3) {
        this.f43696a = str;
        this.f43697b = str2;
        this.f43698c = str3;
        this.f43699d = str4;
        this.f43700e = str5;
        this.f43701f = str6;
        this.f43702g = str7;
        this.f43703h = str8;
        this.f43704i = list;
        this.f43705j = list2;
        this.f43706k = z;
        this.f43707l = z2;
        this.f43708m = z3;
    }
}
