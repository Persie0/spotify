package com.spotify.clientrestrictions.p046v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Empty;
import p204p.n4x0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class RestrictedIntegrationsResponse extends AbstractC0269h implements sre0 {
    public static final int CACHE_TTL_IN_SECONDS_FIELD_NUMBER = 2;
    private static final RestrictedIntegrationsResponse DEFAULT_INSTANCE;
    public static final int ETAG_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PAYLOAD_CACHED_FIELD_NUMBER = 4;
    public static final int PAYLOAD_UNCACHED_FIELD_NUMBER = 3;
    private long cacheTtlInSeconds_;
    private Object payload_;
    private int payloadCase_ = 0;
    private String etag_ = "";

    static {
        RestrictedIntegrationsResponse restrictedIntegrationsResponse = new RestrictedIntegrationsResponse();
        DEFAULT_INSTANCE = restrictedIntegrationsResponse;
        AbstractC0269h.registerDefaultInstance(RestrictedIntegrationsResponse.class, restrictedIntegrationsResponse);
    }

    private RestrictedIntegrationsResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6798n(RestrictedIntegrationsResponse restrictedIntegrationsResponse, long j) {
        restrictedIntegrationsResponse.cacheTtlInSeconds_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static RestrictedIntegrationsResponse m6799s(byte[] bArr) {
        return (RestrictedIntegrationsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003<\u0000\u0004<\u0000", new Object[]{"payload_", "payloadCase_", "etag_", "cacheTtlInSeconds_", RestrictedIntegrationsPayload.class, Empty.class});
        }
        if (iOrdinal == 3) {
            return new RestrictedIntegrationsResponse();
        }
        if (iOrdinal == 4) {
            return new n4x0(DEFAULT_INSTANCE);
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
        synchronized (RestrictedIntegrationsResponse.class) {
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
    public final long m6800o() {
        return this.cacheTtlInSeconds_;
    }

    /* JADX INFO: renamed from: p */
    public final String m6801p() {
        return this.etag_;
    }

    /* JADX INFO: renamed from: q */
    public final RestrictedIntegrationsPayload m6802q() {
        return this.payloadCase_ == 3 ? (RestrictedIntegrationsPayload) this.payload_ : RestrictedIntegrationsPayload.m6793n();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m6803r() {
        return this.payloadCase_ == 3;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
