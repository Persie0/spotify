package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class wo81 {

    /* JADX INFO: renamed from: a */
    public final v140 f253405a;

    /* JADX INFO: renamed from: b */
    public final List f253406b;

    /* JADX INFO: renamed from: c */
    public final Long f253407c;

    /* JADX INFO: renamed from: d */
    public final mto0 f253408d;

    /* JADX INFO: renamed from: e */
    public final y7t0 f253409e;

    public wo81(v140 v140Var, List list, Long l, mto0 mto0Var, y7t0 y7t0Var) {
        this.f253405a = v140Var;
        this.f253406b = list;
        this.f253407c = l;
        this.f253408d = mto0Var;
        this.f253409e = y7t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo81)) {
            return false;
        }
        wo81 wo81Var = (wo81) obj;
        return wj50.m88271j(this.f253405a, wo81Var.f253405a) && wj50.m88271j(this.f253406b, wo81Var.f253406b) && wj50.m88271j(this.f253407c, wo81Var.f253407c) && this.f253408d == wo81Var.f253408d && wj50.m88271j(this.f253409e, wo81Var.f253409e);
    }

    public final int hashCode() {
        v140 v140Var = this.f253405a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        List list = this.f253406b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.f253407c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        mto0 mto0Var = this.f253408d;
        int iHashCode4 = (iHashCode3 + (mto0Var == null ? 0 : mto0Var.hashCode())) * 31;
        y7t0 y7t0Var = this.f253409e;
        return iHashCode4 + (y7t0Var != null ? y7t0Var.hashCode() : 0);
    }
}
