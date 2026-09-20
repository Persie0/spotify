package p204p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class yp11 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f274794a;

    static {
        int[] iArr = new int[PlayabilityRestriction.values().length];
        try {
            iArr[PlayabilityRestriction.EXPLICIT_CONTENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayabilityRestriction.AGE_RESTRICTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f274794a = iArr;
    }
}
