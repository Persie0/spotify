package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.j810;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetDenominationSelectionRequest extends AbstractC0269h implements sre0 {
    private static final GetDenominationSelectionRequest DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static final int INTENT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    private int bitField0_;
    private String identifier_ = "";
    private String intent_ = "";
    private String reason_ = "";

    static {
        GetDenominationSelectionRequest getDenominationSelectionRequest = new GetDenominationSelectionRequest();
        DEFAULT_INSTANCE = getDenominationSelectionRequest;
        AbstractC0269h.registerDefaultInstance(GetDenominationSelectionRequest.class, getDenominationSelectionRequest);
    }

    private GetDenominationSelectionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16479n(GetDenominationSelectionRequest getDenominationSelectionRequest, String str) {
        getDenominationSelectionRequest.getClass();
        str.getClass();
        getDenominationSelectionRequest.identifier_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m16480o(GetDenominationSelectionRequest getDenominationSelectionRequest, String str) {
        getDenominationSelectionRequest.getClass();
        str.getClass();
        getDenominationSelectionRequest.bitField0_ |= 1;
        getDenominationSelectionRequest.intent_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static j810 m16481p() {
        return (j810) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "identifier_", "intent_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new GetDenominationSelectionRequest();
        }
        if (iOrdinal == 4) {
            return new j810(DEFAULT_INSTANCE);
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
        synchronized (GetDenominationSelectionRequest.class) {
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
