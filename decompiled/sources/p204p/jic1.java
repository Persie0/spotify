package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class jic1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f112722a;

    static {
        int[] iArr = new int[ta80.values().length];
        try {
            iArr[ta80.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ta80.ON_PAUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ta80.ON_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ta80.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f112722a = iArr;
    }
}
