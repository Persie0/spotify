package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hw40 {

    /* JADX INFO: renamed from: a */
    public final int f95856a;

    public final boolean equals(Object obj) {
        if (obj instanceof hw40) {
            return this.f95856a == ((hw40) obj).f95856a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f95856a);
    }

    public final String toString() {
        int i = this.f95856a;
        if (i == 1) {
            return "Touch";
        }
        return i == 2 ? "Keyboard" : "Error";
    }
}
