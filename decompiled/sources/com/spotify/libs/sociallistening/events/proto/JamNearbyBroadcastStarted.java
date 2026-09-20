package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v460;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class JamNearbyBroadcastStarted extends AbstractC0269h implements sre0 {
    public static final int BROADCAST_TYPE_FIELD_NUMBER = 7;
    private static final JamNearbyBroadcastStarted DEFAULT_INSTANCE;
    public static final int FAILURE_REASON_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int TECH_FIELD_NUMBER = 2;
    public static final int TOKEN_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String sessionId_ = "";
    private String tech_ = "";
    private String type_ = "";
    private String reason_ = "";
    private String token_ = "";
    private String failureReason_ = "";
    private String broadcastType_ = "";

    static {
        JamNearbyBroadcastStarted jamNearbyBroadcastStarted = new JamNearbyBroadcastStarted();
        DEFAULT_INSTANCE = jamNearbyBroadcastStarted;
        AbstractC0269h.registerDefaultInstance(JamNearbyBroadcastStarted.class, jamNearbyBroadcastStarted);
    }

    private JamNearbyBroadcastStarted() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12823n(JamNearbyBroadcastStarted jamNearbyBroadcastStarted, String str) {
        jamNearbyBroadcastStarted.getClass();
        str.getClass();
        jamNearbyBroadcastStarted.bitField0_ |= 64;
        jamNearbyBroadcastStarted.broadcastType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12824o(JamNearbyBroadcastStarted jamNearbyBroadcastStarted, String str) {
        jamNearbyBroadcastStarted.getClass();
        str.getClass();
        jamNearbyBroadcastStarted.bitField0_ |= 32;
        jamNearbyBroadcastStarted.failureReason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12825p(JamNearbyBroadcastStarted jamNearbyBroadcastStarted, String str) {
        jamNearbyBroadcastStarted.getClass();
        jamNearbyBroadcastStarted.bitField0_ |= 2;
        jamNearbyBroadcastStarted.tech_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12826q(JamNearbyBroadcastStarted jamNearbyBroadcastStarted, String str) {
        jamNearbyBroadcastStarted.getClass();
        str.getClass();
        jamNearbyBroadcastStarted.bitField0_ |= 16;
        jamNearbyBroadcastStarted.token_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12827r(JamNearbyBroadcastStarted jamNearbyBroadcastStarted, String str) {
        jamNearbyBroadcastStarted.getClass();
        jamNearbyBroadcastStarted.bitField0_ |= 4;
        jamNearbyBroadcastStarted.type_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static v460 m12828s() {
        return (v460) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "sessionId_", "tech_", "type_", "reason_", "token_", "failureReason_", "broadcastType_"});
        }
        if (iOrdinal == 3) {
            return new JamNearbyBroadcastStarted();
        }
        if (iOrdinal == 4) {
            return new v460(DEFAULT_INSTANCE);
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
        synchronized (JamNearbyBroadcastStarted.class) {
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
