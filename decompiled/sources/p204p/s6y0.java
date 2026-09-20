package p204p;

import java.util.List;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class s6y0 {

    /* JADX INFO: renamed from: a */
    public final int f206220a;

    /* JADX INFO: renamed from: b */
    public final float f206221b;

    /* JADX INFO: renamed from: c */
    public final String f206222c;

    /* JADX INFO: renamed from: d */
    public final String f206223d;

    /* JADX INFO: renamed from: e */
    public final String f206224e;

    /* JADX INFO: renamed from: f */
    public final String f206225f;

    /* JADX INFO: renamed from: g */
    public final String f206226g;

    /* JADX INFO: renamed from: h */
    public final String f206227h;

    /* JADX INFO: renamed from: i */
    public final String f206228i;

    /* JADX INFO: renamed from: j */
    public final String f206229j;

    /* JADX INFO: renamed from: k */
    public final Integer f206230k;

    /* JADX INFO: renamed from: l */
    public final String f206231l;

    /* JADX INFO: renamed from: m */
    public final String f206232m;

    /* JADX INFO: renamed from: n */
    public final String f206233n;

    /* JADX INFO: renamed from: o */
    public final Boolean f206234o;

    /* JADX INFO: renamed from: p */
    public final List f206235p;

    /* JADX INFO: renamed from: q */
    public final List f206236q;

    /* JADX INFO: renamed from: r */
    public final u6y0 f206237r;

    public s6y0(int i, float f, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, Boolean bool, List list, List list2, u6y0 u6y0Var) {
        this.f206220a = i;
        this.f206221b = f;
        this.f206222c = str;
        this.f206223d = str2;
        this.f206224e = str3;
        this.f206225f = str4;
        this.f206226g = str5;
        this.f206227h = str6;
        this.f206228i = str7;
        this.f206229j = str8;
        this.f206230k = num;
        this.f206231l = str9;
        this.f206232m = str10;
        this.f206233n = str11;
        this.f206234o = bool;
        this.f206235p = list;
        this.f206236q = list2;
        this.f206237r = u6y0Var;
    }

    /* JADX INFO: renamed from: a */
    public static s6y0 m77350a(s6y0 s6y0Var, int i, float f, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, Boolean bool, List list, List list2, u6y0 u6y0Var, int i2) {
        int i3 = (i2 & 1) != 0 ? s6y0Var.f206220a : i;
        float f2 = (i2 & 2) != 0 ? s6y0Var.f206221b : f;
        String str12 = (i2 & 4) != 0 ? s6y0Var.f206222c : str;
        String str13 = (i2 & 8) != 0 ? s6y0Var.f206223d : str2;
        String str14 = (i2 & 16) != 0 ? s6y0Var.f206224e : str3;
        String str15 = (i2 & 32) != 0 ? s6y0Var.f206225f : str4;
        s6y0Var.getClass();
        s6y0Var.getClass();
        s6y0Var.getClass();
        String str16 = (i2 & 512) != 0 ? s6y0Var.f206226g : str5;
        String str17 = (i2 & 1024) != 0 ? s6y0Var.f206227h : str6;
        s6y0Var.getClass();
        s6y0Var.getClass();
        s6y0Var.getClass();
        s6y0Var.getClass();
        s6y0Var.getClass();
        String str18 = (65536 & i2) != 0 ? s6y0Var.f206228i : str7;
        String str19 = (131072 & i2) != 0 ? s6y0Var.f206229j : str8;
        Integer num2 = (262144 & i2) != 0 ? s6y0Var.f206230k : num;
        String str20 = (524288 & i2) != 0 ? s6y0Var.f206231l : str9;
        String str21 = (1048576 & i2) != 0 ? s6y0Var.f206232m : str10;
        String str22 = (2097152 & i2) != 0 ? s6y0Var.f206233n : str11;
        Boolean bool2 = (i2 & 4194304) != 0 ? s6y0Var.f206234o : bool;
        List list3 = (i2 & 8388608) != 0 ? s6y0Var.f206235p : list;
        List list4 = (i2 & 16777216) != 0 ? s6y0Var.f206236q : list2;
        u6y0 u6y0Var2 = (i2 & 33554432) != 0 ? s6y0Var.f206237r : u6y0Var;
        s6y0Var.getClass();
        return new s6y0(i3, f2, str12, str13, str14, str15, str16, str17, str18, str19, num2, str20, str21, str22, bool2, list3, list4, u6y0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6y0)) {
            return false;
        }
        s6y0 s6y0Var = (s6y0) obj;
        return this.f206220a == s6y0Var.f206220a && Float.compare(this.f206221b, s6y0Var.f206221b) == 0 && wj50.m88271j(this.f206222c, s6y0Var.f206222c) && wj50.m88271j(this.f206223d, s6y0Var.f206223d) && wj50.m88271j(this.f206224e, s6y0Var.f206224e) && wj50.m88271j(this.f206225f, s6y0Var.f206225f) && wj50.m88271j(this.f206226g, s6y0Var.f206226g) && wj50.m88271j(this.f206227h, s6y0Var.f206227h) && wj50.m88271j(this.f206228i, s6y0Var.f206228i) && wj50.m88271j(this.f206229j, s6y0Var.f206229j) && wj50.m88271j(this.f206230k, s6y0Var.f206230k) && wj50.m88271j(this.f206231l, s6y0Var.f206231l) && wj50.m88271j(this.f206232m, s6y0Var.f206232m) && wj50.m88271j(this.f206233n, s6y0Var.f206233n) && wj50.m88271j(this.f206234o, s6y0Var.f206234o) && wj50.m88271j(this.f206235p, s6y0Var.f206235p) && wj50.m88271j(this.f206236q, s6y0Var.f206236q) && this.f206237r == s6y0Var.f206237r;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(AbstractC0000a.m8g(edb.m38547C(this.f206220a) * 31, 31, this.f206221b), 31, this.f206222c), 31, this.f206223d), 31, this.f206224e), 923521, this.f206225f), 31, this.f206226g), 887503681, this.f206227h), 31, this.f206228i), 31, this.f206229j);
        Integer num = this.f206230k;
        int iHashCode = (iM77243b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f206231l;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f206232m;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f206233n;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f206234o;
        return this.f206237r.hashCode() + s571.m77244c(s571.m77244c((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f206235p), 31, this.f206236q);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ s6y0() {
        u6y0 u6y0Var = u6y0.NOTHING;
        lau lauVar = lau.f131415a;
        this(1, 0.0f, "", "", "", "", "", "", "", "", null, null, null, null, null, lauVar, lauVar, u6y0Var);
    }
}
