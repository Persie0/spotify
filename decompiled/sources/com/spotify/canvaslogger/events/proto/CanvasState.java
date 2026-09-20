package com.spotify.canvaslogger.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.msb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CanvasState extends AbstractC0269h implements sre0 {
    public static final int APP_FOCUS_STATE_FIELD_NUMBER = 6;
    public static final int AUDIO_STATE_FIELD_NUMBER = 7;
    public static final int CANVAS_ID_FIELD_NUMBER = 1;
    private static final CanvasState DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    public static final int LOAD_STATE_FIELD_NUMBER = 5;
    public static final int PAGE_SOURCE_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int TRACK_TIME_FIELD_NUMBER = 4;
    public static final int VISUAL_STATE_FIELD_NUMBER = 8;
    private int bitField0_;
    private double trackTime_;
    private String canvasId_ = "";
    private String entityUri_ = "";
    private gva playbackId_ = gva.f84678b;
    private String loadState_ = "";
    private String appFocusState_ = "";
    private String audioState_ = "";
    private String visualState_ = "";
    private String pageSource_ = "";

    static {
        CanvasState canvasState = new CanvasState();
        DEFAULT_INSTANCE = canvasState;
        AbstractC0269h.registerDefaultInstance(CanvasState.class, canvasState);
    }

    private CanvasState() {
    }

    /* JADX INFO: renamed from: n */
    public static void m5526n(CanvasState canvasState) {
        canvasState.getClass();
        canvasState.bitField0_ |= 32;
        canvasState.appFocusState_ = "foreground";
    }

    /* JADX INFO: renamed from: o */
    public static void m5527o(CanvasState canvasState, String str) {
        canvasState.getClass();
        canvasState.bitField0_ |= 64;
        canvasState.audioState_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m5528p(CanvasState canvasState, String str) {
        canvasState.getClass();
        canvasState.bitField0_ |= 1;
        canvasState.canvasId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m5529q(CanvasState canvasState, String str) {
        canvasState.getClass();
        str.getClass();
        canvasState.bitField0_ |= 2;
        canvasState.entityUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m5530r(CanvasState canvasState, String str) {
        canvasState.getClass();
        canvasState.bitField0_ |= 16;
        canvasState.loadState_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m5531s(CanvasState canvasState) {
        canvasState.getClass();
        canvasState.bitField0_ |= 256;
        canvasState.pageSource_ = "spotify:app:canvas";
    }

    /* JADX INFO: renamed from: t */
    public static void m5532t(CanvasState canvasState, cva cvaVar) {
        canvasState.getClass();
        canvasState.bitField0_ |= 4;
        canvasState.playbackId_ = cvaVar;
    }

    /* JADX INFO: renamed from: u */
    public static void m5533u(CanvasState canvasState, double d) {
        canvasState.bitField0_ |= 8;
        canvasState.trackTime_ = d;
    }

    /* JADX INFO: renamed from: v */
    public static void m5534v(CanvasState canvasState) {
        canvasState.getClass();
        canvasState.bitField0_ |= 128;
        canvasState.visualState_ = "visible_full";
    }

    /* JADX INFO: renamed from: w */
    public static msb m5535w() {
        return (msb) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004က\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\nဈ\b", new Object[]{"bitField0_", "canvasId_", "entityUri_", "playbackId_", "trackTime_", "loadState_", "appFocusState_", "audioState_", "visualState_", "pageSource_"});
        }
        if (iOrdinal == 3) {
            return new CanvasState();
        }
        if (iOrdinal == 4) {
            return new msb(DEFAULT_INSTANCE);
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
        synchronized (CanvasState.class) {
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
