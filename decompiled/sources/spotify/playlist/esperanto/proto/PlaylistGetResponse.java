package spotify.playlist.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.playlist.proto.PlaylistRequest$Response;
import p204p.bvo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaylistGetResponse extends AbstractC0269h implements sre0 {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final PlaylistGetResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private PlaylistRequest$Response data_;
    private PlaylistQuery query_;
    private ResponseStatus status_;

    static {
        PlaylistGetResponse playlistGetResponse = new PlaylistGetResponse();
        DEFAULT_INSTANCE = playlistGetResponse;
        AbstractC0269h.registerDefaultInstance(PlaylistGetResponse.class, playlistGetResponse);
    }

    private PlaylistGetResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static PlaylistGetResponse m97671p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static PlaylistGetResponse m97672s(byte[] bArr) {
        return (PlaylistGetResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "status_", "data_", "query_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistGetResponse();
        }
        if (iOrdinal == 4) {
            return new bvo0(23);
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
        synchronized (PlaylistGetResponse.class) {
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

    /* JADX INFO: renamed from: o */
    public final PlaylistRequest$Response m97673o() {
        PlaylistRequest$Response playlistRequest$Response = this.data_;
        return playlistRequest$Response == null ? PlaylistRequest$Response.m18627s() : playlistRequest$Response;
    }

    /* JADX INFO: renamed from: q */
    public final PlaylistQuery m97674q() {
        PlaylistQuery playlistQuery = this.query_;
        return playlistQuery == null ? PlaylistQuery.m97732E() : playlistQuery;
    }

    /* JADX INFO: renamed from: r */
    public final ResponseStatus m97675r() {
        ResponseStatus responseStatus = this.status_;
        return responseStatus == null ? ResponseStatus.m97774o() : responseStatus;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
