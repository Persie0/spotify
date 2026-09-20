package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tbi0 implements ubi0 {

    /* JADX INFO: renamed from: a */
    public final fiz f218871a;

    /* JADX INFO: renamed from: b */
    public final qe70 f218872b;

    /* JADX WARN: Multi-variable type inference failed */
    public tbi0(fiz fizVar, xh00 xh00Var) {
        this.f218871a = fizVar;
        this.f218872b = (qe70) xh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbi0)) {
            return false;
        }
        tbi0 tbi0Var = (tbi0) obj;
        return this.f218871a.equals(tbi0Var.f218871a) && this.f218872b.equals(tbi0Var.f218872b);
    }

    public final int hashCode() {
        return this.f218872b.hashCode() + (this.f218871a.hashCode() * 31);
    }
}
