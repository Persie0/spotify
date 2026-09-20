package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hya extends vya {

    /* JADX INFO: renamed from: a */
    public final rza f96527a;

    /* JADX INFO: renamed from: b */
    public final Set f96528b;

    public hya(rza rzaVar, Set set) {
        this.f96527a = rzaVar;
        this.f96528b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hya)) {
            return false;
        }
        hya hyaVar = (hya) obj;
        return wj50.m88271j(this.f96527a, hyaVar.f96527a) && wj50.m88271j(this.f96528b, hyaVar.f96528b);
    }

    public final int hashCode() {
        return this.f96528b.hashCode() + (this.f96527a.hashCode() * 31);
    }
}
