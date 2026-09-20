package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.jqe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryRequest extends AbstractC0269h implements sre0 {
    private static final YourLibraryRequest DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PREDEFINED_PLAYLIST_CONFIGS_FIELD_NUMBER = 4;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 5;
    private int bitField0_;
    private YourLibraryRequestHeader header_;
    private YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs predefinedPlaylistConfigs_;
    private int updateThrottling_;

    static {
        YourLibraryRequest yourLibraryRequest = new YourLibraryRequest();
        DEFAULT_INSTANCE = yourLibraryRequest;
        AbstractC0269h.registerDefaultInstance(YourLibraryRequest.class, yourLibraryRequest);
    }

    private YourLibraryRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98170n(YourLibraryRequest yourLibraryRequest, YourLibraryRequestHeader yourLibraryRequestHeader) {
        yourLibraryRequest.getClass();
        yourLibraryRequestHeader.getClass();
        yourLibraryRequest.header_ = yourLibraryRequestHeader;
        yourLibraryRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m98171o(YourLibraryRequest yourLibraryRequest, YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs) {
        yourLibraryRequest.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.getClass();
        yourLibraryRequest.predefinedPlaylistConfigs_ = yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;
        yourLibraryRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m98172p(YourLibraryRequest yourLibraryRequest, int i) {
        yourLibraryRequest.updateThrottling_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static jqe1 m98173q() {
        return (jqe1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဉ\u0001\u0005\u0004", new Object[]{"bitField0_", "header_", "predefinedPlaylistConfigs_", "updateThrottling_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryRequest();
        }
        if (iOrdinal == 4) {
            return new jqe1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryRequest.class) {
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
