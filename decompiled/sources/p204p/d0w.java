package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class d0w {

    /* JADX INFO: renamed from: A */
    public final z2l0 f44064A;

    /* JADX INFO: renamed from: B */
    public final yzv f44065B;

    /* JADX INFO: renamed from: C */
    public final b0w f44066C;

    /* JADX INFO: renamed from: D */
    public final dpx f44067D;

    /* JADX INFO: renamed from: E */
    public final int f44068E;

    /* JADX INFO: renamed from: a */
    public final String f44069a;

    /* JADX INFO: renamed from: b */
    public final String f44070b;

    /* JADX INFO: renamed from: c */
    public final String f44071c;

    /* JADX INFO: renamed from: d */
    public final vzk f44072d;

    /* JADX INFO: renamed from: e */
    public final vzk f44073e;

    /* JADX INFO: renamed from: f */
    public final String f44074f;

    /* JADX INFO: renamed from: g */
    public final String f44075g;

    /* JADX INFO: renamed from: h */
    public final String f44076h;

    /* JADX INFO: renamed from: i */
    public final String f44077i;

    /* JADX INFO: renamed from: j */
    public final boolean f44078j;

    /* JADX INFO: renamed from: k */
    public final boolean f44079k;

    /* JADX INFO: renamed from: l */
    public final boolean f44080l;

    /* JADX INFO: renamed from: m */
    public final boolean f44081m;

    /* JADX INFO: renamed from: n */
    public final boolean f44082n;

    /* JADX INFO: renamed from: o */
    public final boolean f44083o;

    /* JADX INFO: renamed from: p */
    public final boolean f44084p;

    /* JADX INFO: renamed from: q */
    public final int f44085q;

    /* JADX INFO: renamed from: r */
    public final Integer f44086r;

    /* JADX INFO: renamed from: s */
    public final boolean f44087s;

    /* JADX INFO: renamed from: t */
    public final boolean f44088t;

    /* JADX INFO: renamed from: u */
    public final boolean f44089u;

    /* JADX INFO: renamed from: v */
    public final boolean f44090v;

    /* JADX INFO: renamed from: w */
    public final Long f44091w;

    /* JADX INFO: renamed from: x */
    public final boolean f44092x;

    /* JADX INFO: renamed from: y */
    public final int f44093y;

    /* JADX INFO: renamed from: z */
    public final xj11 f44094z;

    public d0w(String str, int i) {
        this((i & 1) != 0 ? "" : str, null, "", new vzk(), new vzk(), "", "", "", null, false, false, false, false, false, false, 1, false, 0, null, false, false, false, false, null, false, 0, null, t2l0.f216587a, yzv.f277906d, b0w.f22116d, dpx.f51759a);
    }

    /* JADX INFO: renamed from: a */
    public static d0w m34562a(d0w d0wVar, String str) {
        return new d0w(str, d0wVar.f44070b, d0wVar.f44071c, d0wVar.f44072d, d0wVar.f44073e, d0wVar.f44074f, d0wVar.f44075g, d0wVar.f44076h, d0wVar.f44077i, d0wVar.f44078j, d0wVar.f44079k, d0wVar.f44080l, d0wVar.f44081m, d0wVar.f44082n, d0wVar.f44083o, d0wVar.f44068E, d0wVar.f44084p, d0wVar.f44085q, d0wVar.f44086r, d0wVar.f44087s, d0wVar.f44088t, d0wVar.f44089u, d0wVar.f44090v, d0wVar.f44091w, d0wVar.f44092x, d0wVar.f44093y, d0wVar.f44094z, d0wVar.f44064A, d0wVar.f44065B, d0wVar.f44066C, d0wVar.f44067D);
    }

    /* JADX INFO: renamed from: b */
    public final String m34563b(int i) {
        xj11 xj11Var;
        String strM86903a = this.f44072d.m86903a(i);
        if (strM86903a.length() == 0) {
            strM86903a = this.f44073e.m86903a(i);
        }
        return (strM86903a.length() != 0 || (xj11Var = this.f44094z) == null) ? strM86903a : xj11Var.f262002j.m86903a(i);
    }

    /* JADX INFO: renamed from: c */
    public final int m34564c() {
        return this.f44085q;
    }

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap m34565d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zi5.m96194e(linkedHashMap, "image_url", 1, this);
        zi5.m96194e(linkedHashMap, "image_small_url", 2, this);
        zi5.m96194e(linkedHashMap, "image_large_url", 3, this);
        zi5.m96194e(linkedHashMap, "image_xlarge_url", 4, this);
        String str = this.f44071c;
        if (str.length() > 0) {
            linkedHashMap.put(ContextTrack.Metadata.KEY_TITLE, str);
        }
        int iOrdinal = this.f44065B.ordinal();
        String str2 = this.f44075g;
        if (iOrdinal == 0) {
            linkedHashMap.put("media.type", ContextTrack.MediaType.MIXED);
            linkedHashMap.put(ContextTrack.Metadata.KEY_MEDIA_MANIFEST_ID, str2);
        } else if (iOrdinal == 1) {
            linkedHashMap.put("media.type", "audio");
        } else if (iOrdinal == 2) {
            linkedHashMap.put("media.type", "video");
            linkedHashMap.put(ContextTrack.Metadata.KEY_MEDIA_MANIFEST_ID, str2);
        }
        xj11 xj11Var = this.f44094z;
        if (xj11Var != null) {
            String str3 = xj11Var.f261996d;
            if (str3.length() > 0) {
                linkedHashMap.put(ContextTrack.Metadata.KEY_ARTIST_NAME, str3);
            }
        }
        if (this.f44092x) {
            linkedHashMap.put(ContextTrack.Metadata.KEY_IS_BACKGROUNDABLE, "true");
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: e */
    public final String m34566e() {
        return this.f44071c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0w)) {
            return false;
        }
        d0w d0wVar = (d0w) obj;
        return wj50.m88271j(this.f44069a, d0wVar.f44069a) && wj50.m88271j(this.f44070b, d0wVar.f44070b) && wj50.m88271j(this.f44071c, d0wVar.f44071c) && wj50.m88271j(this.f44072d, d0wVar.f44072d) && wj50.m88271j(this.f44073e, d0wVar.f44073e) && wj50.m88271j(this.f44074f, d0wVar.f44074f) && wj50.m88271j(this.f44075g, d0wVar.f44075g) && wj50.m88271j(this.f44076h, d0wVar.f44076h) && wj50.m88271j(this.f44077i, d0wVar.f44077i) && this.f44078j == d0wVar.f44078j && this.f44079k == d0wVar.f44079k && this.f44080l == d0wVar.f44080l && this.f44081m == d0wVar.f44081m && this.f44082n == d0wVar.f44082n && this.f44083o == d0wVar.f44083o && this.f44068E == d0wVar.f44068E && this.f44084p == d0wVar.f44084p && this.f44085q == d0wVar.f44085q && wj50.m88271j(this.f44086r, d0wVar.f44086r) && this.f44087s == d0wVar.f44087s && this.f44088t == d0wVar.f44088t && this.f44089u == d0wVar.f44089u && this.f44090v == d0wVar.f44090v && wj50.m88271j(this.f44091w, d0wVar.f44091w) && this.f44092x == d0wVar.f44092x && this.f44093y == d0wVar.f44093y && wj50.m88271j(this.f44094z, d0wVar.f44094z) && wj50.m88271j(this.f44064A, d0wVar.f44064A) && this.f44065B == d0wVar.f44065B && this.f44066C == d0wVar.f44066C && wj50.m88271j(this.f44067D, d0wVar.f44067D);
    }

    /* JADX INFO: renamed from: f */
    public final int m34567f() {
        return this.f44093y;
    }

    /* JADX INFO: renamed from: g */
    public final String m34568g() {
        return this.f44069a;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m34569h() {
        return this.f44080l;
    }

    public final int hashCode() {
        int iHashCode = this.f44069a.hashCode() * 31;
        String str = this.f44070b;
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b((this.f44073e.hashCode() + ((this.f44072d.hashCode() + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f44071c)) * 31)) * 31, 31, this.f44074f), 31, this.f44075g), 31, this.f44076h);
        String str2 = this.f44077i;
        int iM62800g = mt60.m62800g(this.f44085q, s571.m77245d(f710.m40938f(this.f44068E, s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM77243b + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f44078j), 31, this.f44079k), 31, this.f44080l), 31, this.f44081m), 31, this.f44082n), 31, this.f44083o), 31), 31, this.f44084p), 31);
        Integer num = this.f44086r;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM62800g + (num == null ? 0 : num.hashCode())) * 31, 31, this.f44087s), 31, this.f44088t), 31, this.f44089u), 31, this.f44090v);
        Long l = this.f44091w;
        int iM62800g2 = mt60.m62800g(this.f44093y, s571.m77245d((iM77245d + (l == null ? 0 : l.hashCode())) * 31, 31, this.f44092x), 31);
        xj11 xj11Var = this.f44094z;
        return this.f44067D.hashCode() + ((this.f44066C.hashCode() + ((this.f44065B.hashCode() + ((this.f44064A.hashCode() + ((iM62800g2 + (xj11Var != null ? xj11Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m34570i() {
        return this.f44079k;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m34571j() {
        return this.f44087s;
    }

    public d0w(String str, String str2, String str3, vzk vzkVar, vzk vzkVar2, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, boolean z7, int i2, Integer num, boolean z8, boolean z9, boolean z10, boolean z11, Long l, boolean z12, int i3, xj11 xj11Var, z2l0 z2l0Var, yzv yzvVar, b0w b0wVar, dpx dpxVar) {
        this.f44069a = str;
        this.f44070b = str2;
        this.f44071c = str3;
        this.f44072d = vzkVar;
        this.f44073e = vzkVar2;
        this.f44074f = str4;
        this.f44075g = str5;
        this.f44076h = str6;
        this.f44077i = str7;
        this.f44078j = z;
        this.f44079k = z2;
        this.f44080l = z3;
        this.f44081m = z4;
        this.f44082n = z5;
        this.f44083o = z6;
        this.f44068E = i;
        this.f44084p = z7;
        this.f44085q = i2;
        this.f44086r = num;
        this.f44087s = z8;
        this.f44088t = z9;
        this.f44089u = z10;
        this.f44090v = z11;
        this.f44091w = l;
        this.f44092x = z12;
        this.f44093y = i3;
        this.f44094z = xj11Var;
        this.f44064A = z2l0Var;
        this.f44065B = yzvVar;
        this.f44066C = b0wVar;
        this.f44067D = dpxVar;
    }
}
