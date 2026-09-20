package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gf31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialListeningClientSessionCreated extends AbstractC0269h implements sre0 {
    private static final SocialListeningClientSessionCreated DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_TYPE_FIELD_NUMBER = 3;
    public static final int SESSION_URI_FIELD_NUMBER = 2;
    public static final int TECH_TYPE_FIELD_NUMBER = 5;
    private int bitField0_;
    private String sessionId_ = "";
    private String sessionUri_ = "";
    private String sessionType_ = "";
    private String deviceType_ = "";
    private String techType_ = "";

    static {
        SocialListeningClientSessionCreated socialListeningClientSessionCreated = new SocialListeningClientSessionCreated();
        DEFAULT_INSTANCE = socialListeningClientSessionCreated;
        AbstractC0269h.registerDefaultInstance(SocialListeningClientSessionCreated.class, socialListeningClientSessionCreated);
    }

    private SocialListeningClientSessionCreated() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12890n(SocialListeningClientSessionCreated socialListeningClientSessionCreated, String str) {
        socialListeningClientSessionCreated.getClass();
        socialListeningClientSessionCreated.bitField0_ |= 8;
        socialListeningClientSessionCreated.deviceType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12891o(SocialListeningClientSessionCreated socialListeningClientSessionCreated, String str) {
        socialListeningClientSessionCreated.getClass();
        str.getClass();
        socialListeningClientSessionCreated.bitField0_ |= 1;
        socialListeningClientSessionCreated.sessionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12892p(SocialListeningClientSessionCreated socialListeningClientSessionCreated, String str) {
        socialListeningClientSessionCreated.getClass();
        socialListeningClientSessionCreated.bitField0_ |= 4;
        socialListeningClientSessionCreated.sessionType_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12893q(SocialListeningClientSessionCreated socialListeningClientSessionCreated, String str) {
        socialListeningClientSessionCreated.getClass();
        str.getClass();
        socialListeningClientSessionCreated.bitField0_ |= 2;
        socialListeningClientSessionCreated.sessionUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12894r(SocialListeningClientSessionCreated socialListeningClientSessionCreated, String str) {
        socialListeningClientSessionCreated.getClass();
        socialListeningClientSessionCreated.bitField0_ |= 16;
        socialListeningClientSessionCreated.techType_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static gf31 m12895s() {
        return (gf31) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "sessionId_", "sessionUri_", "sessionType_", "deviceType_", "techType_"});
        }
        if (iOrdinal == 3) {
            return new SocialListeningClientSessionCreated();
        }
        if (iOrdinal == 4) {
            return new gf31(DEFAULT_INSTANCE);
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
        synchronized (SocialListeningClientSessionCreated.class) {
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
