package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.hft0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PushNotificationsReceivedV1 extends AbstractC0269h implements sre0 {
    public static final int APP_DEVICE_ID_FIELD_NUMBER = 4;
    public static final int APP_STATE_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    private static final PushNotificationsReceivedV1 DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PUSH_ID_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 3;
    private int bitField0_;
    private long timestampMs_;
    private String pushId_ = "";
    private String campaignId_ = "";
    private String appDeviceId_ = "";
    private String appState_ = "";

    static {
        PushNotificationsReceivedV1 pushNotificationsReceivedV1 = new PushNotificationsReceivedV1();
        DEFAULT_INSTANCE = pushNotificationsReceivedV1;
        AbstractC0269h.registerDefaultInstance(PushNotificationsReceivedV1.class, pushNotificationsReceivedV1);
    }

    private PushNotificationsReceivedV1() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14393n(PushNotificationsReceivedV1 pushNotificationsReceivedV1, String str) {
        pushNotificationsReceivedV1.getClass();
        str.getClass();
        pushNotificationsReceivedV1.bitField0_ |= 8;
        pushNotificationsReceivedV1.appDeviceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14394o(PushNotificationsReceivedV1 pushNotificationsReceivedV1, String str) {
        pushNotificationsReceivedV1.getClass();
        str.getClass();
        pushNotificationsReceivedV1.bitField0_ |= 16;
        pushNotificationsReceivedV1.appState_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14395p(PushNotificationsReceivedV1 pushNotificationsReceivedV1, String str) {
        pushNotificationsReceivedV1.getClass();
        str.getClass();
        pushNotificationsReceivedV1.bitField0_ |= 2;
        pushNotificationsReceivedV1.campaignId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14396q(PushNotificationsReceivedV1 pushNotificationsReceivedV1, String str) {
        pushNotificationsReceivedV1.getClass();
        str.getClass();
        pushNotificationsReceivedV1.bitField0_ |= 1;
        pushNotificationsReceivedV1.pushId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14397r(PushNotificationsReceivedV1 pushNotificationsReceivedV1, long j) {
        pushNotificationsReceivedV1.bitField0_ |= 4;
        pushNotificationsReceivedV1.timestampMs_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static hft0 m14398s() {
        return (hft0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "pushId_", "campaignId_", "timestampMs_", "appDeviceId_", "appState_"});
        }
        if (iOrdinal == 3) {
            return new PushNotificationsReceivedV1();
        }
        if (iOrdinal == 4) {
            return new hft0(DEFAULT_INSTANCE);
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
        synchronized (PushNotificationsReceivedV1.class) {
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
