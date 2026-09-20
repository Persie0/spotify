package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class ws3 {

    /* JADX INFO: renamed from: a */
    public final ebf0 f254497a;

    /* JADX INFO: renamed from: b */
    public final Set f254498b;

    public ws3(ebf0 ebf0Var, Set set) {
        this.f254497a = ebf0Var;
        this.f254498b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws3)) {
            return false;
        }
        ws3 ws3Var = (ws3) obj;
        return wj50.m88271j(this.f254497a, ws3Var.f254497a) && wj50.m88271j(this.f254498b, ws3Var.f254498b);
    }

    public final int hashCode() {
        ebf0 ebf0Var = this.f254497a;
        return this.f254498b.hashCode() + ((ebf0Var == null ? 0 : ebf0Var.f57921a.hashCode()) * 31);
    }
}
