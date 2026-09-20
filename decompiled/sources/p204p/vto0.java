package p204p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class vto0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f244741a;

    static {
        int[] iArr = new int[PlayabilityRestriction.values().length];
        try {
            iArr[PlayabilityRestriction.NO_RESTRICTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayabilityRestriction.NOT_AVAILABLE_OFFLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlayabilityRestriction.EXPLICIT_CONTENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlayabilityRestriction.AGE_RESTRICTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PlayabilityRestriction.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PlayabilityRestriction.NOT_IN_CATALOGUE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PlayabilityRestriction.PREMIUM_ONLY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f244741a = iArr;
    }
}
