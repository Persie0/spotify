package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class j3p0 {

    /* JADX INFO: renamed from: a */
    public final Map f108452a;

    /* JADX INFO: renamed from: b */
    public final Map f108453b;

    public j3p0(Map map, Map map2) {
        this.f108452a = map;
        this.f108453b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3p0)) {
            return false;
        }
        j3p0 j3p0Var = (j3p0) obj;
        return wj50.m88271j(this.f108452a, j3p0Var.f108452a) && wj50.m88271j(this.f108453b, j3p0Var.f108453b);
    }

    public final int hashCode() {
        return this.f108453b.hashCode() + (this.f108452a.hashCode() * 31);
    }
}
