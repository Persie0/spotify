package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class ot3 {

    /* JADX INFO: renamed from: a */
    public static final Class f168957a;

    /* JADX INFO: renamed from: b */
    public static final boolean f168958b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f168957a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f168958b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m67760a() {
        return (f168957a == null || f168958b) ? false : true;
    }
}
