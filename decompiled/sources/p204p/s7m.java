package p204p;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class s7m {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f206399a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f206400b;

    static {
        int[] iArr = new int[hla.values().length];
        try {
            iArr[hla.BROADCAST_ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hla.BROADCAST_OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hla.BROADCAST_UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[hla.BROADCAST_STATUS_UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f206399a = iArr;
        int[] iArr2 = new int[j3n0.values().length];
        try {
            iArr2[j3n0.UNAVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[j3n0.ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[j3n0.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f206400b = iArr2;
    }
}
