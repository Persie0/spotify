package com.spotify.puffin_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x8t0;
import p204p.z110;
import p204p.z8t0;

/* JADX INFO: loaded from: classes10.dex */
public final class PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest extends AbstractC0269h implements sre0 {
    private static final PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_;

    static {
        PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest puffinFilterRequestOuterClass$PuffinDisableProcessingRequest = new PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest();
        DEFAULT_INSTANCE = puffinFilterRequestOuterClass$PuffinDisableProcessingRequest;
        AbstractC0269h.registerDefaultInstance(PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest.class, puffinFilterRequestOuterClass$PuffinDisableProcessingRequest);
    }

    private PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20007n(PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest puffinFilterRequestOuterClass$PuffinDisableProcessingRequest, z8t0 z8t0Var) {
        puffinFilterRequestOuterClass$PuffinDisableProcessingRequest.getClass();
        puffinFilterRequestOuterClass$PuffinDisableProcessingRequest.reason_ = z8t0Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static x8t0 m20008o() {
        return (x8t0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"reason_"});
        }
        if (iOrdinal == 3) {
            return new PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest();
        }
        if (iOrdinal == 4) {
            return new x8t0(DEFAULT_INSTANCE);
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
        synchronized (PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest.class) {
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
