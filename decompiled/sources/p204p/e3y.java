package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e3y {

    /* JADX INFO: renamed from: a */
    public final ycs0 f55899a;

    /* JADX INFO: renamed from: b */
    public final r8k f55900b;

    public e3y(ycs0 ycs0Var, r8k r8kVar) {
        this.f55899a = ycs0Var;
        this.f55900b = r8kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3y)) {
            return false;
        }
        e3y e3yVar = (e3y) obj;
        return wj50.m88271j(this.f55899a, e3yVar.f55899a) && wj50.m88271j(this.f55900b, e3yVar.f55900b);
    }

    public final int hashCode() {
        int iHashCode = this.f55899a.hashCode() * 31;
        r8k r8kVar = this.f55900b;
        return iHashCode + (r8kVar == null ? 0 : r8kVar.hashCode());
    }
}
