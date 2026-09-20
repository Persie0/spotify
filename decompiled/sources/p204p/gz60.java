package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class gz60 {

    /* JADX INFO: renamed from: a */
    public final int f85849a;

    /* JADX INFO: renamed from: a */
    public static final boolean m46189a(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m46190b(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: c */
    public static String m46191c(int i) {
        if (i == -1) {
            return "Unspecified";
        }
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Characters";
        }
        if (i == 2) {
            return "Words";
        }
        return i == 3 ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gz60) {
            return this.f85849a == ((gz60) obj).f85849a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85849a);
    }

    public final String toString() {
        return m46191c(this.f85849a);
    }
}
