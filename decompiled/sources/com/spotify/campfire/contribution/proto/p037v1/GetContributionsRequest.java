package com.spotify.campfire.contribution.proto.p037v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s710;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class GetContributionsRequest extends AbstractC0269h implements sre0 {
    private static final GetContributionsRequest DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 2;
    public static final int PAGINATION_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 1;
    private int bitField0_;
    private ContributionFilters filters_;
    private ContributionPagination pagination_;
    private ContributionTarget target_;

    static {
        GetContributionsRequest getContributionsRequest = new GetContributionsRequest();
        DEFAULT_INSTANCE = getContributionsRequest;
        AbstractC0269h.registerDefaultInstance(GetContributionsRequest.class, getContributionsRequest);
    }

    private GetContributionsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m4329n(GetContributionsRequest getContributionsRequest, ContributionFilters contributionFilters) {
        getContributionsRequest.getClass();
        getContributionsRequest.filters_ = contributionFilters;
        getContributionsRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m4330o(GetContributionsRequest getContributionsRequest, ContributionPagination contributionPagination) {
        getContributionsRequest.getClass();
        contributionPagination.getClass();
        getContributionsRequest.pagination_ = contributionPagination;
        getContributionsRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: p */
    public static void m4331p(GetContributionsRequest getContributionsRequest, ContributionTarget contributionTarget) {
        getContributionsRequest.getClass();
        getContributionsRequest.target_ = contributionTarget;
        getContributionsRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static s710 m4332q() {
        return (s710) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "target_", "filters_", "pagination_"});
        }
        if (iOrdinal == 3) {
            return new GetContributionsRequest();
        }
        if (iOrdinal == 4) {
            return new s710(DEFAULT_INSTANCE);
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
        synchronized (GetContributionsRequest.class) {
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
