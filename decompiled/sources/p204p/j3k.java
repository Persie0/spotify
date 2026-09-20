package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j3k {

    /* JADX INFO: renamed from: a */
    public final Map f108410a;

    /* JADX INFO: renamed from: b */
    public final prt0 f108411b;

    public j3k(Map map, prt0 prt0Var) {
        this.f108410a = map;
        this.f108411b = prt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3k)) {
            return false;
        }
        j3k j3kVar = (j3k) obj;
        return wj50.m88271j(this.f108410a, j3kVar.f108410a) && wj50.m88271j(this.f108411b, j3kVar.f108411b);
    }

    public final int hashCode() {
        return this.f108411b.hashCode() + (this.f108410a.hashCode() * 31);
    }
}
