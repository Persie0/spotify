package com.spotify.show_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.concertcampaignview.p047v1.CtaType;
import p204p.fc10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GetUnfinishedEpisodesRequest extends AbstractC0269h implements sre0 {
    public static final int ABS_TIME_LEFT_TOLERANCE_FIELD_NUMBER = 6;
    private static final GetUnfinishedEpisodesRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int POLICY_FIELD_NUMBER = 9;
    public static final int PREFER_CACHED_FIELD_NUMBER = 8;
    public static final int RANGE_LENGTH_FIELD_NUMBER = 2;
    public static final int RANGE_START_FIELD_NUMBER = 1;
    public static final int REL_TIME_LEFT_TOLERANCE_FIELD_NUMBER = 7;
    public static final int SORT_FIELD_NUMBER = 3;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 5;
    private int absTimeLeftTolerance_;
    private int bitField0_;
    private ListPolicy policy_;
    private boolean preferCached_;
    private int rangeLength_;
    private int rangeStart_;
    private double relTimeLeftTolerance_;
    private int updateThrottling_;
    private String sort_ = "";
    private String filter_ = "";

    static {
        GetUnfinishedEpisodesRequest getUnfinishedEpisodesRequest = new GetUnfinishedEpisodesRequest();
        DEFAULT_INSTANCE = getUnfinishedEpisodesRequest;
        AbstractC0269h.registerDefaultInstance(GetUnfinishedEpisodesRequest.class, getUnfinishedEpisodesRequest);
    }

    private GetUnfinishedEpisodesRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21209n(GetUnfinishedEpisodesRequest getUnfinishedEpisodesRequest, int i) {
        getUnfinishedEpisodesRequest.absTimeLeftTolerance_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m21210o(GetUnfinishedEpisodesRequest getUnfinishedEpisodesRequest, String str) {
        getUnfinishedEpisodesRequest.getClass();
        str.getClass();
        getUnfinishedEpisodesRequest.filter_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21211p(GetUnfinishedEpisodesRequest getUnfinishedEpisodesRequest, ListPolicy listPolicy) {
        getUnfinishedEpisodesRequest.getClass();
        listPolicy.getClass();
        getUnfinishedEpisodesRequest.policy_ = listPolicy;
        getUnfinishedEpisodesRequest.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21212q(GetUnfinishedEpisodesRequest getUnfinishedEpisodesRequest, int i) {
        getUnfinishedEpisodesRequest.bitField0_ |= 1;
        getUnfinishedEpisodesRequest.rangeLength_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static void m21213r(GetUnfinishedEpisodesRequest getUnfinishedEpisodesRequest, int i) {
        getUnfinishedEpisodesRequest.rangeStart_ = i;
    }

    /* JADX INFO: renamed from: s */
    public static void m21214s(GetUnfinishedEpisodesRequest getUnfinishedEpisodesRequest, double d) {
        getUnfinishedEpisodesRequest.relTimeLeftTolerance_ = d;
    }

    /* JADX INFO: renamed from: t */
    public static void m21215t(GetUnfinishedEpisodesRequest getUnfinishedEpisodesRequest, String str) {
        getUnfinishedEpisodesRequest.getClass();
        str.getClass();
        getUnfinishedEpisodesRequest.sort_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m21216u(GetUnfinishedEpisodesRequest getUnfinishedEpisodesRequest) {
        getUnfinishedEpisodesRequest.updateThrottling_ = CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER;
    }

    /* JADX INFO: renamed from: v */
    public static fc10 m21217v() {
        return (fc10) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002င\u0000\u0003Ȉ\u0004Ȉ\u0005\u000b\u0006\u000b\u0007\u0000\b\u0007\tဉ\u0001", new Object[]{"bitField0_", "rangeStart_", "rangeLength_", "sort_", "filter_", "updateThrottling_", "absTimeLeftTolerance_", "relTimeLeftTolerance_", "preferCached_", "policy_"});
        }
        if (iOrdinal == 3) {
            return new GetUnfinishedEpisodesRequest();
        }
        if (iOrdinal == 4) {
            return new fc10(DEFAULT_INSTANCE);
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
        synchronized (GetUnfinishedEpisodesRequest.class) {
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
