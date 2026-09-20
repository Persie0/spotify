package com.spotify.watchfeed.api.p182v1;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.cva;
import p204p.gva;
import p204p.hed1;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class WatchFeedRequest extends AbstractC0269h implements sre0 {
    public static final int CONSUMED_GROUPS_FIELD_NUMBER = 100;
    private static final WatchFeedRequest DEFAULT_INSTANCE;
    public static final int ENTITY_ID_FIELD_NUMBER = 2;
    public static final int FEED_ID_FIELD_NUMBER = 1;
    public static final int PAGINATION_FIELD_NUMBER = 101;
    public static final int PAGINATION_V1_FIELD_NUMBER = 98;
    public static final int PARAMETERS_FIELD_NUMBER = 99;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private RequestPagination paginationV1_;
    private Pagination pagination_;
    private ihc0 parameters_ = ihc0.f102235b;
    private String feedId_ = "";
    private String entityId_ = "";
    private ae50 consumedGroups_ = AbstractC0269h.emptyProtobufList();

    public static final class Pagination extends AbstractC0269h implements sre0 {
        private static final Pagination DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int TOKEN_FIELD_NUMBER = 1;
        private gva token_ = gva.f84678b;

        static {
            Pagination pagination = new Pagination();
            DEFAULT_INSTANCE = pagination;
            AbstractC0269h.registerDefaultInstance(Pagination.class, pagination);
        }

        private Pagination() {
        }

        /* JADX INFO: renamed from: n */
        public static void m22477n(Pagination pagination, cva cvaVar) {
            pagination.getClass();
            pagination.token_ = cvaVar;
        }

        /* JADX INFO: renamed from: o */
        public static C1337e m22478o() {
            return (C1337e) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"token_"});
            }
            if (iOrdinal == 3) {
                return new Pagination();
            }
            if (iOrdinal == 4) {
                return new C1337e(DEFAULT_INSTANCE);
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

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        WatchFeedRequest watchFeedRequest = new WatchFeedRequest();
        DEFAULT_INSTANCE = watchFeedRequest;
        AbstractC0269h.registerDefaultInstance(WatchFeedRequest.class, watchFeedRequest);
    }

    private WatchFeedRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22471n(WatchFeedRequest watchFeedRequest, ArrayList arrayList) {
        ae50 ae50Var = watchFeedRequest.consumedGroups_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            watchFeedRequest.consumedGroups_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, watchFeedRequest.consumedGroups_);
    }

    /* JADX INFO: renamed from: o */
    public static ihc0 m22472o(WatchFeedRequest watchFeedRequest) {
        ihc0 ihc0Var = watchFeedRequest.parameters_;
        if (!ihc0Var.f102236a) {
            watchFeedRequest.parameters_ = ihc0Var.m50613h();
        }
        return watchFeedRequest.parameters_;
    }

    /* JADX INFO: renamed from: p */
    public static void m22473p(WatchFeedRequest watchFeedRequest, String str) {
        watchFeedRequest.getClass();
        str.getClass();
        watchFeedRequest.entityId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m22474q(WatchFeedRequest watchFeedRequest, String str) {
        watchFeedRequest.getClass();
        str.getClass();
        watchFeedRequest.feedId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m22475r(WatchFeedRequest watchFeedRequest, Pagination pagination) {
        watchFeedRequest.getClass();
        pagination.getClass();
        watchFeedRequest.pagination_ = pagination;
        watchFeedRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: s */
    public static C1336d m22476s() {
        return (C1336d) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001e\u0006\u0001\u0001\u0000\u0001Ȉ\u0002Ȉbဉ\u0000c2d\u001beဉ\u0001", new Object[]{"bitField0_", "feedId_", "entityId_", "paginationV1_", "parameters_", hed1.f90412a, "consumedGroups_", ConsumedGroup.class, "pagination_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedRequest();
        }
        if (iOrdinal == 4) {
            return new C1336d(DEFAULT_INSTANCE);
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
        synchronized (WatchFeedRequest.class) {
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
