package com.spotify.marquee.marquee.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.src0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MarqueeUserHoldoutEvent extends AbstractC0269h implements sre0 {
    public static final int ASSIGNMENT_METHODS_FIELD_NUMBER = 4;
    public static final int CONTENT_URI_FIELD_NUMBER = 3;
    private static final MarqueeUserHoldoutEvent DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 1;
    public static final int FLIGHT_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String event_ = "";
    private String flightId_ = "";
    private String contentUri_ = "";
    private ae50 assignmentMethods_ = AbstractC0269h.emptyProtobufList();

    static {
        MarqueeUserHoldoutEvent marqueeUserHoldoutEvent = new MarqueeUserHoldoutEvent();
        DEFAULT_INSTANCE = marqueeUserHoldoutEvent;
        AbstractC0269h.registerDefaultInstance(MarqueeUserHoldoutEvent.class, marqueeUserHoldoutEvent);
    }

    private MarqueeUserHoldoutEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13414n(MarqueeUserHoldoutEvent marqueeUserHoldoutEvent, List list) {
        ae50 ae50Var = marqueeUserHoldoutEvent.assignmentMethods_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            marqueeUserHoldoutEvent.assignmentMethods_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, marqueeUserHoldoutEvent.assignmentMethods_);
    }

    /* JADX INFO: renamed from: o */
    public static void m13415o(MarqueeUserHoldoutEvent marqueeUserHoldoutEvent, String str) {
        marqueeUserHoldoutEvent.getClass();
        str.getClass();
        marqueeUserHoldoutEvent.bitField0_ |= 4;
        marqueeUserHoldoutEvent.contentUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13416p(MarqueeUserHoldoutEvent marqueeUserHoldoutEvent, String str) {
        marqueeUserHoldoutEvent.getClass();
        marqueeUserHoldoutEvent.bitField0_ |= 1;
        marqueeUserHoldoutEvent.event_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13417q(MarqueeUserHoldoutEvent marqueeUserHoldoutEvent, String str) {
        marqueeUserHoldoutEvent.getClass();
        str.getClass();
        marqueeUserHoldoutEvent.bitField0_ |= 2;
        marqueeUserHoldoutEvent.flightId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static src0 m13418r() {
        return (src0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a", new Object[]{"bitField0_", "event_", "flightId_", "contentUri_", "assignmentMethods_"});
        }
        if (iOrdinal == 3) {
            return new MarqueeUserHoldoutEvent();
        }
        if (iOrdinal == 4) {
            return new src0(DEFAULT_INSTANCE);
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
        synchronized (MarqueeUserHoldoutEvent.class) {
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
