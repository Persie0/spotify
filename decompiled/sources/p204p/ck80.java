package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ck80 {

    /* JADX INFO: renamed from: a */
    public final int f38875a;

    public /* synthetic */ ck80(int i) {
        this.f38875a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ck80 m33082a(int i) {
        return new ck80(i);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m33083b(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m33084c(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: d */
    public static String m33085d(int i) {
        if (i == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        return i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int m33086e() {
        return this.f38875a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ck80) {
            return this.f38875a == ((ck80) obj).f38875a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38875a);
    }

    public final String toString() {
        return m33085d(this.f38875a);
    }
}
