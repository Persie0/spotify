package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class pt3 {

    /* JADX INFO: renamed from: a */
    public static final Class f181033a;

    /* JADX INFO: renamed from: b */
    public static final boolean f181034b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f181033a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f181034b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m70890a() {
        return (f181033a == null || f181034b) ? false : true;
    }
}
