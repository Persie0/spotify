package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.iiw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsCodeRequired$CodeRequired extends AbstractC0269h implements sre0 {
    public static final int CHALLENGECODE_FIELD_NUMBER = 2;
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsCodeRequired$CodeRequired DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private EsCodeRequired$CodeRequiredCode challengeCode_;
    private EsAuthenticateContext$AuthenticateContext context_;

    static {
        EsCodeRequired$CodeRequired esCodeRequired$CodeRequired = new EsCodeRequired$CodeRequired();
        DEFAULT_INSTANCE = esCodeRequired$CodeRequired;
        AbstractC0269h.registerDefaultInstance(EsCodeRequired$CodeRequired.class, esCodeRequired$CodeRequired);
    }

    private EsCodeRequired$CodeRequired() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EsCodeRequired$CodeRequired m3595q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "context_", "challengeCode_"});
        }
        if (iOrdinal == 3) {
            return new EsCodeRequired$CodeRequired();
        }
        if (iOrdinal == 4) {
            return new iiw(18);
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
        synchronized (EsCodeRequired$CodeRequired.class) {
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
    public final EsCodeRequired$CodeRequiredCode m3596o() {
        EsCodeRequired$CodeRequiredCode esCodeRequired$CodeRequiredCode = this.challengeCode_;
        return esCodeRequired$CodeRequiredCode == null ? EsCodeRequired$CodeRequiredCode.m3598p() : esCodeRequired$CodeRequiredCode;
    }

    /* JADX INFO: renamed from: p */
    public final EsAuthenticateContext$AuthenticateContext m3597p() {
        EsAuthenticateContext$AuthenticateContext esAuthenticateContext$AuthenticateContext = this.context_;
        return esAuthenticateContext$AuthenticateContext == null ? EsAuthenticateContext$AuthenticateContext.m3495n() : esAuthenticateContext$AuthenticateContext;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
