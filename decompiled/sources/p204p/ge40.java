package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ge40 {

    /* JADX INFO: renamed from: a */
    public final int f79014a;

    public /* synthetic */ ge40(int i) {
        this.f79014a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ge40 m44450a(int i) {
        return new ge40(i);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m44451b(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m44452c(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: d */
    public static String m44453d(int i) {
        if (i == -1) {
            return "Unspecified";
        }
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Default";
        }
        if (i == 2) {
            return "Go";
        }
        if (i == 3) {
            return "Search";
        }
        if (i == 4) {
            return "Send";
        }
        if (i == 5) {
            return "Previous";
        }
        if (i == 6) {
            return "Next";
        }
        return i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ge40) {
            return this.f79014a == ((ge40) obj).f79014a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79014a);
    }

    public final String toString() {
        return m44453d(this.f79014a);
    }
}
