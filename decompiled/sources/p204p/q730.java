package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class q730 implements r730 {

    /* JADX INFO: renamed from: a */
    public final u730 f186021a;

    /* JADX INFO: renamed from: b */
    public final p730 f186022b;

    public q730(u730 u730Var, p730 p730Var) {
        this.f186021a = u730Var;
        this.f186022b = p730Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q730)) {
            return false;
        }
        q730 q730Var = (q730) obj;
        return wj50.m88271j(this.f186021a, q730Var.f186021a) && wj50.m88271j(this.f186022b, q730Var.f186022b);
    }

    public final int hashCode() {
        return this.f186022b.hashCode() + (this.f186021a.hashCode() * 31);
    }
}
