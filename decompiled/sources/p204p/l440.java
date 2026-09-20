package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class l440 {

    /* JADX INFO: renamed from: a */
    public final int f129566a;

    /* JADX INFO: renamed from: a */
    public static final boolean m58103a(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l440) {
            return this.f129566a == ((l440) obj).f129566a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f129566a);
    }

    public final String toString() {
        int i = this.f129566a;
        if (i == 0) {
            return "Argb8888";
        }
        if (i == 1) {
            return "Alpha8";
        }
        if (i == 2) {
            return "Rgb565";
        }
        if (i == 3) {
            return "F16";
        }
        return i == 4 ? "Gpu" : "Unknown";
    }
}
