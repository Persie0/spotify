package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vlw;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsOffline$LicenseStatusResponse extends AbstractC0269h implements sre0 {
    private static final EsOffline$LicenseStatusResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int FREE_LICENSES_FIELD_NUMBER = 2;
    public static final int MAX_LICENSES_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private long error_;
    private int freeLicenses_;
    private int maxLicenses_;

    static {
        EsOffline$LicenseStatusResponse esOffline$LicenseStatusResponse = new EsOffline$LicenseStatusResponse();
        DEFAULT_INSTANCE = esOffline$LicenseStatusResponse;
        AbstractC0269h.registerDefaultInstance(EsOffline$LicenseStatusResponse.class, esOffline$LicenseStatusResponse);
    }

    private EsOffline$LicenseStatusResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EsOffline$LicenseStatusResponse m16168q(byte[] bArr) {
        return (EsOffline$LicenseStatusResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0002", new Object[]{"maxLicenses_", "freeLicenses_", "error_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$LicenseStatusResponse();
        }
        if (iOrdinal == 4) {
            return new vlw(DEFAULT_INSTANCE, 15);
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
        synchronized (EsOffline$LicenseStatusResponse.class) {
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
    public final long m16169n() {
        return this.error_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m16170o() {
        return this.freeLicenses_;
    }

    /* JADX INFO: renamed from: p */
    public final int m16171p() {
        return this.maxLicenses_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
