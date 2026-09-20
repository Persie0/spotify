package p196j$.time.chrono;

import p196j$.time.temporal.EnumC1592a;

/* JADX INFO: renamed from: j$.time.chrono.h */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC1528h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f10652a;

    static {
        int[] iArr = new int[EnumC1592a.values().length];
        f10652a = iArr;
        try {
            iArr[EnumC1592a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10652a[EnumC1592a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
