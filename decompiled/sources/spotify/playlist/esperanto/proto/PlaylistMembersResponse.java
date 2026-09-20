package spotify.playlist.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bvo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PlaylistMembersResponse extends AbstractC0269h implements sre0 {
    private static final PlaylistMembersResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.spotify.playlist.proto.PlaylistMembersResponse response_;
    private ResponseStatus status_;

    static {
        PlaylistMembersResponse playlistMembersResponse = new PlaylistMembersResponse();
        DEFAULT_INSTANCE = playlistMembersResponse;
        AbstractC0269h.registerDefaultInstance(PlaylistMembersResponse.class, playlistMembersResponse);
    }

    private PlaylistMembersResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static PlaylistMembersResponse m97686p(byte[] bArr) {
        return (PlaylistMembersResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "status_", "response_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistMembersResponse();
        }
        if (iOrdinal == 4) {
            return new bvo0(DEFAULT_INSTANCE, 27);
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
        synchronized (PlaylistMembersResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final com.spotify.playlist.proto.PlaylistMembersResponse m97687n() {
        com.spotify.playlist.proto.PlaylistMembersResponse playlistMembersResponse = this.response_;
        return playlistMembersResponse == null ? com.spotify.playlist.proto.PlaylistMembersResponse.m18535o() : playlistMembersResponse;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ResponseStatus m97688o() {
        ResponseStatus responseStatus = this.status_;
        return responseStatus == null ? ResponseStatus.m97774o() : responseStatus;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
