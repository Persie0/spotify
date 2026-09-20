package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class xgr {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f261368a;

    static {
        int[] iArr = new int[ta80.values().length];
        try {
            iArr[ta80.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ta80.ON_RESUME.ordinal()] = 2;
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
        f261368a = iArr;
    }
}
