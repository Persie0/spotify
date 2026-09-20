package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.hg71;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ThirdPartyAppAttributionClientNonAuth extends AbstractC0269h implements sre0 {
    public static final int APP_REFERRER_FIELD_NUMBER = 5;
    public static final int AUTH_SESSION_ID_FIELD_NUMBER = 2;
    private static final ThirdPartyAppAttributionClientNonAuth DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 3;
    public static final int INSTALL_REFERRER_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 4;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String spotifyId_ = "";
    private String authSessionId_ = "";
    private String eventType_ = "";
    private String platform_ = "";
    private String appReferrer_ = "";
    private String installReferrer_ = "";

    static {
        ThirdPartyAppAttributionClientNonAuth thirdPartyAppAttributionClientNonAuth = new ThirdPartyAppAttributionClientNonAuth();
        DEFAULT_INSTANCE = thirdPartyAppAttributionClientNonAuth;
        AbstractC0269h.registerDefaultInstance(ThirdPartyAppAttributionClientNonAuth.class, thirdPartyAppAttributionClientNonAuth);
    }

    private ThirdPartyAppAttributionClientNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14434n(ThirdPartyAppAttributionClientNonAuth thirdPartyAppAttributionClientNonAuth, String str) {
        thirdPartyAppAttributionClientNonAuth.getClass();
        str.getClass();
        thirdPartyAppAttributionClientNonAuth.bitField0_ |= 16;
        thirdPartyAppAttributionClientNonAuth.appReferrer_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14435o(ThirdPartyAppAttributionClientNonAuth thirdPartyAppAttributionClientNonAuth, String str) {
        thirdPartyAppAttributionClientNonAuth.getClass();
        thirdPartyAppAttributionClientNonAuth.bitField0_ |= 2;
        thirdPartyAppAttributionClientNonAuth.authSessionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14436p(ThirdPartyAppAttributionClientNonAuth thirdPartyAppAttributionClientNonAuth, String str) {
        thirdPartyAppAttributionClientNonAuth.getClass();
        thirdPartyAppAttributionClientNonAuth.bitField0_ |= 4;
        thirdPartyAppAttributionClientNonAuth.eventType_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14437q(ThirdPartyAppAttributionClientNonAuth thirdPartyAppAttributionClientNonAuth, String str) {
        thirdPartyAppAttributionClientNonAuth.getClass();
        str.getClass();
        thirdPartyAppAttributionClientNonAuth.bitField0_ |= 32;
        thirdPartyAppAttributionClientNonAuth.installReferrer_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14438r(ThirdPartyAppAttributionClientNonAuth thirdPartyAppAttributionClientNonAuth) {
        thirdPartyAppAttributionClientNonAuth.getClass();
        thirdPartyAppAttributionClientNonAuth.bitField0_ |= 8;
        thirdPartyAppAttributionClientNonAuth.platform_ = "android";
    }

    /* JADX INFO: renamed from: s */
    public static void m14439s(ThirdPartyAppAttributionClientNonAuth thirdPartyAppAttributionClientNonAuth, String str) {
        thirdPartyAppAttributionClientNonAuth.getClass();
        thirdPartyAppAttributionClientNonAuth.bitField0_ |= 1;
        thirdPartyAppAttributionClientNonAuth.spotifyId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static hg71 m14440t() {
        return (hg71) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "spotifyId_", "authSessionId_", "eventType_", "platform_", "appReferrer_", "installReferrer_"});
        }
        if (iOrdinal == 3) {
            return new ThirdPartyAppAttributionClientNonAuth();
        }
        if (iOrdinal == 4) {
            return new hg71(DEFAULT_INSTANCE);
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
        synchronized (ThirdPartyAppAttributionClientNonAuth.class) {
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
