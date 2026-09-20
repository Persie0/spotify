package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.hd31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialConnectSessionJoinResult extends AbstractC0269h implements sre0 {
    private static final SocialConnectSessionJoinResult DEFAULT_INSTANCE;
    public static final int DISCOVERY_METHODS_FIELD_NUMBER = 9;
    public static final int DISCOVERY_METHOD_FIELD_NUMBER = 8;
    public static final int ERROR_CATEGORY_FIELD_NUMBER = 5;
    public static final int ERROR_DATA_FIELD_NUMBER = 4;
    public static final int ERROR_STATUS_FIELD_NUMBER = 3;
    public static final int JOIN_ATTEMPT_ID_FIELD_NUMBER = 10;
    public static final int JOIN_TYPE_FIELD_NUMBER = 6;
    public static final int JOIN_URL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PARTICIPATION_MODE_FIELD_NUMBER = 7;
    public static final int PERMISSION_MODE_FIELD_NUMBER = 11;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private int errorStatus_;
    private String sessionId_ = "";
    private String joinUrl_ = "";
    private String errorData_ = "";
    private String errorCategory_ = "";
    private String joinType_ = "";
    private String participationMode_ = "";
    private String discoveryMethod_ = "";
    private ae50 discoveryMethods_ = AbstractC0269h.emptyProtobufList();
    private String joinAttemptId_ = "";
    private String permissionMode_ = "";

    static {
        SocialConnectSessionJoinResult socialConnectSessionJoinResult = new SocialConnectSessionJoinResult();
        DEFAULT_INSTANCE = socialConnectSessionJoinResult;
        AbstractC0269h.registerDefaultInstance(SocialConnectSessionJoinResult.class, socialConnectSessionJoinResult);
    }

    private SocialConnectSessionJoinResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12880n(SocialConnectSessionJoinResult socialConnectSessionJoinResult, ArrayList arrayList) {
        ae50 ae50Var = socialConnectSessionJoinResult.discoveryMethods_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            socialConnectSessionJoinResult.discoveryMethods_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, socialConnectSessionJoinResult.discoveryMethods_);
    }

    /* JADX INFO: renamed from: o */
    public static void m12881o(SocialConnectSessionJoinResult socialConnectSessionJoinResult, String str) {
        socialConnectSessionJoinResult.getClass();
        socialConnectSessionJoinResult.bitField0_ |= 16;
        socialConnectSessionJoinResult.errorCategory_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12882p(SocialConnectSessionJoinResult socialConnectSessionJoinResult, String str) {
        socialConnectSessionJoinResult.getClass();
        str.getClass();
        socialConnectSessionJoinResult.bitField0_ |= 8;
        socialConnectSessionJoinResult.errorData_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12883q(SocialConnectSessionJoinResult socialConnectSessionJoinResult, String str) {
        socialConnectSessionJoinResult.getClass();
        str.getClass();
        socialConnectSessionJoinResult.bitField0_ |= 256;
        socialConnectSessionJoinResult.joinAttemptId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12884r(SocialConnectSessionJoinResult socialConnectSessionJoinResult, String str) {
        socialConnectSessionJoinResult.getClass();
        str.getClass();
        socialConnectSessionJoinResult.bitField0_ |= 32;
        socialConnectSessionJoinResult.joinType_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m12885s(SocialConnectSessionJoinResult socialConnectSessionJoinResult, String str) {
        socialConnectSessionJoinResult.getClass();
        str.getClass();
        socialConnectSessionJoinResult.bitField0_ |= 2;
        socialConnectSessionJoinResult.joinUrl_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m12886t(SocialConnectSessionJoinResult socialConnectSessionJoinResult, String str) {
        socialConnectSessionJoinResult.getClass();
        socialConnectSessionJoinResult.bitField0_ |= 64;
        socialConnectSessionJoinResult.participationMode_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m12887u(SocialConnectSessionJoinResult socialConnectSessionJoinResult, String str) {
        socialConnectSessionJoinResult.getClass();
        str.getClass();
        socialConnectSessionJoinResult.bitField0_ |= 512;
        socialConnectSessionJoinResult.permissionMode_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m12888v(SocialConnectSessionJoinResult socialConnectSessionJoinResult, String str) {
        socialConnectSessionJoinResult.getClass();
        socialConnectSessionJoinResult.bitField0_ |= 1;
        socialConnectSessionJoinResult.sessionId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static hd31 m12889w() {
        return (hd31) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\t\u001a\nဈ\b\u000bဈ\t", new Object[]{"bitField0_", "sessionId_", "joinUrl_", "errorStatus_", "errorData_", "errorCategory_", "joinType_", "participationMode_", "discoveryMethod_", "discoveryMethods_", "joinAttemptId_", "permissionMode_"});
        }
        if (iOrdinal == 3) {
            return new SocialConnectSessionJoinResult();
        }
        if (iOrdinal == 4) {
            return new hd31(DEFAULT_INSTANCE);
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
        synchronized (SocialConnectSessionJoinResult.class) {
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
