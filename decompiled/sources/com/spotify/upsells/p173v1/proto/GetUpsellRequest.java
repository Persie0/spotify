package com.spotify.upsells.p173v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ic10;
import p204p.n350;
import p204p.on3;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.w5r;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class GetUpsellRequest extends AbstractC0269h implements sre0 {
    private static final GetUpsellRequest DEFAULT_INSTANCE;
    public static final int DEVICE_CAPABILITIES_FIELD_NUMBER = 3;
    public static final int GATED_FEATURE_CONTEXT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private static final vd50 deviceCapabilities_converter_ = new on3(13);
    private int bitField0_;
    private int deviceCapabilitiesMemoizedSerializedSize;
    private ud50 deviceCapabilities_ = AbstractC0269h.emptyIntList();
    private GatedFeatureContext gatedFeatureContext_;

    static {
        GetUpsellRequest getUpsellRequest = new GetUpsellRequest();
        DEFAULT_INSTANCE = getUpsellRequest;
        AbstractC0269h.registerDefaultInstance(GetUpsellRequest.class, getUpsellRequest);
    }

    private GetUpsellRequest() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m22064n(GetUpsellRequest getUpsellRequest, w5r w5rVar) {
        getUpsellRequest.getClass();
        w5rVar.getClass();
        ud50 ud50Var = getUpsellRequest.deviceCapabilities_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            getUpsellRequest.deviceCapabilities_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) getUpsellRequest.deviceCapabilities_).m63581b(w5rVar.getNumber());
    }

    /* JADX INFO: renamed from: o */
    public static void m22065o(GetUpsellRequest getUpsellRequest, GatedFeatureContext gatedFeatureContext) {
        getUpsellRequest.getClass();
        gatedFeatureContext.getClass();
        getUpsellRequest.gatedFeatureContext_ = gatedFeatureContext;
        getUpsellRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ic10 m22067q() {
        return (ic10) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0003,", new Object[]{"bitField0_", "gatedFeatureContext_", "deviceCapabilities_"});
        }
        if (iOrdinal == 3) {
            return new GetUpsellRequest();
        }
        if (iOrdinal == 4) {
            return new ic10();
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
        synchronized (GetUpsellRequest.class) {
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
