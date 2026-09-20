package com.spotify.p010ad.detection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xl0;
import p204p.z110;
import p204p.zl0;

/* JADX INFO: loaded from: classes4.dex */
public final class AdDetectionOuterClass$DetectResponse extends AbstractC0269h implements sre0 {
    public static final int AD_BREAKS_FIELD_NUMBER = 2;
    public static final int AUDIO_URI_FIELD_NUMBER = 10;
    private static final AdDetectionOuterClass$DetectResponse DEFAULT_INSTANCE;
    public static final int DEGRADED_RANGES_FIELD_NUMBER = 3;
    public static final int DETECTION_ALGORITHM_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int PRECISION_FIELD_NUMBER = 7;
    public static final int REMAINING_AD_DURATION_FIELD_NUMBER = 5;
    public static final int STATUS_FIELD_NUMBER = 8;
    public static final int TOTAL_AD_DURATION_FIELD_NUMBER = 4;
    public static final int TOTAL_BYTES_FIELD_NUMBER = 6;
    private int detectionAlgorithm_;
    private int precision_;
    private int remainingAdDuration_;
    private int status_;
    private int totalAdDuration_;
    private int totalBytes_;
    private ae50 adBreaks_ = AbstractC0269h.emptyProtobufList();
    private ae50 degradedRanges_ = AbstractC0269h.emptyProtobufList();
    private String audioUri_ = "";

    public static final class InternalTimelineResync extends AbstractC0269h implements sre0 {
        public static final int ADJUSTMENT_MS_FIELD_NUMBER = 1;
        private static final InternalTimelineResync DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private int adjustmentMs_;

        static {
            InternalTimelineResync internalTimelineResync = new InternalTimelineResync();
            DEFAULT_INSTANCE = internalTimelineResync;
            AbstractC0269h.registerDefaultInstance(InternalTimelineResync.class, internalTimelineResync);
        }

        private InternalTimelineResync() {
        }

        /* JADX INFO: renamed from: o */
        public static InternalTimelineResync m2275o() {
            return DEFAULT_INSTANCE;
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"adjustmentMs_"});
            }
            if (iOrdinal == 3) {
                return new InternalTimelineResync();
            }
            if (iOrdinal == 4) {
                return new C0278b(DEFAULT_INSTANCE);
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
            synchronized (InternalTimelineResync.class) {
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

        /* JADX INFO: renamed from: n */
        public final int m2276n() {
            return this.adjustmentMs_;
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

    public static final class Range extends AbstractC0269h implements sre0 {
        private static final Range DEFAULT_INSTANCE;
        public static final int DURATION_MS_FIELD_NUMBER = 3;
        public static final int END_BYTE_FIELD_NUMBER = 5;
        public static final int END_MS_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int PRECISION_FIELD_NUMBER = 6;
        public static final int RESYNC_FIELD_NUMBER = 7;
        public static final int START_BYTE_FIELD_NUMBER = 4;
        public static final int START_MS_FIELD_NUMBER = 1;
        private int bitField0_;
        private int durationMs_;
        private int endByte_;
        private int endMs_;
        private int precision_;
        private InternalTimelineResync resync_;
        private int startByte_;
        private int startMs_;

        static {
            Range range = new Range();
            DEFAULT_INSTANCE = range;
            AbstractC0269h.registerDefaultInstance(Range.class, range);
        }

        private Range() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\f\u0007ဉ\u0000", new Object[]{"bitField0_", "startMs_", "endMs_", "durationMs_", "startByte_", "endByte_", "precision_", "resync_"});
            }
            if (iOrdinal == 3) {
                return new Range();
            }
            if (iOrdinal == 4) {
                return new C0279c(DEFAULT_INSTANCE);
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
            synchronized (Range.class) {
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

        /* JADX INFO: renamed from: n */
        public final int m2277n() {
            return this.durationMs_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final int m2278o() {
            return this.endByte_;
        }

        /* JADX INFO: renamed from: p */
        public final int m2279p() {
            return this.endMs_;
        }

        /* JADX INFO: renamed from: q */
        public final zl0 m2280q() {
            zl0 zl0VarM96348a = zl0.m96348a(this.precision_);
            return zl0VarM96348a == null ? zl0.UNRECOGNIZED : zl0VarM96348a;
        }

        /* JADX INFO: renamed from: r */
        public final InternalTimelineResync m2281r() {
            InternalTimelineResync internalTimelineResync = this.resync_;
            return internalTimelineResync == null ? InternalTimelineResync.m2275o() : internalTimelineResync;
        }

        /* JADX INFO: renamed from: s */
        public final int m2282s() {
            return this.startByte_;
        }

        /* JADX INFO: renamed from: t */
        public final int m2283t() {
            return this.startMs_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        AdDetectionOuterClass$DetectResponse adDetectionOuterClass$DetectResponse = new AdDetectionOuterClass$DetectResponse();
        DEFAULT_INSTANCE = adDetectionOuterClass$DetectResponse;
        AbstractC0269h.registerDefaultInstance(AdDetectionOuterClass$DetectResponse.class, adDetectionOuterClass$DetectResponse);
    }

    private AdDetectionOuterClass$DetectResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: u */
    public static AdDetectionOuterClass$DetectResponse m2267u(byte[] bArr) {
        return (AdDetectionOuterClass$DetectResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0002\n\t\u0000\u0002\u0000\u0002\u001b\u0003\u001b\u0004\u0004\u0005\u0004\u0006\u0004\u0007\f\b\f\t\f\nȈ", new Object[]{"adBreaks_", Range.class, "degradedRanges_", Range.class, "totalAdDuration_", "remainingAdDuration_", "totalBytes_", "precision_", "status_", "detectionAlgorithm_", "audioUri_"});
        }
        if (iOrdinal == 3) {
            return new AdDetectionOuterClass$DetectResponse();
        }
        if (iOrdinal == 4) {
            return new C0277a(DEFAULT_INSTANCE);
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
        synchronized (AdDetectionOuterClass$DetectResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final ae50 m2268n() {
        return this.adBreaks_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m2269o() {
        return this.degradedRanges_;
    }

    /* JADX INFO: renamed from: p */
    public final zl0 m2270p() {
        zl0 zl0VarM96348a = zl0.m96348a(this.precision_);
        return zl0VarM96348a == null ? zl0.UNRECOGNIZED : zl0VarM96348a;
    }

    /* JADX INFO: renamed from: q */
    public final int m2271q() {
        return this.remainingAdDuration_;
    }

    /* JADX INFO: renamed from: r */
    public final xl0 m2272r() {
        xl0 xl0Var;
        int i = this.status_;
        if (i == 0) {
            xl0Var = xl0.DETECT_STATUS_UNKNOWN;
        } else if (i == 1) {
            xl0Var = xl0.DETECT_STATUS_ERROR;
        } else if (i == 2) {
            xl0Var = xl0.DETECT_STATUS_IN_PROGRESS;
        } else if (i == 3) {
            xl0Var = xl0.DETECT_STATUS_FINISHED;
        } else if (i != 4) {
            xl0Var = i != 5 ? null : xl0.DETECT_STATUS_FINISHED_BASED_ON_METADATA_ONLY;
        } else {
            xl0Var = xl0.DETECT_STATUS_AUDIO_UNAVAILABLE;
        }
        return xl0Var == null ? xl0.UNRECOGNIZED : xl0Var;
    }

    /* JADX INFO: renamed from: s */
    public final int m2273s() {
        return this.totalAdDuration_;
    }

    /* JADX INFO: renamed from: t */
    public final int m2274t() {
        return this.totalBytes_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
