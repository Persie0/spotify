package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class k571 {

    /* JADX INFO: renamed from: a */
    public final int f119428a;

    public /* synthetic */ k571(int i) {
        this.f119428a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ k571 m55425a(int i) {
        return new k571(i);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m55426b(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m55427c(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: d */
    public static String m55428d(int i) {
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        if (i == 5) {
            return "ContentOrRtl";
        }
        return i == 0 ? "Unspecified" : "Invalid";
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int m55429e() {
        return this.f119428a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k571) {
            return this.f119428a == ((k571) obj).f119428a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f119428a);
    }

    public final String toString() {
        return m55428d(this.f119428a);
    }
}
