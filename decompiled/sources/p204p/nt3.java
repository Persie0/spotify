package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class nt3 {

    /* JADX INFO: renamed from: a */
    public static final Class f157967a;

    /* JADX INFO: renamed from: b */
    public static final boolean f157968b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f157967a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f157968b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m65594a() {
        return (f157967a == null || f157968b) ? false : true;
    }
}
