package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class roz {

    /* JADX INFO: renamed from: a */
    public final int f201376a;

    public /* synthetic */ roz(int i) {
        this.f201376a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ roz m76091a(int i) {
        return new roz(i);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m76092b(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: c */
    public static String m76093c(int i) {
        if (i == 1) {
            return "Next";
        }
        if (i == 2) {
            return "Previous";
        }
        if (i == 3) {
            return "Left";
        }
        if (i == 4) {
            return "Right";
        }
        if (i == 5) {
            return "Up";
        }
        if (i == 6) {
            return "Down";
        }
        if (i == 7) {
            return "Enter";
        }
        return i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int m76094d() {
        return this.f201376a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof roz) {
            return this.f201376a == ((roz) obj).f201376a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f201376a);
    }

    public final String toString() {
        return m76093c(this.f201376a);
    }
}
