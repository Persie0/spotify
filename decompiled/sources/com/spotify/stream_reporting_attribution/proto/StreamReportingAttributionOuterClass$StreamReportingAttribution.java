package com.spotify.stream_reporting_attribution.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pi51;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class StreamReportingAttributionOuterClass$StreamReportingAttribution extends AbstractC0269h implements sre0 {
    private static final StreamReportingAttributionOuterClass$StreamReportingAttribution DEFAULT_INSTANCE;
    public static final int LEAF_SPECIFICATION_ID_FIELD_NUMBER = 4;
    public static final int PAGE_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROVENANCE_FIELD_NUMBER = 1;
    public static final int ROOT_SPECIFICATION_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private String provenance_ = "";
    private String pageId_ = "";
    private String rootSpecificationId_ = "";
    private String leafSpecificationId_ = "";

    static {
        StreamReportingAttributionOuterClass$StreamReportingAttribution streamReportingAttributionOuterClass$StreamReportingAttribution = new StreamReportingAttributionOuterClass$StreamReportingAttribution();
        DEFAULT_INSTANCE = streamReportingAttributionOuterClass$StreamReportingAttribution;
        AbstractC0269h.registerDefaultInstance(StreamReportingAttributionOuterClass$StreamReportingAttribution.class, streamReportingAttributionOuterClass$StreamReportingAttribution);
    }

    private StreamReportingAttributionOuterClass$StreamReportingAttribution() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21613n(StreamReportingAttributionOuterClass$StreamReportingAttribution streamReportingAttributionOuterClass$StreamReportingAttribution, String str) {
        streamReportingAttributionOuterClass$StreamReportingAttribution.getClass();
        streamReportingAttributionOuterClass$StreamReportingAttribution.bitField0_ |= 8;
        streamReportingAttributionOuterClass$StreamReportingAttribution.leafSpecificationId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21614o(StreamReportingAttributionOuterClass$StreamReportingAttribution streamReportingAttributionOuterClass$StreamReportingAttribution, String str) {
        streamReportingAttributionOuterClass$StreamReportingAttribution.getClass();
        streamReportingAttributionOuterClass$StreamReportingAttribution.bitField0_ |= 2;
        streamReportingAttributionOuterClass$StreamReportingAttribution.pageId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21615p(StreamReportingAttributionOuterClass$StreamReportingAttribution streamReportingAttributionOuterClass$StreamReportingAttribution, String str) {
        streamReportingAttributionOuterClass$StreamReportingAttribution.getClass();
        streamReportingAttributionOuterClass$StreamReportingAttribution.bitField0_ |= 1;
        streamReportingAttributionOuterClass$StreamReportingAttribution.provenance_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21616q(StreamReportingAttributionOuterClass$StreamReportingAttribution streamReportingAttributionOuterClass$StreamReportingAttribution, String str) {
        streamReportingAttributionOuterClass$StreamReportingAttribution.getClass();
        streamReportingAttributionOuterClass$StreamReportingAttribution.bitField0_ |= 4;
        streamReportingAttributionOuterClass$StreamReportingAttribution.rootSpecificationId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static pi51 m21617r() {
        return (pi51) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "provenance_", "pageId_", "rootSpecificationId_", "leafSpecificationId_"});
        }
        if (iOrdinal == 3) {
            return new StreamReportingAttributionOuterClass$StreamReportingAttribution();
        }
        if (iOrdinal == 4) {
            return new pi51(DEFAULT_INSTANCE);
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
        synchronized (StreamReportingAttributionOuterClass$StreamReportingAttribution.class) {
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
