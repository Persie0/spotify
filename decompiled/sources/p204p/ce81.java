package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ce81 {

    /* JADX INFO: renamed from: A */
    public final List f37027A;

    /* JADX INFO: renamed from: B */
    public final String f37028B;

    /* JADX INFO: renamed from: C */
    public final Integer f37029C;

    /* JADX INFO: renamed from: D */
    public final String f37030D;

    /* JADX INFO: renamed from: E */
    public final String f37031E;

    /* JADX INFO: renamed from: F */
    public final boolean f37032F;

    /* JADX INFO: renamed from: G */
    public final boolean f37033G;

    /* JADX INFO: renamed from: H */
    public final int f37034H;

    /* JADX INFO: renamed from: a */
    public final String f37035a;

    /* JADX INFO: renamed from: b */
    public final String f37036b;

    /* JADX INFO: renamed from: c */
    public final String f37037c;

    /* JADX INFO: renamed from: d */
    public final String f37038d;

    /* JADX INFO: renamed from: e */
    public final String f37039e;

    /* JADX INFO: renamed from: f */
    public final String f37040f;

    /* JADX INFO: renamed from: g */
    public final String f37041g;

    /* JADX INFO: renamed from: h */
    public final String f37042h;

    /* JADX INFO: renamed from: i */
    public final rcm0 f37043i;

    /* JADX INFO: renamed from: j */
    public final String f37044j;

    /* JADX INFO: renamed from: k */
    public final boolean f37045k;

    /* JADX INFO: renamed from: l */
    public final boolean f37046l;

    /* JADX INFO: renamed from: m */
    public final kct f37047m;

    /* JADX INFO: renamed from: n */
    public final Object f37048n;

    /* JADX INFO: renamed from: o */
    public final is9 f37049o;

    /* JADX INFO: renamed from: p */
    public final boolean f37050p;

    /* JADX INFO: renamed from: q */
    public final boolean f37051q;

    /* JADX INFO: renamed from: r */
    public final lej f37052r;

    /* JADX INFO: renamed from: s */
    public final int f37053s;

    /* JADX INFO: renamed from: t */
    public final boolean f37054t;

    /* JADX INFO: renamed from: u */
    public final boolean f37055u;

    /* JADX INFO: renamed from: v */
    public final boolean f37056v;

    /* JADX INFO: renamed from: w */
    public final boolean f37057w;

    /* JADX INFO: renamed from: x */
    public final boolean f37058x;

    /* JADX INFO: renamed from: y */
    public final boolean f37059y;

    /* JADX INFO: renamed from: z */
    public final boolean f37060z;

    public ce81(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, rcm0 rcm0Var, String str9, boolean z, boolean z2, kct kctVar, List list, is9 is9Var, boolean z3, boolean z4, lej lejVar, int i2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, ArrayList arrayList, String str10, Integer num, String str11, String str12, boolean z12, int i3, int i4) {
        boolean z13 = (i3 & 8388608) != 0 ? false : z8;
        boolean z14 = (i3 & 16777216) != 0 ? false : z9;
        boolean z15 = (i3 & 33554432) != 0 ? false : z10;
        List list2 = (i3 & 134217728) != 0 ? lau.f131415a : arrayList;
        Integer num2 = (i3 & 536870912) != 0 ? null : num;
        String str13 = (i3 & 1073741824) == 0 ? str11 : null;
        String str14 = (i3 & Integer.MIN_VALUE) != 0 ? "" : str12;
        boolean z16 = (i4 & 1) == 0;
        boolean z17 = (i4 & 2) == 0 ? z12 : false;
        this.f37035a = str;
        this.f37036b = str2;
        this.f37037c = str3;
        this.f37038d = str4;
        this.f37039e = str5;
        this.f37040f = str6;
        this.f37041g = str7;
        this.f37042h = str8;
        this.f37034H = i;
        this.f37043i = rcm0Var;
        this.f37044j = str9;
        this.f37045k = z;
        this.f37046l = z2;
        this.f37047m = kctVar;
        this.f37048n = list;
        this.f37049o = is9Var;
        this.f37050p = z3;
        this.f37051q = z4;
        this.f37052r = lejVar;
        this.f37053s = i2;
        this.f37054t = z5;
        this.f37055u = z6;
        this.f37056v = z7;
        this.f37057w = z13;
        this.f37058x = z14;
        this.f37059y = z15;
        this.f37060z = z11;
        this.f37027A = list2;
        this.f37028B = str10;
        this.f37029C = num2;
        this.f37030D = str13;
        this.f37031E = str14;
        this.f37032F = z16;
        this.f37033G = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce81)) {
            return false;
        }
        ce81 ce81Var = (ce81) obj;
        return wj50.m88271j(this.f37035a, ce81Var.f37035a) && wj50.m88271j(this.f37036b, ce81Var.f37036b) && wj50.m88271j(this.f37037c, ce81Var.f37037c) && wj50.m88271j(this.f37038d, ce81Var.f37038d) && wj50.m88271j(this.f37039e, ce81Var.f37039e) && wj50.m88271j(this.f37040f, ce81Var.f37040f) && wj50.m88271j(this.f37041g, ce81Var.f37041g) && wj50.m88271j(this.f37042h, ce81Var.f37042h) && this.f37034H == ce81Var.f37034H && this.f37043i.equals(ce81Var.f37043i) && wj50.m88271j(this.f37044j, ce81Var.f37044j) && this.f37045k == ce81Var.f37045k && this.f37046l == ce81Var.f37046l && wj50.m88271j(this.f37047m, ce81Var.f37047m) && this.f37048n.equals(ce81Var.f37048n) && this.f37049o.equals(ce81Var.f37049o) && this.f37050p == ce81Var.f37050p && this.f37051q == ce81Var.f37051q && wj50.m88271j(this.f37052r, ce81Var.f37052r) && this.f37053s == ce81Var.f37053s && this.f37054t == ce81Var.f37054t && this.f37055u == ce81Var.f37055u && this.f37056v == ce81Var.f37056v && this.f37057w == ce81Var.f37057w && this.f37058x == ce81Var.f37058x && this.f37059y == ce81Var.f37059y && this.f37060z == ce81Var.f37060z && wj50.m88271j(this.f37027A, ce81Var.f37027A) && wj50.m88271j(this.f37028B, ce81Var.f37028B) && wj50.m88271j(this.f37029C, ce81Var.f37029C) && wj50.m88271j(this.f37030D, ce81Var.f37030D) && wj50.m88271j(this.f37031E, ce81Var.f37031E) && this.f37032F == ce81Var.f37032F && this.f37033G == ce81Var.f37033G;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f37035a.hashCode() * 31, 31, this.f37036b), 31, this.f37037c), 31, this.f37038d), 31, this.f37039e), 31, this.f37040f), 31, this.f37041g);
        String str = this.f37042h;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77243b(yds.m93483m(this.f37043i, f710.m40938f(this.f37034H, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f37044j), 31, this.f37045k), 31, this.f37046l);
        kct kctVar = this.f37047m;
        int iM77243b2 = s571.m77243b(s571.m77244c(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f37053s, (this.f37052r.hashCode() + s571.m77245d(s571.m77245d((this.f37049o.hashCode() + dq60.m36604d((iM77245d + (kctVar == null ? 0 : kctVar.hashCode())) * 31, 31, this.f37048n)) * 31, 31, this.f37050p), 31, this.f37051q)) * 31, 31), 31, this.f37054t), 31, this.f37055u), 31, this.f37056v), 31, this.f37057w), 31, this.f37058x), 31, this.f37059y), 31, this.f37060z), 31, this.f37027A), 31, this.f37028B);
        Integer num = this.f37029C;
        int iHashCode = (iM77243b2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f37030D;
        return Boolean.hashCode(this.f37033G) + s571.m77245d(s571.m77243b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f37031E), 31, this.f37032F);
    }
}
