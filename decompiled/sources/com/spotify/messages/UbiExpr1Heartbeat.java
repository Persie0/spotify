package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.eu91;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class UbiExpr1Heartbeat extends AbstractC0269h implements sre0 {
    private static final UbiExpr1Heartbeat DEFAULT_INSTANCE;
    public static final int HEARTBEAT_INTERVAL_FIELD_NUMBER = 3;
    public static final int HEARTBEAT_START_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private long heartbeatInterval_;
    private long heartbeatStartTimestamp_;
    private String pageInstanceId_ = "";

    static {
        UbiExpr1Heartbeat ubiExpr1Heartbeat = new UbiExpr1Heartbeat();
        DEFAULT_INSTANCE = ubiExpr1Heartbeat;
        AbstractC0269h.registerDefaultInstance(UbiExpr1Heartbeat.class, ubiExpr1Heartbeat);
    }

    private UbiExpr1Heartbeat() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14488n(UbiExpr1Heartbeat ubiExpr1Heartbeat, long j) {
        ubiExpr1Heartbeat.bitField0_ |= 4;
        ubiExpr1Heartbeat.heartbeatInterval_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m14489o(UbiExpr1Heartbeat ubiExpr1Heartbeat, long j) {
        ubiExpr1Heartbeat.bitField0_ |= 2;
        ubiExpr1Heartbeat.heartbeatStartTimestamp_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m14490p(UbiExpr1Heartbeat ubiExpr1Heartbeat, String str) {
        ubiExpr1Heartbeat.getClass();
        ubiExpr1Heartbeat.bitField0_ |= 1;
        ubiExpr1Heartbeat.pageInstanceId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static eu91 m14491q() {
        return (eu91) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "pageInstanceId_", "heartbeatStartTimestamp_", "heartbeatInterval_"});
        }
        if (iOrdinal == 3) {
            return new UbiExpr1Heartbeat();
        }
        if (iOrdinal == 4) {
            return new eu91(DEFAULT_INSTANCE);
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
        synchronized (UbiExpr1Heartbeat.class) {
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
