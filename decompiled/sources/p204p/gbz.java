package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gbz {

    /* JADX INFO: renamed from: a */
    public final lsi0 f78439a;

    /* JADX INFO: renamed from: b */
    public s2l f78440b = null;

    public gbz(lsi0 lsi0Var) {
        this.f78439a = lsi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbz)) {
            return false;
        }
        gbz gbzVar = (gbz) obj;
        return this.f78439a.equals(gbzVar.f78439a) && wj50.m88271j(this.f78440b, gbzVar.f78440b);
    }

    public final int hashCode() {
        int iHashCode = this.f78439a.hashCode() * 31;
        s2l s2lVar = this.f78440b;
        return iHashCode + (s2lVar == null ? 0 : s2lVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f78439a + ", subscriber=" + this.f78440b + ')';
    }
}
