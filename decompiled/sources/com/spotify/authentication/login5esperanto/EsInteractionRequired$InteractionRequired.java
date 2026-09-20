package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsInteractionRequired$InteractionRequired extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsInteractionRequired$InteractionRequired DEFAULT_INSTANCE;
    public static final int FINISH_URL_FIELD_NUMBER = 3;
    public static final int INTERACTION_URL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private EsAuthenticateContext$AuthenticateContext context_;
    private String interactionUrl_ = "";
    private String finishUrl_ = "";

    static {
        EsInteractionRequired$InteractionRequired esInteractionRequired$InteractionRequired = new EsInteractionRequired$InteractionRequired();
        DEFAULT_INSTANCE = esInteractionRequired$InteractionRequired;
        AbstractC0269h.registerDefaultInstance(EsInteractionRequired$InteractionRequired.class, esInteractionRequired$InteractionRequired);
    }

    private EsInteractionRequired$InteractionRequired() {
    }

    /* JADX INFO: renamed from: p */
    public static EsInteractionRequired$InteractionRequired m3623p() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"bitField0_", "context_", "interactionUrl_", "finishUrl_"});
        }
        if (iOrdinal == 3) {
            return new EsInteractionRequired$InteractionRequired();
        }
        if (iOrdinal == 4) {
            return new qjw(14);
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
        synchronized (EsInteractionRequired$InteractionRequired.class) {
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
    public final EsAuthenticateContext$AuthenticateContext m3624o() {
        EsAuthenticateContext$AuthenticateContext esAuthenticateContext$AuthenticateContext = this.context_;
        return esAuthenticateContext$AuthenticateContext == null ? EsAuthenticateContext$AuthenticateContext.m3495n() : esAuthenticateContext$AuthenticateContext;
    }

    /* JADX INFO: renamed from: q */
    public final String m3625q() {
        return this.interactionUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
