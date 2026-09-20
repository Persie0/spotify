package com.spotify.marquee.marquee.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.loc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MarqueeOptOutEvent extends AbstractC0269h implements sre0 {
    public static final int ARTIST_FIELD_NUMBER = 3;
    private static final MarqueeOptOutEvent DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 1;
    public static final int LINEITEM_ID_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private String event_ = "";
    private String reason_ = "";
    private String artist_ = "";
    private String lineitemId_ = "";

    static {
        MarqueeOptOutEvent marqueeOptOutEvent = new MarqueeOptOutEvent();
        DEFAULT_INSTANCE = marqueeOptOutEvent;
        AbstractC0269h.registerDefaultInstance(MarqueeOptOutEvent.class, marqueeOptOutEvent);
    }

    private MarqueeOptOutEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13409n(MarqueeOptOutEvent marqueeOptOutEvent, String str) {
        marqueeOptOutEvent.getClass();
        str.getClass();
        marqueeOptOutEvent.bitField0_ |= 4;
        marqueeOptOutEvent.artist_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13410o(MarqueeOptOutEvent marqueeOptOutEvent, String str) {
        marqueeOptOutEvent.getClass();
        marqueeOptOutEvent.bitField0_ |= 1;
        marqueeOptOutEvent.event_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13411p(MarqueeOptOutEvent marqueeOptOutEvent, String str) {
        marqueeOptOutEvent.getClass();
        str.getClass();
        marqueeOptOutEvent.bitField0_ |= 8;
        marqueeOptOutEvent.lineitemId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13412q(MarqueeOptOutEvent marqueeOptOutEvent, String str) {
        marqueeOptOutEvent.getClass();
        str.getClass();
        marqueeOptOutEvent.bitField0_ |= 2;
        marqueeOptOutEvent.reason_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static loc0 m13413r() {
        return (loc0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "event_", "reason_", "artist_", "lineitemId_"});
        }
        if (iOrdinal == 3) {
            return new MarqueeOptOutEvent();
        }
        if (iOrdinal == 4) {
            return new loc0(DEFAULT_INSTANCE);
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
        synchronized (MarqueeOptOutEvent.class) {
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
