package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class ppe1 {

    /* JADX INFO: renamed from: a */
    public final Set f180023a;

    /* JADX INFO: renamed from: b */
    public final boolean f180024b;

    public ppe1(Set set, boolean z) {
        this.f180023a = set;
        this.f180024b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppe1)) {
            return false;
        }
        ppe1 ppe1Var = (ppe1) obj;
        return wj50.m88271j(this.f180023a, ppe1Var.f180023a) && this.f180024b == ppe1Var.f180024b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f180024b) + (this.f180023a.hashCode() * 31);
    }
}
