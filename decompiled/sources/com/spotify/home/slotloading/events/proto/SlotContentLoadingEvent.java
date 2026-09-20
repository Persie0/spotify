package com.spotify.home.slotloading.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ct21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SlotContentLoadingEvent extends AbstractC0269h implements sre0 {
    public static final int CACHE_HIT_FIELD_NUMBER = 5;
    private static final SlotContentLoadingEvent DEFAULT_INSTANCE;
    public static final int FEED_ID_FIELD_NUMBER = 1;
    public static final int IS_OFFLINE_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SLOT_RESPONSE_ID_FIELD_NUMBER = 3;
    public static final int SLOT_TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean cacheHit_;
    private boolean isOffline_;
    private String feedId_ = "";
    private String slotResponseId_ = "";
    private String slotType_ = "";

    static {
        SlotContentLoadingEvent slotContentLoadingEvent = new SlotContentLoadingEvent();
        DEFAULT_INSTANCE = slotContentLoadingEvent;
        AbstractC0269h.registerDefaultInstance(SlotContentLoadingEvent.class, slotContentLoadingEvent);
    }

    private SlotContentLoadingEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11828n(SlotContentLoadingEvent slotContentLoadingEvent, boolean z) {
        slotContentLoadingEvent.bitField0_ |= 8;
        slotContentLoadingEvent.cacheHit_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m11829o(SlotContentLoadingEvent slotContentLoadingEvent, String str) {
        slotContentLoadingEvent.getClass();
        str.getClass();
        slotContentLoadingEvent.bitField0_ |= 1;
        slotContentLoadingEvent.feedId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m11830p(SlotContentLoadingEvent slotContentLoadingEvent, boolean z) {
        slotContentLoadingEvent.bitField0_ |= 16;
        slotContentLoadingEvent.isOffline_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m11831q(SlotContentLoadingEvent slotContentLoadingEvent, String str) {
        slotContentLoadingEvent.getClass();
        str.getClass();
        slotContentLoadingEvent.bitField0_ |= 2;
        slotContentLoadingEvent.slotResponseId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m11832r(SlotContentLoadingEvent slotContentLoadingEvent, String str) {
        slotContentLoadingEvent.getClass();
        str.getClass();
        slotContentLoadingEvent.bitField0_ |= 4;
        slotContentLoadingEvent.slotType_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static ct21 m11833s() {
        return (ct21) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "feedId_", "slotResponseId_", "slotType_", "cacheHit_", "isOffline_"});
        }
        if (iOrdinal == 3) {
            return new SlotContentLoadingEvent();
        }
        if (iOrdinal == 4) {
            return new ct21(DEFAULT_INSTANCE);
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
        synchronized (SlotContentLoadingEvent.class) {
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
