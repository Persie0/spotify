package com.spotify.home.evopage.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.n330;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class HomeFeedLoadingEvent extends AbstractC0269h implements sre0 {
    public static final int CACHE_HIT_FIELD_NUMBER = 1;
    private static final HomeFeedLoadingEvent DEFAULT_INSTANCE;
    public static final int FEED_ID_FIELD_NUMBER = 4;
    public static final int IS_OFFLINE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int RESPONSE_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean cacheHit_;
    private boolean isOffline_;
    private String responseId_ = "";
    private String feedId_ = "";

    static {
        HomeFeedLoadingEvent homeFeedLoadingEvent = new HomeFeedLoadingEvent();
        DEFAULT_INSTANCE = homeFeedLoadingEvent;
        AbstractC0269h.registerDefaultInstance(HomeFeedLoadingEvent.class, homeFeedLoadingEvent);
    }

    private HomeFeedLoadingEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11757n(HomeFeedLoadingEvent homeFeedLoadingEvent, boolean z) {
        homeFeedLoadingEvent.bitField0_ |= 1;
        homeFeedLoadingEvent.cacheHit_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m11758o(HomeFeedLoadingEvent homeFeedLoadingEvent, String str) {
        homeFeedLoadingEvent.getClass();
        str.getClass();
        homeFeedLoadingEvent.bitField0_ |= 8;
        homeFeedLoadingEvent.feedId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m11759p(HomeFeedLoadingEvent homeFeedLoadingEvent, boolean z) {
        homeFeedLoadingEvent.bitField0_ |= 4;
        homeFeedLoadingEvent.isOffline_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m11760q(HomeFeedLoadingEvent homeFeedLoadingEvent, String str) {
        homeFeedLoadingEvent.getClass();
        homeFeedLoadingEvent.bitField0_ |= 2;
        homeFeedLoadingEvent.responseId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static n330 m11761r() {
        return (n330) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "cacheHit_", "responseId_", "isOffline_", "feedId_"});
        }
        if (iOrdinal == 3) {
            return new HomeFeedLoadingEvent();
        }
        if (iOrdinal == 4) {
            return new n330(DEFAULT_INSTANCE);
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
        synchronized (HomeFeedLoadingEvent.class) {
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
