package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zm90 {

    /* JADX INFO: renamed from: a */
    public final int f284196a;

    public final boolean equals(Object obj) {
        if (obj instanceof zm90) {
            return this.f284196a == ((zm90) obj).f284196a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f284196a);
    }

    public final String toString() {
        int i = this.f284196a;
        if (i == 0) {
            return "Polite";
        }
        return i == 1 ? "Assertive" : "Unknown";
    }
}
