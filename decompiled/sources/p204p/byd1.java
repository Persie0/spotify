package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class byd1 {

    /* JADX INFO: renamed from: b */
    public static final byd1 f32163b = new byd1(0);

    /* JADX INFO: renamed from: c */
    public static final byd1 f32164c = new byd1(1);

    /* JADX INFO: renamed from: d */
    public static final byd1 f32165d = new byd1(2);

    /* JADX INFO: renamed from: a */
    public final int f32166a;

    public byd1(int i) {
        this.f32166a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return byd1.class.equals(obj != null ? obj.getClass() : null) && this.f32166a == ((byd1) obj).f32166a;
    }

    public final int hashCode() {
        return this.f32166a;
    }

    public final String toString() {
        String str;
        if (equals(f32163b)) {
            str = "COMPACT";
        } else if (equals(f32164c)) {
            str = "MEDIUM";
        } else {
            str = equals(f32165d) ? "EXPANDED" : "UNKNOWN";
        }
        return "WindowWidthSizeClass: ".concat(str);
    }
}
