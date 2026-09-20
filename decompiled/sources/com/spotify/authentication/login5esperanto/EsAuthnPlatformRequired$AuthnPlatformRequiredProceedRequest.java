package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.giw;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest DEFAULT_INSTANCE;
    public static final int IDENTITY_ASSERTION_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private EsAuthenticateContext$AuthenticateContext context_;
    private gva identityAssertion_ = gva.f84678b;

    static {
        EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest esAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest = new EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest();
        DEFAULT_INSTANCE = esAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest;
        AbstractC0269h.registerDefaultInstance(EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest.class, esAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest);
    }

    private EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3588n(EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest esAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest, EsAuthenticateContext$AuthenticateContext esAuthenticateContext$AuthenticateContext) {
        esAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest.getClass();
        esAuthenticateContext$AuthenticateContext.getClass();
        esAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest.context_ = esAuthenticateContext$AuthenticateContext;
        esAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m3589o(EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest esAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest, cva cvaVar) {
        esAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest.getClass();
        esAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest.identityAssertion_ = cvaVar;
    }

    /* JADX INFO: renamed from: p */
    public static giw m3590p() {
        return (giw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n", new Object[]{"bitField0_", "context_", "identityAssertion_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest();
        }
        if (iOrdinal == 4) {
            return new giw(DEFAULT_INSTANCE);
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
        synchronized (EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest.class) {
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
