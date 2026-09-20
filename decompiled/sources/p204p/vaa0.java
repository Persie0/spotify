package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vaa0 {

    /* JADX INFO: renamed from: a */
    public final e07 f239170a;

    /* JADX INFO: renamed from: b */
    public final List f239171b;

    public vaa0(e07 e07Var, List list) {
        this.f239170a = e07Var;
        this.f239171b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaa0)) {
            return false;
        }
        vaa0 vaa0Var = (vaa0) obj;
        return wj50.m88271j(this.f239170a, vaa0Var.f239170a) && wj50.m88271j(this.f239171b, vaa0Var.f239171b);
    }

    public final int hashCode() {
        return this.f239171b.hashCode() + (this.f239170a.hashCode() * 31);
    }
}
