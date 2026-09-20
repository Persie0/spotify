package com.spotify.connectivity.auth.clienttoken.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.iiw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsClientToken$ClientToken extends AbstractC0269h implements sre0 {
    public static final int CLIENT_DATA_HASH_FIELD_NUMBER = 4;
    private static final EsClientToken$ClientToken DEFAULT_INSTANCE;
    public static final int DOMAINS_FIELD_NUMBER = 5;
    public static final int EXPIRES_AT_TIMESTAMP_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REFRESH_AT_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private long expiresAtTimestamp_;
    private long refreshAtTimestamp_;
    private String token_ = "";
    private String clientDataHash_ = "";
    private ae50 domains_ = AbstractC0269h.emptyProtobufList();

    static {
        EsClientToken$ClientToken esClientToken$ClientToken = new EsClientToken$ClientToken();
        DEFAULT_INSTANCE = esClientToken$ClientToken;
        AbstractC0269h.registerDefaultInstance(EsClientToken$ClientToken.class, esClientToken$ClientToken);
    }

    private EsClientToken$ClientToken() {
    }

    /* JADX INFO: renamed from: o */
    public static EsClientToken$ClientToken m7470o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004Ȉ\u0005Ț", new Object[]{"token_", "expiresAtTimestamp_", "refreshAtTimestamp_", "clientDataHash_", "domains_"});
        }
        if (iOrdinal == 3) {
            return new EsClientToken$ClientToken();
        }
        if (iOrdinal == 4) {
            return new iiw(DEFAULT_INSTANCE, 16);
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
        synchronized (EsClientToken$ClientToken.class) {
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
    public final String m7471n() {
        return this.clientDataHash_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m7472p() {
        return this.domains_;
    }

    /* JADX INFO: renamed from: q */
    public final long m7473q() {
        return this.expiresAtTimestamp_;
    }

    /* JADX INFO: renamed from: r */
    public final long m7474r() {
        return this.refreshAtTimestamp_;
    }

    /* JADX INFO: renamed from: s */
    public final String m7475s() {
        return this.token_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
