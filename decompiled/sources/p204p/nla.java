package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class nla {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f155028a;

    static {
        int[] iArr = new int[hla.values().length];
        try {
            iArr[hla.BROADCAST_STATUS_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hla.BROADCAST_UNAVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hla.BROADCAST_ON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[hla.BROADCAST_OFF.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f155028a = iArr;
    }
}
