package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h2f {

    /* JADX INFO: renamed from: a */
    public final x6m0 f86962a;

    /* JADX INFO: renamed from: b */
    public final Integer f86963b;

    /* JADX INFO: renamed from: c */
    public final pu41 f86964c;

    public h2f(x6m0 x6m0Var, Integer num, pu41 pu41Var) {
        this.f86962a = x6m0Var;
        this.f86963b = num;
        this.f86964c = pu41Var;
    }

    /* JADX INFO: renamed from: a */
    public static h2f m46486a(h2f h2fVar, x6m0 x6m0Var, Integer num, pu41 pu41Var, int i) {
        if ((i & 1) != 0) {
            x6m0Var = h2fVar.f86962a;
        }
        if ((i & 2) != 0) {
            num = h2fVar.f86963b;
        }
        if ((i & 4) != 0) {
            pu41Var = h2fVar.f86964c;
        }
        h2fVar.getClass();
        return new h2f(x6m0Var, num, pu41Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2f)) {
            return false;
        }
        h2f h2fVar = (h2f) obj;
        return wj50.m88271j(this.f86962a, h2fVar.f86962a) && wj50.m88271j(this.f86963b, h2fVar.f86963b) && wj50.m88271j(this.f86964c, h2fVar.f86964c);
    }

    public final int hashCode() {
        int iHashCode = this.f86962a.hashCode() * 31;
        Integer num = this.f86963b;
        return this.f86964c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
