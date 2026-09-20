package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class s0y0 {

    /* JADX INFO: renamed from: a */
    public final v140 f204553a;

    /* JADX INFO: renamed from: b */
    public final String f204554b;

    /* JADX INFO: renamed from: c */
    public final List f204555c;

    /* JADX INFO: renamed from: d */
    public final Long f204556d;

    /* JADX INFO: renamed from: e */
    public final o5p0 f204557e;

    /* JADX INFO: renamed from: f */
    public final mto0 f204558f;

    public s0y0(v140 v140Var, String str, List list, Long l, o5p0 o5p0Var, mto0 mto0Var) {
        this.f204553a = v140Var;
        this.f204554b = str;
        this.f204555c = list;
        this.f204556d = l;
        this.f204557e = o5p0Var;
        this.f204558f = mto0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0y0)) {
            return false;
        }
        s0y0 s0y0Var = (s0y0) obj;
        return wj50.m88271j(this.f204553a, s0y0Var.f204553a) && wj50.m88271j(this.f204554b, s0y0Var.f204554b) && wj50.m88271j(this.f204555c, s0y0Var.f204555c) && wj50.m88271j(this.f204556d, s0y0Var.f204556d) && wj50.m88271j(this.f204557e, s0y0Var.f204557e) && this.f204558f == s0y0Var.f204558f;
    }

    public final int hashCode() {
        v140 v140Var = this.f204553a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        String str = this.f204554b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f204555c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.f204556d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        o5p0 o5p0Var = this.f204557e;
        int iHashCode5 = (iHashCode4 + (o5p0Var == null ? 0 : o5p0Var.hashCode())) * 31;
        mto0 mto0Var = this.f204558f;
        return iHashCode5 + (mto0Var != null ? mto0Var.hashCode() : 0);
    }
}
