package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class tfc0 {

    /* JADX INFO: renamed from: a */
    public final v140 f219910a;

    /* JADX INFO: renamed from: b */
    public final qho f219911b;

    /* JADX INFO: renamed from: c */
    public final dl31 f219912c;

    /* JADX INFO: renamed from: d */
    public final List f219913d;

    /* JADX INFO: renamed from: e */
    public final gu5 f219914e;

    public tfc0(v140 v140Var, qho qhoVar, dl31 dl31Var, List list, gu5 gu5Var) {
        this.f219910a = v140Var;
        this.f219911b = qhoVar;
        this.f219912c = dl31Var;
        this.f219913d = list;
        this.f219914e = gu5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfc0)) {
            return false;
        }
        tfc0 tfc0Var = (tfc0) obj;
        return wj50.m88271j(this.f219910a, tfc0Var.f219910a) && wj50.m88271j(this.f219911b, tfc0Var.f219911b) && wj50.m88271j(this.f219912c, tfc0Var.f219912c) && wj50.m88271j(this.f219913d, tfc0Var.f219913d) && wj50.m88271j(this.f219914e, tfc0Var.f219914e);
    }

    public final int hashCode() {
        v140 v140Var = this.f219910a;
        int iHashCode = (this.f219911b.hashCode() + ((v140Var == null ? 0 : v140Var.hashCode()) * 31)) * 31;
        dl31 dl31Var = this.f219912c;
        int iHashCode2 = (iHashCode + (dl31Var == null ? 0 : dl31Var.hashCode())) * 31;
        List list = this.f219913d;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        gu5 gu5Var = this.f219914e;
        return iHashCode3 + (gu5Var != null ? gu5Var.hashCode() : 0);
    }
}
