package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class l3p0 {

    /* JADX INFO: renamed from: a */
    public final Set f129412a;

    /* JADX INFO: renamed from: b */
    public final i490 f129413b;

    public l3p0(Set set, i490 i490Var) {
        this.f129412a = set;
        this.f129413b = i490Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3p0)) {
            return false;
        }
        l3p0 l3p0Var = (l3p0) obj;
        return wj50.m88271j(this.f129412a, l3p0Var.f129412a) && wj50.m88271j(this.f129413b, l3p0Var.f129413b);
    }

    public final int hashCode() {
        int iHashCode = this.f129412a.hashCode() * 31;
        i490 i490Var = this.f129413b;
        return iHashCode + (i490Var == null ? 0 : i490Var.hashCode());
    }
}
