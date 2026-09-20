package com.spotify.atv_remote.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vr6;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AtvRemoteServiceOuterClass$AtvStartPairingRequest extends AbstractC0269h implements sre0 {
    private static final AtvRemoteServiceOuterClass$AtvStartPairingRequest DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 3;
    public static final int IP_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PORT_FIELD_NUMBER = 2;
    private int port_;
    private String ip_ = "";
    private String identifier_ = "";

    static {
        AtvRemoteServiceOuterClass$AtvStartPairingRequest atvRemoteServiceOuterClass$AtvStartPairingRequest = new AtvRemoteServiceOuterClass$AtvStartPairingRequest();
        DEFAULT_INSTANCE = atvRemoteServiceOuterClass$AtvStartPairingRequest;
        AbstractC0269h.registerDefaultInstance(AtvRemoteServiceOuterClass$AtvStartPairingRequest.class, atvRemoteServiceOuterClass$AtvStartPairingRequest);
    }

    private AtvRemoteServiceOuterClass$AtvStartPairingRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3362n(AtvRemoteServiceOuterClass$AtvStartPairingRequest atvRemoteServiceOuterClass$AtvStartPairingRequest, String str) {
        atvRemoteServiceOuterClass$AtvStartPairingRequest.getClass();
        str.getClass();
        atvRemoteServiceOuterClass$AtvStartPairingRequest.identifier_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m3363o(AtvRemoteServiceOuterClass$AtvStartPairingRequest atvRemoteServiceOuterClass$AtvStartPairingRequest, String str) {
        atvRemoteServiceOuterClass$AtvStartPairingRequest.getClass();
        str.getClass();
        atvRemoteServiceOuterClass$AtvStartPairingRequest.ip_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m3364p(AtvRemoteServiceOuterClass$AtvStartPairingRequest atvRemoteServiceOuterClass$AtvStartPairingRequest, int i) {
        atvRemoteServiceOuterClass$AtvStartPairingRequest.port_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static vr6 m3365q() {
        return (vr6) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003Ȉ", new Object[]{"ip_", "port_", "identifier_"});
        }
        if (iOrdinal == 3) {
            return new AtvRemoteServiceOuterClass$AtvStartPairingRequest();
        }
        if (iOrdinal == 4) {
            return new vr6(DEFAULT_INSTANCE);
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
        synchronized (AtvRemoteServiceOuterClass$AtvStartPairingRequest.class) {
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
