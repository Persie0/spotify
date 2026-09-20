package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ioe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;

/* JADX INFO: loaded from: classes3.dex */
public final class YourLibraryContainsRequest extends AbstractC0269h implements sre0 {
    private static final YourLibraryContainsRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PREDEFINED_PLAYLIST_CONFIGS_FIELD_NUMBER = 4;
    public static final int REQUESTED_URI_FIELD_NUMBER = 3;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 5;
    private int bitField0_;
    private YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs predefinedPlaylistConfigs_;
    private ae50 requestedUri_ = AbstractC0269h.emptyProtobufList();
    private int updateThrottling_;

    static {
        YourLibraryContainsRequest yourLibraryContainsRequest = new YourLibraryContainsRequest();
        DEFAULT_INSTANCE = yourLibraryContainsRequest;
        AbstractC0269h.registerDefaultInstance(YourLibraryContainsRequest.class, yourLibraryContainsRequest);
    }

    private YourLibraryContainsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98147n(YourLibraryContainsRequest yourLibraryContainsRequest, Iterable iterable) {
        ae50 ae50Var = yourLibraryContainsRequest.requestedUri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            yourLibraryContainsRequest.requestedUri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, yourLibraryContainsRequest.requestedUri_);
    }

    /* JADX INFO: renamed from: o */
    public static void m98148o(YourLibraryContainsRequest yourLibraryContainsRequest, String str) {
        yourLibraryContainsRequest.getClass();
        str.getClass();
        ae50 ae50Var = yourLibraryContainsRequest.requestedUri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            yourLibraryContainsRequest.requestedUri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        yourLibraryContainsRequest.requestedUri_.add(str);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ioe1 m98149q() {
        return (ioe1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0001\u0000\u0003Ț\u0004ဉ\u0000\u0005\u0004", new Object[]{"bitField0_", "requestedUri_", "predefinedPlaylistConfigs_", "updateThrottling_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryContainsRequest();
        }
        if (iOrdinal == 4) {
            return new ioe1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryContainsRequest.class) {
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

    /* JADX INFO: renamed from: p */
    public final ae50 m98150p() {
        return this.requestedUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
