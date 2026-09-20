package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.gii;
import p204p.hii;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigurationAppliedNonAuth extends AbstractC0269h implements sre0 {
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 4;
    private static final ConfigurationAppliedNonAuth DEFAULT_INSTANCE;
    public static final int IDENTIFIERS_FIELD_NUMBER = 8;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 2;
    public static final int LAST_RCS_FETCH_TIME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 7;
    public static final int POLICY_GROUP_IDS_FIELD_NUMBER = 3;
    public static final int RC_CLIENT_ID_FIELD_NUMBER = 5;
    public static final int RC_CLIENT_VERSION_FIELD_NUMBER = 6;
    private int bitField0_;
    private long lastRcsFetchTime_;
    private ihc0 identifiers_ = ihc0.f102235b;
    private String installationId_ = "";
    private ud50 policyGroupIds_ = AbstractC0269h.emptyIntList();
    private String configurationAssignmentId_ = "";
    private String rcClientId_ = "";
    private String rcClientVersion_ = "";
    private String platform_ = "";

    static {
        ConfigurationAppliedNonAuth configurationAppliedNonAuth = new ConfigurationAppliedNonAuth();
        DEFAULT_INSTANCE = configurationAppliedNonAuth;
        AbstractC0269h.registerDefaultInstance(ConfigurationAppliedNonAuth.class, configurationAppliedNonAuth);
    }

    private ConfigurationAppliedNonAuth() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m13773n(ConfigurationAppliedNonAuth configurationAppliedNonAuth, Iterable iterable) {
        ud50 ud50Var = configurationAppliedNonAuth.policyGroupIds_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            configurationAppliedNonAuth.policyGroupIds_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        AbstractC2118m8.addAll(iterable, configurationAppliedNonAuth.policyGroupIds_);
    }

    /* JADX INFO: renamed from: o */
    public static ihc0 m13774o(ConfigurationAppliedNonAuth configurationAppliedNonAuth) {
        ihc0 ihc0Var = configurationAppliedNonAuth.identifiers_;
        if (!ihc0Var.f102236a) {
            configurationAppliedNonAuth.identifiers_ = ihc0Var.m50613h();
        }
        return configurationAppliedNonAuth.identifiers_;
    }

    /* JADX INFO: renamed from: p */
    public static void m13775p(ConfigurationAppliedNonAuth configurationAppliedNonAuth, String str) {
        configurationAppliedNonAuth.getClass();
        str.getClass();
        configurationAppliedNonAuth.bitField0_ |= 4;
        configurationAppliedNonAuth.configurationAssignmentId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13776q(ConfigurationAppliedNonAuth configurationAppliedNonAuth, long j) {
        configurationAppliedNonAuth.bitField0_ |= 1;
        configurationAppliedNonAuth.lastRcsFetchTime_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m13777r(ConfigurationAppliedNonAuth configurationAppliedNonAuth) {
        configurationAppliedNonAuth.getClass();
        configurationAppliedNonAuth.bitField0_ |= 32;
        configurationAppliedNonAuth.platform_ = "ANDROID";
    }

    /* JADX INFO: renamed from: s */
    public static void m13778s(ConfigurationAppliedNonAuth configurationAppliedNonAuth) {
        configurationAppliedNonAuth.getClass();
        configurationAppliedNonAuth.bitField0_ |= 8;
        configurationAppliedNonAuth.rcClientId_ = "com.spotify.music";
    }

    /* JADX INFO: renamed from: t */
    public static void m13779t(ConfigurationAppliedNonAuth configurationAppliedNonAuth) {
        configurationAppliedNonAuth.getClass();
        configurationAppliedNonAuth.bitField0_ |= 16;
        configurationAppliedNonAuth.rcClientVersion_ = "9.1.84.2205";
    }

    /* JADX INFO: renamed from: u */
    public static gii m13780u() {
        return (gii) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0001\u0001\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003\u0016\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\b2", new Object[]{"bitField0_", "lastRcsFetchTime_", "installationId_", "policyGroupIds_", "configurationAssignmentId_", "rcClientId_", "rcClientVersion_", "platform_", "identifiers_", hii.f91823a});
        }
        if (iOrdinal == 3) {
            return new ConfigurationAppliedNonAuth();
        }
        if (iOrdinal == 4) {
            return new gii(DEFAULT_INSTANCE);
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
        synchronized (ConfigurationAppliedNonAuth.class) {
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
