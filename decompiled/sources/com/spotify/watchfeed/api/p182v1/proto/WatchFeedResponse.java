package com.spotify.watchfeed.api.p182v1.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import java.util.List;
import p204p.ae50;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class WatchFeedResponse extends AbstractC0269h implements sre0 {
    public static final int DECISION_ID_FIELD_NUMBER = 4;
    private static final WatchFeedResponse DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int IS_FULLSCREEN_FIELD_NUMBER = 6;
    public static final int ITEMS_FIELD_NUMBER = 2;
    public static final int ONBOARDING_FIELD_NUMBER = 3;
    public static final int PAGINATION_FIELD_NUMBER = 100;
    public static final int PAGINATION_V1_FIELD_NUMBER = 98;
    private static volatile r2n0 PARSER = null;
    public static final int PIVOTING_FIELD_NUMBER = 99;
    public static final int REPORTING_CONTEXT_URI_FIELD_NUMBER = 8;
    public static final int SHOW_SCROLLBAR_FIELD_NUMBER = 7;
    public static final int SNACKBAR_MESSAGE_FIELD_NUMBER = 5;
    private int bitField0_;
    private Any header_;
    private boolean isFullscreen_;
    private Any onboarding_;
    private ResponsePagination paginationV1_;
    private Pagination pagination_;
    private ResponsePivoting pivoting_;
    private boolean showScrollbar_;
    private Any snackbarMessage_;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();
    private String decisionId_ = "";
    private String reportingContextUri_ = "";

    public static final class Pagination extends AbstractC0269h implements sre0 {
        private static final Pagination DEFAULT_INSTANCE;
        public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int PREVIOUS_PAGE_TOKEN_FIELD_NUMBER = 1;
        private int bitField0_;
        private gva nextPageToken_;
        private gva previousPageToken_;

        static {
            Pagination pagination = new Pagination();
            DEFAULT_INSTANCE = pagination;
            AbstractC0269h.registerDefaultInstance(Pagination.class, pagination);
        }

        private Pagination() {
            cva cvaVar = gva.f84678b;
            this.previousPageToken_ = cvaVar;
            this.nextPageToken_ = cvaVar;
        }

        /* JADX INFO: renamed from: n */
        public static Pagination m22501n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"bitField0_", "previousPageToken_", "nextPageToken_"});
            }
            if (iOrdinal == 3) {
                return new Pagination();
            }
            if (iOrdinal == 4) {
                return new C1339b(DEFAULT_INSTANCE);
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
            synchronized (Pagination.class) {
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

        /* JADX INFO: renamed from: o */
        public final gva m22502o() {
            return this.nextPageToken_;
        }

        /* JADX INFO: renamed from: p */
        public final gva m22503p() {
            return this.previousPageToken_;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m22504q() {
            return (this.bitField0_ & 2) != 0;
        }

        /* JADX INFO: renamed from: r */
        public final boolean m22505r() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        WatchFeedResponse watchFeedResponse = new WatchFeedResponse();
        DEFAULT_INSTANCE = watchFeedResponse;
        AbstractC0269h.registerDefaultInstance(WatchFeedResponse.class, watchFeedResponse);
    }

    private WatchFeedResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001d\u000b\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004Ȉ\u0005ဉ\u0002\u0006\u0007\u0007\u0007\bȈbဉ\u0003cဉ\u0004dဉ\u0005", new Object[]{"bitField0_", "header_", "items_", Any.class, "onboarding_", "decisionId_", "snackbarMessage_", "isFullscreen_", "showScrollbar_", "reportingContextUri_", "paginationV1_", "pivoting_", "pagination_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedResponse();
        }
        if (iOrdinal == 4) {
            return new C1338a(DEFAULT_INSTANCE);
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
        synchronized (WatchFeedResponse.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    /* JADX INFO: renamed from: n */
    public final String m22491n() {
        return this.decisionId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Any m22492o() {
        Any any = this.header_;
        return any == null ? Any.m1909p() : any;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22493p() {
        return this.isFullscreen_;
    }

    /* JADX INFO: renamed from: q */
    public final Any m22494q() {
        Any any = this.onboarding_;
        return any == null ? Any.m1909p() : any;
    }

    /* JADX INFO: renamed from: r */
    public final Pagination m22495r() {
        Pagination pagination = this.pagination_;
        return pagination == null ? Pagination.m22501n() : pagination;
    }

    /* JADX INFO: renamed from: s */
    public final ResponsePivoting m22496s() {
        ResponsePivoting responsePivoting = this.pivoting_;
        return responsePivoting == null ? ResponsePivoting.m22489o() : responsePivoting;
    }

    /* JADX INFO: renamed from: t */
    public final String m22497t() {
        return this.reportingContextUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m22498u() {
        return this.showScrollbar_;
    }

    /* JADX INFO: renamed from: v */
    public final Any m22499v() {
        Any any = this.snackbarMessage_;
        return any == null ? Any.m1909p() : any;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m22500w() {
        return (this.bitField0_ & 32) != 0;
    }
}
