package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rye1;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ZeroFrictionInteractionNonAuth extends AbstractC0269h implements sre0 {
    private static final ZeroFrictionInteractionNonAuth DEFAULT_INSTANCE;
    public static final int ELEMENT_ID_FIELD_NUMBER = 4;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 6;
    public static final int INTERACTION_TYPE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SCREEN_ID_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String spotifyId_ = "";
    private String sessionId_ = "";
    private String screenId_ = "";
    private String elementId_ = "";
    private String interactionType_ = "";
    private String impressionId_ = "";

    static {
        ZeroFrictionInteractionNonAuth zeroFrictionInteractionNonAuth = new ZeroFrictionInteractionNonAuth();
        DEFAULT_INSTANCE = zeroFrictionInteractionNonAuth;
        AbstractC0269h.registerDefaultInstance(ZeroFrictionInteractionNonAuth.class, zeroFrictionInteractionNonAuth);
    }

    private ZeroFrictionInteractionNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14926n(ZeroFrictionInteractionNonAuth zeroFrictionInteractionNonAuth, String str) {
        zeroFrictionInteractionNonAuth.getClass();
        str.getClass();
        zeroFrictionInteractionNonAuth.bitField0_ |= 8;
        zeroFrictionInteractionNonAuth.elementId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14927o(ZeroFrictionInteractionNonAuth zeroFrictionInteractionNonAuth, String str) {
        zeroFrictionInteractionNonAuth.getClass();
        str.getClass();
        zeroFrictionInteractionNonAuth.bitField0_ |= 32;
        zeroFrictionInteractionNonAuth.impressionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14928p(ZeroFrictionInteractionNonAuth zeroFrictionInteractionNonAuth, String str) {
        zeroFrictionInteractionNonAuth.getClass();
        str.getClass();
        zeroFrictionInteractionNonAuth.bitField0_ |= 16;
        zeroFrictionInteractionNonAuth.interactionType_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14929q(ZeroFrictionInteractionNonAuth zeroFrictionInteractionNonAuth, String str) {
        zeroFrictionInteractionNonAuth.getClass();
        str.getClass();
        zeroFrictionInteractionNonAuth.bitField0_ |= 4;
        zeroFrictionInteractionNonAuth.screenId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14930r(ZeroFrictionInteractionNonAuth zeroFrictionInteractionNonAuth, String str) {
        zeroFrictionInteractionNonAuth.getClass();
        zeroFrictionInteractionNonAuth.bitField0_ |= 2;
        zeroFrictionInteractionNonAuth.sessionId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m14931s(ZeroFrictionInteractionNonAuth zeroFrictionInteractionNonAuth, String str) {
        zeroFrictionInteractionNonAuth.getClass();
        zeroFrictionInteractionNonAuth.bitField0_ |= 1;
        zeroFrictionInteractionNonAuth.spotifyId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static rye1 m14932t() {
        return (rye1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "spotifyId_", "sessionId_", "screenId_", "elementId_", "interactionType_", "impressionId_"});
        }
        if (iOrdinal == 3) {
            return new ZeroFrictionInteractionNonAuth();
        }
        if (iOrdinal == 4) {
            return new rye1(DEFAULT_INSTANCE);
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
        synchronized (ZeroFrictionInteractionNonAuth.class) {
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
