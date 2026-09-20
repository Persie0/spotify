package com.spotify.connectivity.product_state.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.kgt0;
import p204p.lgt0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PutValuesSyncRequest extends AbstractC0269h implements sre0 {
    private static final PutValuesSyncRequest DEFAULT_INSTANCE;
    public static final int PAIRS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ihc0 pairs_ = ihc0.f102235b;

    static {
        PutValuesSyncRequest putValuesSyncRequest = new PutValuesSyncRequest();
        DEFAULT_INSTANCE = putValuesSyncRequest;
        AbstractC0269h.registerDefaultInstance(PutValuesSyncRequest.class, putValuesSyncRequest);
    }

    private PutValuesSyncRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m7527n(PutValuesSyncRequest putValuesSyncRequest) {
        ihc0 ihc0Var = putValuesSyncRequest.pairs_;
        if (!ihc0Var.f102236a) {
            putValuesSyncRequest.pairs_ = ihc0Var.m50613h();
        }
        return putValuesSyncRequest.pairs_;
    }

    /* JADX INFO: renamed from: o */
    public static kgt0 m7528o() {
        return (kgt0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"pairs_", lgt0.f133283a});
        }
        if (iOrdinal == 3) {
            return new PutValuesSyncRequest();
        }
        if (iOrdinal == 4) {
            return new kgt0(DEFAULT_INSTANCE);
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
        synchronized (PutValuesSyncRequest.class) {
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
