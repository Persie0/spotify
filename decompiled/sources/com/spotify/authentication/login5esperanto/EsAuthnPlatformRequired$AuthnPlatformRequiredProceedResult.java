package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsAuthnPlatformRequired$AuthnPlatformRequiredProceedResult extends AbstractC0269h implements sre0 {
    private static final EsAuthnPlatformRequired$AuthnPlatformRequiredProceedResult DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    static {
        EsAuthnPlatformRequired$AuthnPlatformRequiredProceedResult esAuthnPlatformRequired$AuthnPlatformRequiredProceedResult = new EsAuthnPlatformRequired$AuthnPlatformRequiredProceedResult();
        DEFAULT_INSTANCE = esAuthnPlatformRequired$AuthnPlatformRequiredProceedResult;
        AbstractC0269h.registerDefaultInstance(EsAuthnPlatformRequired$AuthnPlatformRequiredProceedResult.class, esAuthnPlatformRequired$AuthnPlatformRequiredProceedResult);
    }

    private EsAuthnPlatformRequired$AuthnPlatformRequiredProceedResult() {
    }

    /* JADX INFO: renamed from: p */
    public static EsAuthnPlatformRequired$AuthnPlatformRequiredProceedResult m3591p(byte[] bArr) {
        return (EsAuthnPlatformRequired$AuthnPlatformRequiredProceedResult) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", EsAuthnPlatformRequired$AuthnPlatformRequiredProceedSuccess.class, EsAuthnPlatformRequired$AuthnPlatformRequiredProceedError.class});
        }
        if (iOrdinal == 3) {
            return new EsAuthnPlatformRequired$AuthnPlatformRequiredProceedResult();
        }
        if (iOrdinal == 4) {
            return new dbw(DEFAULT_INSTANCE, 27);
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
        synchronized (EsAuthnPlatformRequired$AuthnPlatformRequiredProceedResult.class) {
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
    public final EsAuthnPlatformRequired$AuthnPlatformRequiredProceedError m3592n() {
        return this.resultCase_ == 2 ? (EsAuthnPlatformRequired$AuthnPlatformRequiredProceedError) this.result_ : EsAuthnPlatformRequired$AuthnPlatformRequiredProceedError.m3586n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3593o() {
        return this.resultCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
