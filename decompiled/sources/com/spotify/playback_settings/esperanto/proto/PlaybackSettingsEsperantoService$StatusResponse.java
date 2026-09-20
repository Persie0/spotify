package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bvo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z2p0;

/* JADX INFO: loaded from: classes9.dex */
public final class PlaybackSettingsEsperantoService$StatusResponse extends AbstractC0269h implements sre0 {
    private static final PlaybackSettingsEsperantoService$StatusResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    static {
        PlaybackSettingsEsperantoService$StatusResponse playbackSettingsEsperantoService$StatusResponse = new PlaybackSettingsEsperantoService$StatusResponse();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$StatusResponse;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$StatusResponse.class, playbackSettingsEsperantoService$StatusResponse);
    }

    private PlaybackSettingsEsperantoService$StatusResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static PlaybackSettingsEsperantoService$StatusResponse m17610o(byte[] bArr) {
        return (PlaybackSettingsEsperantoService$StatusResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$StatusResponse();
        }
        if (iOrdinal == 4) {
            return new bvo0(DEFAULT_INSTANCE, 10);
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
        synchronized (PlaybackSettingsEsperantoService$StatusResponse.class) {
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
    public final z2p0 m17611n() {
        z2p0 z2p0VarM95229a = z2p0.m95229a(this.status_);
        return z2p0VarM95229a == null ? z2p0.UNRECOGNIZED : z2p0VarM95229a;
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
