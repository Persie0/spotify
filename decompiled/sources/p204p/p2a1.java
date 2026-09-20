package p204p;

import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class p2a1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f173310a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f173311b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f173312c;

    static {
        int[] iArr = new int[PlayabilityRestriction.values().length];
        try {
            iArr[PlayabilityRestriction.AGE_RESTRICTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayabilityRestriction.EXPLICIT_CONTENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlayabilityRestriction.NO_RESTRICTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlayabilityRestriction.NOT_IN_CATALOGUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f173310a = iArr;
        int[] iArr2 = new int[EpisodeMetadata.EpisodeType.values().length];
        try {
            iArr2[EpisodeMetadata.EpisodeType.BONUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EpisodeMetadata.EpisodeType.TRAILER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EpisodeMetadata.EpisodeType.FULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f173311b = iArr2;
        int[] iArr3 = new int[EpisodeMetadata.MediaType.values().length];
        try {
            iArr3[EpisodeMetadata.MediaType.VODCAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[EpisodeMetadata.MediaType.AUDIO.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[EpisodeMetadata.MediaType.VIDEO.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        f173312c = iArr3;
    }
}
