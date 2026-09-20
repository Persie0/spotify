package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class woq0 {

    /* JADX INFO: renamed from: a */
    public final ljq0 f253559a;

    /* JADX INFO: renamed from: b */
    public final int f253560b;

    public woq0(ljq0 ljq0Var, int i) {
        this.f253559a = ljq0Var;
        this.f253560b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woq0)) {
            return false;
        }
        woq0 woq0Var = (woq0) obj;
        return this.f253559a.equals(woq0Var.f253559a) && this.f253560b == woq0Var.f253560b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + mt60.m62800g(this.f253560b, this.f253559a.hashCode() * 31, 31);
    }
}
