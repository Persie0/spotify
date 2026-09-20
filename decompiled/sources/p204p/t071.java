package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t071 {

    /* JADX INFO: renamed from: a */
    public static final boolean f215773a;

    static {
        boolean z;
        try {
            Class.forName("org.robolectric.Robolectric");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        f215773a = z;
    }
}
