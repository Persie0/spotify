package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class k5e0 {

    /* JADX INFO: renamed from: a */
    public final ebf0 f119489a;

    /* JADX INFO: renamed from: b */
    public final Set f119490b;

    public k5e0(ebf0 ebf0Var, Set set) {
        this.f119489a = ebf0Var;
        this.f119490b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5e0)) {
            return false;
        }
        k5e0 k5e0Var = (k5e0) obj;
        return wj50.m88271j(this.f119489a, k5e0Var.f119489a) && wj50.m88271j(this.f119490b, k5e0Var.f119490b);
    }

    public final int hashCode() {
        return this.f119490b.hashCode() + (this.f119489a.f57921a.hashCode() * 31);
    }

    public /* synthetic */ k5e0(ebf0 ebf0Var) {
        this(ebf0Var, gbu.f78413a);
    }
}
