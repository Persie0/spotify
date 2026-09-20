package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.shw;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthenticateCredentials$EmailAddress extends AbstractC0269h implements sre0 {
    private static final EsAuthenticateCredentials$EmailAddress DEFAULT_INSTANCE;
    public static final int EMAILADDRESS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String emailAddress_ = "";

    static {
        EsAuthenticateCredentials$EmailAddress esAuthenticateCredentials$EmailAddress = new EsAuthenticateCredentials$EmailAddress();
        DEFAULT_INSTANCE = esAuthenticateCredentials$EmailAddress;
        AbstractC0269h.registerDefaultInstance(EsAuthenticateCredentials$EmailAddress.class, esAuthenticateCredentials$EmailAddress);
    }

    private EsAuthenticateCredentials$EmailAddress() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3512n(EsAuthenticateCredentials$EmailAddress esAuthenticateCredentials$EmailAddress, String str) {
        esAuthenticateCredentials$EmailAddress.getClass();
        str.getClass();
        esAuthenticateCredentials$EmailAddress.emailAddress_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static shw m3514p() {
        return (shw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"emailAddress_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateCredentials$EmailAddress();
        }
        if (iOrdinal == 4) {
            return new shw();
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
        synchronized (EsAuthenticateCredentials$EmailAddress.class) {
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
