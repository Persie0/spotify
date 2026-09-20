package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yny0 {

    /* JADX INFO: renamed from: a */
    public final zny0 f274528a;

    /* JADX INFO: renamed from: b */
    public final ncz0 f274529b;

    public yny0(zny0 zny0Var, ncz0 ncz0Var) {
        this.f274528a = zny0Var;
        this.f274529b = ncz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yny0)) {
            return false;
        }
        yny0 yny0Var = (yny0) obj;
        return wj50.m88271j(this.f274528a, yny0Var.f274528a) && wj50.m88271j(this.f274529b, yny0Var.f274529b);
    }

    public final int hashCode() {
        int iHashCode = this.f274528a.hashCode() * 31;
        ncz0 ncz0Var = this.f274529b;
        return iHashCode + (ncz0Var == null ? 0 : ncz0Var.hashCode());
    }
}
