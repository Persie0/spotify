package spotify.playlist.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.lnp0;
import p204p.mnp0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PlaylistOfflineRequest extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 3;
    private static final PlaylistOfflineRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int action_;
    private int bitField0_;
    private PlaylistQuery query_;
    private String uri_ = "";

    static {
        PlaylistOfflineRequest playlistOfflineRequest = new PlaylistOfflineRequest();
        DEFAULT_INSTANCE = playlistOfflineRequest;
        AbstractC0269h.registerDefaultInstance(PlaylistOfflineRequest.class, playlistOfflineRequest);
    }

    private PlaylistOfflineRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97713n(PlaylistOfflineRequest playlistOfflineRequest, lnp0 lnp0Var) {
        playlistOfflineRequest.getClass();
        playlistOfflineRequest.action_ = lnp0Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m97714o(PlaylistOfflineRequest playlistOfflineRequest, PlaylistQuery playlistQuery) {
        playlistOfflineRequest.getClass();
        playlistQuery.getClass();
        playlistOfflineRequest.query_ = playlistQuery;
        playlistOfflineRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m97715p(PlaylistOfflineRequest playlistOfflineRequest, String str) {
        playlistOfflineRequest.getClass();
        str.getClass();
        playlistOfflineRequest.uri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static mnp0 m97716q() {
        return (mnp0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\f", new Object[]{"bitField0_", "uri_", "query_", "action_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistOfflineRequest();
        }
        if (iOrdinal == 4) {
            return new mnp0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistOfflineRequest.class) {
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
