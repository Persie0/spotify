package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ved0 {

    /* JADX INFO: renamed from: a */
    public final sl00 f240700a;

    /* JADX INFO: renamed from: b */
    public final int f240701b;

    /* JADX INFO: renamed from: c */
    public final eh00 f240702c;

    public ved0(sl00 sl00Var, int i, eh00 eh00Var) {
        this.f240700a = sl00Var;
        this.f240701b = i;
        this.f240702c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ved0)) {
            return false;
        }
        ved0 ved0Var = (ved0) obj;
        return wj50.m88271j(this.f240700a, ved0Var.f240700a) && this.f240701b == ved0Var.f240701b && wj50.m88271j(this.f240702c, ved0Var.f240702c);
    }

    public final int hashCode() {
        return this.f240702c.hashCode() + mt60.m62800g(this.f240701b, this.f240700a.hashCode() * 31, 31);
    }
}
