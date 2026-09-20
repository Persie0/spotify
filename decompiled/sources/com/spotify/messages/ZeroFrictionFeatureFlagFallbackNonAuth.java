package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.mye1;
import p204p.nye1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ZeroFrictionFeatureFlagFallbackNonAuth extends AbstractC0269h implements sre0 {
    private static final ZeroFrictionFeatureFlagFallbackNonAuth DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private ihc0 flags_ = ihc0.f102235b;
    private String spotifyId_ = "";
    private String sessionId_ = "";

    static {
        ZeroFrictionFeatureFlagFallbackNonAuth zeroFrictionFeatureFlagFallbackNonAuth = new ZeroFrictionFeatureFlagFallbackNonAuth();
        DEFAULT_INSTANCE = zeroFrictionFeatureFlagFallbackNonAuth;
        AbstractC0269h.registerDefaultInstance(ZeroFrictionFeatureFlagFallbackNonAuth.class, zeroFrictionFeatureFlagFallbackNonAuth);
    }

    private ZeroFrictionFeatureFlagFallbackNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m14911n(ZeroFrictionFeatureFlagFallbackNonAuth zeroFrictionFeatureFlagFallbackNonAuth) {
        ihc0 ihc0Var = zeroFrictionFeatureFlagFallbackNonAuth.flags_;
        if (!ihc0Var.f102236a) {
            zeroFrictionFeatureFlagFallbackNonAuth.flags_ = ihc0Var.m50613h();
        }
        return zeroFrictionFeatureFlagFallbackNonAuth.flags_;
    }

    /* JADX INFO: renamed from: o */
    public static void m14912o(ZeroFrictionFeatureFlagFallbackNonAuth zeroFrictionFeatureFlagFallbackNonAuth, String str) {
        zeroFrictionFeatureFlagFallbackNonAuth.getClass();
        zeroFrictionFeatureFlagFallbackNonAuth.bitField0_ |= 2;
        zeroFrictionFeatureFlagFallbackNonAuth.sessionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14913p(ZeroFrictionFeatureFlagFallbackNonAuth zeroFrictionFeatureFlagFallbackNonAuth, String str) {
        zeroFrictionFeatureFlagFallbackNonAuth.getClass();
        zeroFrictionFeatureFlagFallbackNonAuth.bitField0_ |= 1;
        zeroFrictionFeatureFlagFallbackNonAuth.spotifyId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static mye1 m14914q() {
        return (mye1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u00032", new Object[]{"bitField0_", "spotifyId_", "sessionId_", "flags_", nye1.f159803a});
        }
        if (iOrdinal == 3) {
            return new ZeroFrictionFeatureFlagFallbackNonAuth();
        }
        if (iOrdinal == 4) {
            return new mye1(DEFAULT_INSTANCE);
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
        synchronized (ZeroFrictionFeatureFlagFallbackNonAuth.class) {
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
