package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o4g0 implements q4g0 {

    /* JADX INFO: renamed from: a */
    public final h4b0 f161668a;

    /* JADX INFO: renamed from: b */
    public final int f161669b;

    public o4g0(h4b0 h4b0Var, int i) {
        this.f161668a = h4b0Var;
        this.f161669b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4g0)) {
            return false;
        }
        o4g0 o4g0Var = (o4g0) obj;
        return this.f161668a == o4g0Var.f161668a && this.f161669b == o4g0Var.f161669b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f161669b) + (this.f161668a.hashCode() * 31);
    }
}
