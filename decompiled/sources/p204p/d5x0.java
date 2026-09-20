package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d5x0 {

    /* JADX INFO: renamed from: a */
    public final boolean f45528a;

    /* JADX INFO: renamed from: b */
    public final boolean f45529b;

    public d5x0(boolean z, boolean z2) {
        this.f45528a = z;
        this.f45529b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5x0)) {
            return false;
        }
        d5x0 d5x0Var = (d5x0) obj;
        return this.f45528a == d5x0Var.f45528a && this.f45529b == d5x0Var.f45529b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f45529b) + (Boolean.hashCode(this.f45528a) * 31);
    }
}
