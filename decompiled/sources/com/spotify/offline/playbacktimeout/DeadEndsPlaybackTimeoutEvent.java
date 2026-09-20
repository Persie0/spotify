package com.spotify.offline.playbacktimeout;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uoo;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class DeadEndsPlaybackTimeoutEvent extends AbstractC0269h implements sre0 {
    private static final DeadEndsPlaybackTimeoutEvent DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 2;
    public static final int SIGNAL_FIELD_NUMBER = 1;
    private int bitField0_;
    private String signal_ = "";
    private String playbackId_ = "";

    static {
        DeadEndsPlaybackTimeoutEvent deadEndsPlaybackTimeoutEvent = new DeadEndsPlaybackTimeoutEvent();
        DEFAULT_INSTANCE = deadEndsPlaybackTimeoutEvent;
        AbstractC0269h.registerDefaultInstance(DeadEndsPlaybackTimeoutEvent.class, deadEndsPlaybackTimeoutEvent);
    }

    private DeadEndsPlaybackTimeoutEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16075n(DeadEndsPlaybackTimeoutEvent deadEndsPlaybackTimeoutEvent, String str) {
        deadEndsPlaybackTimeoutEvent.getClass();
        str.getClass();
        deadEndsPlaybackTimeoutEvent.bitField0_ |= 2;
        deadEndsPlaybackTimeoutEvent.playbackId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m16076o(DeadEndsPlaybackTimeoutEvent deadEndsPlaybackTimeoutEvent, String str) {
        deadEndsPlaybackTimeoutEvent.getClass();
        deadEndsPlaybackTimeoutEvent.bitField0_ |= 1;
        deadEndsPlaybackTimeoutEvent.signal_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static uoo m16077p() {
        return (uoo) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "signal_", "playbackId_"});
        }
        if (iOrdinal == 3) {
            return new DeadEndsPlaybackTimeoutEvent();
        }
        if (iOrdinal == 4) {
            return new uoo(DEFAULT_INSTANCE);
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
        synchronized (DeadEndsPlaybackTimeoutEvent.class) {
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
