package com.spotify.common_capping.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.nof;
import p204p.oof;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CommonCappingOuterClass$GetQuotaStateAtRequest extends AbstractC0269h implements sre0 {
    public static final int DAYS_OFFSET_FIELD_NUMBER = 2;
    private static final CommonCappingOuterClass$GetQuotaStateAtRequest DEFAULT_INSTANCE;
    public static final int FEATURE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int daysOffset_;
    private int feature_;

    static {
        CommonCappingOuterClass$GetQuotaStateAtRequest commonCappingOuterClass$GetQuotaStateAtRequest = new CommonCappingOuterClass$GetQuotaStateAtRequest();
        DEFAULT_INSTANCE = commonCappingOuterClass$GetQuotaStateAtRequest;
        AbstractC0269h.registerDefaultInstance(CommonCappingOuterClass$GetQuotaStateAtRequest.class, commonCappingOuterClass$GetQuotaStateAtRequest);
    }

    private CommonCappingOuterClass$GetQuotaStateAtRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6897n(CommonCappingOuterClass$GetQuotaStateAtRequest commonCappingOuterClass$GetQuotaStateAtRequest, int i) {
        commonCappingOuterClass$GetQuotaStateAtRequest.daysOffset_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m6898o(CommonCappingOuterClass$GetQuotaStateAtRequest commonCappingOuterClass$GetQuotaStateAtRequest, nof nofVar) {
        commonCappingOuterClass$GetQuotaStateAtRequest.getClass();
        commonCappingOuterClass$GetQuotaStateAtRequest.feature_ = nofVar.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static oof m6899p() {
        return (oof) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"feature_", "daysOffset_"});
        }
        if (iOrdinal == 3) {
            return new CommonCappingOuterClass$GetQuotaStateAtRequest();
        }
        if (iOrdinal == 4) {
            return new oof(DEFAULT_INSTANCE);
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
        synchronized (CommonCappingOuterClass$GetQuotaStateAtRequest.class) {
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
