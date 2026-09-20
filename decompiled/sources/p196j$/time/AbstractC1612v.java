package p196j$.time;

import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;

/* JADX INFO: renamed from: j$.time.v */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC1612v {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f10847a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f10848b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f10848b = iArr;
        try {
            iArr[ChronoUnit.YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10848b[ChronoUnit.DECADES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10848b[ChronoUnit.CENTURIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f10848b[ChronoUnit.MILLENNIA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f10848b[ChronoUnit.ERAS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[EnumC1592a.values().length];
        f10847a = iArr2;
        try {
            iArr2[EnumC1592a.YEAR_OF_ERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f10847a[EnumC1592a.YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f10847a[EnumC1592a.ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
