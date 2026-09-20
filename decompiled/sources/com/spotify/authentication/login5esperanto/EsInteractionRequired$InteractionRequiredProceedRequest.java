package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.blw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsInteractionRequired$InteractionRequiredProceedRequest extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsInteractionRequired$InteractionRequiredProceedRequest DEFAULT_INSTANCE;
    public static final int INTERACTION_REF_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SERVER_HASH_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsAuthenticateContext$AuthenticateContext context_;
    private String interactionRef_ = "";
    private String serverHash_ = "";

    static {
        EsInteractionRequired$InteractionRequiredProceedRequest esInteractionRequired$InteractionRequiredProceedRequest = new EsInteractionRequired$InteractionRequiredProceedRequest();
        DEFAULT_INSTANCE = esInteractionRequired$InteractionRequiredProceedRequest;
        AbstractC0269h.registerDefaultInstance(EsInteractionRequired$InteractionRequiredProceedRequest.class, esInteractionRequired$InteractionRequiredProceedRequest);
    }

    private EsInteractionRequired$InteractionRequiredProceedRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3628n(EsInteractionRequired$InteractionRequiredProceedRequest esInteractionRequired$InteractionRequiredProceedRequest, EsAuthenticateContext$AuthenticateContext esAuthenticateContext$AuthenticateContext) {
        esInteractionRequired$InteractionRequiredProceedRequest.getClass();
        esAuthenticateContext$AuthenticateContext.getClass();
        esInteractionRequired$InteractionRequiredProceedRequest.context_ = esAuthenticateContext$AuthenticateContext;
        esInteractionRequired$InteractionRequiredProceedRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m3629o(EsInteractionRequired$InteractionRequiredProceedRequest esInteractionRequired$InteractionRequiredProceedRequest, String str) {
        esInteractionRequired$InteractionRequiredProceedRequest.getClass();
        str.getClass();
        esInteractionRequired$InteractionRequiredProceedRequest.interactionRef_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m3630p(EsInteractionRequired$InteractionRequiredProceedRequest esInteractionRequired$InteractionRequiredProceedRequest, String str) {
        esInteractionRequired$InteractionRequiredProceedRequest.getClass();
        str.getClass();
        esInteractionRequired$InteractionRequiredProceedRequest.serverHash_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static blw m3631q() {
        return (blw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"bitField0_", "context_", "interactionRef_", "serverHash_"});
        }
        if (iOrdinal == 3) {
            return new EsInteractionRequired$InteractionRequiredProceedRequest();
        }
        if (iOrdinal == 4) {
            return new blw(DEFAULT_INSTANCE);
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
        synchronized (EsInteractionRequired$InteractionRequiredProceedRequest.class) {
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
