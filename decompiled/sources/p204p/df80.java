package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class df80 {

    /* JADX INFO: renamed from: a */
    public final List f48517a;

    /* JADX INFO: renamed from: b */
    public final i490 f48518b;

    public df80(List list, i490 i490Var) {
        this.f48517a = list;
        this.f48518b = i490Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df80)) {
            return false;
        }
        df80 df80Var = (df80) obj;
        return wj50.m88271j(this.f48517a, df80Var.f48517a) && wj50.m88271j(this.f48518b, df80Var.f48518b);
    }

    public final int hashCode() {
        int iHashCode = this.f48517a.hashCode() * 31;
        i490 i490Var = this.f48518b;
        return iHashCode + (i490Var == null ? 0 : i490Var.hashCode());
    }
}
