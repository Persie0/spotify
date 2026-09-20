package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class zcl0 {

    /* JADX INFO: renamed from: a */
    public final m6e1 f281538a;

    /* JADX INFO: renamed from: b */
    public final Set f281539b;

    public zcl0(m6e1 m6e1Var, Set set) {
        this.f281538a = m6e1Var;
        this.f281539b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcl0)) {
            return false;
        }
        zcl0 zcl0Var = (zcl0) obj;
        return wj50.m88271j(this.f281538a, zcl0Var.f281538a) && wj50.m88271j(this.f281539b, zcl0Var.f281539b);
    }

    public final int hashCode() {
        return this.f281539b.hashCode() + (this.f281538a.hashCode() * 31);
    }

    public /* synthetic */ zcl0(m6e1 m6e1Var) {
        this(m6e1Var, gbu.f78413a);
    }
}
