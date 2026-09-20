package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cub;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ytb;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class CapabilityRequest extends AbstractC0269h implements sre0 {
    public static final int CAPABILITY_FIELD_NUMBER = 1;
    private static final CapabilityRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int capability_;

    static {
        CapabilityRequest capabilityRequest = new CapabilityRequest();
        DEFAULT_INSTANCE = capabilityRequest;
        AbstractC0269h.registerDefaultInstance(CapabilityRequest.class, capabilityRequest);
    }

    private CapabilityRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2609n(CapabilityRequest capabilityRequest, ytb ytbVar) {
        capabilityRequest.getClass();
        capabilityRequest.capability_ = ytbVar.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static cub m2610o() {
        return (cub) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"capability_"});
        }
        if (iOrdinal == 3) {
            return new CapabilityRequest();
        }
        if (iOrdinal == 4) {
            return new cub(DEFAULT_INSTANCE);
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
        synchronized (CapabilityRequest.class) {
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
