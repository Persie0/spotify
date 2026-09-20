package com.spotify.liveroom.livestreampagefragment.p101v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.jr90;
import p204p.kr90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveStreamStateMessage extends AbstractC0269h implements sre0 {
    private static final LiveStreamStateMessage DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int ROOM_STATE_FIELD_NUMBER = 2;
    public static final int ROOM_URI_FIELD_NUMBER = 1;
    public static final int START_TIMESTAMP_FIELD_NUMBER = 3;
    private int roomState_;
    private String roomUri_ = "";
    private long startTimestamp_;

    static {
        LiveStreamStateMessage liveStreamStateMessage = new LiveStreamStateMessage();
        DEFAULT_INSTANCE = liveStreamStateMessage;
        AbstractC0269h.registerDefaultInstance(LiveStreamStateMessage.class, liveStreamStateMessage);
    }

    private LiveStreamStateMessage() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13111n(LiveStreamStateMessage liveStreamStateMessage, jr90 jr90Var) {
        liveStreamStateMessage.getClass();
        liveStreamStateMessage.roomState_ = jr90Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m13112o(LiveStreamStateMessage liveStreamStateMessage, String str) {
        liveStreamStateMessage.getClass();
        str.getClass();
        liveStreamStateMessage.roomUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13113p(LiveStreamStateMessage liveStreamStateMessage, long j) {
        liveStreamStateMessage.startTimestamp_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static kr90 m13114s() {
        return (kr90) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0002", new Object[]{"roomUri_", "roomState_", "startTimestamp_"});
        }
        if (iOrdinal == 3) {
            return new LiveStreamStateMessage();
        }
        if (iOrdinal == 4) {
            return new kr90(DEFAULT_INSTANCE);
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
        synchronized (LiveStreamStateMessage.class) {
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

    /* JADX INFO: renamed from: q */
    public final jr90 m13115q() {
        jr90 jr90Var;
        int i = this.roomState_;
        if (i == 0) {
            jr90Var = jr90.UNKNOWN;
        } else if (i == 1) {
            jr90Var = jr90.SCHEDULED;
        } else if (i == 2) {
            jr90Var = jr90.LIVE;
        } else if (i != 3) {
            jr90Var = i != 4 ? null : jr90.CANCELLED;
        } else {
            jr90Var = jr90.ENDED;
        }
        return jr90Var == null ? jr90.UNRECOGNIZED : jr90Var;
    }

    /* JADX INFO: renamed from: r */
    public final long m13116r() {
        return this.startTimestamp_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
