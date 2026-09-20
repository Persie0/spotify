package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mt3 {

    /* JADX INFO: renamed from: a */
    public static final Class f146939a;

    /* JADX INFO: renamed from: b */
    public static final boolean f146940b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f146939a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f146940b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m62787a() {
        return (f146939a == null || f146940b) ? false : true;
    }
}
