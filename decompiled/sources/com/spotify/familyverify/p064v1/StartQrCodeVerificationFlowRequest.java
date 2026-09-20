package com.spotify.familyverify.p064v1;

import com.google.protobuf.AbstractC0269h;
import p204p.hr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class StartQrCodeVerificationFlowRequest extends AbstractC0269h implements sre0 {
    private static final StartQrCodeVerificationFlowRequest DEFAULT_INSTANCE;
    public static final int FILLER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int V2_ENABLED_FIELD_NUMBER = 2;
    private String filler_ = "";
    private boolean v2Enabled_;

    static {
        StartQrCodeVerificationFlowRequest startQrCodeVerificationFlowRequest = new StartQrCodeVerificationFlowRequest();
        DEFAULT_INSTANCE = startQrCodeVerificationFlowRequest;
        AbstractC0269h.registerDefaultInstance(StartQrCodeVerificationFlowRequest.class, startQrCodeVerificationFlowRequest);
    }

    private StartQrCodeVerificationFlowRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m10639n(StartQrCodeVerificationFlowRequest startQrCodeVerificationFlowRequest) {
        startQrCodeVerificationFlowRequest.getClass();
        startQrCodeVerificationFlowRequest.filler_ = " ";
    }

    /* JADX INFO: renamed from: o */
    public static void m10640o(StartQrCodeVerificationFlowRequest startQrCodeVerificationFlowRequest, boolean z) {
        startQrCodeVerificationFlowRequest.v2Enabled_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static hr41 m10642q() {
        return (hr41) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"filler_", "v2Enabled_"});
        }
        if (iOrdinal == 3) {
            return new StartQrCodeVerificationFlowRequest();
        }
        if (iOrdinal == 4) {
            return new hr41();
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
        synchronized (StartQrCodeVerificationFlowRequest.class) {
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
