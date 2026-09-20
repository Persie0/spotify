package spotify.playlist.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bnp0;
import p204p.cnp0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaylistMultiGetSingleResponse extends AbstractC0269h implements cnp0 {
    private static final PlaylistMultiGetSingleResponse DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private PlaylistGetResponse response_;
    private String id_ = "";
    private String uri_ = "";

    static {
        PlaylistMultiGetSingleResponse playlistMultiGetSingleResponse = new PlaylistMultiGetSingleResponse();
        DEFAULT_INSTANCE = playlistMultiGetSingleResponse;
        AbstractC0269h.registerDefaultInstance(PlaylistMultiGetSingleResponse.class, playlistMultiGetSingleResponse);
    }

    private PlaylistMultiGetSingleResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "id_", "uri_", "response_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistMultiGetSingleResponse();
        }
        if (iOrdinal == 4) {
            return new bnp0();
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
        synchronized (PlaylistMultiGetSingleResponse.class) {
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

    @Override // p204p.cnp0
    public final String getId() {
        return this.id_;
    }

    @Override // p204p.cnp0
    public final String getUri() {
        return this.uri_;
    }

    @Override // p204p.cnp0
    /* JADX INFO: renamed from: j */
    public final PlaylistGetResponse mo30067j() {
        PlaylistGetResponse playlistGetResponse = this.response_;
        return playlistGetResponse == null ? PlaylistGetResponse.m97671p() : playlistGetResponse;
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
