package com.spotify.connectivity.product_state.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.igt0;
import p204p.ihc0;
import p204p.jgt0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class PutValuesRequest extends AbstractC0269h implements sre0 {
    private static final PutValuesRequest DEFAULT_INSTANCE;
    public static final int PAIRS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ihc0 pairs_ = ihc0.f102235b;

    static {
        PutValuesRequest putValuesRequest = new PutValuesRequest();
        DEFAULT_INSTANCE = putValuesRequest;
        AbstractC0269h.registerDefaultInstance(PutValuesRequest.class, putValuesRequest);
    }

    private PutValuesRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m7523n(PutValuesRequest putValuesRequest) {
        ihc0 ihc0Var = putValuesRequest.pairs_;
        if (!ihc0Var.f102236a) {
            putValuesRequest.pairs_ = ihc0Var.m50613h();
        }
        return putValuesRequest.pairs_;
    }

    /* JADX INFO: renamed from: o */
    public static igt0 m7524o() {
        return (igt0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"pairs_", jgt0.f112262a});
        }
        if (iOrdinal == 3) {
            return new PutValuesRequest();
        }
        if (iOrdinal == 4) {
            return new igt0(DEFAULT_INSTANCE);
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
        synchronized (PutValuesRequest.class) {
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
