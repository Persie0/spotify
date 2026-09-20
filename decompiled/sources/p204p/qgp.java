package p204p;

import com.spotify.cosmos.util.proto.ShowPlayState;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class qgp {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f188512a;

    static {
        int[] iArr = new int[ShowPlayState.Label.values().length];
        try {
            iArr[ShowPlayState.Label.UNKNOWN_LABEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShowPlayState.Label.NOT_STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ShowPlayState.Label.IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ShowPlayState.Label.COMPLETED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f188512a = iArr;
    }
}
