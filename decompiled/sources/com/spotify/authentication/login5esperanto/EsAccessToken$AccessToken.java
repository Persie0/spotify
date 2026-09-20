package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.dbw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAccessToken$AccessToken extends AbstractC0269h implements sre0 {
    private static final EsAccessToken$AccessToken DEFAULT_INSTANCE;
    public static final int EXPIRESAT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Timestamp expiresAt_;
    private String token_ = "";
    private String type_ = "";

    static {
        EsAccessToken$AccessToken esAccessToken$AccessToken = new EsAccessToken$AccessToken();
        DEFAULT_INSTANCE = esAccessToken$AccessToken;
        AbstractC0269h.registerDefaultInstance(EsAccessToken$AccessToken.class, esAccessToken$AccessToken);
    }

    private EsAccessToken$AccessToken() {
    }

    /* JADX INFO: renamed from: o */
    public static EsAccessToken$AccessToken m3474o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "token_", "type_", "expiresAt_"});
        }
        if (iOrdinal == 3) {
            return new EsAccessToken$AccessToken();
        }
        if (iOrdinal == 4) {
            return new dbw(16);
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
        synchronized (EsAccessToken$AccessToken.class) {
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

    /* JADX INFO: renamed from: p */
    public final Timestamp m3475p() {
        Timestamp timestamp = this.expiresAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: q */
    public final String m3476q() {
        return this.token_;
    }

    /* JADX INFO: renamed from: r */
    public final String m3477r() {
        return this.type_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
