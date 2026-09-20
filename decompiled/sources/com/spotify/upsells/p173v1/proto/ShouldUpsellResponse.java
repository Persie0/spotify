package com.spotify.upsells.p173v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fi11;
import p204p.iia1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ShouldUpsellResponse extends AbstractC0269h implements sre0 {
    private static final ShouldUpsellResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;

    static {
        ShouldUpsellResponse shouldUpsellResponse = new ShouldUpsellResponse();
        DEFAULT_INSTANCE = shouldUpsellResponse;
        AbstractC0269h.registerDefaultInstance(ShouldUpsellResponse.class, shouldUpsellResponse);
    }

    private ShouldUpsellResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static ShouldUpsellResponse m22079n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"result_"});
        }
        if (iOrdinal == 3) {
            return new ShouldUpsellResponse();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 2);
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
        synchronized (ShouldUpsellResponse.class) {
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
    public final iia1 m22080o() {
        iia1 iia1Var;
        int i = this.result_;
        if (i == 0) {
            iia1Var = iia1.UPSELL_RESULT_UNSPECIFIED;
        } else if (i != 1) {
            iia1Var = i != 2 ? null : iia1.UPSELL_RESULT_NO_UPSELL;
        } else {
            iia1Var = iia1.UPSELL_RESULT_HAS_UPSELL;
        }
        return iia1Var == null ? iia1.UNRECOGNIZED : iia1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
