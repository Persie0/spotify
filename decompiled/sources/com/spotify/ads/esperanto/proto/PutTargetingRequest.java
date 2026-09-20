package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ggt0;
import p204p.hgt0;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class PutTargetingRequest extends AbstractC0269h implements sre0 {
    private static final PutTargetingRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TARGETING_MAP_FIELD_NUMBER = 1;
    private ihc0 targetingMap_ = ihc0.f102235b;

    static {
        PutTargetingRequest putTargetingRequest = new PutTargetingRequest();
        DEFAULT_INSTANCE = putTargetingRequest;
        AbstractC0269h.registerDefaultInstance(PutTargetingRequest.class, putTargetingRequest);
    }

    private PutTargetingRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m2688n(PutTargetingRequest putTargetingRequest) {
        ihc0 ihc0Var = putTargetingRequest.targetingMap_;
        if (!ihc0Var.f102236a) {
            putTargetingRequest.targetingMap_ = ihc0Var.m50613h();
        }
        return putTargetingRequest.targetingMap_;
    }

    /* JADX INFO: renamed from: o */
    public static ggt0 m2689o() {
        return (ggt0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"targetingMap_", hgt0.f91201a});
        }
        if (iOrdinal == 3) {
            return new PutTargetingRequest();
        }
        if (iOrdinal == 4) {
            return new ggt0(DEFAULT_INSTANCE);
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
        synchronized (PutTargetingRequest.class) {
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
