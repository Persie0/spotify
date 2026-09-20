package p204p;

import com.spotify.yourupdates.domain.models.FetchMode;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class cxe1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f43017a;

    static {
        int[] iArr = new int[m70.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            z60 z60Var = m70.Companion;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[FetchMode.values().length];
        try {
            iArr2[FetchMode.NEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[FetchMode.INITIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f43017a = iArr2;
    }
}
