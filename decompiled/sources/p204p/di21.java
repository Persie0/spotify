package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class di21 {

    /* JADX INFO: renamed from: c */
    public static final di21 f49218c = new di21(-1, -1);

    /* JADX INFO: renamed from: a */
    public final int f49219a;

    /* JADX INFO: renamed from: b */
    public final int f49220b;

    static {
        new di21(0, 0);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public di21(int i, int i2) {
        c95.m31843i((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f49219a = i;
        this.f49220b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof di21) {
            di21 di21Var = (di21) obj;
            if (this.f49219a == di21Var.f49219a && this.f49220b == di21Var.f49220b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f49219a;
        return ((i >>> 16) | (i << 16)) ^ this.f49220b;
    }

    public final String toString() {
        return this.f49219a + "x" + this.f49220b;
    }
}
