package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class xss {

    /* JADX INFO: renamed from: a */
    public final Set f265656a;

    /* JADX INFO: renamed from: b */
    public final i490 f265657b;

    public xss(Set set, i490 i490Var) {
        this.f265656a = set;
        this.f265657b = i490Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xss)) {
            return false;
        }
        xss xssVar = (xss) obj;
        return wj50.m88271j(this.f265656a, xssVar.f265656a) && wj50.m88271j(this.f265657b, xssVar.f265657b);
    }

    public final int hashCode() {
        int iHashCode = this.f265656a.hashCode() * 31;
        i490 i490Var = this.f265657b;
        return iHashCode + (i490Var == null ? 0 : i490Var.hashCode());
    }
}
