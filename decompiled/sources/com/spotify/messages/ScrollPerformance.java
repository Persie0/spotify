package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.mly0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ScrollPerformance extends AbstractC0269h implements sre0 {
    public static final int CONTAINER_ID_FIELD_NUMBER = 1;
    private static final ScrollPerformance DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    public static final int ENTITY_URI_FIELD_NUMBER = 5;
    public static final int LARGE_FRAME_DROPS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SMALL_FRAME_DROPS_FIELD_NUMBER = 3;
    private int bitField0_;
    private int duration_;
    private long largeFrameDrops_;
    private long smallFrameDrops_;
    private String containerId_ = "";
    private String entityUri_ = "";

    static {
        ScrollPerformance scrollPerformance = new ScrollPerformance();
        DEFAULT_INSTANCE = scrollPerformance;
        AbstractC0269h.registerDefaultInstance(ScrollPerformance.class, scrollPerformance);
    }

    private ScrollPerformance() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14418n(ScrollPerformance scrollPerformance, String str) {
        scrollPerformance.getClass();
        str.getClass();
        scrollPerformance.bitField0_ |= 1;
        scrollPerformance.containerId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14419o(ScrollPerformance scrollPerformance, int i) {
        scrollPerformance.bitField0_ |= 2;
        scrollPerformance.duration_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m14420p(ScrollPerformance scrollPerformance, long j) {
        scrollPerformance.bitField0_ |= 8;
        scrollPerformance.largeFrameDrops_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14421q(ScrollPerformance scrollPerformance, long j) {
        scrollPerformance.bitField0_ |= 4;
        scrollPerformance.smallFrameDrops_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static mly0 m14422r() {
        return (mly0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "containerId_", "duration_", "smallFrameDrops_", "largeFrameDrops_", "entityUri_"});
        }
        if (iOrdinal == 3) {
            return new ScrollPerformance();
        }
        if (iOrdinal == 4) {
            return new mly0(DEFAULT_INSTANCE);
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
        synchronized (ScrollPerformance.class) {
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
