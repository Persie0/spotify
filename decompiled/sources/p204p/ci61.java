package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ci61 {

    /* JADX INFO: renamed from: a */
    public static final boolean f38242a;

    /* JADX INFO: renamed from: b */
    public static final boolean f38243b;

    /* JADX INFO: renamed from: c */
    public static final boolean f38244c;

    static {
        Object c6x0Var;
        Object c6x0Var2;
        Object c6x0Var3;
        try {
            c6x0Var = System.getProperty("kotlin.reflect.jvm.useK1Implementation");
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        String str = (String) c6x0Var;
        boolean z = false;
        f38242a = str != null && Boolean.parseBoolean(str);
        try {
            c6x0Var2 = System.getProperty("kotlin.reflect.jvm.newFakeOverridesImplementation");
        } catch (Throwable th2) {
            c6x0Var2 = new c6x0(th2);
        }
        if (c6x0Var2 instanceof c6x0) {
            c6x0Var2 = null;
        }
        String str2 = (String) c6x0Var2;
        f38243b = str2 != null && Boolean.parseBoolean(str2);
        try {
            c6x0Var3 = System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly");
        } catch (Throwable th3) {
            c6x0Var3 = new c6x0(th3);
        }
        String str3 = (String) (c6x0Var3 instanceof c6x0 ? null : c6x0Var3);
        if (str3 != null && Boolean.parseBoolean(str3)) {
            z = true;
        }
        f38244c = z;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m32881a() {
        return f38244c;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m32882b() {
        return f38243b;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m32883c() {
        return f38242a;
    }
}
