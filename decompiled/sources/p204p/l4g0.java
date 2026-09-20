package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l4g0 implements q4g0 {

    /* JADX INFO: renamed from: a */
    public final f2z f129679a;

    /* JADX INFO: renamed from: b */
    public final int f129680b;

    public l4g0(f2z f2zVar, int i) {
        this.f129679a = f2zVar;
        this.f129680b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4g0)) {
            return false;
        }
        l4g0 l4g0Var = (l4g0) obj;
        return this.f129679a == l4g0Var.f129679a && this.f129680b == l4g0Var.f129680b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f129680b) + (this.f129679a.hashCode() * 31);
    }
}
