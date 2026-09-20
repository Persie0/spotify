package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class s6q0 {

    /* JADX INFO: renamed from: a */
    public final int f206181a;

    public /* synthetic */ s6q0(int i) {
        this.f206181a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ s6q0 m77339a(int i) {
        return new s6q0(i);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m77340b(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: c */
    public static String m77341c(int i) {
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Mouse";
        }
        if (i != 3) {
            return i != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int m77342d() {
        return this.f206181a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s6q0) {
            return this.f206181a == ((s6q0) obj).f206181a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f206181a);
    }

    public final String toString() {
        return m77341c(this.f206181a);
    }
}
