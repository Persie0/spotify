package com.spotify.canvaslogger.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.csb;
import p204p.dsb;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CanvasLoad extends AbstractC0269h implements sre0 {
    public static final int CANVAS_ID_FIELD_NUMBER = 1;
    private static final CanvasLoad DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    public static final int EVENT_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 4;
    private int bitField0_;
    private ihc0 metadata_ = ihc0.f102235b;
    private String canvasId_ = "";
    private String entityUri_ = "";
    private String event_ = "";
    private String source_ = "";

    static {
        CanvasLoad canvasLoad = new CanvasLoad();
        DEFAULT_INSTANCE = canvasLoad;
        AbstractC0269h.registerDefaultInstance(CanvasLoad.class, canvasLoad);
    }

    private CanvasLoad() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m5520n(CanvasLoad canvasLoad) {
        ihc0 ihc0Var = canvasLoad.metadata_;
        if (!ihc0Var.f102236a) {
            canvasLoad.metadata_ = ihc0Var.m50613h();
        }
        return canvasLoad.metadata_;
    }

    /* JADX INFO: renamed from: o */
    public static void m5521o(CanvasLoad canvasLoad, String str) {
        canvasLoad.getClass();
        str.getClass();
        canvasLoad.bitField0_ |= 1;
        canvasLoad.canvasId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m5522p(CanvasLoad canvasLoad, String str) {
        canvasLoad.getClass();
        str.getClass();
        canvasLoad.bitField0_ |= 2;
        canvasLoad.entityUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m5523q(CanvasLoad canvasLoad, String str) {
        canvasLoad.getClass();
        canvasLoad.bitField0_ |= 4;
        canvasLoad.event_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m5524r(CanvasLoad canvasLoad) {
        canvasLoad.getClass();
        canvasLoad.bitField0_ |= 8;
        canvasLoad.source_ = "NPV";
    }

    /* JADX INFO: renamed from: s */
    public static csb m5525s() {
        return (csb) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u00052", new Object[]{"bitField0_", "canvasId_", "entityUri_", "event_", "source_", "metadata_", dsb.f52527a});
        }
        if (iOrdinal == 3) {
            return new CanvasLoad();
        }
        if (iOrdinal == 4) {
            return new csb(DEFAULT_INSTANCE);
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
        synchronized (CanvasLoad.class) {
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
