package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class vfe0 {

    /* JADX INFO: renamed from: a */
    public final List f240969a;

    /* JADX INFO: renamed from: b */
    public final hz80 f240970b;

    public vfe0(List list, hz80 hz80Var) {
        this.f240969a = list;
        this.f240970b = hz80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfe0)) {
            return false;
        }
        vfe0 vfe0Var = (vfe0) obj;
        return wj50.m88271j(this.f240969a, vfe0Var.f240969a) && wj50.m88271j(this.f240970b, vfe0Var.f240970b);
    }

    public final int hashCode() {
        return this.f240970b.hashCode() + (this.f240969a.hashCode() * 31);
    }
}
