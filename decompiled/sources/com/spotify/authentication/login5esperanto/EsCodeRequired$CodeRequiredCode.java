package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.iiw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.siw;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsCodeRequired$CodeRequiredCode extends AbstractC0269h implements sre0 {
    public static final int CANONICALPHONENUMBER_FIELD_NUMBER = 3;
    public static final int CODELENGTH_FIELD_NUMBER = 2;
    private static final EsCodeRequired$CodeRequiredCode DEFAULT_INSTANCE;
    public static final int EMAILADDRESS_FIELD_NUMBER = 7;
    public static final int EXPIRES_AT_FIELD_NUMBER = 4;
    public static final int EXPIRES_IN_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int RETRY_NUMBER_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int codeLength_;
    private long expiresAt_;
    private long expiresIn_;
    private int retryNumber_;
    private int type_;
    private String canonicalPhoneNumber_ = "";
    private String emailAddress_ = "";

    static {
        EsCodeRequired$CodeRequiredCode esCodeRequired$CodeRequiredCode = new EsCodeRequired$CodeRequiredCode();
        DEFAULT_INSTANCE = esCodeRequired$CodeRequiredCode;
        AbstractC0269h.registerDefaultInstance(EsCodeRequired$CodeRequiredCode.class, esCodeRequired$CodeRequiredCode);
    }

    private EsCodeRequired$CodeRequiredCode() {
    }

    /* JADX INFO: renamed from: p */
    public static EsCodeRequired$CodeRequiredCode m3598p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003Ȉ\u0004\u0002\u0005\u0002\u0006\u0004\u0007Ȉ", new Object[]{"type_", "codeLength_", "canonicalPhoneNumber_", "expiresAt_", "expiresIn_", "retryNumber_", "emailAddress_"});
        }
        if (iOrdinal == 3) {
            return new EsCodeRequired$CodeRequiredCode();
        }
        if (iOrdinal == 4) {
            return new iiw(DEFAULT_INSTANCE, 19);
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
        synchronized (EsCodeRequired$CodeRequiredCode.class) {
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
    public final String m3599n() {
        return this.canonicalPhoneNumber_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m3600o() {
        return this.codeLength_;
    }

    /* JADX INFO: renamed from: q */
    public final String m3601q() {
        return this.emailAddress_;
    }

    /* JADX INFO: renamed from: r */
    public final long m3602r() {
        return this.expiresAt_;
    }

    /* JADX INFO: renamed from: s */
    public final long m3603s() {
        return this.expiresIn_;
    }

    /* JADX INFO: renamed from: t */
    public final int m3604t() {
        return this.retryNumber_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final siw m3605u() {
        siw siwVar;
        int i = this.type_;
        if (i == 0) {
            siwVar = siw.unknown;
        } else if (i != 1) {
            siwVar = i != 2 ? null : siw.emailCode;
        } else {
            siwVar = siw.smsCode;
        }
        return siwVar == null ? siw.UNRECOGNIZED : siwVar;
    }
}
