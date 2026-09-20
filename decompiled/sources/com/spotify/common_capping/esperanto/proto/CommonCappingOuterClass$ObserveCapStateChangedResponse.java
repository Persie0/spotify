package com.spotify.common_capping.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pof;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class CommonCappingOuterClass$ObserveCapStateChangedResponse extends AbstractC0269h implements sre0 {
    private static final CommonCappingOuterClass$ObserveCapStateChangedResponse DEFAULT_INSTANCE;
    public static final int IS_CAPPED_FIELD_NUMBER = 1;
    public static final int IS_CHANGE_FROM_LOCAL_CONSUMPTION_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private boolean isCapped_;
    private boolean isChangeFromLocalConsumption_;

    static {
        CommonCappingOuterClass$ObserveCapStateChangedResponse commonCappingOuterClass$ObserveCapStateChangedResponse = new CommonCappingOuterClass$ObserveCapStateChangedResponse();
        DEFAULT_INSTANCE = commonCappingOuterClass$ObserveCapStateChangedResponse;
        AbstractC0269h.registerDefaultInstance(CommonCappingOuterClass$ObserveCapStateChangedResponse.class, commonCappingOuterClass$ObserveCapStateChangedResponse);
    }

    private CommonCappingOuterClass$ObserveCapStateChangedResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static CommonCappingOuterClass$ObserveCapStateChangedResponse m6909q(byte[] bArr) {
        return (CommonCappingOuterClass$ObserveCapStateChangedResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"isCapped_", "isChangeFromLocalConsumption_"});
        }
        if (iOrdinal == 3) {
            return new CommonCappingOuterClass$ObserveCapStateChangedResponse();
        }
        if (iOrdinal == 4) {
            return new pof(2);
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
        synchronized (CommonCappingOuterClass$ObserveCapStateChangedResponse.class) {
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
    public final boolean m6910o() {
        return this.isCapped_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m6911p() {
        return this.isChangeFromLocalConsumption_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
