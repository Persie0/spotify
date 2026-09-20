package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class vxd1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f245722a;

    static {
        int[] iArr = new int[ta80.values().length];
        try {
            iArr[ta80.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ta80.ON_START.ordinal()] = 2;
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
        try {
            iArr[ta80.ON_PAUSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ta80.ON_RESUME.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ta80.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f245722a = iArr;
    }
}
