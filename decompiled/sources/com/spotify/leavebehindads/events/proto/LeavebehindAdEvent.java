package com.spotify.leavebehindads.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q180;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class LeavebehindAdEvent extends AbstractC0269h implements sre0 {
    private static final LeavebehindAdEvent DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 3;
    public static final int EVENT_REASON_FIELD_NUMBER = 4;
    public static final int LEAVEBEHIND_LINEITEM_ID_FIELD_NUMBER = 1;
    public static final int LEAVEBEHIND_REQUEST_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SURFACE_FIELD_NUMBER = 5;
    public static final int SURFACE_POSITION_FIELD_NUMBER = 7;
    public static final int URI_FIELD_NUMBER = 6;
    private int bitField0_;
    private int surfacePosition_;
    private String leavebehindLineitemId_ = "";
    private String leavebehindRequestId_ = "";
    private String event_ = "";
    private String eventReason_ = "";
    private String surface_ = "";
    private String uri_ = "";

    static {
        LeavebehindAdEvent leavebehindAdEvent = new LeavebehindAdEvent();
        DEFAULT_INSTANCE = leavebehindAdEvent;
        AbstractC0269h.registerDefaultInstance(LeavebehindAdEvent.class, leavebehindAdEvent);
    }

    private LeavebehindAdEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12543n(LeavebehindAdEvent leavebehindAdEvent, String str) {
        leavebehindAdEvent.getClass();
        str.getClass();
        leavebehindAdEvent.bitField0_ |= 4;
        leavebehindAdEvent.event_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12544o(LeavebehindAdEvent leavebehindAdEvent, String str) {
        leavebehindAdEvent.getClass();
        str.getClass();
        leavebehindAdEvent.bitField0_ |= 8;
        leavebehindAdEvent.eventReason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12545p(LeavebehindAdEvent leavebehindAdEvent, String str) {
        leavebehindAdEvent.getClass();
        str.getClass();
        leavebehindAdEvent.bitField0_ |= 1;
        leavebehindAdEvent.leavebehindLineitemId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12546q(LeavebehindAdEvent leavebehindAdEvent, String str) {
        leavebehindAdEvent.getClass();
        str.getClass();
        leavebehindAdEvent.bitField0_ |= 2;
        leavebehindAdEvent.leavebehindRequestId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12547r(LeavebehindAdEvent leavebehindAdEvent, String str) {
        leavebehindAdEvent.getClass();
        str.getClass();
        leavebehindAdEvent.bitField0_ |= 16;
        leavebehindAdEvent.surface_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m12548s(LeavebehindAdEvent leavebehindAdEvent, int i) {
        leavebehindAdEvent.bitField0_ |= 64;
        leavebehindAdEvent.surfacePosition_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m12549t(LeavebehindAdEvent leavebehindAdEvent, String str) {
        leavebehindAdEvent.getClass();
        str.getClass();
        leavebehindAdEvent.bitField0_ |= 32;
        leavebehindAdEvent.uri_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static q180 m12550u() {
        return (q180) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006", new Object[]{"bitField0_", "leavebehindLineitemId_", "leavebehindRequestId_", "event_", "eventReason_", "surface_", "uri_", "surfacePosition_"});
        }
        if (iOrdinal == 3) {
            return new LeavebehindAdEvent();
        }
        if (iOrdinal == 4) {
            return new q180(DEFAULT_INSTANCE);
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
        synchronized (LeavebehindAdEvent.class) {
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
