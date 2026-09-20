package p196j$.adapter;

/* JADX INFO: renamed from: j$.adapter.a */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC1411a {

    /* JADX INFO: renamed from: a */
    public static final boolean f10458a;

    /* JADX INFO: renamed from: b */
    public static final boolean f10459b;

    static {
        boolean z;
        try {
            Class.forName("java.util.StringJoiner");
        } catch (ClassNotFoundException unused) {
        }
        boolean z2 = false;
        try {
            Class.forName("java.nio.file.FileSystems");
            z = true;
        } catch (ClassNotFoundException unused2) {
            z = false;
        }
        f10458a = z;
        try {
            Class.forName("android.os.Build");
            z2 = true;
        } catch (ClassNotFoundException unused3) {
        }
        f10459b = z2;
    }
}
