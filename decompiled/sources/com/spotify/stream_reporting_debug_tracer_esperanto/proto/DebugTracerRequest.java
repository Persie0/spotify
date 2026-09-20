package com.spotify.stream_reporting_debug_tracer_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.ppo;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.spo;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class DebugTracerRequest extends AbstractC0269h implements sre0 {
    public static final int DEBUG_TRACE_POINT_FIELD_NUMBER = 1;
    private static final DebugTracerRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 2;
    public static final int RAW_STREAM_HANDLE_FIELD_NUMBER = 3;
    private int debugTracePoint_;
    private gva playbackId_ = gva.f84678b;
    private int rawStreamHandle_;

    static {
        DebugTracerRequest debugTracerRequest = new DebugTracerRequest();
        DEFAULT_INSTANCE = debugTracerRequest;
        AbstractC0269h.registerDefaultInstance(DebugTracerRequest.class, debugTracerRequest);
    }

    private DebugTracerRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21621n(DebugTracerRequest debugTracerRequest, ppo ppoVar) {
        debugTracerRequest.getClass();
        debugTracerRequest.debugTracePoint_ = ppoVar.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m21622o(DebugTracerRequest debugTracerRequest, cva cvaVar) {
        debugTracerRequest.getClass();
        debugTracerRequest.playbackId_ = cvaVar;
    }

    /* JADX INFO: renamed from: p */
    public static void m21623p(DebugTracerRequest debugTracerRequest, int i) {
        debugTracerRequest.rawStreamHandle_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static spo m21624q() {
        return (spo) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\n\u0003\u000b", new Object[]{"debugTracePoint_", "playbackId_", "rawStreamHandle_"});
        }
        if (iOrdinal == 3) {
            return new DebugTracerRequest();
        }
        if (iOrdinal == 4) {
            return new spo(DEFAULT_INSTANCE);
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
        synchronized (DebugTracerRequest.class) {
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
