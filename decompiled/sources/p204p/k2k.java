package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class k2k {

    /* JADX INFO: renamed from: a */
    public final g7k f118653a;

    /* JADX INFO: renamed from: b */
    public final List f118654b;

    /* JADX INFO: renamed from: c */
    public final t221 f118655c;

    /* JADX INFO: renamed from: d */
    public final v6k f118656d;

    public /* synthetic */ k2k(g7k g7kVar) {
        this(g7kVar, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2k)) {
            return false;
        }
        k2k k2kVar = (k2k) obj;
        return wj50.m88271j(this.f118653a, k2kVar.f118653a) && wj50.m88271j(this.f118654b, k2kVar.f118654b) && wj50.m88271j(this.f118655c, k2kVar.f118655c) && wj50.m88271j(this.f118656d, k2kVar.f118656d);
    }

    public final int hashCode() {
        int iHashCode = this.f118653a.hashCode() * 31;
        List list = this.f118654b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        t221 t221Var = this.f118655c;
        int iHashCode3 = (iHashCode2 + (t221Var == null ? 0 : t221Var.hashCode())) * 31;
        v6k v6kVar = this.f118656d;
        return iHashCode3 + (v6kVar != null ? v6kVar.hashCode() : 0);
    }

    public k2k(g7k g7kVar, List list, t221 t221Var, v6k v6kVar) {
        this.f118653a = g7kVar;
        this.f118654b = list;
        this.f118655c = t221Var;
        this.f118656d = v6kVar;
    }
}
