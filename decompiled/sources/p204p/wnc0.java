package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wnc0 {

    /* JADX INFO: renamed from: a */
    public final int f253149a;

    /* JADX INFO: renamed from: a */
    public static String m88592a(int i) {
        if (i == 0) {
            return "Immediately";
        }
        if (i == 1) {
            return "WhileFocused";
        }
        throw new IllegalStateException(("invalid value: " + i).toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wnc0) {
            return this.f253149a == ((wnc0) obj).f253149a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f253149a);
    }

    public final String toString() {
        return m88592a(this.f253149a);
    }
}
