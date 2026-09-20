package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.oii;
import p204p.ore0;
import p204p.pii;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigurationFetchedNonAuth extends AbstractC0269h implements sre0 {
    public static final int ATTRIBUTES_SET_ID_FIELD_NUMBER = 5;
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 3;
    private static final ConfigurationFetchedNonAuth DEFAULT_INSTANCE;
    public static final int ERROR_CODE_ACCOUNT_ATTRIBUTES_FIELD_NUMBER = 20;
    public static final int ERROR_CODE_CONFIGURATION_RESOLVE_FIELD_NUMBER = 21;
    public static final int ERROR_MESSAGE_ACCOUNT_ATTRIBUTES_FIELD_NUMBER = 19;
    public static final int ERROR_MESSAGE_CONFIGURATION_RESOLVE_FIELD_NUMBER = 17;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 15;
    public static final int ERROR_REASON_ACCOUNT_ATTRIBUTES_FIELD_NUMBER = 18;
    public static final int ERROR_REASON_CONFIGURATION_RESOLVE_FIELD_NUMBER = 16;
    public static final int ERROR_REASON_FIELD_NUMBER = 14;
    public static final int FETCH_TYPE_FIELD_NUMBER = 10;
    public static final int IDENTIFIERS_FIELD_NUMBER = 22;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 2;
    public static final int LAST_RCS_FETCH_TIME_FIELD_NUMBER = 1;
    public static final int LATENCY_FIELD_NUMBER = 11;
    private static volatile r2n0 PARSER = null;
    public static final int PAYLOAD_SIZE_FIELD_NUMBER = 12;
    public static final int PLATFORM_FIELD_NUMBER = 9;
    public static final int PROPERTY_SET_ID_FIELD_NUMBER = 4;
    public static final int RC_CLIENT_ID_FIELD_NUMBER = 6;
    public static final int RC_CLIENT_VERSION_FIELD_NUMBER = 7;
    public static final int RC_SDK_VERSION_FIELD_NUMBER = 8;
    public static final int STATUS_CODE_FIELD_NUMBER = 13;
    private int bitField0_;
    private int errorCodeAccountAttributes_;
    private int errorCodeConfigurationResolve_;
    private long lastRcsFetchTime_;
    private long latency_;
    private long payloadSize_;
    private int statusCode_;
    private ihc0 identifiers_ = ihc0.f102235b;
    private String installationId_ = "";
    private String configurationAssignmentId_ = "";
    private String propertySetId_ = "";
    private String attributesSetId_ = "";
    private String rcClientId_ = "";
    private String rcClientVersion_ = "";
    private String rcSdkVersion_ = "";
    private String platform_ = "";
    private String fetchType_ = "";
    private String errorReason_ = "";
    private String errorMessage_ = "";
    private String errorReasonConfigurationResolve_ = "";
    private String errorMessageConfigurationResolve_ = "";
    private String errorReasonAccountAttributes_ = "";
    private String errorMessageAccountAttributes_ = "";

    static {
        ConfigurationFetchedNonAuth configurationFetchedNonAuth = new ConfigurationFetchedNonAuth();
        DEFAULT_INSTANCE = configurationFetchedNonAuth;
        AbstractC0269h.registerDefaultInstance(ConfigurationFetchedNonAuth.class, configurationFetchedNonAuth);
    }

    private ConfigurationFetchedNonAuth() {
    }

    /* JADX INFO: renamed from: A */
    public static void m13803A(ConfigurationFetchedNonAuth configurationFetchedNonAuth, long j) {
        configurationFetchedNonAuth.bitField0_ |= 2048;
        configurationFetchedNonAuth.payloadSize_ = j;
    }

    /* JADX INFO: renamed from: B */
    public static void m13804B(ConfigurationFetchedNonAuth configurationFetchedNonAuth) {
        configurationFetchedNonAuth.getClass();
        configurationFetchedNonAuth.bitField0_ |= 256;
        configurationFetchedNonAuth.platform_ = "ANDROID";
    }

    /* JADX INFO: renamed from: C */
    public static void m13805C(ConfigurationFetchedNonAuth configurationFetchedNonAuth) {
        configurationFetchedNonAuth.getClass();
        configurationFetchedNonAuth.bitField0_ |= 8;
        configurationFetchedNonAuth.propertySetId_ = "c3370a435715000ddcb9a7006f5bee08c97d107411ca98c11223eed87ae4dadc";
    }

    /* JADX INFO: renamed from: D */
    public static void m13806D(ConfigurationFetchedNonAuth configurationFetchedNonAuth) {
        configurationFetchedNonAuth.getClass();
        configurationFetchedNonAuth.bitField0_ |= 32;
        configurationFetchedNonAuth.rcClientId_ = "com.spotify.music";
    }

    /* JADX INFO: renamed from: E */
    public static void m13807E(ConfigurationFetchedNonAuth configurationFetchedNonAuth) {
        configurationFetchedNonAuth.getClass();
        configurationFetchedNonAuth.bitField0_ |= 64;
        configurationFetchedNonAuth.rcClientVersion_ = "9.1.84.2205";
    }

    /* JADX INFO: renamed from: F */
    public static void m13808F(ConfigurationFetchedNonAuth configurationFetchedNonAuth, String str) {
        configurationFetchedNonAuth.getClass();
        str.getClass();
        configurationFetchedNonAuth.bitField0_ |= 128;
        configurationFetchedNonAuth.rcSdkVersion_ = str;
    }

    /* JADX INFO: renamed from: G */
    public static void m13809G(ConfigurationFetchedNonAuth configurationFetchedNonAuth, int i) {
        configurationFetchedNonAuth.bitField0_ |= 4096;
        configurationFetchedNonAuth.statusCode_ = i;
    }

    /* JADX INFO: renamed from: H */
    public static oii m13810H() {
        return (oii) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m13811n(ConfigurationFetchedNonAuth configurationFetchedNonAuth) {
        ihc0 ihc0Var = configurationFetchedNonAuth.identifiers_;
        if (!ihc0Var.f102236a) {
            configurationFetchedNonAuth.identifiers_ = ihc0Var.m50613h();
        }
        return configurationFetchedNonAuth.identifiers_;
    }

    /* JADX INFO: renamed from: o */
    public static void m13812o(ConfigurationFetchedNonAuth configurationFetchedNonAuth, String str) {
        configurationFetchedNonAuth.getClass();
        str.getClass();
        configurationFetchedNonAuth.bitField0_ |= 4;
        configurationFetchedNonAuth.configurationAssignmentId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13813p(ConfigurationFetchedNonAuth configurationFetchedNonAuth, int i) {
        configurationFetchedNonAuth.bitField0_ |= 524288;
        configurationFetchedNonAuth.errorCodeAccountAttributes_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13814q(ConfigurationFetchedNonAuth configurationFetchedNonAuth, int i) {
        configurationFetchedNonAuth.bitField0_ |= 1048576;
        configurationFetchedNonAuth.errorCodeConfigurationResolve_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static void m13815r(ConfigurationFetchedNonAuth configurationFetchedNonAuth, String str) {
        configurationFetchedNonAuth.getClass();
        str.getClass();
        configurationFetchedNonAuth.bitField0_ |= 16384;
        configurationFetchedNonAuth.errorMessage_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13816s(ConfigurationFetchedNonAuth configurationFetchedNonAuth, String str) {
        configurationFetchedNonAuth.getClass();
        str.getClass();
        configurationFetchedNonAuth.bitField0_ |= 262144;
        configurationFetchedNonAuth.errorMessageAccountAttributes_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m13817t(ConfigurationFetchedNonAuth configurationFetchedNonAuth, String str) {
        configurationFetchedNonAuth.getClass();
        str.getClass();
        configurationFetchedNonAuth.bitField0_ |= 65536;
        configurationFetchedNonAuth.errorMessageConfigurationResolve_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m13818u(ConfigurationFetchedNonAuth configurationFetchedNonAuth, String str) {
        configurationFetchedNonAuth.getClass();
        configurationFetchedNonAuth.bitField0_ |= 8192;
        configurationFetchedNonAuth.errorReason_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m13819v(ConfigurationFetchedNonAuth configurationFetchedNonAuth, String str) {
        configurationFetchedNonAuth.getClass();
        configurationFetchedNonAuth.bitField0_ |= 131072;
        configurationFetchedNonAuth.errorReasonAccountAttributes_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m13820w(ConfigurationFetchedNonAuth configurationFetchedNonAuth, String str) {
        configurationFetchedNonAuth.getClass();
        configurationFetchedNonAuth.bitField0_ |= 32768;
        configurationFetchedNonAuth.errorReasonConfigurationResolve_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m13821x(ConfigurationFetchedNonAuth configurationFetchedNonAuth, String str) {
        configurationFetchedNonAuth.getClass();
        str.getClass();
        configurationFetchedNonAuth.bitField0_ |= 512;
        configurationFetchedNonAuth.fetchType_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m13822y(ConfigurationFetchedNonAuth configurationFetchedNonAuth, long j) {
        configurationFetchedNonAuth.bitField0_ |= 1;
        configurationFetchedNonAuth.lastRcsFetchTime_ = j;
    }

    /* JADX INFO: renamed from: z */
    public static void m13823z(ConfigurationFetchedNonAuth configurationFetchedNonAuth, long j) {
        configurationFetchedNonAuth.bitField0_ |= 1024;
        configurationFetchedNonAuth.latency_ = j;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0001\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဂ\n\fဂ\u000b\rင\f\u000eဈ\r\u000fဈ\u000e\u0010ဈ\u000f\u0011ဈ\u0010\u0012ဈ\u0011\u0013ဈ\u0012\u0014င\u0013\u0015င\u0014\u00162", new Object[]{"bitField0_", "lastRcsFetchTime_", "installationId_", "configurationAssignmentId_", "propertySetId_", "attributesSetId_", "rcClientId_", "rcClientVersion_", "rcSdkVersion_", "platform_", "fetchType_", "latency_", "payloadSize_", "statusCode_", "errorReason_", "errorMessage_", "errorReasonConfigurationResolve_", "errorMessageConfigurationResolve_", "errorReasonAccountAttributes_", "errorMessageAccountAttributes_", "errorCodeAccountAttributes_", "errorCodeConfigurationResolve_", "identifiers_", pii.f177972a});
        }
        if (iOrdinal == 3) {
            return new ConfigurationFetchedNonAuth();
        }
        if (iOrdinal == 4) {
            return new oii(DEFAULT_INSTANCE);
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
        synchronized (ConfigurationFetchedNonAuth.class) {
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
