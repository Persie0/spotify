package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xt30 {

    /* JADX INFO: renamed from: a */
    public final int f265742a;

    public /* synthetic */ xt30(int i) {
        this.f265742a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ xt30 m92003a(int i) {
        return new xt30(i);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m92004b(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m92005c(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: d */
    public static String m92006d(int i) {
        if (i == 1) {
            return "Hyphens.None";
        }
        if (i == 2) {
            return "Hyphens.Auto";
        }
        return i == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int m92007e() {
        return this.f265742a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xt30) {
            return this.f265742a == ((xt30) obj).f265742a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f265742a);
    }

    public final String toString() {
        return m92006d(this.f265742a);
    }
}
