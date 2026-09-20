package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class g4j0 {

    /* JADX INFO: renamed from: a */
    public final int f76429a;

    /* JADX INFO: renamed from: b */
    public final j4m0 f76430b;

    public g4j0(int i, j4m0 j4m0Var) {
        this.f76429a = i;
        this.f76430b = j4m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4j0)) {
            return false;
        }
        g4j0 g4j0Var = (g4j0) obj;
        return this.f76429a == g4j0Var.f76429a && this.f76430b.equals(g4j0Var.f76430b);
    }

    public final int hashCode() {
        return this.f76430b.hashCode() + (edb.m38547C(this.f76429a) * 31);
    }
}
