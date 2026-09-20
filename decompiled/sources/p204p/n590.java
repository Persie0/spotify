package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class n590 implements o590 {

    /* JADX INFO: renamed from: a */
    public final rg61 f150505a;

    /* JADX INFO: renamed from: b */
    public final Set f150506b;

    public n590(rg61 rg61Var, Set set) {
        this.f150505a = rg61Var;
        this.f150506b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n590)) {
            return false;
        }
        n590 n590Var = (n590) obj;
        return this.f150505a == n590Var.f150505a && wj50.m88271j(this.f150506b, n590Var.f150506b);
    }

    public final int hashCode() {
        return this.f150506b.hashCode() + (this.f150505a.hashCode() * 31);
    }
}
