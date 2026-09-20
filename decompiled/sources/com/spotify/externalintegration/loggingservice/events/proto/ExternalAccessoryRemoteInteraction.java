package com.spotify.externalintegration.loggingservice.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gwx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ExternalAccessoryRemoteInteraction extends AbstractC0269h implements sre0 {
    public static final int ACCESSORY_CLASS_FIELD_NUMBER = 15;
    public static final int ACCESSORY_NAME_FIELD_NUMBER = 7;
    public static final int ACCESSORY_TYPE_FIELD_NUMBER = 6;
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int AUDIO_ROUTE_ID_FIELD_NUMBER = 14;
    public static final int BRAND_FIELD_NUMBER = 8;
    public static final int CLIENT_ID_FIELD_NUMBER = 11;
    private static final ExternalAccessoryRemoteInteraction DEFAULT_INSTANCE;
    public static final int INTEGRATION_FIELD_NUMBER = 3;
    public static final int INTERACTION_ID_FIELD_NUMBER = 2;
    public static final int MODEL_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 4;
    public static final int REMOTE_DEVICE_ID_FIELD_NUMBER = 13;
    public static final int SENDER_ID_FIELD_NUMBER = 12;
    public static final int TRANSPORT_TYPE_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 10;
    private int bitField0_;
    private String action_ = "";
    private String interactionId_ = "";
    private String integration_ = "";
    private String protocol_ = "";
    private String transportType_ = "";
    private String accessoryType_ = "";
    private String accessoryName_ = "";
    private String brand_ = "";
    private String model_ = "";
    private String version_ = "";
    private String clientId_ = "";
    private String senderId_ = "";
    private String remoteDeviceId_ = "";
    private String audioRouteId_ = "";
    private String accessoryClass_ = "";

    static {
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = new ExternalAccessoryRemoteInteraction();
        DEFAULT_INSTANCE = externalAccessoryRemoteInteraction;
        AbstractC0269h.registerDefaultInstance(ExternalAccessoryRemoteInteraction.class, externalAccessoryRemoteInteraction);
    }

    private ExternalAccessoryRemoteInteraction() {
    }

    /* JADX INFO: renamed from: A */
    public static void m10567A(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 16;
        externalAccessoryRemoteInteraction.transportType_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static void m10568B(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 512;
        externalAccessoryRemoteInteraction.version_ = str;
    }

    /* JADX INFO: renamed from: E */
    public static gwx m10569E() {
        return (gwx) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m10570n(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 16384;
        externalAccessoryRemoteInteraction.accessoryClass_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m10571o(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 64;
        externalAccessoryRemoteInteraction.accessoryName_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m10572p(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 32;
        externalAccessoryRemoteInteraction.accessoryType_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m10573q(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 1;
        externalAccessoryRemoteInteraction.action_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m10574r(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 8192;
        externalAccessoryRemoteInteraction.audioRouteId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m10575s(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 128;
        externalAccessoryRemoteInteraction.brand_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m10576t(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 1024;
        externalAccessoryRemoteInteraction.clientId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m10577u(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 4;
        externalAccessoryRemoteInteraction.integration_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m10578v(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 2;
        externalAccessoryRemoteInteraction.interactionId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m10579w(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 256;
        externalAccessoryRemoteInteraction.model_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m10580x(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 8;
        externalAccessoryRemoteInteraction.protocol_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m10581y(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 4096;
        externalAccessoryRemoteInteraction.remoteDeviceId_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m10582z(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.bitField0_ |= 2048;
        externalAccessoryRemoteInteraction.senderId_ = str;
    }

    /* JADX INFO: renamed from: C */
    public final String m10583C() {
        return this.senderId_;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m10584D() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဈ\u000e", new Object[]{"bitField0_", "action_", "interactionId_", "integration_", "protocol_", "transportType_", "accessoryType_", "accessoryName_", "brand_", "model_", "version_", "clientId_", "senderId_", "remoteDeviceId_", "audioRouteId_", "accessoryClass_"});
        }
        if (iOrdinal == 3) {
            return new ExternalAccessoryRemoteInteraction();
        }
        if (iOrdinal == 4) {
            return new gwx(DEFAULT_INSTANCE);
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
        synchronized (ExternalAccessoryRemoteInteraction.class) {
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
