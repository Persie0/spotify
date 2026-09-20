package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class q290 {

    /* JADX INFO: renamed from: a */
    public final int f184566a;

    /* JADX INFO: renamed from: b */
    public final int f184567b;

    public q290(int i, int i2) {
        this.f184566a = i;
        this.f184567b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q290)) {
            return false;
        }
        q290 q290Var = (q290) obj;
        return this.f184566a == q290Var.f184566a && this.f184567b == q290Var.f184567b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f184567b) + (Integer.hashCode(this.f184566a) * 31);
    }
}
