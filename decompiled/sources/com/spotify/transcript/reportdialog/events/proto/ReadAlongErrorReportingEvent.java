package com.spotify.transcript.reportdialog.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.mnu0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ReadAlongErrorReportingEvent extends AbstractC0269h implements sre0 {
    private static final ReadAlongErrorReportingEvent DEFAULT_INSTANCE;
    public static final int FLAG_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSCRIPT_URI_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String uri_ = "";
    private String transcriptUri_ = "";
    private String flag_ = "";

    static {
        ReadAlongErrorReportingEvent readAlongErrorReportingEvent = new ReadAlongErrorReportingEvent();
        DEFAULT_INSTANCE = readAlongErrorReportingEvent;
        AbstractC0269h.registerDefaultInstance(ReadAlongErrorReportingEvent.class, readAlongErrorReportingEvent);
    }

    private ReadAlongErrorReportingEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21838n(ReadAlongErrorReportingEvent readAlongErrorReportingEvent, String str) {
        readAlongErrorReportingEvent.getClass();
        readAlongErrorReportingEvent.bitField0_ |= 4;
        readAlongErrorReportingEvent.flag_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21839o(ReadAlongErrorReportingEvent readAlongErrorReportingEvent, String str) {
        readAlongErrorReportingEvent.getClass();
        readAlongErrorReportingEvent.bitField0_ |= 2;
        readAlongErrorReportingEvent.transcriptUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21840p(ReadAlongErrorReportingEvent readAlongErrorReportingEvent, String str) {
        readAlongErrorReportingEvent.getClass();
        readAlongErrorReportingEvent.bitField0_ |= 1;
        readAlongErrorReportingEvent.uri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static mnu0 m21841q() {
        return (mnu0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "uri_", "transcriptUri_", "flag_"});
        }
        if (iOrdinal == 3) {
            return new ReadAlongErrorReportingEvent();
        }
        if (iOrdinal == 4) {
            return new mnu0(DEFAULT_INSTANCE);
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
        synchronized (ReadAlongErrorReportingEvent.class) {
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
