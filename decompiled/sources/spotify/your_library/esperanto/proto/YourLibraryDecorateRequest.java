package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.moe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryDecorateRequest extends AbstractC0269h implements sre0 {
    private static final YourLibraryDecorateRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PREDEFINED_PLAYLIST_CONFIGS_FIELD_NUMBER = 6;
    public static final int REQUESTED_URI_FIELD_NUMBER = 3;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 7;
    private int bitField0_;
    private YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs predefinedPlaylistConfigs_;
    private ae50 requestedUri_ = AbstractC0269h.emptyProtobufList();
    private int updateThrottling_;

    static {
        YourLibraryDecorateRequest yourLibraryDecorateRequest = new YourLibraryDecorateRequest();
        DEFAULT_INSTANCE = yourLibraryDecorateRequest;
        AbstractC0269h.registerDefaultInstance(YourLibraryDecorateRequest.class, yourLibraryDecorateRequest);
    }

    private YourLibraryDecorateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98158n(YourLibraryDecorateRequest yourLibraryDecorateRequest, Iterable iterable) {
        ae50 ae50Var = yourLibraryDecorateRequest.requestedUri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            yourLibraryDecorateRequest.requestedUri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, yourLibraryDecorateRequest.requestedUri_);
    }

    /* JADX INFO: renamed from: o */
    public static void m98159o(YourLibraryDecorateRequest yourLibraryDecorateRequest, String str) {
        yourLibraryDecorateRequest.getClass();
        str.getClass();
        ae50 ae50Var = yourLibraryDecorateRequest.requestedUri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            yourLibraryDecorateRequest.requestedUri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        yourLibraryDecorateRequest.requestedUri_.add(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m98160p(YourLibraryDecorateRequest yourLibraryDecorateRequest, YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs) {
        yourLibraryDecorateRequest.getClass();
        yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.getClass();
        yourLibraryDecorateRequest.predefinedPlaylistConfigs_ = yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;
        yourLibraryDecorateRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m98161q(YourLibraryDecorateRequest yourLibraryDecorateRequest) {
        yourLibraryDecorateRequest.updateThrottling_ = 100;
    }

    /* JADX INFO: renamed from: r */
    public static moe1 m98162r() {
        return (moe1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0003\u0007\u0003\u0000\u0001\u0000\u0003Ț\u0006ဉ\u0000\u0007\u0004", new Object[]{"bitField0_", "requestedUri_", "predefinedPlaylistConfigs_", "updateThrottling_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecorateRequest();
        }
        if (iOrdinal == 4) {
            return new moe1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryDecorateRequest.class) {
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
