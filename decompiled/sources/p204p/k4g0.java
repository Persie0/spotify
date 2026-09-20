package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k4g0 implements q4g0 {

    /* JADX INFO: renamed from: a */
    public final wbw f119218a;

    /* JADX INFO: renamed from: b */
    public final int f119219b;

    public k4g0(wbw wbwVar, int i) {
        this.f119218a = wbwVar;
        this.f119219b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4g0)) {
            return false;
        }
        k4g0 k4g0Var = (k4g0) obj;
        return this.f119218a == k4g0Var.f119218a && this.f119219b == k4g0Var.f119219b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f119219b) + (this.f119218a.hashCode() * 31);
    }
}
