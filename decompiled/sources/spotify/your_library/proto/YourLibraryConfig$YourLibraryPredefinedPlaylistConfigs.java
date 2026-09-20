package spotify.your_library.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.foe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs extends AbstractC0269h implements sre0 {
    public static final int ALL_AVAILABLE_CONFIGS_PROVIDED_FIELD_NUMBER = 99;
    public static final int CACHED_FILES_FIELD_NUMBER = 5;
    private static final YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs DEFAULT_INSTANCE;
    public static final int HIGHLIGHTS_FIELD_NUMBER = 6;
    public static final int KALLAX_FIELD_NUMBER = 7;
    public static final int LIKED_SONGS_FIELD_NUMBER = 1;
    public static final int LOCAL_FILES_FIELD_NUMBER = 4;
    public static final int NEW_EPISODES_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int YOUR_EPISODES_FIELD_NUMBER = 2;
    private boolean allAvailableConfigsProvided_;
    private int bitField0_;
    private YourLibraryConfig$YourLibraryPredefinedPlaylistConfig cachedFiles_;
    private YourLibraryConfig$YourLibraryPredefinedPlaylistConfig highlights_;
    private YourLibraryConfig$YourLibraryPredefinedPlaylistConfig kallax_;
    private YourLibraryConfig$YourLibraryPredefinedPlaylistConfig likedSongs_;
    private YourLibraryConfig$YourLibraryLabelAndImage localFiles_;
    private YourLibraryConfig$YourLibraryLabelAndImage newEpisodes_;
    private YourLibraryConfig$YourLibraryPredefinedPlaylistConfig yourEpisodes_;

    static {
        YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs = new YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs();
        DEFAULT_INSTANCE = yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;
        AbstractC0269h.registerDefaultInstance(YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.class, yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs);
    }

    private YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98225n(YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs, boolean z) {
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.allAvailableConfigsProvided_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m98226o(YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs, YourLibraryConfig$YourLibraryPredefinedPlaylistConfig yourLibraryConfig$YourLibraryPredefinedPlaylistConfig) {
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfig.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.cachedFiles_ = yourLibraryConfig$YourLibraryPredefinedPlaylistConfig;
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: p */
    public static void m98227p(YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs, YourLibraryConfig$YourLibraryPredefinedPlaylistConfig yourLibraryConfig$YourLibraryPredefinedPlaylistConfig) {
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfig.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.highlights_ = yourLibraryConfig$YourLibraryPredefinedPlaylistConfig;
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.bitField0_ |= 32;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m98228q(YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs, YourLibraryConfig$YourLibraryPredefinedPlaylistConfig yourLibraryConfig$YourLibraryPredefinedPlaylistConfig) {
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfig.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.kallax_ = yourLibraryConfig$YourLibraryPredefinedPlaylistConfig;
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.bitField0_ |= 64;
    }

    /* JADX INFO: renamed from: r */
    public static void m98229r(YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs, YourLibraryConfig$YourLibraryPredefinedPlaylistConfig yourLibraryConfig$YourLibraryPredefinedPlaylistConfig) {
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfig.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.likedSongs_ = yourLibraryConfig$YourLibraryPredefinedPlaylistConfig;
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static void m98230s(YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs, YourLibraryConfig$YourLibraryLabelAndImage yourLibraryConfig$YourLibraryLabelAndImage) {
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.getClass();
        yourLibraryConfig$YourLibraryLabelAndImage.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.localFiles_ = yourLibraryConfig$YourLibraryLabelAndImage;
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: t */
    public static void m98231t(YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs, YourLibraryConfig$YourLibraryLabelAndImage yourLibraryConfig$YourLibraryLabelAndImage) {
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.getClass();
        yourLibraryConfig$YourLibraryLabelAndImage.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.newEpisodes_ = yourLibraryConfig$YourLibraryLabelAndImage;
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: u */
    public static void m98232u(YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs, YourLibraryConfig$YourLibraryPredefinedPlaylistConfig yourLibraryConfig$YourLibraryPredefinedPlaylistConfig) {
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfig.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.yourEpisodes_ = yourLibraryConfig$YourLibraryPredefinedPlaylistConfig;
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: w */
    public static YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs m98234w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static foe1 m98235x() {
        return (foe1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001c\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006c\u0007", new Object[]{"bitField0_", "likedSongs_", "yourEpisodes_", "newEpisodes_", "localFiles_", "cachedFiles_", "highlights_", "kallax_", "allAvailableConfigsProvided_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs();
        }
        if (iOrdinal == 4) {
            return new foe1();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
