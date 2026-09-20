package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.iiw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsCodeRequired$CodeRequiredProceedResult extends AbstractC0269h implements sre0 {
    private static final EsCodeRequired$CodeRequiredProceedResult DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    static {
        EsCodeRequired$CodeRequiredProceedResult esCodeRequired$CodeRequiredProceedResult = new EsCodeRequired$CodeRequiredProceedResult();
        DEFAULT_INSTANCE = esCodeRequired$CodeRequiredProceedResult;
        AbstractC0269h.registerDefaultInstance(EsCodeRequired$CodeRequiredProceedResult.class, esCodeRequired$CodeRequiredProceedResult);
    }

    private EsCodeRequired$CodeRequiredProceedResult() {
    }

    /* JADX INFO: renamed from: p */
    public static EsCodeRequired$CodeRequiredProceedResult m3612p(byte[] bArr) {
        return (EsCodeRequired$CodeRequiredProceedResult) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", EsCodeRequired$CodeRequiredProceedSuccess.class, EsCodeRequired$CodeRequiredProceedError.class});
        }
        if (iOrdinal == 3) {
            return new EsCodeRequired$CodeRequiredProceedResult();
        }
        if (iOrdinal == 4) {
            return new iiw(DEFAULT_INSTANCE, 21);
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
        synchronized (EsCodeRequired$CodeRequiredProceedResult.class) {
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
    public final EsCodeRequired$CodeRequiredProceedError m3613n() {
        return this.resultCase_ == 2 ? (EsCodeRequired$CodeRequiredProceedError) this.result_ : EsCodeRequired$CodeRequiredProceedError.m3606n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3614o() {
        return this.resultCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
