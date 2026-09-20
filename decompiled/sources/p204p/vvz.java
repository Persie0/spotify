package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class vvz {

    /* JADX INFO: renamed from: a */
    public final Set f245362a;

    /* JADX INFO: renamed from: b */
    public final i490 f245363b;

    public vvz(Set set, i490 i490Var) {
        this.f245362a = set;
        this.f245363b = i490Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvz)) {
            return false;
        }
        vvz vvzVar = (vvz) obj;
        return wj50.m88271j(this.f245362a, vvzVar.f245362a) && wj50.m88271j(this.f245363b, vvzVar.f245363b);
    }

    public final int hashCode() {
        int iHashCode = this.f245362a.hashCode() * 31;
        i490 i490Var = this.f245363b;
        return iHashCode + (i490Var == null ? 0 : i490Var.hashCode());
    }
}
