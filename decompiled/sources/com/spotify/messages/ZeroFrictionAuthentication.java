package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.hye1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ZeroFrictionAuthentication extends AbstractC0269h implements sre0 {
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 7;
    public static final int AUTHENTICATION_METHOD_FIELD_NUMBER = 6;
    public static final int AUTHENTICATION_TYPE_FIELD_NUMBER = 5;
    private static final ZeroFrictionAuthentication DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REGISTRATION_FIELD_NUMBER = 4;
    public static final int REQUEST_ID_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean registration_;
    private String spotifyId_ = "";
    private String sessionId_ = "";
    private String requestId_ = "";
    private String authenticationType_ = "";
    private String authenticationMethod_ = "";
    private String appInstanceId_ = "";

    static {
        ZeroFrictionAuthentication zeroFrictionAuthentication = new ZeroFrictionAuthentication();
        DEFAULT_INSTANCE = zeroFrictionAuthentication;
        AbstractC0269h.registerDefaultInstance(ZeroFrictionAuthentication.class, zeroFrictionAuthentication);
    }

    private ZeroFrictionAuthentication() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14890n(ZeroFrictionAuthentication zeroFrictionAuthentication, String str) {
        zeroFrictionAuthentication.getClass();
        str.getClass();
        zeroFrictionAuthentication.bitField0_ |= 64;
        zeroFrictionAuthentication.appInstanceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14891o(ZeroFrictionAuthentication zeroFrictionAuthentication, String str) {
        zeroFrictionAuthentication.getClass();
        zeroFrictionAuthentication.bitField0_ |= 32;
        zeroFrictionAuthentication.authenticationMethod_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14892p(ZeroFrictionAuthentication zeroFrictionAuthentication, String str) {
        zeroFrictionAuthentication.getClass();
        zeroFrictionAuthentication.bitField0_ |= 16;
        zeroFrictionAuthentication.authenticationType_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14893q(ZeroFrictionAuthentication zeroFrictionAuthentication, boolean z) {
        zeroFrictionAuthentication.bitField0_ |= 8;
        zeroFrictionAuthentication.registration_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m14894r(ZeroFrictionAuthentication zeroFrictionAuthentication, String str) {
        zeroFrictionAuthentication.getClass();
        str.getClass();
        zeroFrictionAuthentication.bitField0_ |= 4;
        zeroFrictionAuthentication.requestId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m14895s(ZeroFrictionAuthentication zeroFrictionAuthentication, String str) {
        zeroFrictionAuthentication.getClass();
        zeroFrictionAuthentication.bitField0_ |= 2;
        zeroFrictionAuthentication.sessionId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m14896t(ZeroFrictionAuthentication zeroFrictionAuthentication, String str) {
        zeroFrictionAuthentication.getClass();
        zeroFrictionAuthentication.bitField0_ |= 1;
        zeroFrictionAuthentication.spotifyId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static hye1 m14897u() {
        return (hye1) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: v */
    public static ZeroFrictionAuthentication m14898v(byte[] bArr) {
        return (ZeroFrictionAuthentication) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "spotifyId_", "sessionId_", "requestId_", "registration_", "authenticationType_", "authenticationMethod_", "appInstanceId_"});
        }
        if (iOrdinal == 3) {
            return new ZeroFrictionAuthentication();
        }
        if (iOrdinal == 4) {
            return new hye1(DEFAULT_INSTANCE);
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
        synchronized (ZeroFrictionAuthentication.class) {
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
