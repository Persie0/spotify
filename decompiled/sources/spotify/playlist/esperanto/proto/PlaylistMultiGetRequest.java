package spotify.playlist.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ymp0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaylistMultiGetRequest extends AbstractC0269h implements sre0 {
    private static final PlaylistMultiGetRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REQUESTS_FIELD_NUMBER = 1;
    public static final int TIMEOUT_FIELD_NUMBER = 2;
    private int bitField0_;
    private ae50 requests_ = AbstractC0269h.emptyProtobufList();
    private Duration timeout_;

    static {
        PlaylistMultiGetRequest playlistMultiGetRequest = new PlaylistMultiGetRequest();
        DEFAULT_INSTANCE = playlistMultiGetRequest;
        AbstractC0269h.registerDefaultInstance(PlaylistMultiGetRequest.class, playlistMultiGetRequest);
    }

    private PlaylistMultiGetRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97695n(PlaylistMultiGetRequest playlistMultiGetRequest, List list) {
        ae50 ae50Var = playlistMultiGetRequest.requests_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            playlistMultiGetRequest.requests_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, playlistMultiGetRequest.requests_);
    }

    /* JADX INFO: renamed from: o */
    public static void m97696o(PlaylistMultiGetRequest playlistMultiGetRequest, Duration duration) {
        playlistMultiGetRequest.getClass();
        duration.getClass();
        playlistMultiGetRequest.timeout_ = duration;
        playlistMultiGetRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static ymp0 m97697p() {
        return (ymp0) DEFAULT_INSTANCE.createBuilder();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "requests_", PlaylistMultiGetSingleRequest.class, "timeout_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistMultiGetRequest();
        }
        if (iOrdinal == 4) {
            return new ymp0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistMultiGetRequest.class) {
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
