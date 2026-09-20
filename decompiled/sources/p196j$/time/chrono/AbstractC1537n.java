package p196j$.time.chrono;

import p196j$.time.temporal.EnumC1592a;

/* JADX INFO: renamed from: j$.time.chrono.n */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC1537n {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f10661a;

    static {
        int[] iArr = new int[EnumC1592a.values().length];
        f10661a = iArr;
        try {
            iArr[EnumC1592a.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10661a[EnumC1592a.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10661a[EnumC1592a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f10661a[EnumC1592a.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f10661a[EnumC1592a.YEAR_OF_ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f10661a[EnumC1592a.ERA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
