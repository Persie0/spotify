package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class sj71 {

    /* JADX INFO: renamed from: a */
    public final dj71 f209771a;

    /* JADX INFO: renamed from: b */
    public final tp71 f209772b;

    /* JADX INFO: renamed from: c */
    public final tp71 f209773c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f209774d;

    public sj71(dj71 dj71Var, tp71 tp71Var, tp71 tp71Var2, ArrayList arrayList) {
        this.f209771a = dj71Var;
        this.f209772b = tp71Var;
        this.f209773c = tp71Var2;
        this.f209774d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj71)) {
            return false;
        }
        sj71 sj71Var = (sj71) obj;
        return this.f209771a.equals(sj71Var.f209771a) && wj50.m88271j(this.f209772b, sj71Var.f209772b) && wj50.m88271j(this.f209773c, sj71Var.f209773c) && this.f209774d.equals(sj71Var.f209774d);
    }

    public final int hashCode() {
        int iHashCode = this.f209771a.hashCode() * 31;
        tp71 tp71Var = this.f209772b;
        int iHashCode2 = (iHashCode + (tp71Var == null ? 0 : tp71Var.hashCode())) * 31;
        tp71 tp71Var2 = this.f209773c;
        return this.f209774d.hashCode() + ((iHashCode2 + (tp71Var2 != null ? tp71Var2.hashCode() : 0)) * 31);
    }
}
