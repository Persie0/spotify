package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class j4r implements k4r {

    /* JADX INFO: renamed from: a */
    public final kvl0 f108763a;

    /* JADX INFO: renamed from: b */
    public final List f108764b;

    public j4r(kvl0 kvl0Var, List list) {
        this.f108763a = kvl0Var;
        this.f108764b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4r)) {
            return false;
        }
        j4r j4rVar = (j4r) obj;
        return wj50.m88271j(this.f108763a, j4rVar.f108763a) && wj50.m88271j(this.f108764b, j4rVar.f108764b);
    }

    public final int hashCode() {
        return this.f108764b.hashCode() + (this.f108763a.hashCode() * 31);
    }
}
