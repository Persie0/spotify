package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class k5s0 implements m5s0 {

    /* JADX INFO: renamed from: a */
    public final Set f119577a;

    public k5s0(Set set) {
        this.f119577a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5s0) && wj50.m88271j(this.f119577a, ((k5s0) obj).f119577a);
    }

    public final int hashCode() {
        return this.f119577a.hashCode();
    }
}
