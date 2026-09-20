package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pwc1 implements bxc1 {

    /* JADX INFO: renamed from: a */
    public final dy1 f181987a;

    /* JADX INFO: renamed from: b */
    public final Double f181988b;

    public pwc1(dy1 dy1Var, Double d) {
        this.f181987a = dy1Var;
        this.f181988b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwc1)) {
            return false;
        }
        pwc1 pwc1Var = (pwc1) obj;
        return wj50.m88271j(this.f181987a, pwc1Var.f181987a) && wj50.m88271j(this.f181988b, pwc1Var.f181988b);
    }

    public final int hashCode() {
        int iHashCode = this.f181987a.hashCode() * 31;
        Double d = this.f181988b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }
}
