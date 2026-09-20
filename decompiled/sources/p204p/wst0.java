package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class wst0 {

    /* JADX INFO: renamed from: A */
    public final boolean f254727A;

    /* JADX INFO: renamed from: B */
    public final Map f254728B;

    /* JADX INFO: renamed from: C */
    public final Map f254729C;

    /* JADX INFO: renamed from: D */
    public final boolean f254730D;

    /* JADX INFO: renamed from: E */
    public final Set f254731E;

    /* JADX INFO: renamed from: F */
    public final String f254732F;

    /* JADX INFO: renamed from: G */
    public final int f254733G;

    /* JADX INFO: renamed from: H */
    public final int f254734H;

    /* JADX INFO: renamed from: a */
    public final ContextTrack f254735a;

    /* JADX INFO: renamed from: b */
    public final ContextTrack f254736b;

    /* JADX INFO: renamed from: c */
    public final List f254737c;

    /* JADX INFO: renamed from: d */
    public final List f254738d;

    /* JADX INFO: renamed from: e */
    public final Map f254739e;

    /* JADX INFO: renamed from: f */
    public final boolean f254740f;

    /* JADX INFO: renamed from: g */
    public final boolean f254741g;

    /* JADX INFO: renamed from: h */
    public final String f254742h;

    /* JADX INFO: renamed from: i */
    public final String f254743i;

    /* JADX INFO: renamed from: j */
    public final Restrictions f254744j;

    /* JADX INFO: renamed from: k */
    public final ljr0 f254745k;

    /* JADX INFO: renamed from: l */
    public final boolean f254746l;

    /* JADX INFO: renamed from: m */
    public final boolean f254747m;

    /* JADX INFO: renamed from: n */
    public final List f254748n;

    /* JADX INFO: renamed from: o */
    public final boolean f254749o;

    /* JADX INFO: renamed from: p */
    public final boolean f254750p;

    /* JADX INFO: renamed from: q */
    public final boolean f254751q;

    /* JADX INFO: renamed from: r */
    public final boolean f254752r;

    /* JADX INFO: renamed from: s */
    public final boolean f254753s;

    /* JADX INFO: renamed from: t */
    public final boolean f254754t;

    /* JADX INFO: renamed from: u */
    public final vst0 f254755u;

    /* JADX INFO: renamed from: v */
    public final boolean f254756v;

    /* JADX INFO: renamed from: w */
    public final boolean f254757w;

    /* JADX INFO: renamed from: x */
    public final Map f254758x;

    /* JADX INFO: renamed from: y */
    public final Map f254759y;

    /* JADX INFO: renamed from: z */
    public final boolean f254760z;

    public wst0(ContextTrack contextTrack, ContextTrack contextTrack2, List list, List list2, Map map, boolean z, boolean z2, String str, String str2, Restrictions restrictions, ljr0 ljr0Var, int i, int i2, boolean z3, boolean z4, List list3, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, vst0 vst0Var, boolean z11, boolean z12, Map map2, Map map3, boolean z13, boolean z14, Map map4, Map map5, boolean z15, Set set, String str3) {
        this.f254735a = contextTrack;
        this.f254736b = contextTrack2;
        this.f254737c = list;
        this.f254738d = list2;
        this.f254739e = map;
        this.f254740f = z;
        this.f254741g = z2;
        this.f254742h = str;
        this.f254743i = str2;
        this.f254744j = restrictions;
        this.f254745k = ljr0Var;
        this.f254733G = i;
        this.f254734H = i2;
        this.f254746l = z3;
        this.f254747m = z4;
        this.f254748n = list3;
        this.f254749o = z5;
        this.f254750p = z6;
        this.f254751q = z7;
        this.f254752r = z8;
        this.f254753s = z9;
        this.f254754t = z10;
        this.f254755u = vst0Var;
        this.f254756v = z11;
        this.f254757w = z12;
        this.f254758x = map2;
        this.f254759y = map3;
        this.f254760z = z13;
        this.f254727A = z14;
        this.f254728B = map4;
        this.f254729C = map5;
        this.f254730D = z15;
        this.f254731E = set;
        this.f254732F = str3;
    }

    /* JADX INFO: renamed from: a */
    public static wst0 m88900a(wst0 wst0Var, ContextTrack contextTrack, ContextTrack contextTrack2, ArrayList arrayList, List list, Map map, boolean z, boolean z2, String str, String str2, ljr0 ljr0Var, int i, int i2, boolean z3, boolean z4, List list2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, vst0 vst0Var, boolean z10, LinkedHashMap linkedHashMap, Map map2, boolean z11, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, boolean z12, Set set, String str3, int i3, int i4) {
        ContextTrack contextTrack3 = (i3 & 1) != 0 ? wst0Var.f254735a : contextTrack;
        ContextTrack contextTrack4 = (i3 & 2) != 0 ? wst0Var.f254736b : contextTrack2;
        List list3 = (i3 & 4) != 0 ? wst0Var.f254737c : arrayList;
        List list4 = (i3 & 8) != 0 ? wst0Var.f254738d : list;
        Map map3 = (i3 & 16) != 0 ? wst0Var.f254739e : map;
        boolean z13 = (i3 & 32) != 0 ? wst0Var.f254740f : z;
        boolean z14 = (i3 & 64) != 0 ? wst0Var.f254741g : z2;
        String str4 = (i3 & 128) != 0 ? wst0Var.f254742h : str;
        String str5 = (i3 & 256) != 0 ? wst0Var.f254743i : str2;
        Restrictions restrictions = wst0Var.f254744j;
        ljr0 ljr0Var2 = (i3 & 1024) != 0 ? wst0Var.f254745k : ljr0Var;
        int i5 = (i3 & 2048) != 0 ? wst0Var.f254733G : i;
        int i6 = (i3 & 4096) != 0 ? wst0Var.f254734H : i2;
        boolean z15 = (i3 & 8192) != 0 ? wst0Var.f254746l : z3;
        boolean z16 = (i3 & 16384) != 0 ? wst0Var.f254747m : z4;
        List list5 = (32768 & i3) != 0 ? wst0Var.f254748n : list2;
        wst0Var.getClass();
        boolean z17 = (131072 & i3) != 0 ? wst0Var.f254749o : z5;
        boolean z18 = (262144 & i3) != 0 ? wst0Var.f254750p : z6;
        boolean z19 = (524288 & i3) != 0 ? wst0Var.f254751q : z7;
        boolean z20 = (1048576 & i3) != 0 ? wst0Var.f254752r : z8;
        boolean z21 = (2097152 & i3) != 0 ? wst0Var.f254753s : z9;
        boolean z22 = (4194304 & i3) != 0 ? wst0Var.f254754t : true;
        vst0 vst0Var2 = (8388608 & i3) != 0 ? wst0Var.f254755u : vst0Var;
        boolean z23 = (16777216 & i3) != 0 ? wst0Var.f254756v : z10;
        boolean z24 = wst0Var.f254757w;
        Map map4 = (67108864 & i3) != 0 ? wst0Var.f254758x : linkedHashMap;
        Map map5 = (134217728 & i3) != 0 ? wst0Var.f254759y : map2;
        boolean z25 = wst0Var.f254760z;
        boolean z26 = (i3 & 536870912) != 0 ? wst0Var.f254727A : z11;
        Map map6 = (i3 & 1073741824) != 0 ? wst0Var.f254728B : linkedHashMap2;
        Map map7 = (i3 & Integer.MIN_VALUE) != 0 ? wst0Var.f254729C : linkedHashMap3;
        boolean z27 = (i4 & 1) != 0 ? wst0Var.f254730D : z12;
        Set set2 = (i4 & 2) != 0 ? wst0Var.f254731E : set;
        String str6 = (i4 & 4) != 0 ? wst0Var.f254732F : str3;
        wst0Var.getClass();
        return new wst0(contextTrack3, contextTrack4, list3, list4, map3, z13, z14, str4, str5, restrictions, ljr0Var2, i5, i6, z15, z16, list5, z17, z18, z19, z20, z21, z22, vst0Var2, z23, z24, map4, map5, z25, z26, map6, map7, z27, set2, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wst0)) {
            return false;
        }
        wst0 wst0Var = (wst0) obj;
        return wj50.m88271j(this.f254735a, wst0Var.f254735a) && wj50.m88271j(this.f254736b, wst0Var.f254736b) && wj50.m88271j(this.f254737c, wst0Var.f254737c) && wj50.m88271j(this.f254738d, wst0Var.f254738d) && wj50.m88271j(this.f254739e, wst0Var.f254739e) && this.f254740f == wst0Var.f254740f && this.f254741g == wst0Var.f254741g && wj50.m88271j(this.f254742h, wst0Var.f254742h) && wj50.m88271j(this.f254743i, wst0Var.f254743i) && wj50.m88271j(this.f254744j, wst0Var.f254744j) && wj50.m88271j(this.f254745k, wst0Var.f254745k) && this.f254733G == wst0Var.f254733G && this.f254734H == wst0Var.f254734H && this.f254746l == wst0Var.f254746l && this.f254747m == wst0Var.f254747m && wj50.m88271j(this.f254748n, wst0Var.f254748n) && this.f254749o == wst0Var.f254749o && this.f254750p == wst0Var.f254750p && this.f254751q == wst0Var.f254751q && this.f254752r == wst0Var.f254752r && this.f254753s == wst0Var.f254753s && this.f254754t == wst0Var.f254754t && wj50.m88271j(this.f254755u, wst0Var.f254755u) && this.f254756v == wst0Var.f254756v && this.f254757w == wst0Var.f254757w && wj50.m88271j(this.f254758x, wst0Var.f254758x) && wj50.m88271j(this.f254759y, wst0Var.f254759y) && this.f254760z == wst0Var.f254760z && this.f254727A == wst0Var.f254727A && wj50.m88271j(this.f254728B, wst0Var.f254728B) && wj50.m88271j(this.f254729C, wst0Var.f254729C) && this.f254730D == wst0Var.f254730D && wj50.m88271j(this.f254731E, wst0Var.f254731E) && wj50.m88271j(this.f254732F, wst0Var.f254732F);
    }

    public final int hashCode() {
        ContextTrack contextTrack = this.f254735a;
        int iHashCode = (contextTrack == null ? 0 : contextTrack.hashCode()) * 31;
        ContextTrack contextTrack2 = this.f254736b;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77244c(s571.m77245d(s571.m77245d(f710.m40938f(this.f254734H, f710.m40938f(this.f254733G, (this.f254745k.hashCode() + ((this.f254744j.hashCode() + s571.m77243b(s571.m77243b(s571.m77245d(s571.m77245d(edb.m38557f(s571.m77244c(s571.m77244c((iHashCode + (contextTrack2 == null ? 0 : contextTrack2.hashCode())) * 31, 31, this.f254737c), 31, this.f254738d), 31, this.f254739e), 31, this.f254740f), 31, this.f254741g), 31, this.f254742h), 31, this.f254743i)) * 31)) * 31, 31), 31), 31, this.f254746l), 31, this.f254747m), 31, this.f254748n), 31, false), 31, this.f254749o), 31, this.f254750p), 31, this.f254751q), 31, this.f254752r), 31, this.f254753s), 31, this.f254754t);
        vst0 vst0Var = this.f254755u;
        return this.f254732F.hashCode() + klh.m56830b(s571.m77245d(edb.m38557f(edb.m38557f(s571.m77245d(s571.m77245d(edb.m38557f(edb.m38557f(s571.m77245d(s571.m77245d((iM77245d + (vst0Var != null ? vst0Var.hashCode() : 0)) * 31, 31, this.f254756v), 31, this.f254757w), 31, this.f254758x), 31, this.f254759y), 31, this.f254760z), 31, this.f254727A), 31, this.f254728B), 31, this.f254729C), 31, this.f254730D), 31, this.f254731E);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ wst0(boolean z, boolean z2) {
        Restrictions restrictions = Restrictions.EMPTY;
        kjr0 kjr0Var = kjr0.f123410l;
        gbu gbuVar = gbu.f78413a;
        lau lauVar = lau.f131415a;
        nau nauVar = nau.f152117a;
        this(null, null, lauVar, lauVar, nauVar, false, false, "", "", restrictions, kjr0Var, 3, 1, false, false, lauVar, false, false, false, false, false, false, null, false, z, nauVar, nauVar, z2, false, nauVar, nauVar, false, gbuVar, "");
    }
}
