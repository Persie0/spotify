package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mnd {

    /* JADX INFO: renamed from: a */
    public final ckf1 f145405a;

    /* JADX INFO: renamed from: b */
    public final y96 f145406b;

    public mnd(ckf1 ckf1Var, y96 y96Var) {
        this.f145405a = ckf1Var;
        this.f145406b = y96Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnd)) {
            return false;
        }
        mnd mndVar = (mnd) obj;
        return wj50.m88271j(this.f145405a, mndVar.f145405a) && wj50.m88271j(this.f145406b, mndVar.f145406b);
    }

    public final int hashCode() {
        return this.f145406b.f270516a.hashCode() + (this.f145405a.hashCode() * 31);
    }
}
