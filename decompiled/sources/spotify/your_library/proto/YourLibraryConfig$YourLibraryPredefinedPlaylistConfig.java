package spotify.your_library.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.doe1;
import p204p.eoe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryConfig$YourLibraryPredefinedPlaylistConfig extends AbstractC0269h implements sre0 {
    public static final int DECORATE_NUM_LINK_TYPES_FIELD_NUMBER = 2;
    private static final YourLibraryConfig$YourLibraryPredefinedPlaylistConfig DEFAULT_INSTANCE;
    public static final int INCLUSION_MODE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private boolean decorateNumLinkTypes_;
    private int inclusionMode_;

    static {
        YourLibraryConfig$YourLibraryPredefinedPlaylistConfig yourLibraryConfig$YourLibraryPredefinedPlaylistConfig = new YourLibraryConfig$YourLibraryPredefinedPlaylistConfig();
        DEFAULT_INSTANCE = yourLibraryConfig$YourLibraryPredefinedPlaylistConfig;
        AbstractC0269h.registerDefaultInstance(YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.class, yourLibraryConfig$YourLibraryPredefinedPlaylistConfig);
    }

    private YourLibraryConfig$YourLibraryPredefinedPlaylistConfig() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98221n(YourLibraryConfig$YourLibraryPredefinedPlaylistConfig yourLibraryConfig$YourLibraryPredefinedPlaylistConfig) {
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfig.decorateNumLinkTypes_ = true;
    }

    /* JADX INFO: renamed from: o */
    public static void m98222o(YourLibraryConfig$YourLibraryPredefinedPlaylistConfig yourLibraryConfig$YourLibraryPredefinedPlaylistConfig, eoe1 eoe1Var) {
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfig.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfig.inclusionMode_ = eoe1Var.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static YourLibraryConfig$YourLibraryPredefinedPlaylistConfig m98223p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static doe1 m98224q() {
        return (doe1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"inclusionMode_", "decorateNumLinkTypes_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryConfig$YourLibraryPredefinedPlaylistConfig();
        }
        if (iOrdinal == 4) {
            return new doe1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.class) {
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
