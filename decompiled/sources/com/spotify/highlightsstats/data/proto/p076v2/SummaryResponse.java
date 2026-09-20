package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.cm51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SummaryResponse extends AbstractC0269h implements sre0 {
    public static final int ANALYTICS_PARAMETERS_FIELD_NUMBER = 2;
    private static final SummaryResponse DEFAULT_INSTANCE;
    public static final int PAGE_TITLE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SECTIONS_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    private PageAnalyticsParameters analyticsParameters_;
    private int bitField0_;
    private Timestamp timestamp_;
    private ae50 sections_ = AbstractC0269h.emptyProtobufList();
    private String pageTitle_ = "";

    static {
        SummaryResponse summaryResponse = new SummaryResponse();
        DEFAULT_INSTANCE = summaryResponse;
        AbstractC0269h.registerDefaultInstance(SummaryResponse.class, summaryResponse);
    }

    private SummaryResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001", new Object[]{"bitField0_", "sections_", Section.class, "analyticsParameters_", "pageTitle_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new SummaryResponse();
        }
        if (iOrdinal == 4) {
            return new cm51(DEFAULT_INSTANCE, 18);
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
        synchronized (SummaryResponse.class) {
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
    public final PageAnalyticsParameters m11689n() {
        PageAnalyticsParameters pageAnalyticsParameters = this.analyticsParameters_;
        return pageAnalyticsParameters == null ? PageAnalyticsParameters.m11563n() : pageAnalyticsParameters;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m11690o() {
        return this.pageTitle_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m11691p() {
        return this.sections_;
    }

    /* JADX INFO: renamed from: q */
    public final Timestamp m11692q() {
        Timestamp timestamp = this.timestamp_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
