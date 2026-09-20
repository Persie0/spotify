package com.spotify.rcs.resolver.grpc.p141v0.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.i8w0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Resolve$ResolveResponse extends AbstractC0269h implements sre0 {
    public static final int CONFIGURATION_FIELD_NUMBER = 1;
    private static final Resolve$ResolveResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Resolve$Configuration configuration_;

    static {
        Resolve$ResolveResponse resolve$ResolveResponse = new Resolve$ResolveResponse();
        DEFAULT_INSTANCE = resolve$ResolveResponse;
        AbstractC0269h.registerDefaultInstance(Resolve$ResolveResponse.class, resolve$ResolveResponse);
    }

    private Resolve$ResolveResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static Resolve$ResolveResponse m20175p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "configuration_"});
        }
        if (iOrdinal == 3) {
            return new Resolve$ResolveResponse();
        }
        if (iOrdinal == 4) {
            return new i8w0(14);
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
        synchronized (Resolve$ResolveResponse.class) {
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
    public final Resolve$Configuration m20176o() {
        Resolve$Configuration resolve$Configuration = this.configuration_;
        return resolve$Configuration == null ? Resolve$Configuration.m20157o() : resolve$Configuration;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
