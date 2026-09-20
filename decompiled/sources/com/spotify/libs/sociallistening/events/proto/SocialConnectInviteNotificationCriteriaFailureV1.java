package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cd31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialConnectInviteNotificationCriteriaFailureV1 extends AbstractC0269h implements sre0 {
    public static final int APP_IS_ON_FOREGROUND_FIELD_NUMBER = 3;
    public static final int BACKEND_VISIBILITY_IS_FALSE_FIELD_NUMBER = 4;
    private static final SocialConnectInviteNotificationCriteriaFailureV1 DEFAULT_INSTANCE;
    public static final int EXCEPTION_VALIDATING_URI_FIELD_NUMBER = 5;
    public static final int HAS_NO_JAM_NEARBY_FIELD_NUMBER = 2;
    public static final int JAM_JOIN_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private boolean appIsOnForeground_;
    private boolean backendVisibilityIsFalse_;
    private int bitField0_;
    private boolean hasNoJamNearby_;
    private String jamJoinUri_ = "";
    private String exceptionValidatingUri_ = "";

    static {
        SocialConnectInviteNotificationCriteriaFailureV1 socialConnectInviteNotificationCriteriaFailureV1 = new SocialConnectInviteNotificationCriteriaFailureV1();
        DEFAULT_INSTANCE = socialConnectInviteNotificationCriteriaFailureV1;
        AbstractC0269h.registerDefaultInstance(SocialConnectInviteNotificationCriteriaFailureV1.class, socialConnectInviteNotificationCriteriaFailureV1);
    }

    private SocialConnectInviteNotificationCriteriaFailureV1() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12855n(SocialConnectInviteNotificationCriteriaFailureV1 socialConnectInviteNotificationCriteriaFailureV1, boolean z) {
        socialConnectInviteNotificationCriteriaFailureV1.bitField0_ |= 4;
        socialConnectInviteNotificationCriteriaFailureV1.appIsOnForeground_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m12856o(SocialConnectInviteNotificationCriteriaFailureV1 socialConnectInviteNotificationCriteriaFailureV1, boolean z) {
        socialConnectInviteNotificationCriteriaFailureV1.bitField0_ |= 8;
        socialConnectInviteNotificationCriteriaFailureV1.backendVisibilityIsFalse_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m12857p(SocialConnectInviteNotificationCriteriaFailureV1 socialConnectInviteNotificationCriteriaFailureV1, String str) {
        socialConnectInviteNotificationCriteriaFailureV1.getClass();
        str.getClass();
        socialConnectInviteNotificationCriteriaFailureV1.bitField0_ |= 16;
        socialConnectInviteNotificationCriteriaFailureV1.exceptionValidatingUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12858q(SocialConnectInviteNotificationCriteriaFailureV1 socialConnectInviteNotificationCriteriaFailureV1, boolean z) {
        socialConnectInviteNotificationCriteriaFailureV1.bitField0_ |= 2;
        socialConnectInviteNotificationCriteriaFailureV1.hasNoJamNearby_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m12859r(SocialConnectInviteNotificationCriteriaFailureV1 socialConnectInviteNotificationCriteriaFailureV1, String str) {
        socialConnectInviteNotificationCriteriaFailureV1.getClass();
        str.getClass();
        socialConnectInviteNotificationCriteriaFailureV1.bitField0_ |= 1;
        socialConnectInviteNotificationCriteriaFailureV1.jamJoinUri_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static cd31 m12860s() {
        return (cd31) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "jamJoinUri_", "hasNoJamNearby_", "appIsOnForeground_", "backendVisibilityIsFalse_", "exceptionValidatingUri_"});
        }
        if (iOrdinal == 3) {
            return new SocialConnectInviteNotificationCriteriaFailureV1();
        }
        if (iOrdinal == 4) {
            return new cd31(DEFAULT_INSTANCE);
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
        synchronized (SocialConnectInviteNotificationCriteriaFailureV1.class) {
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
