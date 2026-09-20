package p196j$.desugar.sun.nio.p197fs;

import p196j$.nio.file.EnumC1432a;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.j */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC1422j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f10486a;

    static {
        int[] iArr = new int[EnumC1432a.values().length];
        f10486a = iArr;
        try {
            iArr[EnumC1432a.READ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10486a[EnumC1432a.WRITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10486a[EnumC1432a.EXECUTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
