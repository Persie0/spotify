package com.spotify.libraryimportservice.tmm;

import com.google.protobuf.AbstractC0269h;
import p204p.e951;
import p204p.mw8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z8v;

/* JADX INFO: loaded from: classes7.dex */
public final class StoreTransferResultsEngagementRequest extends AbstractC0269h implements sre0 {
    public static final int BANNER_TYPE_FIELD_NUMBER = 2;
    private static final StoreTransferResultsEngagementRequest DEFAULT_INSTANCE;
    public static final int ENGAGEMENT_TYPE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSFER_ID_FIELD_NUMBER = 1;
    private int bannerType_;
    private int engagementType_;
    private String transferId_ = "";

    static {
        StoreTransferResultsEngagementRequest storeTransferResultsEngagementRequest = new StoreTransferResultsEngagementRequest();
        DEFAULT_INSTANCE = storeTransferResultsEngagementRequest;
        AbstractC0269h.registerDefaultInstance(StoreTransferResultsEngagementRequest.class, storeTransferResultsEngagementRequest);
    }

    private StoreTransferResultsEngagementRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12607n(StoreTransferResultsEngagementRequest storeTransferResultsEngagementRequest, mw8 mw8Var) {
        storeTransferResultsEngagementRequest.getClass();
        storeTransferResultsEngagementRequest.bannerType_ = mw8Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m12608o(StoreTransferResultsEngagementRequest storeTransferResultsEngagementRequest, z8v z8vVar) {
        storeTransferResultsEngagementRequest.getClass();
        storeTransferResultsEngagementRequest.engagementType_ = z8vVar.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m12609p(StoreTransferResultsEngagementRequest storeTransferResultsEngagementRequest, String str) {
        storeTransferResultsEngagementRequest.getClass();
        str.getClass();
        storeTransferResultsEngagementRequest.transferId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static e951 m12610q() {
        return (e951) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f", new Object[]{"transferId_", "bannerType_", "engagementType_"});
        }
        if (iOrdinal == 3) {
            return new StoreTransferResultsEngagementRequest();
        }
        if (iOrdinal == 4) {
            return new e951(DEFAULT_INSTANCE);
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
        synchronized (StoreTransferResultsEngagementRequest.class) {
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
