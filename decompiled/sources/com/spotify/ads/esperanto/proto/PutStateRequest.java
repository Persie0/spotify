package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.egt0;
import p204p.fgt0;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class PutStateRequest extends AbstractC0269h implements sre0 {
    private static final PutStateRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    private ihc0 state_ = ihc0.f102235b;

    static {
        PutStateRequest putStateRequest = new PutStateRequest();
        DEFAULT_INSTANCE = putStateRequest;
        AbstractC0269h.registerDefaultInstance(PutStateRequest.class, putStateRequest);
    }

    private PutStateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m2686n(PutStateRequest putStateRequest) {
        ihc0 ihc0Var = putStateRequest.state_;
        if (!ihc0Var.f102236a) {
            putStateRequest.state_ = ihc0Var.m50613h();
        }
        return putStateRequest.state_;
    }

    /* JADX INFO: renamed from: o */
    public static egt0 m2687o() {
        return (egt0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"state_", fgt0.f69398a});
        }
        if (iOrdinal == 3) {
            return new PutStateRequest();
        }
        if (iOrdinal == 4) {
            return new egt0(DEFAULT_INSTANCE);
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
        synchronized (PutStateRequest.class) {
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
