package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qq81 {

    /* JADX INFO: renamed from: a */
    public final int f191509a;

    /* JADX INFO: renamed from: b */
    public final int f191510b;

    public qq81(int i, int i2) {
        this.f191509a = i;
        this.f191510b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq81)) {
            return false;
        }
        qq81 qq81Var = (qq81) obj;
        return this.f191509a == qq81Var.f191509a && this.f191510b == qq81Var.f191510b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f191510b) + (Integer.hashCode(this.f191509a) * 31);
    }
}
