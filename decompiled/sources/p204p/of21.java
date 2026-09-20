package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class of21 implements pf21 {

    /* JADX INFO: renamed from: a */
    public final List f164624a;

    /* JADX INFO: renamed from: b */
    public final ebf0 f164625b;

    public of21(List list, ebf0 ebf0Var) {
        this.f164624a = list;
        this.f164625b = ebf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of21)) {
            return false;
        }
        of21 of21Var = (of21) obj;
        return wj50.m88271j(this.f164624a, of21Var.f164624a) && wj50.m88271j(this.f164625b, of21Var.f164625b);
    }

    public final int hashCode() {
        int iHashCode = this.f164624a.hashCode() * 31;
        ebf0 ebf0Var = this.f164625b;
        return iHashCode + (ebf0Var == null ? 0 : ebf0Var.f57921a.hashCode());
    }
}
