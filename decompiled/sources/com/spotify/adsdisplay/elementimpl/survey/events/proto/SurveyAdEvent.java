package com.spotify.adsdisplay.elementimpl.survey.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ba61;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SurveyAdEvent extends AbstractC0269h implements sre0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    private static final SurveyAdEvent DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 8;
    public static final int EVENT_REASON_FIELD_NUMBER = 9;
    public static final int FORMAT_FIELD_NUMBER = 11;
    public static final int IN_FOCUS_FIELD_NUMBER = 13;
    public static final int LINEITEM_ID_FIELD_NUMBER = 3;
    public static final int OPTION_ID_FIELD_NUMBER = 5;
    public static final int OPTION_POSITION_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PRODUCT_NAME_FIELD_NUMBER = 12;
    public static final int QUESTION_ID_FIELD_NUMBER = 4;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    public static final int RESPONSE_FIELD_NUMBER = 7;
    public static final int SLOT_FIELD_NUMBER = 10;
    private int bitField0_;
    private boolean inFocus_;
    private int optionPosition_;
    private String adId_ = "";
    private String requestId_ = "";
    private String lineitemId_ = "";
    private String questionId_ = "";
    private String optionId_ = "";
    private String response_ = "";
    private String event_ = "";
    private String eventReason_ = "";
    private String slot_ = "";
    private String format_ = "";
    private String productName_ = "";

    static {
        SurveyAdEvent surveyAdEvent = new SurveyAdEvent();
        DEFAULT_INSTANCE = surveyAdEvent;
        AbstractC0269h.registerDefaultInstance(SurveyAdEvent.class, surveyAdEvent);
    }

    private SurveyAdEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2795n(SurveyAdEvent surveyAdEvent, String str) {
        surveyAdEvent.getClass();
        str.getClass();
        surveyAdEvent.bitField0_ |= 1;
        surveyAdEvent.adId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m2796o(SurveyAdEvent surveyAdEvent, String str) {
        surveyAdEvent.getClass();
        surveyAdEvent.bitField0_ |= 128;
        surveyAdEvent.event_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2797p(SurveyAdEvent surveyAdEvent, String str) {
        surveyAdEvent.getClass();
        str.getClass();
        surveyAdEvent.bitField0_ |= 1024;
        surveyAdEvent.format_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2798q(SurveyAdEvent surveyAdEvent, boolean z) {
        surveyAdEvent.bitField0_ |= 4096;
        surveyAdEvent.inFocus_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m2799r(SurveyAdEvent surveyAdEvent, String str) {
        surveyAdEvent.getClass();
        surveyAdEvent.bitField0_ |= 4;
        surveyAdEvent.lineitemId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m2800s(SurveyAdEvent surveyAdEvent, String str) {
        surveyAdEvent.getClass();
        str.getClass();
        surveyAdEvent.bitField0_ |= 16;
        surveyAdEvent.optionId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m2801t(SurveyAdEvent surveyAdEvent, int i) {
        surveyAdEvent.bitField0_ |= 32;
        surveyAdEvent.optionPosition_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static void m2802u(SurveyAdEvent surveyAdEvent) {
        surveyAdEvent.getClass();
        surveyAdEvent.bitField0_ |= 2048;
        surveyAdEvent.productName_ = "brand_survey";
    }

    /* JADX INFO: renamed from: v */
    public static void m2803v(SurveyAdEvent surveyAdEvent, String str) {
        surveyAdEvent.getClass();
        str.getClass();
        surveyAdEvent.bitField0_ |= 8;
        surveyAdEvent.questionId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m2804w(SurveyAdEvent surveyAdEvent, String str) {
        surveyAdEvent.getClass();
        surveyAdEvent.bitField0_ |= 2;
        surveyAdEvent.requestId_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m2805x(SurveyAdEvent surveyAdEvent, String str) {
        surveyAdEvent.getClass();
        surveyAdEvent.bitField0_ |= 64;
        surveyAdEvent.response_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static ba61 m2806y() {
        return (ba61) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဇ\f", new Object[]{"bitField0_", "adId_", "requestId_", "lineitemId_", "questionId_", "optionId_", "optionPosition_", "response_", "event_", "eventReason_", "slot_", "format_", "productName_", "inFocus_"});
        }
        if (iOrdinal == 3) {
            return new SurveyAdEvent();
        }
        if (iOrdinal == 4) {
            return new ba61(DEFAULT_INSTANCE);
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
        synchronized (SurveyAdEvent.class) {
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
