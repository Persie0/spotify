package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class pzh {

    /* JADX INFO: renamed from: a */
    public final String f183694a;

    /* JADX INFO: renamed from: b */
    public final ezh f183695b;

    /* JADX INFO: renamed from: c */
    public final String f183696c;

    /* JADX INFO: renamed from: d */
    public final String f183697d;

    /* JADX INFO: renamed from: e */
    public final List f183698e;

    /* JADX INFO: renamed from: f */
    public final List f183699f;

    /* JADX INFO: renamed from: g */
    public final Boolean f183700g;

    /* JADX INFO: renamed from: h */
    public final List f183701h;

    /* JADX INFO: renamed from: i */
    public final String f183702i;

    /* JADX INFO: renamed from: j */
    public final String f183703j;

    /* JADX INFO: renamed from: k */
    public final String f183704k;

    /* JADX INFO: renamed from: l */
    public final String f183705l;

    /* JADX INFO: renamed from: m */
    public final String f183706m;

    /* JADX INFO: renamed from: n */
    public final boolean f183707n;

    /* JADX INFO: renamed from: o */
    public final yqo f183708o;

    /* JADX INFO: renamed from: p */
    public final yqo f183709p;

    /* JADX INFO: renamed from: q */
    public final int f183710q;

    /* JADX INFO: renamed from: r */
    public final n6f f183711r;

    public pzh(String str, ezh ezhVar, String str2, String str3, List list, List list2, Boolean bool, List list3, String str4, String str5, String str6, String str7, String str8, boolean z, yqo yqoVar, yqo yqoVar2, int i, n6f n6fVar) {
        this.f183694a = str;
        this.f183695b = ezhVar;
        this.f183696c = str2;
        this.f183697d = str3;
        this.f183698e = list;
        this.f183699f = list2;
        this.f183700g = bool;
        this.f183701h = list3;
        this.f183702i = str4;
        this.f183703j = str5;
        this.f183704k = str6;
        this.f183705l = str7;
        this.f183706m = str8;
        this.f183707n = z;
        this.f183708o = yqoVar;
        this.f183709p = yqoVar2;
        this.f183710q = i;
        this.f183711r = n6fVar;
    }

    /* JADX INFO: renamed from: a */
    public static pzh m71755a(pzh pzhVar, String str, ae50 ae50Var, ae50 ae50Var2, Boolean bool, String str2, String str3, String str4, String str5, String str6, yqo yqoVar, yqo yqoVar2, int i, int i2) {
        String str7 = pzhVar.f183694a;
        ezh ezhVar = pzhVar.f183695b;
        String str8 = pzhVar.f183696c;
        String str9 = (i2 & 8) != 0 ? pzhVar.f183697d : str;
        List list = (i2 & 16) != 0 ? pzhVar.f183698e : ae50Var;
        List list2 = (i2 & 32) != 0 ? pzhVar.f183699f : ae50Var2;
        Boolean bool2 = (i2 & 64) != 0 ? pzhVar.f183700g : bool;
        List list3 = pzhVar.f183701h;
        String str10 = (i2 & 256) != 0 ? pzhVar.f183702i : str2;
        String str11 = (i2 & 512) != 0 ? pzhVar.f183703j : str3;
        String str12 = (i2 & 1024) != 0 ? pzhVar.f183704k : str4;
        String str13 = (i2 & 2048) != 0 ? pzhVar.f183705l : str5;
        String str14 = (i2 & 4096) != 0 ? pzhVar.f183706m : str6;
        boolean z = (i2 & 8192) != 0 ? pzhVar.f183707n : false;
        yqo yqoVar3 = (i2 & 16384) != 0 ? pzhVar.f183708o : yqoVar;
        yqo yqoVar4 = (i2 & 32768) != 0 ? pzhVar.f183709p : yqoVar2;
        int i3 = (i2 & 65536) != 0 ? pzhVar.f183710q : i;
        n6f n6fVar = pzhVar.f183711r;
        pzhVar.getClass();
        return new pzh(str7, ezhVar, str8, str9, list, list2, bool2, list3, str10, str11, str12, str13, str14, z, yqoVar3, yqoVar4, i3, n6fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzh)) {
            return false;
        }
        pzh pzhVar = (pzh) obj;
        return wj50.m88271j(this.f183694a, pzhVar.f183694a) && wj50.m88271j(this.f183695b, pzhVar.f183695b) && wj50.m88271j(this.f183696c, pzhVar.f183696c) && wj50.m88271j(this.f183697d, pzhVar.f183697d) && wj50.m88271j(this.f183698e, pzhVar.f183698e) && wj50.m88271j(this.f183699f, pzhVar.f183699f) && wj50.m88271j(this.f183700g, pzhVar.f183700g) && wj50.m88271j(this.f183701h, pzhVar.f183701h) && wj50.m88271j(this.f183702i, pzhVar.f183702i) && wj50.m88271j(this.f183703j, pzhVar.f183703j) && wj50.m88271j(this.f183704k, pzhVar.f183704k) && wj50.m88271j(this.f183705l, pzhVar.f183705l) && wj50.m88271j(this.f183706m, pzhVar.f183706m) && this.f183707n == pzhVar.f183707n && wj50.m88271j(this.f183708o, pzhVar.f183708o) && wj50.m88271j(this.f183709p, pzhVar.f183709p) && this.f183710q == pzhVar.f183710q && wj50.m88271j(this.f183711r, pzhVar.f183711r);
    }

    public final int hashCode() {
        int iHashCode = (this.f183695b.hashCode() + (this.f183694a.hashCode() * 31)) * 31;
        String str = this.f183696c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f183697d;
        int iM77244c = s571.m77244c(s571.m77244c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f183698e), 31, this.f183699f);
        Boolean bool = this.f183700g;
        int iM77244c2 = s571.m77244c((iM77244c + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f183701h);
        String str3 = this.f183702i;
        int iHashCode3 = (iM77244c2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f183703j;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f183704k;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f183705l;
        int iM77245d = s571.m77245d(s571.m77243b((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f183706m), 31, this.f183707n);
        yqo yqoVar = this.f183708o;
        int iHashCode6 = (iM77245d + (yqoVar == null ? 0 : yqoVar.hashCode())) * 31;
        yqo yqoVar2 = this.f183709p;
        int iM62800g = mt60.m62800g(this.f183710q, (iHashCode6 + (yqoVar2 == null ? 0 : yqoVar2.hashCode())) * 31, 31);
        n6f n6fVar = this.f183711r;
        return iM62800g + (n6fVar != null ? Long.hashCode(n6fVar.f150873a) : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ pzh(String str, ezh ezhVar, String str2, String str3, ae50 ae50Var, ae50 ae50Var2, String str4, String str5, String str6, String str7, String str8, boolean z, n6f n6fVar, int i) {
        String str9 = (i & 1) != 0 ? "" : str;
        ezh ezhVar2 = (i & 2) != 0 ? new ezh(255, null, null, null, null) : ezhVar;
        String str10 = (i & 4) != 0 ? null : str2;
        String str11 = (i & 8) != 0 ? null : str3;
        int i2 = i & 16;
        lau lauVar = lau.f131415a;
        this(str9, ezhVar2, str10, str11, i2 != 0 ? lauVar : ae50Var, (i & 32) != 0 ? lauVar : ae50Var2, null, lauVar, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? "" : str8, (i & 8192) != 0 ? false : z, null, null, 0, (i & 131072) != 0 ? null : n6fVar);
    }
}
