package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class y82 extends a92 {

    /* JADX INFO: renamed from: a */
    public final boolean f270173a;

    /* JADX INFO: renamed from: b */
    public final int f270174b;

    public y82(boolean z, int i) {
        this.f270173a = z;
        this.f270174b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y82)) {
            return false;
        }
        y82 y82Var = (y82) obj;
        return this.f270173a == y82Var.f270173a && this.f270174b == y82Var.f270174b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f270174b) + (Boolean.hashCode(this.f270173a) * 31);
    }
}
