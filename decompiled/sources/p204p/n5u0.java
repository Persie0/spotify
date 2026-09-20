package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n5u0 {

    /* JADX INFO: renamed from: d */
    public static final n5u0 f150621d = new n5u0(0, 0);

    /* JADX INFO: renamed from: a */
    public final int f150622a;

    /* JADX INFO: renamed from: b */
    public final int f150623b;

    /* JADX INFO: renamed from: c */
    public final int f150624c;

    public n5u0(int i, int i2) {
        this.f150622a = i;
        this.f150623b = i2;
        this.f150624c = i2 * 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5u0)) {
            return false;
        }
        n5u0 n5u0Var = (n5u0) obj;
        return this.f150622a == n5u0Var.f150622a && this.f150623b == n5u0Var.f150623b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f150623b) + (Integer.hashCode(this.f150622a) * 31);
    }
}
