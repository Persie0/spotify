package com.spotify.lyrics.sharecard.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xmb0;
import p204p.ymb0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class LyricsSharingV3 extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_FIELD_NUMBER = 3;
    public static final int CARD_BACKGROUND_VISIBLE_FIELD_NUMBER = 4;
    private static final LyricsSharingV3 DEFAULT_INSTANCE;
    public static final int DESTINATION_NETWORK_FIELD_NUMBER = 7;
    public static final int LYRICS_LINES_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 5;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER = 6;
    public static final int SHARE_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean cardBackgroundVisible_;
    private ihc0 lyricsLines_ = ihc0.f102235b;
    private String shareId_ = "";
    private String background_ = "";
    private String provider_ = "";
    private String providerLyricsId_ = "";
    private String destinationNetwork_ = "";

    static {
        LyricsSharingV3 lyricsSharingV3 = new LyricsSharingV3();
        DEFAULT_INSTANCE = lyricsSharingV3;
        AbstractC0269h.registerDefaultInstance(LyricsSharingV3.class, lyricsSharingV3);
    }

    private LyricsSharingV3() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m13376n(LyricsSharingV3 lyricsSharingV3) {
        ihc0 ihc0Var = lyricsSharingV3.lyricsLines_;
        if (!ihc0Var.f102236a) {
            lyricsSharingV3.lyricsLines_ = ihc0Var.m50613h();
        }
        return lyricsSharingV3.lyricsLines_;
    }

    /* JADX INFO: renamed from: o */
    public static void m13377o(LyricsSharingV3 lyricsSharingV3, String str) {
        lyricsSharingV3.getClass();
        lyricsSharingV3.bitField0_ |= 2;
        lyricsSharingV3.background_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13378p(LyricsSharingV3 lyricsSharingV3) {
        lyricsSharingV3.bitField0_ |= 4;
        lyricsSharingV3.cardBackgroundVisible_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13379q(LyricsSharingV3 lyricsSharingV3, String str) {
        lyricsSharingV3.getClass();
        lyricsSharingV3.bitField0_ |= 32;
        lyricsSharingV3.destinationNetwork_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13380r(LyricsSharingV3 lyricsSharingV3, String str) {
        lyricsSharingV3.getClass();
        str.getClass();
        lyricsSharingV3.bitField0_ |= 8;
        lyricsSharingV3.provider_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13381s(LyricsSharingV3 lyricsSharingV3, String str) {
        lyricsSharingV3.getClass();
        str.getClass();
        lyricsSharingV3.bitField0_ |= 16;
        lyricsSharingV3.providerLyricsId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m13382t(LyricsSharingV3 lyricsSharingV3, String str) {
        lyricsSharingV3.getClass();
        str.getClass();
        lyricsSharingV3.bitField0_ |= 1;
        lyricsSharingV3.shareId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static xmb0 m13383u() {
        return (xmb0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001ဈ\u0000\u00022\u0003ဈ\u0001\u0004ဇ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"bitField0_", "shareId_", "lyricsLines_", ymb0.f274214a, "background_", "cardBackgroundVisible_", "provider_", "providerLyricsId_", "destinationNetwork_"});
        }
        if (iOrdinal == 3) {
            return new LyricsSharingV3();
        }
        if (iOrdinal == 4) {
            return new xmb0(DEFAULT_INSTANCE);
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
        synchronized (LyricsSharingV3.class) {
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
