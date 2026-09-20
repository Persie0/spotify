package com.spotify.show_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.jit0;
import p204p.kit0;
import p204p.lit0;
import p204p.mit0;
import p204p.nit0;
import p204p.oit0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class QueryFilter extends AbstractC0269h implements sre0 {
    public static final int AVAILABILITY_FIELD_NUMBER = 1;
    public static final int COLLECTION_STATUS_FIELD_NUMBER = 5;
    public static final int CONTAINS_TEXT_FIELD_NUMBER = 4;
    private static final QueryFilter DEFAULT_INSTANCE;
    public static final int OFFLINE_STATUS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYED_STATE_FIELD_NUMBER = 3;
    public static final int SUBSCRIPTION_STATUS_FIELD_NUMBER = 6;
    private int availability_;
    private int bitField0_;
    private int collectionStatus_;
    private String containsText_ = "";
    private int offlineStatus_;
    private int playedState_;
    private int subscriptionStatus_;

    static {
        QueryFilter queryFilter = new QueryFilter();
        DEFAULT_INSTANCE = queryFilter;
        AbstractC0269h.registerDefaultInstance(QueryFilter.class, queryFilter);
    }

    private QueryFilter() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21238n(QueryFilter queryFilter) {
        queryFilter.getClass();
        queryFilter.availability_ = jit0.AVAILABILITY_AVAILABLE.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m21239o(QueryFilter queryFilter) {
        queryFilter.getClass();
        queryFilter.collectionStatus_ = lit0.COLLECTION_STATUS_IN_YOUR_EPISODES.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m21240p(QueryFilter queryFilter, String str) {
        queryFilter.getClass();
        str.getClass();
        queryFilter.bitField0_ |= 1;
        queryFilter.containsText_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21241q(QueryFilter queryFilter) {
        queryFilter.getClass();
        queryFilter.offlineStatus_ = mit0.OFFLINE_STATUS_AVAILABLE_OFFLINE.getNumber();
    }

    /* JADX INFO: renamed from: r */
    public static void m21242r(QueryFilter queryFilter) {
        queryFilter.getClass();
        queryFilter.playedState_ = nit0.PLAYED_STATE_UNPLAYED.getNumber();
    }

    /* JADX INFO: renamed from: s */
    public static void m21243s(QueryFilter queryFilter, oit0 oit0Var) {
        queryFilter.getClass();
        queryFilter.subscriptionStatus_ = oit0Var.getNumber();
    }

    /* JADX INFO: renamed from: t */
    public static kit0 m21244t() {
        return (kit0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004ለ\u0000\u0005\f\u0006\f", new Object[]{"bitField0_", "availability_", "offlineStatus_", "playedState_", "containsText_", "collectionStatus_", "subscriptionStatus_"});
        }
        if (iOrdinal == 3) {
            return new QueryFilter();
        }
        if (iOrdinal == 4) {
            return new kit0(DEFAULT_INSTANCE);
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
        synchronized (QueryFilter.class) {
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
