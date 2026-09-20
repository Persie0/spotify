package p204p;

import com.spotify.cosmos.util.proto.EpisodeMetadata;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class ngp {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f153748a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f153749b;

    static {
        int[] iArr = new int[EpisodeMetadata.MediaType.values().length];
        try {
            iArr[EpisodeMetadata.MediaType.VODCAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EpisodeMetadata.MediaType.AUDIO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EpisodeMetadata.MediaType.VIDEO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f153748a = iArr;
        int[] iArr2 = new int[EpisodeMetadata.EpisodeType.values().length];
        try {
            iArr2[EpisodeMetadata.EpisodeType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EpisodeMetadata.EpisodeType.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EpisodeMetadata.EpisodeType.TRAILER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EpisodeMetadata.EpisodeType.BONUS.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f153749b = iArr2;
    }
}
