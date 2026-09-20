package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class qb8 implements sb8 {

    /* JADX INFO: renamed from: a */
    public final Set f187033a;

    public qb8(Set set) {
        this.f187033a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb8) && wj50.m88271j(this.f187033a, ((qb8) obj).f187033a);
    }

    public final int hashCode() {
        return this.f187033a.hashCode();
    }
}
