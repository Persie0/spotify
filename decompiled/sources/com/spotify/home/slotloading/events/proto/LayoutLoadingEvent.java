package com.spotify.home.slotloading.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.xo70;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class LayoutLoadingEvent extends AbstractC0269h implements sre0 {
    public static final int CACHE_HIT_FIELD_NUMBER = 4;
    private static final LayoutLoadingEvent DEFAULT_INSTANCE;
    public static final int FEED_ID_FIELD_NUMBER = 1;
    public static final int IS_BACKGROUND_FIELD_NUMBER = 6;
    public static final int IS_OFFLINE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SLOT_TYPES_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean cacheHit_;
    private boolean isBackground_;
    private boolean isOffline_;
    private String feedId_ = "";
    private ud50 slotTypes_ = AbstractC0269h.emptyIntList();

    static {
        LayoutLoadingEvent layoutLoadingEvent = new LayoutLoadingEvent();
        DEFAULT_INSTANCE = layoutLoadingEvent;
        AbstractC0269h.registerDefaultInstance(LayoutLoadingEvent.class, layoutLoadingEvent);
    }

    private LayoutLoadingEvent() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m11816n(LayoutLoadingEvent layoutLoadingEvent, ArrayList arrayList) {
        ud50 ud50Var = layoutLoadingEvent.slotTypes_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            layoutLoadingEvent.slotTypes_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        AbstractC2118m8.addAll(arrayList, layoutLoadingEvent.slotTypes_);
    }

    /* JADX INFO: renamed from: o */
    public static void m11817o(LayoutLoadingEvent layoutLoadingEvent, boolean z) {
        layoutLoadingEvent.bitField0_ |= 2;
        layoutLoadingEvent.cacheHit_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m11818p(LayoutLoadingEvent layoutLoadingEvent, String str) {
        layoutLoadingEvent.getClass();
        layoutLoadingEvent.bitField0_ |= 1;
        layoutLoadingEvent.feedId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m11819q(LayoutLoadingEvent layoutLoadingEvent, boolean z) {
        layoutLoadingEvent.bitField0_ |= 8;
        layoutLoadingEvent.isBackground_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m11820r(LayoutLoadingEvent layoutLoadingEvent, boolean z) {
        layoutLoadingEvent.bitField0_ |= 4;
        layoutLoadingEvent.isOffline_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static xo70 m11821s() {
        return (xo70) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u0016\u0004ဇ\u0001\u0005ဇ\u0002\u0006ဇ\u0003", new Object[]{"bitField0_", "feedId_", "slotTypes_", "cacheHit_", "isOffline_", "isBackground_"});
        }
        if (iOrdinal == 3) {
            return new LayoutLoadingEvent();
        }
        if (iOrdinal == 4) {
            return new xo70(DEFAULT_INSTANCE);
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
        synchronized (LayoutLoadingEvent.class) {
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
