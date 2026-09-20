package com.spotify.aiplaylistcoverart.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ys2;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest extends AbstractC0269h implements sre0 {
    public static final int CURRENT_PICTURE_ID_FIELD_NUMBER = 2;
    private static final AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String playlistUri_ = "";
    private gva currentPictureId_ = gva.f84678b;

    static {
        AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest aiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest = new AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest();
        DEFAULT_INSTANCE = aiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest;
        AbstractC0269h.registerDefaultInstance(AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest.class, aiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest);
    }

    private AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3088n(AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest aiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest, cva cvaVar) {
        aiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest.getClass();
        aiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest.bitField0_ |= 1;
        aiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest.currentPictureId_ = cvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m3089o(AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest aiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest, String str) {
        aiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest.getClass();
        aiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest.playlistUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static ys2 m3090p() {
        return (ys2) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ည\u0000", new Object[]{"bitField0_", "playlistUri_", "currentPictureId_"});
        }
        if (iOrdinal == 3) {
            return new AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest();
        }
        if (iOrdinal == 4) {
            return new ys2(DEFAULT_INSTANCE);
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
        synchronized (AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest.class) {
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
