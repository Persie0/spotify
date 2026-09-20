package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.ore0;
import p204p.oye1;
import p204p.pre0;
import p204p.pye1;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ZeroFrictionGenericNonAuth extends AbstractC0269h implements sre0 {
    public static final int DATA_FIELD_NUMBER = 5;
    private static final ZeroFrictionGenericNonAuth DEFAULT_INSTANCE;
    public static final int GENERIC_EVENT_ID_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SCREEN_ID_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private ihc0 data_ = ihc0.f102235b;
    private String spotifyId_ = "";
    private String sessionId_ = "";
    private String screenId_ = "";
    private String genericEventId_ = "";

    static {
        ZeroFrictionGenericNonAuth zeroFrictionGenericNonAuth = new ZeroFrictionGenericNonAuth();
        DEFAULT_INSTANCE = zeroFrictionGenericNonAuth;
        AbstractC0269h.registerDefaultInstance(ZeroFrictionGenericNonAuth.class, zeroFrictionGenericNonAuth);
    }

    private ZeroFrictionGenericNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m14915n(ZeroFrictionGenericNonAuth zeroFrictionGenericNonAuth) {
        ihc0 ihc0Var = zeroFrictionGenericNonAuth.data_;
        if (!ihc0Var.f102236a) {
            zeroFrictionGenericNonAuth.data_ = ihc0Var.m50613h();
        }
        return zeroFrictionGenericNonAuth.data_;
    }

    /* JADX INFO: renamed from: o */
    public static void m14916o(ZeroFrictionGenericNonAuth zeroFrictionGenericNonAuth, String str) {
        zeroFrictionGenericNonAuth.getClass();
        str.getClass();
        zeroFrictionGenericNonAuth.bitField0_ |= 8;
        zeroFrictionGenericNonAuth.genericEventId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14917p(ZeroFrictionGenericNonAuth zeroFrictionGenericNonAuth, String str) {
        zeroFrictionGenericNonAuth.getClass();
        str.getClass();
        zeroFrictionGenericNonAuth.bitField0_ |= 4;
        zeroFrictionGenericNonAuth.screenId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14918q(ZeroFrictionGenericNonAuth zeroFrictionGenericNonAuth, String str) {
        zeroFrictionGenericNonAuth.getClass();
        zeroFrictionGenericNonAuth.bitField0_ |= 2;
        zeroFrictionGenericNonAuth.sessionId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14919r(ZeroFrictionGenericNonAuth zeroFrictionGenericNonAuth, String str) {
        zeroFrictionGenericNonAuth.getClass();
        zeroFrictionGenericNonAuth.bitField0_ |= 1;
        zeroFrictionGenericNonAuth.spotifyId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static oye1 m14920s() {
        return (oye1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u00052", new Object[]{"bitField0_", "spotifyId_", "sessionId_", "screenId_", "genericEventId_", "data_", pye1.f183398a});
        }
        if (iOrdinal == 3) {
            return new ZeroFrictionGenericNonAuth();
        }
        if (iOrdinal == 4) {
            return new oye1(DEFAULT_INSTANCE);
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
        synchronized (ZeroFrictionGenericNonAuth.class) {
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
