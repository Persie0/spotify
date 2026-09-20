package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wqw0;
import p204p.xqw0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ReportAnswer extends AbstractC0269h implements sre0 {
    public static final int ANSWER_STATE_FIELD_NUMBER = 2;
    private static final ReportAnswer DEFAULT_INSTANCE;
    public static final int DWELL_TIME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int QUESTION_ID_FIELD_NUMBER = 1;
    private int answerState_;
    private int bitField0_;
    private Duration dwellTime_;
    private String questionId_ = "";

    static {
        ReportAnswer reportAnswer = new ReportAnswer();
        DEFAULT_INSTANCE = reportAnswer;
        AbstractC0269h.registerDefaultInstance(ReportAnswer.class, reportAnswer);
    }

    private ReportAnswer() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15912n(ReportAnswer reportAnswer, xqw0 xqw0Var) {
        reportAnswer.getClass();
        reportAnswer.answerState_ = xqw0Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m15913o(ReportAnswer reportAnswer, Duration duration) {
        reportAnswer.getClass();
        reportAnswer.dwellTime_ = duration;
        reportAnswer.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m15914p(ReportAnswer reportAnswer, String str) {
        reportAnswer.getClass();
        str.getClass();
        reportAnswer.questionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static wqw0 m15915q() {
        return (wqw0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000", new Object[]{"bitField0_", "questionId_", "answerState_", "dwellTime_"});
        }
        if (iOrdinal == 3) {
            return new ReportAnswer();
        }
        if (iOrdinal == 4) {
            return new wqw0(DEFAULT_INSTANCE);
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
        synchronized (ReportAnswer.class) {
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
