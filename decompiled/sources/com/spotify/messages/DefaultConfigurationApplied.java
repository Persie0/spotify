package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.n5p;
import p204p.o5p;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class DefaultConfigurationApplied extends AbstractC0269h implements sre0 {
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 2;
    private static final DefaultConfigurationApplied DEFAULT_INSTANCE;
    public static final int FETCH_TYPE_FIELD_NUMBER = 6;
    public static final int IDENTIFIERS_FIELD_NUMBER = 8;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 5;
    public static final int RC_CLIENT_ID_FIELD_NUMBER = 3;
    public static final int RC_CLIENT_VERSION_FIELD_NUMBER = 4;
    public static final int REASON_FIELD_NUMBER = 7;
    private int bitField0_;
    private ihc0 identifiers_ = ihc0.f102235b;
    private String installationId_ = "";
    private String configurationAssignmentId_ = "";
    private String rcClientId_ = "";
    private String rcClientVersion_ = "";
    private String platform_ = "";
    private String fetchType_ = "";
    private String reason_ = "";

    static {
        DefaultConfigurationApplied defaultConfigurationApplied = new DefaultConfigurationApplied();
        DEFAULT_INSTANCE = defaultConfigurationApplied;
        AbstractC0269h.registerDefaultInstance(DefaultConfigurationApplied.class, defaultConfigurationApplied);
    }

    private DefaultConfigurationApplied() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m13828n(DefaultConfigurationApplied defaultConfigurationApplied) {
        ihc0 ihc0Var = defaultConfigurationApplied.identifiers_;
        if (!ihc0Var.f102236a) {
            defaultConfigurationApplied.identifiers_ = ihc0Var.m50613h();
        }
        return defaultConfigurationApplied.identifiers_;
    }

    /* JADX INFO: renamed from: o */
    public static void m13829o(DefaultConfigurationApplied defaultConfigurationApplied, String str) {
        defaultConfigurationApplied.getClass();
        str.getClass();
        defaultConfigurationApplied.bitField0_ |= 2;
        defaultConfigurationApplied.configurationAssignmentId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13830p(DefaultConfigurationApplied defaultConfigurationApplied) {
        defaultConfigurationApplied.getClass();
        defaultConfigurationApplied.bitField0_ |= 16;
        defaultConfigurationApplied.platform_ = "ANDROID";
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13831q(DefaultConfigurationApplied defaultConfigurationApplied) {
        defaultConfigurationApplied.getClass();
        defaultConfigurationApplied.bitField0_ |= 4;
        defaultConfigurationApplied.rcClientId_ = "com.spotify.music";
    }

    /* JADX INFO: renamed from: r */
    public static void m13832r(DefaultConfigurationApplied defaultConfigurationApplied) {
        defaultConfigurationApplied.getClass();
        defaultConfigurationApplied.bitField0_ |= 8;
        defaultConfigurationApplied.rcClientVersion_ = "9.1.84.2205";
    }

    /* JADX INFO: renamed from: s */
    public static n5p m13833s() {
        return (n5p) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\b2", new Object[]{"bitField0_", "installationId_", "configurationAssignmentId_", "rcClientId_", "rcClientVersion_", "platform_", "fetchType_", "reason_", "identifiers_", o5p.f162045a});
        }
        if (iOrdinal == 3) {
            return new DefaultConfigurationApplied();
        }
        if (iOrdinal == 4) {
            return new n5p(DEFAULT_INSTANCE);
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
        synchronized (DefaultConfigurationApplied.class) {
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
