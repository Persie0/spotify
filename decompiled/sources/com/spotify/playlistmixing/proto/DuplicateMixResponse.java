package com.spotify.playlistmixing.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.omr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class DuplicateMixResponse extends AbstractC0269h implements sre0 {
    private static final DuplicateMixResponse DEFAULT_INSTANCE;
    public static final int ORIGINAL_PLAYLIST_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    private String playlistUri_ = "";
    private String originalPlaylistUri_ = "";

    static {
        DuplicateMixResponse duplicateMixResponse = new DuplicateMixResponse();
        DEFAULT_INSTANCE = duplicateMixResponse;
        AbstractC0269h.registerDefaultInstance(DuplicateMixResponse.class, duplicateMixResponse);
    }

    private DuplicateMixResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"playlistUri_", "originalPlaylistUri_"});
        }
        if (iOrdinal == 3) {
            return new DuplicateMixResponse();
        }
        if (iOrdinal == 4) {
            return new omr(DEFAULT_INSTANCE, 14);
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
        synchronized (DuplicateMixResponse.class) {
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

    public final String getPlaylistUri() {
        return this.playlistUri_;
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
