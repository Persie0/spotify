package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ijt0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class QuestionFeedback extends AbstractC0269h implements sre0 {
    private static final QuestionFeedback DEFAULT_INSTANCE;
    public static final int FEEDBACK_CONTEXT_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int RATING_FIELD_NUMBER = 1;
    public static final int SELECTED_REASONS_FIELD_NUMBER = 3;
    public static final int TEXT_FEEDBACK_FIELD_NUMBER = 2;
    private int bitField0_;
    private int rating_;
    private String textFeedback_ = "";
    private ae50 selectedReasons_ = AbstractC0269h.emptyProtobufList();
    private String feedbackContext_ = "";

    static {
        QuestionFeedback questionFeedback = new QuestionFeedback();
        DEFAULT_INSTANCE = questionFeedback;
        AbstractC0269h.registerDefaultInstance(QuestionFeedback.class, questionFeedback);
    }

    private QuestionFeedback() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15891n(QuestionFeedback questionFeedback, Iterable iterable) {
        ae50 ae50Var = questionFeedback.selectedReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            questionFeedback.selectedReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, questionFeedback.selectedReasons_);
    }

    /* JADX INFO: renamed from: o */
    public static void m15892o(QuestionFeedback questionFeedback, int i) {
        questionFeedback.rating_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m15893p(QuestionFeedback questionFeedback, String str) {
        questionFeedback.getClass();
        str.getClass();
        questionFeedback.bitField0_ |= 1;
        questionFeedback.textFeedback_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ijt0 m15894q() {
        return (ijt0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002ለ\u0000\u0003Ț\u0004ለ\u0001", new Object[]{"bitField0_", "rating_", "textFeedback_", "selectedReasons_", "feedbackContext_"});
        }
        if (iOrdinal == 3) {
            return new QuestionFeedback();
        }
        if (iOrdinal == 4) {
            return new ijt0(DEFAULT_INSTANCE);
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
        synchronized (QuestionFeedback.class) {
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
