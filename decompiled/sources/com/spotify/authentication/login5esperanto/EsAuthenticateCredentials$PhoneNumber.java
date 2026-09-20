package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.biw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthenticateCredentials$PhoneNumber extends AbstractC0269h implements sre0 {
    public static final int COUNTRYCALLINGCODE_FIELD_NUMBER = 3;
    private static final EsAuthenticateCredentials$PhoneNumber DEFAULT_INSTANCE;
    public static final int ISOCOUNTRYCODE_FIELD_NUMBER = 2;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String number_ = "";
    private String isoCountryCode_ = "";
    private String countryCallingCode_ = "";

    static {
        EsAuthenticateCredentials$PhoneNumber esAuthenticateCredentials$PhoneNumber = new EsAuthenticateCredentials$PhoneNumber();
        DEFAULT_INSTANCE = esAuthenticateCredentials$PhoneNumber;
        AbstractC0269h.registerDefaultInstance(EsAuthenticateCredentials$PhoneNumber.class, esAuthenticateCredentials$PhoneNumber);
    }

    private EsAuthenticateCredentials$PhoneNumber() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3545n(EsAuthenticateCredentials$PhoneNumber esAuthenticateCredentials$PhoneNumber, String str) {
        esAuthenticateCredentials$PhoneNumber.getClass();
        esAuthenticateCredentials$PhoneNumber.countryCallingCode_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m3546o(EsAuthenticateCredentials$PhoneNumber esAuthenticateCredentials$PhoneNumber, String str) {
        esAuthenticateCredentials$PhoneNumber.getClass();
        esAuthenticateCredentials$PhoneNumber.isoCountryCode_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m3547p(EsAuthenticateCredentials$PhoneNumber esAuthenticateCredentials$PhoneNumber, String str) {
        esAuthenticateCredentials$PhoneNumber.getClass();
        str.getClass();
        esAuthenticateCredentials$PhoneNumber.number_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static biw m3549r() {
        return (biw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"number_", "isoCountryCode_", "countryCallingCode_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateCredentials$PhoneNumber();
        }
        if (iOrdinal == 4) {
            return new biw();
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
        synchronized (EsAuthenticateCredentials$PhoneNumber.class) {
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
