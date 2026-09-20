package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.p2p0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y2p0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PlaybackSettingsEsperantoService$SetShuffleStateRequest extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_ENHANCEMENT_FIELD_NUMBER = 3;
    private static final PlaybackSettingsEsperantoService$SetShuffleStateRequest DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SHUFFLE_ON_FIELD_NUMBER = 2;
    private int contextEnhancement_;
    private String id_ = "";
    private boolean shuffleOn_;

    static {
        PlaybackSettingsEsperantoService$SetShuffleStateRequest playbackSettingsEsperantoService$SetShuffleStateRequest = new PlaybackSettingsEsperantoService$SetShuffleStateRequest();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$SetShuffleStateRequest;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$SetShuffleStateRequest.class, playbackSettingsEsperantoService$SetShuffleStateRequest);
    }

    private PlaybackSettingsEsperantoService$SetShuffleStateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17601n(PlaybackSettingsEsperantoService$SetShuffleStateRequest playbackSettingsEsperantoService$SetShuffleStateRequest, p2p0 p2p0Var) {
        playbackSettingsEsperantoService$SetShuffleStateRequest.getClass();
        playbackSettingsEsperantoService$SetShuffleStateRequest.contextEnhancement_ = p2p0Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m17602o(PlaybackSettingsEsperantoService$SetShuffleStateRequest playbackSettingsEsperantoService$SetShuffleStateRequest, String str) {
        playbackSettingsEsperantoService$SetShuffleStateRequest.getClass();
        playbackSettingsEsperantoService$SetShuffleStateRequest.id_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m17603p(PlaybackSettingsEsperantoService$SetShuffleStateRequest playbackSettingsEsperantoService$SetShuffleStateRequest, boolean z) {
        playbackSettingsEsperantoService$SetShuffleStateRequest.shuffleOn_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static y2p0 m17604q() {
        return (y2p0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\f", new Object[]{"id_", "shuffleOn_", "contextEnhancement_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$SetShuffleStateRequest();
        }
        if (iOrdinal == 4) {
            return new y2p0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$SetShuffleStateRequest.class) {
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
