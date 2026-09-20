package com.spotify.automix.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.automix.proto.TransitionOuterClass$FxStyleCurves;
import p204p.ae50;
import p204p.iiw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsAutomix$GetFxStylesForFxStyleIdResponse extends AbstractC0269h implements sre0 {
    private static final EsAutomix$GetFxStylesForFxStyleIdResponse DEFAULT_INSTANCE;
    public static final int FX_STYLES_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 fxStyles_ = AbstractC0269h.emptyProtobufList();

    static {
        EsAutomix$GetFxStylesForFxStyleIdResponse esAutomix$GetFxStylesForFxStyleIdResponse = new EsAutomix$GetFxStylesForFxStyleIdResponse();
        DEFAULT_INSTANCE = esAutomix$GetFxStylesForFxStyleIdResponse;
        AbstractC0269h.registerDefaultInstance(EsAutomix$GetFxStylesForFxStyleIdResponse.class, esAutomix$GetFxStylesForFxStyleIdResponse);
    }

    private EsAutomix$GetFxStylesForFxStyleIdResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static EsAutomix$GetFxStylesForFxStyleIdResponse m3690n() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static EsAutomix$GetFxStylesForFxStyleIdResponse m3691p(byte[] bArr) {
        return (EsAutomix$GetFxStylesForFxStyleIdResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fxStyles_", TransitionOuterClass$FxStyleCurves.class});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$GetFxStylesForFxStyleIdResponse();
        }
        if (iOrdinal == 4) {
            return new iiw(DEFAULT_INSTANCE, 7);
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
        synchronized (EsAutomix$GetFxStylesForFxStyleIdResponse.class) {
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
    public final ae50 m3692o() {
        return this.fxStyles_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
