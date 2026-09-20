package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsInteractionRequired$InteractionRequiredProceedResult extends AbstractC0269h implements sre0 {
    private static final EsInteractionRequired$InteractionRequiredProceedResult DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    static {
        EsInteractionRequired$InteractionRequiredProceedResult esInteractionRequired$InteractionRequiredProceedResult = new EsInteractionRequired$InteractionRequiredProceedResult();
        DEFAULT_INSTANCE = esInteractionRequired$InteractionRequiredProceedResult;
        AbstractC0269h.registerDefaultInstance(EsInteractionRequired$InteractionRequiredProceedResult.class, esInteractionRequired$InteractionRequiredProceedResult);
    }

    private EsInteractionRequired$InteractionRequiredProceedResult() {
    }

    /* JADX INFO: renamed from: p */
    public static EsInteractionRequired$InteractionRequiredProceedResult m3632p(byte[] bArr) {
        return (EsInteractionRequired$InteractionRequiredProceedResult) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", EsInteractionRequired$InteractionRequiredProceedSuccess.class, EsInteractionRequired$InteractionRequiredProceedError.class});
        }
        if (iOrdinal == 3) {
            return new EsInteractionRequired$InteractionRequiredProceedResult();
        }
        if (iOrdinal == 4) {
            return new qjw(DEFAULT_INSTANCE, 16);
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
        synchronized (EsInteractionRequired$InteractionRequiredProceedResult.class) {
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
    public final EsInteractionRequired$InteractionRequiredProceedError m3633n() {
        return this.resultCase_ == 2 ? (EsInteractionRequired$InteractionRequiredProceedError) this.result_ : EsInteractionRequired$InteractionRequiredProceedError.m3626n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3634o() {
        return this.resultCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
