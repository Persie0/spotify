package p204p;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class q9r {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f186658a;

    static {
        int[] iArr = new int[ta80.values().length];
        try {
            iArr[ta80.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ta80.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ta80.ON_PAUSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ta80.ON_STOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f186658a = iArr;
    }
}
