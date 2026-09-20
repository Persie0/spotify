package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class n7e0 {

    /* JADX INFO: renamed from: a */
    public final ebf0 f151141a;

    /* JADX INFO: renamed from: b */
    public final Set f151142b;

    public n7e0(ebf0 ebf0Var, Set set) {
        this.f151141a = ebf0Var;
        this.f151142b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7e0)) {
            return false;
        }
        n7e0 n7e0Var = (n7e0) obj;
        return wj50.m88271j(this.f151141a, n7e0Var.f151141a) && wj50.m88271j(this.f151142b, n7e0Var.f151142b);
    }

    public final int hashCode() {
        return this.f151142b.hashCode() + (this.f151141a.f57921a.hashCode() * 31);
    }
}
