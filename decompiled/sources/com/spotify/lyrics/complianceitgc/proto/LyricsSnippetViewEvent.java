package com.spotify.lyrics.complianceitgc.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zmb0;

/* JADX INFO: loaded from: classes8.dex */
public final class LyricsSnippetViewEvent extends AbstractC0269h implements sre0 {
    private static final LyricsSnippetViewEvent DEFAULT_INSTANCE;
    public static final int LYRICS_FORMAT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int PROVIDER_FIELD_NUMBER = 4;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER = 5;
    public static final int SYNC_TYPE_FIELD_NUMBER = 6;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String trackUri_ = "";
    private String lyricsFormat_ = "";
    private String playbackId_ = "";
    private String provider_ = "";
    private String providerLyricsId_ = "";
    private String syncType_ = "";

    static {
        LyricsSnippetViewEvent lyricsSnippetViewEvent = new LyricsSnippetViewEvent();
        DEFAULT_INSTANCE = lyricsSnippetViewEvent;
        AbstractC0269h.registerDefaultInstance(LyricsSnippetViewEvent.class, lyricsSnippetViewEvent);
    }

    private LyricsSnippetViewEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13295n(LyricsSnippetViewEvent lyricsSnippetViewEvent, String str) {
        lyricsSnippetViewEvent.getClass();
        str.getClass();
        lyricsSnippetViewEvent.bitField0_ |= 2;
        lyricsSnippetViewEvent.lyricsFormat_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13296o(LyricsSnippetViewEvent lyricsSnippetViewEvent, String str) {
        lyricsSnippetViewEvent.getClass();
        str.getClass();
        lyricsSnippetViewEvent.bitField0_ |= 4;
        lyricsSnippetViewEvent.playbackId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13297p(LyricsSnippetViewEvent lyricsSnippetViewEvent, String str) {
        lyricsSnippetViewEvent.getClass();
        str.getClass();
        lyricsSnippetViewEvent.bitField0_ |= 8;
        lyricsSnippetViewEvent.provider_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13298q(LyricsSnippetViewEvent lyricsSnippetViewEvent, String str) {
        lyricsSnippetViewEvent.getClass();
        str.getClass();
        lyricsSnippetViewEvent.bitField0_ |= 16;
        lyricsSnippetViewEvent.providerLyricsId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13299r(LyricsSnippetViewEvent lyricsSnippetViewEvent, String str) {
        lyricsSnippetViewEvent.getClass();
        str.getClass();
        lyricsSnippetViewEvent.bitField0_ |= 32;
        lyricsSnippetViewEvent.syncType_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13300s(LyricsSnippetViewEvent lyricsSnippetViewEvent, String str) {
        lyricsSnippetViewEvent.getClass();
        str.getClass();
        lyricsSnippetViewEvent.bitField0_ |= 1;
        lyricsSnippetViewEvent.trackUri_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static zmb0 m13301t() {
        return (zmb0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "trackUri_", "lyricsFormat_", "playbackId_", "provider_", "providerLyricsId_", "syncType_"});
        }
        if (iOrdinal == 3) {
            return new LyricsSnippetViewEvent();
        }
        if (iOrdinal == 4) {
            return new zmb0(DEFAULT_INSTANCE);
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
        synchronized (LyricsSnippetViewEvent.class) {
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
