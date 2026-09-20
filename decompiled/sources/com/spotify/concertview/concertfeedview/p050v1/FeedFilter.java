package com.spotify.concertview.concertfeedview.p050v1;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.oiy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class FeedFilter extends AbstractC0269h implements sre0 {
    public static final int BROWSE_LOCATION_FIELD_NUMBER = 1;
    public static final int BROWSE_RADIUS_IN_KM_FIELD_NUMBER = 2;
    public static final int CONCEPT_URIS_FIELD_NUMBER = 3;
    public static final int DATE_FILTER_FIELD_NUMBER = 4;
    private static final FeedFilter DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private int browseRadiusInKm_;
    private DateFilter dateFilter_;
    private String browseLocation_ = "";
    private ae50 conceptUris_ = AbstractC0269h.emptyProtobufList();

    static {
        FeedFilter feedFilter = new FeedFilter();
        DEFAULT_INSTANCE = feedFilter;
        AbstractC0269h.registerDefaultInstance(FeedFilter.class, feedFilter);
    }

    private FeedFilter() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7238n(FeedFilter feedFilter, ArrayList arrayList) {
        ae50 ae50Var = feedFilter.conceptUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            feedFilter.conceptUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, feedFilter.conceptUris_);
    }

    /* JADX INFO: renamed from: o */
    public static void m7239o(FeedFilter feedFilter, String str) {
        feedFilter.getClass();
        str.getClass();
        feedFilter.bitField0_ |= 1;
        feedFilter.browseLocation_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m7240p(FeedFilter feedFilter, DateFilter dateFilter) {
        feedFilter.getClass();
        dateFilter.getClass();
        feedFilter.dateFilter_ = dateFilter;
        feedFilter.bitField0_ |= 4;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static oiy m7241q() {
        return (oiy) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002င\u0001\u0003Ț\u0004ဉ\u0002", new Object[]{"bitField0_", "browseLocation_", "browseRadiusInKm_", "conceptUris_", "dateFilter_"});
        }
        if (iOrdinal == 3) {
            return new FeedFilter();
        }
        if (iOrdinal == 4) {
            return new oiy(DEFAULT_INSTANCE);
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
        synchronized (FeedFilter.class) {
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
