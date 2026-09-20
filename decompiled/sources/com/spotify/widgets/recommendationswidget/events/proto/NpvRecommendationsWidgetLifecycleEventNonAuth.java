package com.spotify.widgets.recommendationswidget.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zgk0;

/* JADX INFO: loaded from: classes11.dex */
public final class NpvRecommendationsWidgetLifecycleEventNonAuth extends AbstractC0269h implements sre0 {
    private static final NpvRecommendationsWidgetLifecycleEventNonAuth DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    public static final int IS_SYSTEM_LAUNCHER_FIELD_NUMBER = 8;
    public static final int LAUNCHER_NAME_FIELD_NUMBER = 6;
    public static final int LAUNCHER_PACKAGE_FIELD_NUMBER = 5;
    public static final int LAUNCHER_VERSION_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 4;
    public static final int WIDGET_CATEGORY_FIELD_NUMBER = 3;
    public static final int WIDGET_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isSystemLauncher_;
    private long widgetId_;
    private String eventType_ = "";
    private String widgetCategory_ = "";
    private String spotifyId_ = "";
    private String launcherPackage_ = "";
    private String launcherName_ = "";
    private String launcherVersion_ = "";

    static {
        NpvRecommendationsWidgetLifecycleEventNonAuth npvRecommendationsWidgetLifecycleEventNonAuth = new NpvRecommendationsWidgetLifecycleEventNonAuth();
        DEFAULT_INSTANCE = npvRecommendationsWidgetLifecycleEventNonAuth;
        AbstractC0269h.registerDefaultInstance(NpvRecommendationsWidgetLifecycleEventNonAuth.class, npvRecommendationsWidgetLifecycleEventNonAuth);
    }

    private NpvRecommendationsWidgetLifecycleEventNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m23114n(NpvRecommendationsWidgetLifecycleEventNonAuth npvRecommendationsWidgetLifecycleEventNonAuth, String str) {
        npvRecommendationsWidgetLifecycleEventNonAuth.getClass();
        str.getClass();
        npvRecommendationsWidgetLifecycleEventNonAuth.bitField0_ |= 1;
        npvRecommendationsWidgetLifecycleEventNonAuth.eventType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m23115o(NpvRecommendationsWidgetLifecycleEventNonAuth npvRecommendationsWidgetLifecycleEventNonAuth, String str) {
        npvRecommendationsWidgetLifecycleEventNonAuth.getClass();
        str.getClass();
        npvRecommendationsWidgetLifecycleEventNonAuth.bitField0_ |= 32;
        npvRecommendationsWidgetLifecycleEventNonAuth.launcherName_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m23116p(NpvRecommendationsWidgetLifecycleEventNonAuth npvRecommendationsWidgetLifecycleEventNonAuth, String str) {
        npvRecommendationsWidgetLifecycleEventNonAuth.getClass();
        npvRecommendationsWidgetLifecycleEventNonAuth.bitField0_ |= 16;
        npvRecommendationsWidgetLifecycleEventNonAuth.launcherPackage_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m23117q(NpvRecommendationsWidgetLifecycleEventNonAuth npvRecommendationsWidgetLifecycleEventNonAuth, String str) {
        npvRecommendationsWidgetLifecycleEventNonAuth.getClass();
        str.getClass();
        npvRecommendationsWidgetLifecycleEventNonAuth.bitField0_ |= 64;
        npvRecommendationsWidgetLifecycleEventNonAuth.launcherVersion_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m23118r(NpvRecommendationsWidgetLifecycleEventNonAuth npvRecommendationsWidgetLifecycleEventNonAuth, String str) {
        npvRecommendationsWidgetLifecycleEventNonAuth.getClass();
        str.getClass();
        npvRecommendationsWidgetLifecycleEventNonAuth.bitField0_ |= 8;
        npvRecommendationsWidgetLifecycleEventNonAuth.spotifyId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m23119s(NpvRecommendationsWidgetLifecycleEventNonAuth npvRecommendationsWidgetLifecycleEventNonAuth, String str) {
        npvRecommendationsWidgetLifecycleEventNonAuth.getClass();
        str.getClass();
        npvRecommendationsWidgetLifecycleEventNonAuth.bitField0_ |= 4;
        npvRecommendationsWidgetLifecycleEventNonAuth.widgetCategory_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m23120t(NpvRecommendationsWidgetLifecycleEventNonAuth npvRecommendationsWidgetLifecycleEventNonAuth, long j) {
        npvRecommendationsWidgetLifecycleEventNonAuth.bitField0_ |= 2;
        npvRecommendationsWidgetLifecycleEventNonAuth.widgetId_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static zgk0 m23121u() {
        return (zgk0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"bitField0_", "eventType_", "widgetId_", "widgetCategory_", "spotifyId_", "launcherPackage_", "launcherName_", "launcherVersion_", "isSystemLauncher_"});
        }
        if (iOrdinal == 3) {
            return new NpvRecommendationsWidgetLifecycleEventNonAuth();
        }
        if (iOrdinal == 4) {
            return new zgk0(DEFAULT_INSTANCE);
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
        synchronized (NpvRecommendationsWidgetLifecycleEventNonAuth.class) {
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
