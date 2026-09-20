package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class s7g0 {

    /* JADX INFO: renamed from: a */
    public final k69 f206355a;

    /* JADX INFO: renamed from: b */
    public final k69 f206356b;

    /* JADX INFO: renamed from: c */
    public final long f206357c;

    /* JADX INFO: renamed from: d */
    public final long f206358d;

    /* JADX INFO: renamed from: e */
    public final Map f206359e;

    /* JADX INFO: renamed from: f */
    public final Map f206360f;

    /* JADX INFO: renamed from: g */
    public final Map f206361g;

    /* JADX INFO: renamed from: h */
    public final Map f206362h;

    /* JADX INFO: renamed from: i */
    public final Map f206363i;

    /* JADX INFO: renamed from: j */
    public final o0x0 f206364j;

    public s7g0(k69 k69Var, k69 k69Var2, long j, long j2, Map map, Map map2, Map map3, Map map4, Map map5, o0x0 o0x0Var) {
        this.f206355a = k69Var;
        this.f206356b = k69Var2;
        this.f206357c = j;
        this.f206358d = j2;
        this.f206359e = map;
        this.f206360f = map2;
        this.f206361g = map3;
        this.f206362h = map4;
        this.f206363i = map5;
        this.f206364j = o0x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7g0)) {
            return false;
        }
        s7g0 s7g0Var = (s7g0) obj;
        return wj50.m88271j(this.f206355a, s7g0Var.f206355a) && wj50.m88271j(this.f206356b, s7g0Var.f206356b) && this.f206357c == s7g0Var.f206357c && this.f206358d == s7g0Var.f206358d && wj50.m88271j(this.f206359e, s7g0Var.f206359e) && wj50.m88271j(this.f206360f, s7g0Var.f206360f) && wj50.m88271j(this.f206361g, s7g0Var.f206361g) && wj50.m88271j(this.f206362h, s7g0Var.f206362h) && wj50.m88271j(this.f206363i, s7g0Var.f206363i) && wj50.m88271j(this.f206364j, s7g0Var.f206364j);
    }

    public final int hashCode() {
        k69 k69Var = this.f206355a;
        int iHashCode = (k69Var == null ? 0 : k69Var.hashCode()) * 31;
        k69 k69Var2 = this.f206356b;
        int iM36605e = dq60.m36605e(dq60.m36605e((iHashCode + (k69Var2 == null ? 0 : k69Var2.hashCode())) * 31, this.f206357c, 31), this.f206358d, 31);
        Map map = this.f206359e;
        int iHashCode2 = (iM36605e + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f206360f;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f206361g;
        int iHashCode4 = (iHashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map map4 = this.f206362h;
        int iHashCode5 = (iHashCode4 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map map5 = this.f206363i;
        int iHashCode6 = (iHashCode5 + (map5 == null ? 0 : map5.hashCode())) * 31;
        o0x0 o0x0Var = this.f206364j;
        return iHashCode6 + (o0x0Var != null ? o0x0Var.hashCode() : 0);
    }
}
