package com.spotify.deeplinkimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qzo0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PlaybackFromDeeplink extends AbstractC0269h implements sre0 {
    public static final int DEEPLINK_SESSION_ID_FIELD_NUMBER = 2;
    private static final PlaybackFromDeeplink DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 1;
    public static final int PLAYING_CONTEXT_URI_FIELD_NUMBER = 4;
    public static final int PLAYING_ENTITY_URI_FIELD_NUMBER = 3;
    private int bitField0_;
    private String playbackId_ = "";
    private String deeplinkSessionId_ = "";
    private String playingEntityUri_ = "";
    private String playingContextUri_ = "";

    static {
        PlaybackFromDeeplink playbackFromDeeplink = new PlaybackFromDeeplink();
        DEFAULT_INSTANCE = playbackFromDeeplink;
        AbstractC0269h.registerDefaultInstance(PlaybackFromDeeplink.class, playbackFromDeeplink);
    }

    private PlaybackFromDeeplink() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9189n(PlaybackFromDeeplink playbackFromDeeplink, String str) {
        playbackFromDeeplink.getClass();
        playbackFromDeeplink.bitField0_ |= 2;
        playbackFromDeeplink.deeplinkSessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m9190o(PlaybackFromDeeplink playbackFromDeeplink, String str) {
        playbackFromDeeplink.getClass();
        str.getClass();
        playbackFromDeeplink.bitField0_ |= 1;
        playbackFromDeeplink.playbackId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m9191p(PlaybackFromDeeplink playbackFromDeeplink, String str) {
        playbackFromDeeplink.getClass();
        playbackFromDeeplink.bitField0_ |= 8;
        playbackFromDeeplink.playingContextUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9192q(PlaybackFromDeeplink playbackFromDeeplink, String str) {
        playbackFromDeeplink.getClass();
        playbackFromDeeplink.bitField0_ |= 4;
        playbackFromDeeplink.playingEntityUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static qzo0 m9193r() {
        return (qzo0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "playbackId_", "deeplinkSessionId_", "playingEntityUri_", "playingContextUri_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackFromDeeplink();
        }
        if (iOrdinal == 4) {
            return new qzo0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackFromDeeplink.class) {
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
