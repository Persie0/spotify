package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xc31;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialConnectHostApprovalRequestResult extends AbstractC0269h implements sre0 {
    private static final SocialConnectHostApprovalRequestResult DEFAULT_INSTANCE;
    public static final int ERROR_CATEGORY_FIELD_NUMBER = 6;
    public static final int ERROR_DATA_FIELD_NUMBER = 5;
    public static final int JOIN_ATTEMPT_ID_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SURFACE_FIELD_NUMBER = 4;
    public static final int TARGET_DEVICE_BRAND_FIELD_NUMBER = 10;
    public static final int TARGET_DEVICE_CLIENT_ID_FIELD_NUMBER = 9;
    public static final int TARGET_DEVICE_MODEL_FIELD_NUMBER = 11;
    public static final int TARGET_DEVICE_TYPE_FIELD_NUMBER = 8;
    public static final int TRIGGER_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String sessionId_ = "";
    private String type_ = "";
    private String trigger_ = "";
    private String surface_ = "";
    private String errorData_ = "";
    private String errorCategory_ = "";
    private String joinAttemptId_ = "";
    private String targetDeviceType_ = "";
    private String targetDeviceClientId_ = "";
    private String targetDeviceBrand_ = "";
    private String targetDeviceModel_ = "";

    static {
        SocialConnectHostApprovalRequestResult socialConnectHostApprovalRequestResult = new SocialConnectHostApprovalRequestResult();
        DEFAULT_INSTANCE = socialConnectHostApprovalRequestResult;
        AbstractC0269h.registerDefaultInstance(SocialConnectHostApprovalRequestResult.class, socialConnectHostApprovalRequestResult);
    }

    private SocialConnectHostApprovalRequestResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12846n(SocialConnectHostApprovalRequestResult socialConnectHostApprovalRequestResult, String str) {
        socialConnectHostApprovalRequestResult.getClass();
        socialConnectHostApprovalRequestResult.bitField0_ |= 32;
        socialConnectHostApprovalRequestResult.errorCategory_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12847o(SocialConnectHostApprovalRequestResult socialConnectHostApprovalRequestResult, String str) {
        socialConnectHostApprovalRequestResult.getClass();
        str.getClass();
        socialConnectHostApprovalRequestResult.bitField0_ |= 16;
        socialConnectHostApprovalRequestResult.errorData_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12848p(SocialConnectHostApprovalRequestResult socialConnectHostApprovalRequestResult, String str) {
        socialConnectHostApprovalRequestResult.getClass();
        str.getClass();
        socialConnectHostApprovalRequestResult.bitField0_ |= 64;
        socialConnectHostApprovalRequestResult.joinAttemptId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12849q(SocialConnectHostApprovalRequestResult socialConnectHostApprovalRequestResult, String str) {
        socialConnectHostApprovalRequestResult.getClass();
        socialConnectHostApprovalRequestResult.bitField0_ |= 1;
        socialConnectHostApprovalRequestResult.sessionId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12850r(SocialConnectHostApprovalRequestResult socialConnectHostApprovalRequestResult) {
        socialConnectHostApprovalRequestResult.getClass();
        socialConnectHostApprovalRequestResult.bitField0_ |= 8;
        socialConnectHostApprovalRequestResult.surface_ = "manage-requests-sheet";
    }

    /* JADX INFO: renamed from: s */
    public static void m12851s(SocialConnectHostApprovalRequestResult socialConnectHostApprovalRequestResult, String str) {
        socialConnectHostApprovalRequestResult.getClass();
        str.getClass();
        socialConnectHostApprovalRequestResult.bitField0_ |= 128;
        socialConnectHostApprovalRequestResult.targetDeviceType_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m12852t(SocialConnectHostApprovalRequestResult socialConnectHostApprovalRequestResult, String str) {
        socialConnectHostApprovalRequestResult.getClass();
        socialConnectHostApprovalRequestResult.bitField0_ |= 4;
        socialConnectHostApprovalRequestResult.trigger_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m12853u(SocialConnectHostApprovalRequestResult socialConnectHostApprovalRequestResult, String str) {
        socialConnectHostApprovalRequestResult.getClass();
        socialConnectHostApprovalRequestResult.bitField0_ |= 2;
        socialConnectHostApprovalRequestResult.type_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static xc31 m12854v() {
        return (xc31) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n", new Object[]{"bitField0_", "sessionId_", "type_", "trigger_", "surface_", "errorData_", "errorCategory_", "joinAttemptId_", "targetDeviceType_", "targetDeviceClientId_", "targetDeviceBrand_", "targetDeviceModel_"});
        }
        if (iOrdinal == 3) {
            return new SocialConnectHostApprovalRequestResult();
        }
        if (iOrdinal == 4) {
            return new xc31(DEFAULT_INSTANCE);
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
        synchronized (SocialConnectHostApprovalRequestResult.class) {
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
