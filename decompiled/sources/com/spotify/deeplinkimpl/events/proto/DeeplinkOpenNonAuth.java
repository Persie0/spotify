package com.spotify.deeplinkimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cuo;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DeeplinkOpenNonAuth extends AbstractC0269h implements sre0 {
    public static final int AUTH_SESSION_ID_FIELD_NUMBER = 8;
    public static final int DEEPLINK_SESSION_ID_FIELD_NUMBER = 4;
    private static final DeeplinkOpenNonAuth DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAVIGATION_REFERENCE_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int SHORTLINK_SESSION_ID_FIELD_NUMBER = 7;
    public static final int SHORTLINK_SOURCE_FIELD_NUMBER = 6;
    public static final int SHORT_LINK_FIELD_NUMBER = 5;
    public static final int SOURCE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String link_ = "";
    private String entityUri_ = "";
    private String source_ = "";
    private String deeplinkSessionId_ = "";
    private String shortLink_ = "";
    private String shortlinkSource_ = "";
    private String shortlinkSessionId_ = "";
    private String authSessionId_ = "";
    private String navigationReference_ = "";

    static {
        DeeplinkOpenNonAuth deeplinkOpenNonAuth = new DeeplinkOpenNonAuth();
        DEFAULT_INSTANCE = deeplinkOpenNonAuth;
        AbstractC0269h.registerDefaultInstance(DeeplinkOpenNonAuth.class, deeplinkOpenNonAuth);
    }

    private DeeplinkOpenNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9179n(DeeplinkOpenNonAuth deeplinkOpenNonAuth, String str) {
        deeplinkOpenNonAuth.getClass();
        deeplinkOpenNonAuth.bitField0_ |= 128;
        deeplinkOpenNonAuth.authSessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m9180o(DeeplinkOpenNonAuth deeplinkOpenNonAuth, String str) {
        deeplinkOpenNonAuth.getClass();
        str.getClass();
        deeplinkOpenNonAuth.bitField0_ |= 8;
        deeplinkOpenNonAuth.deeplinkSessionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m9181p(DeeplinkOpenNonAuth deeplinkOpenNonAuth, String str) {
        deeplinkOpenNonAuth.getClass();
        deeplinkOpenNonAuth.bitField0_ |= 2;
        deeplinkOpenNonAuth.entityUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9182q(DeeplinkOpenNonAuth deeplinkOpenNonAuth, String str) {
        deeplinkOpenNonAuth.getClass();
        str.getClass();
        deeplinkOpenNonAuth.bitField0_ |= 1;
        deeplinkOpenNonAuth.link_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m9183r(DeeplinkOpenNonAuth deeplinkOpenNonAuth, String str) {
        deeplinkOpenNonAuth.getClass();
        deeplinkOpenNonAuth.bitField0_ |= 256;
        deeplinkOpenNonAuth.navigationReference_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m9184s(DeeplinkOpenNonAuth deeplinkOpenNonAuth, String str) {
        deeplinkOpenNonAuth.getClass();
        deeplinkOpenNonAuth.bitField0_ |= 16;
        deeplinkOpenNonAuth.shortLink_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m9185t(DeeplinkOpenNonAuth deeplinkOpenNonAuth, String str) {
        deeplinkOpenNonAuth.getClass();
        str.getClass();
        deeplinkOpenNonAuth.bitField0_ |= 64;
        deeplinkOpenNonAuth.shortlinkSessionId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m9186u(DeeplinkOpenNonAuth deeplinkOpenNonAuth, String str) {
        deeplinkOpenNonAuth.getClass();
        deeplinkOpenNonAuth.bitField0_ |= 32;
        deeplinkOpenNonAuth.shortlinkSource_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m9187v(DeeplinkOpenNonAuth deeplinkOpenNonAuth, String str) {
        deeplinkOpenNonAuth.getClass();
        deeplinkOpenNonAuth.bitField0_ |= 4;
        deeplinkOpenNonAuth.source_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static cuo m9188w() {
        return (cuo) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b", new Object[]{"bitField0_", "link_", "entityUri_", "source_", "deeplinkSessionId_", "shortLink_", "shortlinkSource_", "shortlinkSessionId_", "authSessionId_", "navigationReference_"});
        }
        if (iOrdinal == 3) {
            return new DeeplinkOpenNonAuth();
        }
        if (iOrdinal == 4) {
            return new cuo(DEFAULT_INSTANCE);
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
        synchronized (DeeplinkOpenNonAuth.class) {
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
