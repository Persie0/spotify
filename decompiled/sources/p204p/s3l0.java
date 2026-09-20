package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s3l0 {

    /* JADX INFO: renamed from: c */
    public static final s3l0 f205302c = new s3l0(0, 0);

    /* JADX INFO: renamed from: a */
    public final int f205303a;

    /* JADX INFO: renamed from: b */
    public final int f205304b;

    public s3l0(int i, int i2) {
        this.f205303a = i;
        this.f205304b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3l0)) {
            return false;
        }
        s3l0 s3l0Var = (s3l0) obj;
        return this.f205303a == s3l0Var.f205303a && this.f205304b == s3l0Var.f205304b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f205304b) + (Integer.hashCode(this.f205303a) * 31);
    }
}
