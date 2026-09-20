package com.spotify.widgets.recommendationswidget.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wgk0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class NpvRecommendationsWidgetErrorEvent extends AbstractC0269h implements sre0 {
    private static final NpvRecommendationsWidgetErrorEvent DEFAULT_INSTANCE;
    public static final int ERROR_TYPE_FIELD_NUMBER = 1;
    public static final int PARAMETERS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int STACKTRACE_FIELD_NUMBER = 2;
    public static final int WIDGET_CATEGORY_FIELD_NUMBER = 4;
    private int bitField0_;
    private String errorType_ = "";
    private String stacktrace_ = "";
    private String parameters_ = "";
    private String widgetCategory_ = "";

    static {
        NpvRecommendationsWidgetErrorEvent npvRecommendationsWidgetErrorEvent = new NpvRecommendationsWidgetErrorEvent();
        DEFAULT_INSTANCE = npvRecommendationsWidgetErrorEvent;
        AbstractC0269h.registerDefaultInstance(NpvRecommendationsWidgetErrorEvent.class, npvRecommendationsWidgetErrorEvent);
    }

    private NpvRecommendationsWidgetErrorEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m23097n(NpvRecommendationsWidgetErrorEvent npvRecommendationsWidgetErrorEvent, String str) {
        npvRecommendationsWidgetErrorEvent.getClass();
        str.getClass();
        npvRecommendationsWidgetErrorEvent.bitField0_ |= 1;
        npvRecommendationsWidgetErrorEvent.errorType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m23098o(NpvRecommendationsWidgetErrorEvent npvRecommendationsWidgetErrorEvent, String str) {
        npvRecommendationsWidgetErrorEvent.getClass();
        str.getClass();
        npvRecommendationsWidgetErrorEvent.bitField0_ |= 4;
        npvRecommendationsWidgetErrorEvent.parameters_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m23099p(NpvRecommendationsWidgetErrorEvent npvRecommendationsWidgetErrorEvent, String str) {
        npvRecommendationsWidgetErrorEvent.getClass();
        str.getClass();
        npvRecommendationsWidgetErrorEvent.bitField0_ |= 2;
        npvRecommendationsWidgetErrorEvent.stacktrace_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m23100q(NpvRecommendationsWidgetErrorEvent npvRecommendationsWidgetErrorEvent, String str) {
        npvRecommendationsWidgetErrorEvent.getClass();
        str.getClass();
        npvRecommendationsWidgetErrorEvent.bitField0_ |= 8;
        npvRecommendationsWidgetErrorEvent.widgetCategory_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static wgk0 m23101r() {
        return (wgk0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "errorType_", "stacktrace_", "parameters_", "widgetCategory_"});
        }
        if (iOrdinal == 3) {
            return new NpvRecommendationsWidgetErrorEvent();
        }
        if (iOrdinal == 4) {
            return new wgk0(DEFAULT_INSTANCE);
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
        synchronized (NpvRecommendationsWidgetErrorEvent.class) {
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
