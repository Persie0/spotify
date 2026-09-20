package com.spotify.atv_remote.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wr6;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AtvRemoteServiceOuterClass$AtvSubmitPinRequest extends AbstractC0269h implements sre0 {
    private static final AtvRemoteServiceOuterClass$AtvSubmitPinRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PIN_FIELD_NUMBER = 1;
    private int pin_;

    static {
        AtvRemoteServiceOuterClass$AtvSubmitPinRequest atvRemoteServiceOuterClass$AtvSubmitPinRequest = new AtvRemoteServiceOuterClass$AtvSubmitPinRequest();
        DEFAULT_INSTANCE = atvRemoteServiceOuterClass$AtvSubmitPinRequest;
        AbstractC0269h.registerDefaultInstance(AtvRemoteServiceOuterClass$AtvSubmitPinRequest.class, atvRemoteServiceOuterClass$AtvSubmitPinRequest);
    }

    private AtvRemoteServiceOuterClass$AtvSubmitPinRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3366n(AtvRemoteServiceOuterClass$AtvSubmitPinRequest atvRemoteServiceOuterClass$AtvSubmitPinRequest, int i) {
        atvRemoteServiceOuterClass$AtvSubmitPinRequest.pin_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static wr6 m3367o() {
        return (wr6) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"pin_"});
        }
        if (iOrdinal == 3) {
            return new AtvRemoteServiceOuterClass$AtvSubmitPinRequest();
        }
        if (iOrdinal == 4) {
            return new wr6(DEFAULT_INSTANCE);
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
        synchronized (AtvRemoteServiceOuterClass$AtvSubmitPinRequest.class) {
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
