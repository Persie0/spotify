package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.gsa0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class MainViewResponse extends AbstractC0269h implements sre0 {
    public static final int BANNER_CONTENT_FIELD_NUMBER = 5;
    private static final MainViewResponse DEFAULT_INSTANCE;
    public static final int FILTER_CATALOG_FIELD_NUMBER = 12;
    public static final int FLAT_FILTERS_FIELD_NUMBER = 10;
    public static final int HITS_FIELD_NUMBER = 1;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int RECOMMENDATIONS_FIELD_NUMBER = 2;
    private BannerContent bannerContent_;
    private int bitField0_;
    private FilterCatalog filterCatalog_;
    private Filters flatFilters_;
    private ae50 hits_ = AbstractC0269h.emptyProtobufList();
    private String nextPageToken_ = "";
    private Recommendations recommendations_;

    static {
        MainViewResponse mainViewResponse = new MainViewResponse();
        DEFAULT_INSTANCE = mainViewResponse;
        AbstractC0269h.registerDefaultInstance(MainViewResponse.class, mainViewResponse);
    }

    private MainViewResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\f\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0004Ȉ\u0005ဉ\u0001\nဉ\u0002\fဉ\u0003", new Object[]{"bitField0_", "hits_", Entity.class, "recommendations_", "nextPageToken_", "bannerContent_", "flatFilters_", "filterCatalog_"});
        }
        if (iOrdinal == 3) {
            return new MainViewResponse();
        }
        if (iOrdinal == 4) {
            return new gsa0(DEFAULT_INSTANCE, 13);
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
        synchronized (MainViewResponse.class) {
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

    public final String getNextPageToken() {
        return this.nextPageToken_;
    }

    /* JADX INFO: renamed from: n */
    public final BannerContent m20861n() {
        BannerContent bannerContent = this.bannerContent_;
        return bannerContent == null ? BannerContent.m20780o() : bannerContent;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final FilterCatalog m20862o() {
        FilterCatalog filterCatalog = this.filterCatalog_;
        return filterCatalog == null ? FilterCatalog.m20838n() : filterCatalog;
    }

    /* JADX INFO: renamed from: p */
    public final Filters m20863p() {
        Filters filters = this.flatFilters_;
        return filters == null ? Filters.m20842n() : filters;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m20864q() {
        return this.hits_;
    }

    /* JADX INFO: renamed from: r */
    public final Recommendations m20865r() {
        Recommendations recommendations = this.recommendations_;
        return recommendations == null ? Recommendations.m20895n() : recommendations;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m20866s() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m20867t() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m20868u() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m20869v() {
        return (this.bitField0_ & 1) != 0;
    }
}
