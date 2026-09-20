package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class wa90 {

    /* JADX INFO: renamed from: a */
    public final int f249419a;

    /* JADX INFO: renamed from: b */
    public final Set f249420b;

    public wa90(int i, Set set) {
        this.f249419a = i;
        this.f249420b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa90)) {
            return false;
        }
        wa90 wa90Var = (wa90) obj;
        return this.f249419a == wa90Var.f249419a && wj50.m88271j(this.f249420b, wa90Var.f249420b);
    }

    public final int hashCode() {
        return this.f249420b.hashCode() + (edb.m38547C(this.f249419a) * 31);
    }
}
