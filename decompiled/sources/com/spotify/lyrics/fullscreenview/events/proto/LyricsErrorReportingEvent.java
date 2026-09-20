package com.spotify.lyrics.fullscreenview.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tdb0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class LyricsErrorReportingEvent extends AbstractC0269h implements sre0 {
    private static final LyricsErrorReportingEvent DEFAULT_INSTANCE;
    public static final int FLAG_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 2;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER = 3;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String trackUri_ = "";
    private String provider_ = "";
    private String providerLyricsId_ = "";
    private String flag_ = "";

    static {
        LyricsErrorReportingEvent lyricsErrorReportingEvent = new LyricsErrorReportingEvent();
        DEFAULT_INSTANCE = lyricsErrorReportingEvent;
        AbstractC0269h.registerDefaultInstance(LyricsErrorReportingEvent.class, lyricsErrorReportingEvent);
    }

    private LyricsErrorReportingEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13311n(LyricsErrorReportingEvent lyricsErrorReportingEvent, String str) {
        lyricsErrorReportingEvent.getClass();
        lyricsErrorReportingEvent.bitField0_ |= 8;
        lyricsErrorReportingEvent.flag_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13312o(LyricsErrorReportingEvent lyricsErrorReportingEvent, String str) {
        lyricsErrorReportingEvent.getClass();
        str.getClass();
        lyricsErrorReportingEvent.bitField0_ |= 2;
        lyricsErrorReportingEvent.provider_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13313p(LyricsErrorReportingEvent lyricsErrorReportingEvent, String str) {
        lyricsErrorReportingEvent.getClass();
        str.getClass();
        lyricsErrorReportingEvent.bitField0_ |= 4;
        lyricsErrorReportingEvent.providerLyricsId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13314q(LyricsErrorReportingEvent lyricsErrorReportingEvent, String str) {
        lyricsErrorReportingEvent.getClass();
        str.getClass();
        lyricsErrorReportingEvent.bitField0_ |= 1;
        lyricsErrorReportingEvent.trackUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static tdb0 m13315r() {
        return (tdb0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "trackUri_", "provider_", "providerLyricsId_", "flag_"});
        }
        if (iOrdinal == 3) {
            return new LyricsErrorReportingEvent();
        }
        if (iOrdinal == 4) {
            return new tdb0(DEFAULT_INSTANCE);
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
        synchronized (LyricsErrorReportingEvent.class) {
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
