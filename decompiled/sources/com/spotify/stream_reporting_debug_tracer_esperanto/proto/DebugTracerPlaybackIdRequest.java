package com.spotify.stream_reporting_debug_tracer_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.ppo;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rpo;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class DebugTracerPlaybackIdRequest extends AbstractC0269h implements sre0 {
    public static final int DEBUG_TRACE_POINT_FIELD_NUMBER = 1;
    private static final DebugTracerPlaybackIdRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 2;
    private int debugTracePoint_;
    private gva playbackId_ = gva.f84678b;

    static {
        DebugTracerPlaybackIdRequest debugTracerPlaybackIdRequest = new DebugTracerPlaybackIdRequest();
        DEFAULT_INSTANCE = debugTracerPlaybackIdRequest;
        AbstractC0269h.registerDefaultInstance(DebugTracerPlaybackIdRequest.class, debugTracerPlaybackIdRequest);
    }

    private DebugTracerPlaybackIdRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21618n(DebugTracerPlaybackIdRequest debugTracerPlaybackIdRequest, ppo ppoVar) {
        debugTracerPlaybackIdRequest.getClass();
        debugTracerPlaybackIdRequest.debugTracePoint_ = ppoVar.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m21619o(DebugTracerPlaybackIdRequest debugTracerPlaybackIdRequest, cva cvaVar) {
        debugTracerPlaybackIdRequest.getClass();
        debugTracerPlaybackIdRequest.playbackId_ = cvaVar;
    }

    /* JADX INFO: renamed from: p */
    public static rpo m21620p() {
        return (rpo) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"debugTracePoint_", "playbackId_"});
        }
        if (iOrdinal == 3) {
            return new DebugTracerPlaybackIdRequest();
        }
        if (iOrdinal == 4) {
            return new rpo(DEFAULT_INSTANCE);
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
        synchronized (DebugTracerPlaybackIdRequest.class) {
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
