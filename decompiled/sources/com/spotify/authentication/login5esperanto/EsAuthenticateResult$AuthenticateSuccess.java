package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;
import p204p.dbw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthenticateResult$AuthenticateSuccess extends AbstractC0269h implements sre0 {
    public static final int ACCESSTOKEN_FIELD_NUMBER = 2;
    public static final int AUTHBLOB_FIELD_NUMBER = 3;
    private static final EsAuthenticateResult$AuthenticateSuccess DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private EsAuthBlob$AuthBlob authBlob_;
    private int bitField0_;
    private Object optionalAccessToken_;
    private int optionalAccessTokenCase_ = 0;
    private String username_ = "";

    static {
        EsAuthenticateResult$AuthenticateSuccess esAuthenticateResult$AuthenticateSuccess = new EsAuthenticateResult$AuthenticateSuccess();
        DEFAULT_INSTANCE = esAuthenticateResult$AuthenticateSuccess;
        AbstractC0269h.registerDefaultInstance(EsAuthenticateResult$AuthenticateSuccess.class, esAuthenticateResult$AuthenticateSuccess);
    }

    private EsAuthenticateResult$AuthenticateSuccess() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EsAuthenticateResult$AuthenticateSuccess m3579q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003ဉ\u0000", new Object[]{"optionalAccessToken_", "optionalAccessTokenCase_", "bitField0_", "username_", EsAccessToken$AccessToken.class, "authBlob_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateResult$AuthenticateSuccess();
        }
        if (iOrdinal == 4) {
            return new dbw(24);
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
        synchronized (EsAuthenticateResult$AuthenticateSuccess.class) {
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

    public final String getUsername() {
        return this.username_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EsAccessToken$AccessToken m3580o() {
        return this.optionalAccessTokenCase_ == 2 ? (EsAccessToken$AccessToken) this.optionalAccessToken_ : EsAccessToken$AccessToken.m3474o();
    }

    /* JADX INFO: renamed from: p */
    public final EsAuthBlob$AuthBlob m3581p() {
        EsAuthBlob$AuthBlob esAuthBlob$AuthBlob = this.authBlob_;
        return esAuthBlob$AuthBlob == null ? EsAuthBlob$AuthBlob.m7479o() : esAuthBlob$AuthBlob;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3582r() {
        return this.optionalAccessTokenCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
