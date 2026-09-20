package spotify.playlist.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import p204p.ore0;
import p204p.pkp0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaylistGetRequest extends AbstractC0269h implements sre0 {
    private static final PlaylistGetRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int POLICY_FIELD_NUMBER = 3;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private PlaylistRequestDecorationPolicy policy_;
    private PlaylistQuery query_;
    private String uri_ = "";

    static {
        PlaylistGetRequest playlistGetRequest = new PlaylistGetRequest();
        DEFAULT_INSTANCE = playlistGetRequest;
        AbstractC0269h.registerDefaultInstance(PlaylistGetRequest.class, playlistGetRequest);
    }

    private PlaylistGetRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97666n(PlaylistGetRequest playlistGetRequest, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy) {
        playlistGetRequest.getClass();
        playlistRequestDecorationPolicy.getClass();
        playlistGetRequest.policy_ = playlistRequestDecorationPolicy;
        playlistGetRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m97667o(PlaylistGetRequest playlistGetRequest, PlaylistQuery playlistQuery) {
        playlistGetRequest.getClass();
        playlistQuery.getClass();
        playlistGetRequest.query_ = playlistQuery;
        playlistGetRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m97668p(PlaylistGetRequest playlistGetRequest, String str) {
        playlistGetRequest.getClass();
        str.getClass();
        playlistGetRequest.uri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static pkp0 m97669q() {
        return (pkp0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "uri_", "query_", "policy_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistGetRequest();
        }
        if (iOrdinal == 4) {
            return new pkp0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistGetRequest.class) {
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
