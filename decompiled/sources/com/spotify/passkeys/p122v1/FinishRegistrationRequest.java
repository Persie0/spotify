package com.spotify.passkeys.p122v1;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.hcj0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t9z;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class FinishRegistrationRequest extends AbstractC0269h implements sre0 {
    public static final int ATTESTATION_OBJECT_FIELD_NUMBER = 5;
    public static final int CLIENT_DATA_JSON_FIELD_NUMBER = 4;
    public static final int CREDENTIAL_ID_FIELD_NUMBER = 3;
    private static final FinishRegistrationRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SIGNALS_FIELD_NUMBER = 1;
    public static final int TRANSPORTS_FIELD_NUMBER = 6;
    private static final vd50 transports_converter_ = new hcj0(26);
    private gva attestationObject_;
    private int bitField0_;
    private gva clientDataJson_;
    private gva credentialId_;
    private String sessionId_ = "";
    private Signals signals_;
    private int transportsMemoizedSerializedSize;
    private ud50 transports_;

    static {
        FinishRegistrationRequest finishRegistrationRequest = new FinishRegistrationRequest();
        DEFAULT_INSTANCE = finishRegistrationRequest;
        AbstractC0269h.registerDefaultInstance(FinishRegistrationRequest.class, finishRegistrationRequest);
    }

    private FinishRegistrationRequest() {
        cva cvaVar = gva.f84678b;
        this.credentialId_ = cvaVar;
        this.clientDataJson_ = cvaVar;
        this.attestationObject_ = cvaVar;
        this.transports_ = AbstractC0269h.emptyIntList();
    }

    /* JADX INFO: renamed from: n */
    public static void m16652n(FinishRegistrationRequest finishRegistrationRequest, cva cvaVar) {
        finishRegistrationRequest.getClass();
        finishRegistrationRequest.attestationObject_ = cvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m16653o(FinishRegistrationRequest finishRegistrationRequest, cva cvaVar) {
        finishRegistrationRequest.getClass();
        finishRegistrationRequest.clientDataJson_ = cvaVar;
    }

    /* JADX INFO: renamed from: p */
    public static void m16654p(FinishRegistrationRequest finishRegistrationRequest, cva cvaVar) {
        finishRegistrationRequest.getClass();
        finishRegistrationRequest.credentialId_ = cvaVar;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m16655q(FinishRegistrationRequest finishRegistrationRequest, String str) {
        finishRegistrationRequest.getClass();
        finishRegistrationRequest.sessionId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m16656r(FinishRegistrationRequest finishRegistrationRequest, Signals signals) {
        finishRegistrationRequest.getClass();
        signals.getClass();
        finishRegistrationRequest.signals_ = signals;
        finishRegistrationRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: t */
    public static t9z m16658t() {
        return (t9z) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\n\u0004\n\u0005\n\u0006,", new Object[]{"bitField0_", "signals_", "sessionId_", "credentialId_", "clientDataJson_", "attestationObject_", "transports_"});
        }
        if (iOrdinal == 3) {
            return new FinishRegistrationRequest();
        }
        if (iOrdinal == 4) {
            return new t9z();
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
        synchronized (FinishRegistrationRequest.class) {
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
