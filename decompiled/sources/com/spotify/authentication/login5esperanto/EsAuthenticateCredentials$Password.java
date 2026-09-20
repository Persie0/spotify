package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.aiw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthenticateCredentials$Password extends AbstractC0269h implements sre0 {
    private static final EsAuthenticateCredentials$Password DEFAULT_INSTANCE;
    public static final int HINT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int optionalHintCase_ = 0;
    private Object optionalHint_;

    static {
        EsAuthenticateCredentials$Password esAuthenticateCredentials$Password = new EsAuthenticateCredentials$Password();
        DEFAULT_INSTANCE = esAuthenticateCredentials$Password;
        AbstractC0269h.registerDefaultInstance(EsAuthenticateCredentials$Password.class, esAuthenticateCredentials$Password);
    }

    private EsAuthenticateCredentials$Password() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3542n(EsAuthenticateCredentials$Password esAuthenticateCredentials$Password, String str) {
        esAuthenticateCredentials$Password.getClass();
        esAuthenticateCredentials$Password.optionalHintCase_ = 1;
        esAuthenticateCredentials$Password.optionalHint_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static aiw m3544p() {
        return (aiw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȼ\u0000", new Object[]{"optionalHint_", "optionalHintCase_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateCredentials$Password();
        }
        if (iOrdinal == 4) {
            return new aiw();
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
        synchronized (EsAuthenticateCredentials$Password.class) {
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
