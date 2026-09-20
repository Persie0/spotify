package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qvd1 {

    /* JADX INFO: renamed from: b */
    public static final qvd1 f192981b = new qvd1(0);

    /* JADX INFO: renamed from: c */
    public static final qvd1 f192982c = new qvd1(1);

    /* JADX INFO: renamed from: d */
    public static final qvd1 f192983d = new qvd1(2);

    /* JADX INFO: renamed from: a */
    public final int f192984a;

    public qvd1(int i) {
        this.f192984a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return qvd1.class.equals(obj != null ? obj.getClass() : null) && this.f192984a == ((qvd1) obj).f192984a;
    }

    public final int hashCode() {
        return this.f192984a;
    }

    public final String toString() {
        String str;
        if (equals(f192981b)) {
            str = "COMPACT";
        } else if (equals(f192982c)) {
            str = "MEDIUM";
        } else {
            str = equals(f192983d) ? "EXPANDED" : "UNKNOWN";
        }
        return "WindowHeightSizeClass: ".concat(str);
    }
}
