package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class h171 {

    /* JADX INFO: renamed from: a */
    public final int f86525a;

    /* JADX INFO: renamed from: a */
    public static String m46410a(int i) {
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            return "End";
        }
        return i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h171) {
            return this.f86525a == ((h171) obj).f86525a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f86525a);
    }

    public final String toString() {
        return m46410a(this.f86525a);
    }
}
