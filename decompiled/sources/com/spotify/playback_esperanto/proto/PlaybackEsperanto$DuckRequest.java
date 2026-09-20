package com.spotify.playback_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qyo0;
import p204p.r110;
import p204p.r2n0;
import p204p.ryo0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PlaybackEsperanto$DuckRequest extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final PlaybackEsperanto$DuckRequest DEFAULT_INSTANCE;
    public static final int FADE_DURATION_MS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int VOLUME_FIELD_NUMBER = 3;
    private int action_;
    private int fadeDurationMs_;
    private double volume_;

    static {
        PlaybackEsperanto$DuckRequest playbackEsperanto$DuckRequest = new PlaybackEsperanto$DuckRequest();
        DEFAULT_INSTANCE = playbackEsperanto$DuckRequest;
        AbstractC0269h.registerDefaultInstance(PlaybackEsperanto$DuckRequest.class, playbackEsperanto$DuckRequest);
    }

    private PlaybackEsperanto$DuckRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17553n(PlaybackEsperanto$DuckRequest playbackEsperanto$DuckRequest, qyo0 qyo0Var) {
        playbackEsperanto$DuckRequest.getClass();
        playbackEsperanto$DuckRequest.action_ = qyo0Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m17554o(PlaybackEsperanto$DuckRequest playbackEsperanto$DuckRequest, int i) {
        playbackEsperanto$DuckRequest.fadeDurationMs_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m17555p(PlaybackEsperanto$DuckRequest playbackEsperanto$DuckRequest, double d) {
        playbackEsperanto$DuckRequest.volume_ = d;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ryo0 m17556q() {
        return (ryo0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002\f\u0003\u0000\u0004\u000b", new Object[]{"action_", "volume_", "fadeDurationMs_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackEsperanto$DuckRequest();
        }
        if (iOrdinal == 4) {
            return new ryo0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackEsperanto$DuckRequest.class) {
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
