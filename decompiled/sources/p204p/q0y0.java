package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class q0y0 {

    /* JADX INFO: renamed from: a */
    public final v140 f184135a;

    /* JADX INFO: renamed from: b */
    public final String f184136b;

    /* JADX INFO: renamed from: c */
    public final List f184137c;

    /* JADX INFO: renamed from: d */
    public final Long f184138d;

    /* JADX INFO: renamed from: e */
    public final o5p0 f184139e;

    public q0y0(v140 v140Var, String str, List list, Long l, o5p0 o5p0Var) {
        this.f184135a = v140Var;
        this.f184136b = str;
        this.f184137c = list;
        this.f184138d = l;
        this.f184139e = o5p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0y0)) {
            return false;
        }
        q0y0 q0y0Var = (q0y0) obj;
        return wj50.m88271j(this.f184135a, q0y0Var.f184135a) && wj50.m88271j(this.f184136b, q0y0Var.f184136b) && wj50.m88271j(this.f184137c, q0y0Var.f184137c) && wj50.m88271j(this.f184138d, q0y0Var.f184138d) && wj50.m88271j(this.f184139e, q0y0Var.f184139e);
    }

    public final int hashCode() {
        v140 v140Var = this.f184135a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        String str = this.f184136b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f184137c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.f184138d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        o5p0 o5p0Var = this.f184139e;
        return iHashCode4 + (o5p0Var != null ? o5p0Var.hashCode() : 0);
    }
}
