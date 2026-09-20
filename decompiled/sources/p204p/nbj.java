package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nbj {

    /* JADX INFO: renamed from: a */
    public final int f152277a;

    /* JADX INFO: renamed from: b */
    public final fw21 f152278b;

    public nbj(int i, fw21 fw21Var) {
        this.f152277a = i;
        this.f152278b = fw21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbj)) {
            return false;
        }
        nbj nbjVar = (nbj) obj;
        return this.f152277a == nbjVar.f152277a && this.f152278b == nbjVar.f152278b;
    }

    public final int hashCode() {
        return this.f152278b.hashCode() + (edb.m38547C(this.f152277a) * 31);
    }
}
