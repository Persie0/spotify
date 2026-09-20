package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ooa1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class UserContext extends AbstractC0269h implements sre0 {
    public static final int CURRENTLY_PLAYING_CONTEXT_URI_FIELD_NUMBER = 4;
    public static final int CURRENTLY_PLAYING_URI_FIELD_NUMBER = 1;
    public static final int CURRENT_PAGE_URI_FIELD_NUMBER = 6;
    private static final UserContext DEFAULT_INSTANCE;
    public static final int IS_PLAYBACK_PAUSED_FIELD_NUMBER = 5;
    public static final int LOCAL_TIME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int UTC_OFFSET_IN_MINUTES_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean isPlaybackPaused_;
    private int utcOffsetInMinutes_;
    private String currentlyPlayingUri_ = "";
    private String localTime_ = "";
    private String currentlyPlayingContextUri_ = "";
    private String currentPageUri_ = "";

    static {
        UserContext userContext = new UserContext();
        DEFAULT_INSTANCE = userContext;
        AbstractC0269h.registerDefaultInstance(UserContext.class, userContext);
    }

    private UserContext() {
    }

    /* JADX INFO: renamed from: E */
    public static ooa1 m2989E() {
        return (ooa1) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m2990n(UserContext userContext, String str) {
        userContext.getClass();
        str.getClass();
        userContext.bitField0_ |= 8;
        userContext.currentPageUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m2991o(UserContext userContext, String str) {
        userContext.getClass();
        str.getClass();
        userContext.currentlyPlayingContextUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2992p(UserContext userContext, String str) {
        userContext.getClass();
        str.getClass();
        userContext.currentlyPlayingUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2993q(UserContext userContext, boolean z) {
        userContext.bitField0_ |= 4;
        userContext.isPlaybackPaused_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m2994r(UserContext userContext, String str) {
        userContext.getClass();
        str.getClass();
        userContext.bitField0_ |= 1;
        userContext.localTime_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m2995s(UserContext userContext, int i) {
        userContext.bitField0_ |= 2;
        userContext.utcOffsetInMinutes_ = i;
    }

    /* JADX INFO: renamed from: w */
    public static UserContext m2996w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m2997A() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m2998B() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m2999C() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m3000D() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003င\u0001\u0004Ȉ\u0005ဇ\u0002\u0006ለ\u0003", new Object[]{"bitField0_", "currentlyPlayingUri_", "localTime_", "utcOffsetInMinutes_", "currentlyPlayingContextUri_", "isPlaybackPaused_", "currentPageUri_"});
        }
        if (iOrdinal == 3) {
            return new UserContext();
        }
        if (iOrdinal == 4) {
            return new ooa1(DEFAULT_INSTANCE);
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
        synchronized (UserContext.class) {
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

    /* JADX INFO: renamed from: t */
    public final String m3001t() {
        return this.currentPageUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m3002u() {
        return this.currentlyPlayingContextUri_;
    }

    /* JADX INFO: renamed from: v */
    public final String m3003v() {
        return this.currentlyPlayingUri_;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m3004x() {
        return this.isPlaybackPaused_;
    }

    /* JADX INFO: renamed from: y */
    public final String m3005y() {
        return this.localTime_;
    }

    /* JADX INFO: renamed from: z */
    public final int m3006z() {
        return this.utcOffsetInMinutes_;
    }
}
