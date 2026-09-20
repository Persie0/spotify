package p196j$.time;

import p196j$.time.temporal.EnumC1592a;

/* JADX INFO: renamed from: j$.time.a0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC1511a0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f10632a;

    static {
        int[] iArr = new int[EnumC1592a.values().length];
        f10632a = iArr;
        try {
            iArr[EnumC1592a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10632a[EnumC1592a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
