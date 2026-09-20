package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ox5 {

    /* JADX INFO: renamed from: a */
    public final hy5 f170889a;

    public ox5(hy5 hy5Var) {
        this.f170889a = hy5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ox5) && wj50.m88271j(this.f170889a, ((ox5) obj).f170889a);
    }

    public final int hashCode() {
        hy5 hy5Var = this.f170889a;
        if (hy5Var == null) {
            return 0;
        }
        return hy5Var.f96463a.hashCode();
    }
}
