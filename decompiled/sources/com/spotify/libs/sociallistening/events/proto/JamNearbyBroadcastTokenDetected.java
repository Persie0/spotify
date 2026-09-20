package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.w460;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class JamNearbyBroadcastTokenDetected extends AbstractC0269h implements sre0 {
    private static final JamNearbyBroadcastTokenDetected DEFAULT_INSTANCE;
    public static final int DISCOVERY_METHOD_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private String token_ = "";
    private String discoveryMethod_ = "";

    static {
        JamNearbyBroadcastTokenDetected jamNearbyBroadcastTokenDetected = new JamNearbyBroadcastTokenDetected();
        DEFAULT_INSTANCE = jamNearbyBroadcastTokenDetected;
        AbstractC0269h.registerDefaultInstance(JamNearbyBroadcastTokenDetected.class, jamNearbyBroadcastTokenDetected);
    }

    private JamNearbyBroadcastTokenDetected() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12829n(JamNearbyBroadcastTokenDetected jamNearbyBroadcastTokenDetected, String str) {
        jamNearbyBroadcastTokenDetected.getClass();
        jamNearbyBroadcastTokenDetected.bitField0_ |= 2;
        jamNearbyBroadcastTokenDetected.discoveryMethod_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12830o(JamNearbyBroadcastTokenDetected jamNearbyBroadcastTokenDetected, String str) {
        jamNearbyBroadcastTokenDetected.getClass();
        str.getClass();
        jamNearbyBroadcastTokenDetected.bitField0_ |= 1;
        jamNearbyBroadcastTokenDetected.token_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static w460 m12831p() {
        return (w460) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "token_", "discoveryMethod_"});
        }
        if (iOrdinal == 3) {
            return new JamNearbyBroadcastTokenDetected();
        }
        if (iOrdinal == 4) {
            return new w460(DEFAULT_INSTANCE);
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
        synchronized (JamNearbyBroadcastTokenDetected.class) {
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
