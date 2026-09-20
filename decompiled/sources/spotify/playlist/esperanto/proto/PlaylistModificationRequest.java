package spotify.playlist.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.playlist.proto.ModificationRequest;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xmp0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PlaylistModificationRequest extends AbstractC0269h implements sre0 {
    private static final PlaylistModificationRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private ModificationRequest request_;
    private String uri_ = "";

    static {
        PlaylistModificationRequest playlistModificationRequest = new PlaylistModificationRequest();
        DEFAULT_INSTANCE = playlistModificationRequest;
        AbstractC0269h.registerDefaultInstance(PlaylistModificationRequest.class, playlistModificationRequest);
    }

    private PlaylistModificationRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97689n(PlaylistModificationRequest playlistModificationRequest, ModificationRequest modificationRequest) {
        playlistModificationRequest.getClass();
        playlistModificationRequest.request_ = modificationRequest;
        playlistModificationRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m97690o(PlaylistModificationRequest playlistModificationRequest, String str) {
        playlistModificationRequest.getClass();
        str.getClass();
        playlistModificationRequest.uri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static xmp0 m97691p() {
        return (xmp0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "uri_", "request_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistModificationRequest();
        }
        if (iOrdinal == 4) {
            return new xmp0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistModificationRequest.class) {
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
