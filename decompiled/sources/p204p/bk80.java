package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bk80 {

    /* JADX INFO: renamed from: a */
    public final int f27860a;

    public /* synthetic */ bk80(int i) {
        this.f27860a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ bk80 m29646a(int i) {
        return new bk80(i);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m29647b(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m29648c(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: d */
    public static String m29649d(int i) {
        if (i == 0) {
            return "LineHeightStyle.Mode.Fixed";
        }
        if (i == 1) {
            return "LineHeightStyle.Mode.Minimum";
        }
        return i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int m29650e() {
        return this.f27860a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bk80) {
            return this.f27860a == ((bk80) obj).f27860a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27860a);
    }

    public final String toString() {
        return m29649d(this.f27860a);
    }
}
