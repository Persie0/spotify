package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mjf0 {

    /* JADX INFO: renamed from: a */
    public final boolean f144247a;

    /* JADX INFO: renamed from: b */
    public final int f144248b;

    public mjf0(boolean z, int i) {
        this.f144247a = z;
        this.f144248b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjf0)) {
            return false;
        }
        mjf0 mjf0Var = (mjf0) obj;
        return this.f144247a == mjf0Var.f144247a && this.f144248b == mjf0Var.f144248b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f144248b) + (Boolean.hashCode(this.f144247a) * 31);
    }
}
