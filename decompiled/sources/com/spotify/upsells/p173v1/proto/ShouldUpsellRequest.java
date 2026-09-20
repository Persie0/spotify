package com.spotify.upsells.p173v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pj11;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ShouldUpsellRequest extends AbstractC0269h implements sre0 {
    private static final ShouldUpsellRequest DEFAULT_INSTANCE;
    public static final int GATED_FEATURE_CONTEXT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private GatedFeatureContext gatedFeatureContext_;

    static {
        ShouldUpsellRequest shouldUpsellRequest = new ShouldUpsellRequest();
        DEFAULT_INSTANCE = shouldUpsellRequest;
        AbstractC0269h.registerDefaultInstance(ShouldUpsellRequest.class, shouldUpsellRequest);
    }

    private ShouldUpsellRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22076n(ShouldUpsellRequest shouldUpsellRequest, GatedFeatureContext gatedFeatureContext) {
        shouldUpsellRequest.getClass();
        gatedFeatureContext.getClass();
        shouldUpsellRequest.gatedFeatureContext_ = gatedFeatureContext;
        shouldUpsellRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static pj11 m22078p() {
        return (pj11) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "gatedFeatureContext_"});
        }
        if (iOrdinal == 3) {
            return new ShouldUpsellRequest();
        }
        if (iOrdinal == 4) {
            return new pj11();
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
        synchronized (ShouldUpsellRequest.class) {
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
