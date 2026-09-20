package com.spotify.lyrics.complianceitgc.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bff0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MinimumLyricsCharactersSeen extends AbstractC0269h implements sre0 {
    private static final MinimumLyricsCharactersSeen DEFAULT_INSTANCE;
    public static final int IS_OFFLINE_FIELD_NUMBER = 8;
    public static final int IS_SNIPPET_FIELD_NUMBER = 7;
    public static final int IS_TRANSLATION_DISPLAYED_FIELD_NUMBER = 9;
    public static final int LYRICS_FORMAT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int PROVIDER_FIELD_NUMBER = 4;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER = 5;
    public static final int SYNC_TYPE_FIELD_NUMBER = 6;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isOffline_;
    private boolean isSnippet_;
    private boolean isTranslationDisplayed_;
    private String trackUri_ = "";
    private String lyricsFormat_ = "";
    private String playbackId_ = "";
    private String provider_ = "";
    private String providerLyricsId_ = "";
    private String syncType_ = "";

    static {
        MinimumLyricsCharactersSeen minimumLyricsCharactersSeen = new MinimumLyricsCharactersSeen();
        DEFAULT_INSTANCE = minimumLyricsCharactersSeen;
        AbstractC0269h.registerDefaultInstance(MinimumLyricsCharactersSeen.class, minimumLyricsCharactersSeen);
    }

    private MinimumLyricsCharactersSeen() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13302n(MinimumLyricsCharactersSeen minimumLyricsCharactersSeen, boolean z) {
        minimumLyricsCharactersSeen.bitField0_ |= 128;
        minimumLyricsCharactersSeen.isOffline_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m13303o(MinimumLyricsCharactersSeen minimumLyricsCharactersSeen, boolean z) {
        minimumLyricsCharactersSeen.bitField0_ |= 256;
        minimumLyricsCharactersSeen.isTranslationDisplayed_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m13304p(MinimumLyricsCharactersSeen minimumLyricsCharactersSeen, String str) {
        minimumLyricsCharactersSeen.getClass();
        str.getClass();
        minimumLyricsCharactersSeen.bitField0_ |= 2;
        minimumLyricsCharactersSeen.lyricsFormat_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13305q(MinimumLyricsCharactersSeen minimumLyricsCharactersSeen, String str) {
        minimumLyricsCharactersSeen.getClass();
        str.getClass();
        minimumLyricsCharactersSeen.bitField0_ |= 4;
        minimumLyricsCharactersSeen.playbackId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13306r(MinimumLyricsCharactersSeen minimumLyricsCharactersSeen, String str) {
        minimumLyricsCharactersSeen.getClass();
        str.getClass();
        minimumLyricsCharactersSeen.bitField0_ |= 8;
        minimumLyricsCharactersSeen.provider_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13307s(MinimumLyricsCharactersSeen minimumLyricsCharactersSeen, String str) {
        minimumLyricsCharactersSeen.getClass();
        str.getClass();
        minimumLyricsCharactersSeen.bitField0_ |= 16;
        minimumLyricsCharactersSeen.providerLyricsId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m13308t(MinimumLyricsCharactersSeen minimumLyricsCharactersSeen, String str) {
        minimumLyricsCharactersSeen.getClass();
        str.getClass();
        minimumLyricsCharactersSeen.bitField0_ |= 32;
        minimumLyricsCharactersSeen.syncType_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m13309u(MinimumLyricsCharactersSeen minimumLyricsCharactersSeen, String str) {
        minimumLyricsCharactersSeen.getClass();
        str.getClass();
        minimumLyricsCharactersSeen.bitField0_ |= 1;
        minimumLyricsCharactersSeen.trackUri_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static bff0 m13310v() {
        return (bff0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b", new Object[]{"bitField0_", "trackUri_", "lyricsFormat_", "playbackId_", "provider_", "providerLyricsId_", "syncType_", "isSnippet_", "isOffline_", "isTranslationDisplayed_"});
        }
        if (iOrdinal == 3) {
            return new MinimumLyricsCharactersSeen();
        }
        if (iOrdinal == 4) {
            return new bff0(DEFAULT_INSTANCE);
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
        synchronized (MinimumLyricsCharactersSeen.class) {
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
