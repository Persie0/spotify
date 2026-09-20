package com.spotify.referrals.service.p143v1;

import com.google.protobuf.AbstractC0269h;
import p204p.l851;
import p204p.omv0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y8v;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class StoreEngagementRequest extends AbstractC0269h implements sre0 {
    private static final StoreEngagementRequest DEFAULT_INSTANCE;
    public static final int ENGAGEMENT_TYPE_FIELD_NUMBER = 3;
    public static final int ENTITY_ID_FIELD_NUMBER = 4;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SURFACE_FIELD_NUMBER = 2;
    private int engagementType_;
    private int surface_;
    private String entityUri_ = "";
    private String entityId_ = "";

    static {
        StoreEngagementRequest storeEngagementRequest = new StoreEngagementRequest();
        DEFAULT_INSTANCE = storeEngagementRequest;
        AbstractC0269h.registerDefaultInstance(StoreEngagementRequest.class, storeEngagementRequest);
    }

    private StoreEngagementRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20365n(StoreEngagementRequest storeEngagementRequest, y8v y8vVar) {
        storeEngagementRequest.getClass();
        storeEngagementRequest.engagementType_ = y8vVar.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m20366o(StoreEngagementRequest storeEngagementRequest, String str) {
        storeEngagementRequest.getClass();
        str.getClass();
        storeEngagementRequest.entityId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m20367p(StoreEngagementRequest storeEngagementRequest, String str) {
        storeEngagementRequest.getClass();
        storeEngagementRequest.entityUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m20368q(StoreEngagementRequest storeEngagementRequest, omv0 omv0Var) {
        storeEngagementRequest.getClass();
        storeEngagementRequest.surface_ = omv0Var.getNumber();
    }

    /* JADX INFO: renamed from: r */
    public static l851 m20369r() {
        return (l851) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004Ȉ", new Object[]{"entityUri_", "surface_", "engagementType_", "entityId_"});
        }
        if (iOrdinal == 3) {
            return new StoreEngagementRequest();
        }
        if (iOrdinal == 4) {
            return new l851(DEFAULT_INSTANCE);
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
        synchronized (StoreEngagementRequest.class) {
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
