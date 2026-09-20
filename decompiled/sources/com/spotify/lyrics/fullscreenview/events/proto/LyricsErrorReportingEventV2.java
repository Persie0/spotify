package com.spotify.lyrics.fullscreenview.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class LyricsErrorReportingEventV2 extends AbstractC0269h implements sre0 {
    private static final LyricsErrorReportingEventV2 DEFAULT_INSTANCE;
    public static final int FLAG_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 2;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER = 3;
    public static final int REPORTED_CORRECTIONS_FIELD_NUMBER = 7;
    public static final int REPORTED_FULL_LYRICS_TEXT_FIELD_NUMBER = 6;
    public static final int REPORTED_TEXTS_FIELD_NUMBER = 5;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String trackUri_ = "";
    private String provider_ = "";
    private String providerLyricsId_ = "";
    private String flag_ = "";
    private ae50 reportedTexts_ = AbstractC0269h.emptyProtobufList();
    private String reportedFullLyricsText_ = "";
    private ae50 reportedCorrections_ = AbstractC0269h.emptyProtobufList();

    public static final class ReportedCorrections extends AbstractC0269h implements sre0 {
        public static final int CORRECTED_TEXT_FIELD_NUMBER = 2;
        private static final ReportedCorrections DEFAULT_INSTANCE;
        public static final int ORIGINAL_TEXT_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private String originalText_ = "";
        private String correctedText_ = "";

        static {
            ReportedCorrections reportedCorrections = new ReportedCorrections();
            DEFAULT_INSTANCE = reportedCorrections;
            AbstractC0269h.registerDefaultInstance(ReportedCorrections.class, reportedCorrections);
        }

        private ReportedCorrections() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "originalText_", "correctedText_"});
            }
            if (iOrdinal == 3) {
                return new ReportedCorrections();
            }
            if (iOrdinal == 4) {
                return new C0864b(DEFAULT_INSTANCE);
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
            synchronized (ReportedCorrections.class) {
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

    static {
        LyricsErrorReportingEventV2 lyricsErrorReportingEventV2 = new LyricsErrorReportingEventV2();
        DEFAULT_INSTANCE = lyricsErrorReportingEventV2;
        AbstractC0269h.registerDefaultInstance(LyricsErrorReportingEventV2.class, lyricsErrorReportingEventV2);
    }

    private LyricsErrorReportingEventV2() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13316n(LyricsErrorReportingEventV2 lyricsErrorReportingEventV2, ArrayList arrayList) {
        ae50 ae50Var = lyricsErrorReportingEventV2.reportedTexts_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            lyricsErrorReportingEventV2.reportedTexts_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, lyricsErrorReportingEventV2.reportedTexts_);
    }

    /* JADX INFO: renamed from: o */
    public static void m13317o(LyricsErrorReportingEventV2 lyricsErrorReportingEventV2, String str) {
        lyricsErrorReportingEventV2.getClass();
        lyricsErrorReportingEventV2.bitField0_ |= 8;
        lyricsErrorReportingEventV2.flag_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13318p(LyricsErrorReportingEventV2 lyricsErrorReportingEventV2, String str) {
        lyricsErrorReportingEventV2.getClass();
        str.getClass();
        lyricsErrorReportingEventV2.bitField0_ |= 2;
        lyricsErrorReportingEventV2.provider_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13319q(LyricsErrorReportingEventV2 lyricsErrorReportingEventV2, String str) {
        lyricsErrorReportingEventV2.getClass();
        str.getClass();
        lyricsErrorReportingEventV2.bitField0_ |= 4;
        lyricsErrorReportingEventV2.providerLyricsId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13320r(LyricsErrorReportingEventV2 lyricsErrorReportingEventV2, String str) {
        lyricsErrorReportingEventV2.getClass();
        str.getClass();
        lyricsErrorReportingEventV2.bitField0_ |= 16;
        lyricsErrorReportingEventV2.reportedFullLyricsText_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13321s(LyricsErrorReportingEventV2 lyricsErrorReportingEventV2, String str) {
        lyricsErrorReportingEventV2.getClass();
        str.getClass();
        lyricsErrorReportingEventV2.bitField0_ |= 1;
        lyricsErrorReportingEventV2.trackUri_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static C0863a m13322t() {
        return (C0863a) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005\u001a\u0006ဈ\u0004\u0007\u001b", new Object[]{"bitField0_", "trackUri_", "provider_", "providerLyricsId_", "flag_", "reportedTexts_", "reportedFullLyricsText_", "reportedCorrections_", ReportedCorrections.class});
        }
        if (iOrdinal == 3) {
            return new LyricsErrorReportingEventV2();
        }
        if (iOrdinal == 4) {
            return new C0863a(DEFAULT_INSTANCE);
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
        synchronized (LyricsErrorReportingEventV2.class) {
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
