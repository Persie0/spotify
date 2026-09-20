package com.spotify.widgets.widgetattributionimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rzo0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PlaybackFromIntent extends AbstractC0269h implements sre0 {
    private static final PlaybackFromIntent DEFAULT_INSTANCE;
    public static final int INTERACTION_ID_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int PLAYING_CONTEXT_URI_FIELD_NUMBER = 2;
    public static final int PLAYING_ENTITY_URI_FIELD_NUMBER = 1;
    public static final int SELECTED_CONTEXT_URI_FIELD_NUMBER = 6;
    public static final int SELECTED_ENTITY_URI_FIELD_NUMBER = 5;
    public static final int WIDGET_TYPE_FIELD_NUMBER = 7;
    private int bitField0_;
    private String playingEntityUri_ = "";
    private String playingContextUri_ = "";
    private String playbackId_ = "";
    private String interactionId_ = "";
    private String selectedEntityUri_ = "";
    private String selectedContextUri_ = "";
    private String widgetType_ = "";

    static {
        PlaybackFromIntent playbackFromIntent = new PlaybackFromIntent();
        DEFAULT_INSTANCE = playbackFromIntent;
        AbstractC0269h.registerDefaultInstance(PlaybackFromIntent.class, playbackFromIntent);
    }

    private PlaybackFromIntent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m23129n(PlaybackFromIntent playbackFromIntent, String str) {
        playbackFromIntent.getClass();
        str.getClass();
        playbackFromIntent.bitField0_ |= 8;
        playbackFromIntent.interactionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m23130o(PlaybackFromIntent playbackFromIntent, String str) {
        playbackFromIntent.getClass();
        str.getClass();
        playbackFromIntent.bitField0_ |= 4;
        playbackFromIntent.playbackId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m23131p(PlaybackFromIntent playbackFromIntent, String str) {
        playbackFromIntent.getClass();
        str.getClass();
        playbackFromIntent.bitField0_ |= 2;
        playbackFromIntent.playingContextUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m23132q(PlaybackFromIntent playbackFromIntent, String str) {
        playbackFromIntent.getClass();
        playbackFromIntent.bitField0_ |= 1;
        playbackFromIntent.playingEntityUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m23133r(PlaybackFromIntent playbackFromIntent, String str) {
        playbackFromIntent.getClass();
        str.getClass();
        playbackFromIntent.bitField0_ |= 32;
        playbackFromIntent.selectedContextUri_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m23134s(PlaybackFromIntent playbackFromIntent, String str) {
        playbackFromIntent.getClass();
        str.getClass();
        playbackFromIntent.bitField0_ |= 64;
        playbackFromIntent.widgetType_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static rzo0 m23135t() {
        return (rzo0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "playingEntityUri_", "playingContextUri_", "playbackId_", "interactionId_", "selectedEntityUri_", "selectedContextUri_", "widgetType_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackFromIntent();
        }
        if (iOrdinal == 4) {
            return new rzo0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackFromIntent.class) {
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
