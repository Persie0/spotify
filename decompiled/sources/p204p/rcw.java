package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rcw {

    /* JADX INFO: renamed from: a */
    public final int f197931a;

    /* JADX INFO: renamed from: b */
    public final int f197932b;

    public rcw(int i, int i2) {
        this.f197931a = i;
        this.f197932b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcw)) {
            return false;
        }
        rcw rcwVar = (rcw) obj;
        return this.f197931a == rcwVar.f197931a && this.f197932b == rcwVar.f197932b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f197932b) + (Integer.hashCode(this.f197931a) * 31);
    }
}
