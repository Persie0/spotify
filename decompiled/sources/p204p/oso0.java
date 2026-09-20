package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@rtz0
public final class oso0 implements ny8 {
    public static final nso0 Companion = new nso0();

    /* JADX INFO: renamed from: l */
    public static final fr70[] f168843l = {null, null, null, null, null, null, null, q3d0.m72078I(2, lin0.f133841Y), null, null, null};

    /* JADX INFO: renamed from: a */
    public final String f168844a;

    /* JADX INFO: renamed from: b */
    public final String f168845b;

    /* JADX INFO: renamed from: c */
    public final String f168846c;

    /* JADX INFO: renamed from: d */
    public final Boolean f168847d;

    /* JADX INFO: renamed from: e */
    public final String f168848e;

    /* JADX INFO: renamed from: f */
    public final String f168849f;

    /* JADX INFO: renamed from: g */
    public final Long f168850g;

    /* JADX INFO: renamed from: h */
    public final Map f168851h;

    /* JADX INFO: renamed from: i */
    public final hp80 f168852i;

    /* JADX INFO: renamed from: j */
    public final String f168853j;

    /* JADX INFO: renamed from: k */
    public final Boolean f168854k;

    public /* synthetic */ oso0(int i, String str, String str2, String str3, Boolean bool, String str4, String str5, Long l, Map map, hp80 hp80Var, String str6, Boolean bool2) {
        if (1 != (i & 1)) {
            edo.m38617p(i, 1, mso0.f146838a.getDescriptor());
            throw null;
        }
        this.f168844a = str;
        if ((i & 2) == 0) {
            this.f168845b = null;
        } else {
            this.f168845b = str2;
        }
        if ((i & 4) == 0) {
            this.f168846c = null;
        } else {
            this.f168846c = str3;
        }
        if ((i & 8) == 0) {
            this.f168847d = null;
        } else {
            this.f168847d = bool;
        }
        if ((i & 16) == 0) {
            this.f168848e = null;
        } else {
            this.f168848e = str4;
        }
        if ((i & 32) == 0) {
            this.f168849f = null;
        } else {
            this.f168849f = str5;
        }
        if ((i & 64) == 0) {
            this.f168850g = null;
        } else {
            this.f168850g = l;
        }
        if ((i & 128) == 0) {
            this.f168851h = null;
        } else {
            this.f168851h = map;
        }
        if ((i & 256) == 0) {
            this.f168852i = null;
        } else {
            this.f168852i = hp80Var;
        }
        if ((i & 512) == 0) {
            this.f168853j = null;
        } else {
            this.f168853j = str6;
        }
        if ((i & 1024) == 0) {
            this.f168854k = null;
        } else {
            this.f168854k = bool2;
        }
    }

    @Override // p204p.ny8
    /* JADX INFO: renamed from: a */
    public final String mo25750a(fk60 fk60Var) {
        return fk60Var.m41881b(Companion.serializer(), this);
    }

    /* JADX INFO: renamed from: b */
    public final String m67741b() {
        return this.f168849f;
    }

    /* JADX INFO: renamed from: c */
    public final String m67742c() {
        return this.f168853j;
    }

    /* JADX INFO: renamed from: d */
    public final String m67743d() {
        return this.f168848e;
    }

    /* JADX INFO: renamed from: e */
    public final Long m67744e() {
        return this.f168850g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oso0)) {
            return false;
        }
        oso0 oso0Var = (oso0) obj;
        return wj50.m88271j(this.f168844a, oso0Var.f168844a) && wj50.m88271j(this.f168845b, oso0Var.f168845b) && wj50.m88271j(this.f168846c, oso0Var.f168846c) && wj50.m88271j(this.f168847d, oso0Var.f168847d) && wj50.m88271j(this.f168848e, oso0Var.f168848e) && wj50.m88271j(this.f168849f, oso0Var.f168849f) && wj50.m88271j(this.f168850g, oso0Var.f168850g) && wj50.m88271j(this.f168851h, oso0Var.f168851h) && wj50.m88271j(this.f168852i, oso0Var.f168852i) && wj50.m88271j(this.f168853j, oso0Var.f168853j) && wj50.m88271j(this.f168854k, oso0Var.f168854k);
    }

    /* JADX INFO: renamed from: f */
    public final Boolean m67745f() {
        return this.f168847d;
    }

    /* JADX INFO: renamed from: g */
    public final String m67746g() {
        return this.f168846c;
    }

    /* JADX INFO: renamed from: h */
    public final String m67747h() {
        return this.f168845b;
    }

    public final int hashCode() {
        int iHashCode = this.f168844a.hashCode() * 31;
        String str = this.f168845b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f168846c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f168847d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f168848e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f168849f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.f168850g;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Map map = this.f168851h;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        hp80 hp80Var = this.f168852i;
        int iHashCode9 = (iHashCode8 + (hp80Var == null ? 0 : hp80Var.hashCode())) * 31;
        String str5 = this.f168853j;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.f168854k;
        return iHashCode10 + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final Boolean m67748i() {
        return this.f168854k;
    }
}
