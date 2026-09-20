package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u2y {

    /* JADX INFO: renamed from: a */
    public final wwj0 f226193a;

    /* JADX INFO: renamed from: b */
    public final f1j f226194b;

    public u2y(wwj0 wwj0Var, f1j f1jVar) {
        this.f226193a = wwj0Var;
        this.f226194b = f1jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2y)) {
            return false;
        }
        u2y u2yVar = (u2y) obj;
        return wj50.m88271j(this.f226193a, u2yVar.f226193a) && wj50.m88271j(this.f226194b, u2yVar.f226194b);
    }

    public final int hashCode() {
        return this.f226194b.hashCode() + (this.f226193a.f255781a.hashCode() * 31);
    }
}
