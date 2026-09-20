package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ac71 {

    /* JADX INFO: renamed from: a */
    public final int f14281a;

    public final boolean equals(Object obj) {
        if (obj instanceof ac71) {
            return this.f14281a == ((ac71) obj).f14281a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14281a);
    }

    public final String toString() {
        int i = this.f14281a;
        if (i == 1) {
            return "Linearity.Linear";
        }
        if (i == 2) {
            return "Linearity.FontHinting";
        }
        return i == 3 ? "Linearity.None" : "Invalid";
    }
}
