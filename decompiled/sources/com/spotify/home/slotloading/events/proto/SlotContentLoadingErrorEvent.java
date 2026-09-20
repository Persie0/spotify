package com.spotify.home.slotloading.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bt21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SlotContentLoadingErrorEvent extends AbstractC0269h implements sre0 {
    private static final SlotContentLoadingErrorEvent DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 5;
    public static final int FEED_ID_FIELD_NUMBER = 1;
    public static final int HTTP_STATUS_CODE_FIELD_NUMBER = 4;
    public static final int IS_OFFLINE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SLOT_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int httpStatusCode_;
    private boolean isOffline_;
    private String feedId_ = "";
    private String slotType_ = "";
    private String errorMessage_ = "";

    static {
        SlotContentLoadingErrorEvent slotContentLoadingErrorEvent = new SlotContentLoadingErrorEvent();
        DEFAULT_INSTANCE = slotContentLoadingErrorEvent;
        AbstractC0269h.registerDefaultInstance(SlotContentLoadingErrorEvent.class, slotContentLoadingErrorEvent);
    }

    private SlotContentLoadingErrorEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11822n(SlotContentLoadingErrorEvent slotContentLoadingErrorEvent, String str) {
        slotContentLoadingErrorEvent.getClass();
        str.getClass();
        slotContentLoadingErrorEvent.bitField0_ |= 16;
        slotContentLoadingErrorEvent.errorMessage_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m11823o(SlotContentLoadingErrorEvent slotContentLoadingErrorEvent, String str) {
        slotContentLoadingErrorEvent.getClass();
        str.getClass();
        slotContentLoadingErrorEvent.bitField0_ |= 1;
        slotContentLoadingErrorEvent.feedId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m11824p(SlotContentLoadingErrorEvent slotContentLoadingErrorEvent, int i) {
        slotContentLoadingErrorEvent.bitField0_ |= 8;
        slotContentLoadingErrorEvent.httpStatusCode_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m11825q(SlotContentLoadingErrorEvent slotContentLoadingErrorEvent, boolean z) {
        slotContentLoadingErrorEvent.bitField0_ |= 4;
        slotContentLoadingErrorEvent.isOffline_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m11826r(SlotContentLoadingErrorEvent slotContentLoadingErrorEvent, String str) {
        slotContentLoadingErrorEvent.getClass();
        str.getClass();
        slotContentLoadingErrorEvent.bitField0_ |= 2;
        slotContentLoadingErrorEvent.slotType_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static bt21 m11827s() {
        return (bt21) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "feedId_", "slotType_", "isOffline_", "httpStatusCode_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new SlotContentLoadingErrorEvent();
        }
        if (iOrdinal == 4) {
            return new bt21(DEFAULT_INSTANCE);
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
        synchronized (SlotContentLoadingErrorEvent.class) {
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
