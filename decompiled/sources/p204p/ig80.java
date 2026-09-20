package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ig80 {

    /* JADX INFO: renamed from: a */
    public final List f101924a;

    /* JADX INFO: renamed from: b */
    public final gg80 f101925b;

    public ig80(List list, gg80 gg80Var) {
        this.f101924a = list;
        this.f101925b = gg80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig80)) {
            return false;
        }
        ig80 ig80Var = (ig80) obj;
        return wj50.m88271j(this.f101924a, ig80Var.f101924a) && wj50.m88271j(this.f101925b, ig80Var.f101925b);
    }

    public final int hashCode() {
        int iHashCode = this.f101924a.hashCode() * 31;
        gg80 gg80Var = this.f101925b;
        return iHashCode + (gg80Var == null ? 0 : gg80Var.hashCode());
    }
}
