package com.spotify.atv_remote.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ur6;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AtvRemoteServiceOuterClass$AtvPairingResponse extends AbstractC0269h implements sre0 {
    private static final AtvRemoteServiceOuterClass$AtvPairingResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private String errorMessage_ = "";
    private int error_;
    private boolean success_;

    static {
        AtvRemoteServiceOuterClass$AtvPairingResponse atvRemoteServiceOuterClass$AtvPairingResponse = new AtvRemoteServiceOuterClass$AtvPairingResponse();
        DEFAULT_INSTANCE = atvRemoteServiceOuterClass$AtvPairingResponse;
        AbstractC0269h.registerDefaultInstance(AtvRemoteServiceOuterClass$AtvPairingResponse.class, atvRemoteServiceOuterClass$AtvPairingResponse);
    }

    private AtvRemoteServiceOuterClass$AtvPairingResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static AtvRemoteServiceOuterClass$AtvPairingResponse m3358q(byte[] bArr) {
        return (AtvRemoteServiceOuterClass$AtvPairingResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003\f", new Object[]{"success_", "errorMessage_", "error_"});
        }
        if (iOrdinal == 3) {
            return new AtvRemoteServiceOuterClass$AtvPairingResponse();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 2);
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
        synchronized (AtvRemoteServiceOuterClass$AtvPairingResponse.class) {
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
    public final ur6 m3359n() {
        ur6 ur6Var;
        switch (this.error_) {
            case 0:
                ur6Var = ur6.ATV_PAIRING_ERROR_UNSPECIFIED;
                break;
            case 1:
                ur6Var = ur6.ATV_PAIRING_ERROR_INVALID_PIN_FORMAT;
                break;
            case 2:
                ur6Var = ur6.ATV_PAIRING_ERROR_HAP_AUTHENTICATION;
                break;
            case 3:
                ur6Var = ur6.ATV_PAIRING_ERROR_HAP_BACKOFF;
                break;
            case 4:
                ur6Var = ur6.ATV_PAIRING_ERROR_HAP_MAX_PEERS;
                break;
            case 5:
                ur6Var = ur6.ATV_PAIRING_ERROR_HAP_MAX_TRIES;
                break;
            case 6:
                ur6Var = ur6.ATV_PAIRING_ERROR_HAP_UNAVAILABLE;
                break;
            case 7:
                ur6Var = ur6.ATV_PAIRING_ERROR_HAP_BUSY;
                break;
            case 8:
                ur6Var = ur6.ATV_PAIRING_ERROR_UNKNOWN_HAP_ERROR;
                break;
            case 9:
                ur6Var = ur6.ATV_PAIRING_ERROR_DEVICE_NOT_RESPONDING;
                break;
            case 10:
                ur6Var = ur6.ATV_PAIRING_ERROR_CONNECTION_LOST;
                break;
            case 11:
                ur6Var = ur6.ATV_PAIRING_ERROR_UNKNOWN;
                break;
            default:
                ur6Var = null;
                break;
        }
        return ur6Var == null ? ur6.UNRECOGNIZED : ur6Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m3360o() {
        return this.errorMessage_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m3361p() {
        return this.success_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
