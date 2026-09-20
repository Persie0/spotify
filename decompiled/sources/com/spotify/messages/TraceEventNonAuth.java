package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ua81;
import p204p.va81;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class TraceEventNonAuth extends AbstractC0269h implements sre0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 5;
    private static final TraceEventNonAuth DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SEGMENT_FIELD_NUMBER = 2;
    public static final int SPANS_FIELD_NUMBER = 4;
    public static final int TRACE_ID_FIELD_NUMBER = 1;
    public static final int TRACE_KEY_FIELD_NUMBER = 3;
    private int bitField0_;
    private int segment_;
    private ihc0 attributes_ = ihc0.f102235b;
    private String traceId_ = "";
    private String traceKey_ = "";
    private gva spans_ = gva.f84678b;

    static {
        TraceEventNonAuth traceEventNonAuth = new TraceEventNonAuth();
        DEFAULT_INSTANCE = traceEventNonAuth;
        AbstractC0269h.registerDefaultInstance(TraceEventNonAuth.class, traceEventNonAuth);
    }

    private TraceEventNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m14479n(TraceEventNonAuth traceEventNonAuth) {
        ihc0 ihc0Var = traceEventNonAuth.attributes_;
        if (!ihc0Var.f102236a) {
            traceEventNonAuth.attributes_ = ihc0Var.m50613h();
        }
        return traceEventNonAuth.attributes_;
    }

    /* JADX INFO: renamed from: o */
    public static void m14480o(TraceEventNonAuth traceEventNonAuth, int i) {
        traceEventNonAuth.bitField0_ |= 2;
        traceEventNonAuth.segment_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m14481p(TraceEventNonAuth traceEventNonAuth, gva gvaVar) {
        traceEventNonAuth.getClass();
        gvaVar.getClass();
        traceEventNonAuth.bitField0_ |= 8;
        traceEventNonAuth.spans_ = gvaVar;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14482q(TraceEventNonAuth traceEventNonAuth, String str) {
        traceEventNonAuth.getClass();
        str.getClass();
        traceEventNonAuth.bitField0_ |= 1;
        traceEventNonAuth.traceId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14483r(TraceEventNonAuth traceEventNonAuth, String str) {
        traceEventNonAuth.getClass();
        str.getClass();
        traceEventNonAuth.bitField0_ |= 4;
        traceEventNonAuth.traceKey_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static va81 m14484s() {
        return (va81) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ည\u0003\u00052", new Object[]{"bitField0_", "traceId_", "segment_", "traceKey_", "spans_", "attributes_", ua81.f228430a});
        }
        if (iOrdinal == 3) {
            return new TraceEventNonAuth();
        }
        if (iOrdinal == 4) {
            return new va81(DEFAULT_INSTANCE);
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
        synchronized (TraceEventNonAuth.class) {
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
