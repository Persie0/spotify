package com.spotify.common_capping.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pof;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sof;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CommonCappingOuterClass$GetQuotaStateAtResponse extends AbstractC0269h implements sre0 {
    private static final CommonCappingOuterClass$GetQuotaStateAtResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int QUOTA_STATE_FIELD_NUMBER = 1;
    private int quotaState_;

    static {
        CommonCappingOuterClass$GetQuotaStateAtResponse commonCappingOuterClass$GetQuotaStateAtResponse = new CommonCappingOuterClass$GetQuotaStateAtResponse();
        DEFAULT_INSTANCE = commonCappingOuterClass$GetQuotaStateAtResponse;
        AbstractC0269h.registerDefaultInstance(CommonCappingOuterClass$GetQuotaStateAtResponse.class, commonCappingOuterClass$GetQuotaStateAtResponse);
    }

    private CommonCappingOuterClass$GetQuotaStateAtResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static CommonCappingOuterClass$GetQuotaStateAtResponse m6900o(byte[] bArr) {
        return (CommonCappingOuterClass$GetQuotaStateAtResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"quotaState_"});
        }
        if (iOrdinal == 3) {
            return new CommonCappingOuterClass$GetQuotaStateAtResponse();
        }
        if (iOrdinal == 4) {
            return new pof(DEFAULT_INSTANCE, 0);
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
        synchronized (CommonCappingOuterClass$GetQuotaStateAtResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final sof m6901n() {
        sof sofVar;
        int i = this.quotaState_;
        if (i == 0) {
            sofVar = sof.NO_QUOTA_DATA;
        } else if (i != 1) {
            sofVar = i != 2 ? null : sof.QUOTA_FULLY_CONSUMED;
        } else {
            sofVar = sof.HAS_REMAINING_QUOTA;
        }
        return sofVar == null ? sof.UNRECOGNIZED : sofVar;
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
