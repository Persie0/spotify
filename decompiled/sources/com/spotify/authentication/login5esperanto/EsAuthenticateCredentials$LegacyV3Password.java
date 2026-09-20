package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vhw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthenticateCredentials$LegacyV3Password extends AbstractC0269h implements sre0 {
    private static final EsAuthenticateCredentials$LegacyV3Password DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    private String id_ = "";
    private String password_ = "";

    static {
        EsAuthenticateCredentials$LegacyV3Password esAuthenticateCredentials$LegacyV3Password = new EsAuthenticateCredentials$LegacyV3Password();
        DEFAULT_INSTANCE = esAuthenticateCredentials$LegacyV3Password;
        AbstractC0269h.registerDefaultInstance(EsAuthenticateCredentials$LegacyV3Password.class, esAuthenticateCredentials$LegacyV3Password);
    }

    private EsAuthenticateCredentials$LegacyV3Password() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3524n(EsAuthenticateCredentials$LegacyV3Password esAuthenticateCredentials$LegacyV3Password, String str) {
        esAuthenticateCredentials$LegacyV3Password.getClass();
        str.getClass();
        esAuthenticateCredentials$LegacyV3Password.id_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m3525o(EsAuthenticateCredentials$LegacyV3Password esAuthenticateCredentials$LegacyV3Password, String str) {
        esAuthenticateCredentials$LegacyV3Password.getClass();
        str.getClass();
        esAuthenticateCredentials$LegacyV3Password.password_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static vhw m3526p() {
        return (vhw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"id_", "password_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateCredentials$LegacyV3Password();
        }
        if (iOrdinal == 4) {
            return new vhw(DEFAULT_INSTANCE);
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
        synchronized (EsAuthenticateCredentials$LegacyV3Password.class) {
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
