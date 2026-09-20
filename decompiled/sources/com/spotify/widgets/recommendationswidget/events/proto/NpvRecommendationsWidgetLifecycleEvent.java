package com.spotify.widgets.recommendationswidget.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ygk0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class NpvRecommendationsWidgetLifecycleEvent extends AbstractC0269h implements sre0 {
    private static final NpvRecommendationsWidgetLifecycleEvent DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    public static final int IS_SYSTEM_LAUNCHER_FIELD_NUMBER = 7;
    public static final int LAUNCHER_NAME_FIELD_NUMBER = 5;
    public static final int LAUNCHER_PACKAGE_FIELD_NUMBER = 4;
    public static final int LAUNCHER_VERSION_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int WIDGET_CATEGORY_FIELD_NUMBER = 3;
    public static final int WIDGET_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isSystemLauncher_;
    private long widgetId_;
    private String eventType_ = "";
    private String widgetCategory_ = "";
    private String launcherPackage_ = "";
    private String launcherName_ = "";
    private String launcherVersion_ = "";

    static {
        NpvRecommendationsWidgetLifecycleEvent npvRecommendationsWidgetLifecycleEvent = new NpvRecommendationsWidgetLifecycleEvent();
        DEFAULT_INSTANCE = npvRecommendationsWidgetLifecycleEvent;
        AbstractC0269h.registerDefaultInstance(NpvRecommendationsWidgetLifecycleEvent.class, npvRecommendationsWidgetLifecycleEvent);
    }

    private NpvRecommendationsWidgetLifecycleEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m23107n(NpvRecommendationsWidgetLifecycleEvent npvRecommendationsWidgetLifecycleEvent, String str) {
        npvRecommendationsWidgetLifecycleEvent.getClass();
        str.getClass();
        npvRecommendationsWidgetLifecycleEvent.bitField0_ |= 1;
        npvRecommendationsWidgetLifecycleEvent.eventType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m23108o(NpvRecommendationsWidgetLifecycleEvent npvRecommendationsWidgetLifecycleEvent, String str) {
        npvRecommendationsWidgetLifecycleEvent.getClass();
        str.getClass();
        npvRecommendationsWidgetLifecycleEvent.bitField0_ |= 16;
        npvRecommendationsWidgetLifecycleEvent.launcherName_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m23109p(NpvRecommendationsWidgetLifecycleEvent npvRecommendationsWidgetLifecycleEvent, String str) {
        npvRecommendationsWidgetLifecycleEvent.getClass();
        npvRecommendationsWidgetLifecycleEvent.bitField0_ |= 8;
        npvRecommendationsWidgetLifecycleEvent.launcherPackage_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m23110q(NpvRecommendationsWidgetLifecycleEvent npvRecommendationsWidgetLifecycleEvent, String str) {
        npvRecommendationsWidgetLifecycleEvent.getClass();
        str.getClass();
        npvRecommendationsWidgetLifecycleEvent.bitField0_ |= 32;
        npvRecommendationsWidgetLifecycleEvent.launcherVersion_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m23111r(NpvRecommendationsWidgetLifecycleEvent npvRecommendationsWidgetLifecycleEvent, String str) {
        npvRecommendationsWidgetLifecycleEvent.getClass();
        str.getClass();
        npvRecommendationsWidgetLifecycleEvent.bitField0_ |= 4;
        npvRecommendationsWidgetLifecycleEvent.widgetCategory_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m23112s(NpvRecommendationsWidgetLifecycleEvent npvRecommendationsWidgetLifecycleEvent, long j) {
        npvRecommendationsWidgetLifecycleEvent.bitField0_ |= 2;
        npvRecommendationsWidgetLifecycleEvent.widgetId_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static ygk0 m23113t() {
        return (ygk0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006", new Object[]{"bitField0_", "eventType_", "widgetId_", "widgetCategory_", "launcherPackage_", "launcherName_", "launcherVersion_", "isSystemLauncher_"});
        }
        if (iOrdinal == 3) {
            return new NpvRecommendationsWidgetLifecycleEvent();
        }
        if (iOrdinal == 4) {
            return new ygk0(DEFAULT_INSTANCE);
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
        synchronized (NpvRecommendationsWidgetLifecycleEvent.class) {
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
