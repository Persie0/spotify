package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.eii;
import p204p.fii;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigurationApplied extends AbstractC0269h implements sre0 {
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 4;
    private static final ConfigurationApplied DEFAULT_INSTANCE;
    public static final int FETCH_TYPE_FIELD_NUMBER = 8;
    public static final int IDENTIFIERS_FIELD_NUMBER = 9;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 2;
    public static final int LAST_RCS_FETCH_TIME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 7;
    public static final int POLICY_GROUP_IDS_FIELD_NUMBER = 3;
    public static final int RC_CLIENT_ID_FIELD_NUMBER = 5;
    public static final int RC_CLIENT_VERSION_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 10;
    private int bitField0_;
    private long lastRcsFetchTime_;
    private ihc0 identifiers_ = ihc0.f102235b;
    private String installationId_ = "";
    private ud50 policyGroupIds_ = AbstractC0269h.emptyIntList();
    private String configurationAssignmentId_ = "";
    private String rcClientId_ = "";
    private String rcClientVersion_ = "";
    private String platform_ = "";
    private String fetchType_ = "";
    private String type_ = "";

    static {
        ConfigurationApplied configurationApplied = new ConfigurationApplied();
        DEFAULT_INSTANCE = configurationApplied;
        AbstractC0269h.registerDefaultInstance(ConfigurationApplied.class, configurationApplied);
    }

    private ConfigurationApplied() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m13765n(ConfigurationApplied configurationApplied, Iterable iterable) {
        ud50 ud50Var = configurationApplied.policyGroupIds_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            configurationApplied.policyGroupIds_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        AbstractC2118m8.addAll(iterable, configurationApplied.policyGroupIds_);
    }

    /* JADX INFO: renamed from: o */
    public static ihc0 m13766o(ConfigurationApplied configurationApplied) {
        ihc0 ihc0Var = configurationApplied.identifiers_;
        if (!ihc0Var.f102236a) {
            configurationApplied.identifiers_ = ihc0Var.m50613h();
        }
        return configurationApplied.identifiers_;
    }

    /* JADX INFO: renamed from: p */
    public static void m13767p(ConfigurationApplied configurationApplied, String str) {
        configurationApplied.getClass();
        str.getClass();
        configurationApplied.bitField0_ |= 4;
        configurationApplied.configurationAssignmentId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13768q(ConfigurationApplied configurationApplied, long j) {
        configurationApplied.bitField0_ |= 1;
        configurationApplied.lastRcsFetchTime_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m13769r(ConfigurationApplied configurationApplied) {
        configurationApplied.getClass();
        configurationApplied.bitField0_ |= 32;
        configurationApplied.platform_ = "ANDROID";
    }

    /* JADX INFO: renamed from: s */
    public static void m13770s(ConfigurationApplied configurationApplied) {
        configurationApplied.getClass();
        configurationApplied.bitField0_ |= 8;
        configurationApplied.rcClientId_ = "com.spotify.music";
    }

    /* JADX INFO: renamed from: t */
    public static void m13771t(ConfigurationApplied configurationApplied) {
        configurationApplied.getClass();
        configurationApplied.bitField0_ |= 16;
        configurationApplied.rcClientVersion_ = "9.1.84.2205";
    }

    /* JADX INFO: renamed from: u */
    public static eii m13772u() {
        return (eii) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0001\u0001\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003\u0016\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\t2\nဈ\u0007", new Object[]{"bitField0_", "lastRcsFetchTime_", "installationId_", "policyGroupIds_", "configurationAssignmentId_", "rcClientId_", "rcClientVersion_", "platform_", "fetchType_", "identifiers_", fii.f69893a, "type_"});
        }
        if (iOrdinal == 3) {
            return new ConfigurationApplied();
        }
        if (iOrdinal == 4) {
            return new eii(DEFAULT_INSTANCE);
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
        synchronized (ConfigurationApplied.class) {
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
