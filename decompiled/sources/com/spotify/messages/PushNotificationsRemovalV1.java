package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ift0;
import p204p.ihc0;
import p204p.jft0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PushNotificationsRemovalV1 extends AbstractC0269h implements sre0 {
    public static final int APP_DEVICE_ID_FIELD_NUMBER = 1;
    private static final PushNotificationsRemovalV1 DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 5;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int REMOVAL_DATA_FIELD_NUMBER = 4;
    public static final int REMOVAL_MECHANISM_FIELD_NUMBER = 3;
    public static final int REMOVAL_STRATEGY_FIELD_NUMBER = 2;
    public static final int REQUESTING_FEATURE_FIELD_NUMBER = 7;
    private int bitField0_;
    private ihc0 removalData_ = ihc0.f102235b;
    private String appDeviceId_ = "";
    private String removalStrategy_ = "";
    private String removalMechanism_ = "";
    private String messageId_ = "";
    private String opportunityId_ = "";
    private String requestingFeature_ = "";

    static {
        PushNotificationsRemovalV1 pushNotificationsRemovalV1 = new PushNotificationsRemovalV1();
        DEFAULT_INSTANCE = pushNotificationsRemovalV1;
        AbstractC0269h.registerDefaultInstance(PushNotificationsRemovalV1.class, pushNotificationsRemovalV1);
    }

    private PushNotificationsRemovalV1() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m14399n(PushNotificationsRemovalV1 pushNotificationsRemovalV1) {
        ihc0 ihc0Var = pushNotificationsRemovalV1.removalData_;
        if (!ihc0Var.f102236a) {
            pushNotificationsRemovalV1.removalData_ = ihc0Var.m50613h();
        }
        return pushNotificationsRemovalV1.removalData_;
    }

    /* JADX INFO: renamed from: o */
    public static void m14400o(PushNotificationsRemovalV1 pushNotificationsRemovalV1, String str) {
        pushNotificationsRemovalV1.getClass();
        pushNotificationsRemovalV1.bitField0_ |= 1;
        pushNotificationsRemovalV1.appDeviceId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14401p(PushNotificationsRemovalV1 pushNotificationsRemovalV1, String str) {
        pushNotificationsRemovalV1.getClass();
        pushNotificationsRemovalV1.bitField0_ |= 8;
        pushNotificationsRemovalV1.messageId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14402q(PushNotificationsRemovalV1 pushNotificationsRemovalV1, String str) {
        pushNotificationsRemovalV1.getClass();
        pushNotificationsRemovalV1.bitField0_ |= 16;
        pushNotificationsRemovalV1.opportunityId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14403r(PushNotificationsRemovalV1 pushNotificationsRemovalV1) {
        pushNotificationsRemovalV1.getClass();
        pushNotificationsRemovalV1.bitField0_ |= 4;
        pushNotificationsRemovalV1.removalMechanism_ = "silent_push";
    }

    /* JADX INFO: renamed from: s */
    public static void m14404s(PushNotificationsRemovalV1 pushNotificationsRemovalV1, String str) {
        pushNotificationsRemovalV1.getClass();
        pushNotificationsRemovalV1.bitField0_ |= 2;
        pushNotificationsRemovalV1.removalStrategy_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m14405t(PushNotificationsRemovalV1 pushNotificationsRemovalV1, String str) {
        pushNotificationsRemovalV1.getClass();
        pushNotificationsRemovalV1.bitField0_ |= 32;
        pushNotificationsRemovalV1.requestingFeature_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static ift0 m14406u() {
        return (ift0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"bitField0_", "appDeviceId_", "removalStrategy_", "removalMechanism_", "removalData_", jft0.f111967a, "messageId_", "opportunityId_", "requestingFeature_"});
        }
        if (iOrdinal == 3) {
            return new PushNotificationsRemovalV1();
        }
        if (iOrdinal == 4) {
            return new ift0(DEFAULT_INSTANCE);
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
        synchronized (PushNotificationsRemovalV1.class) {
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
