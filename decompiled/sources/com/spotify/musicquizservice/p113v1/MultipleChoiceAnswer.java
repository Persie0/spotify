package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.d2i0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MultipleChoiceAnswer extends AbstractC0269h implements sre0 {
    public static final int CORRECT_ANSWER_INDEX_FIELD_NUMBER = 2;
    private static final MultipleChoiceAnswer DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private Object correctAnswerIdentifier_;
    private int correctAnswerIdentifierCase_ = 0;
    private ae50 options_ = AbstractC0269h.emptyProtobufList();

    static {
        MultipleChoiceAnswer multipleChoiceAnswer = new MultipleChoiceAnswer();
        DEFAULT_INSTANCE = multipleChoiceAnswer;
        AbstractC0269h.registerDefaultInstance(MultipleChoiceAnswer.class, multipleChoiceAnswer);
    }

    private MultipleChoiceAnswer() {
    }

    /* JADX INFO: renamed from: o */
    public static MultipleChoiceAnswer m15865o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u00027\u0000", new Object[]{"correctAnswerIdentifier_", "correctAnswerIdentifierCase_", "options_"});
        }
        if (iOrdinal == 3) {
            return new MultipleChoiceAnswer();
        }
        if (iOrdinal == 4) {
            return new d2i0(DEFAULT_INSTANCE, 8);
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
        synchronized (MultipleChoiceAnswer.class) {
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

    /* JADX INFO: renamed from: n */
    public final int m15866n() {
        if (this.correctAnswerIdentifierCase_ == 2) {
            return ((Integer) this.correctAnswerIdentifier_).intValue();
        }
        return 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m15867p() {
        return this.options_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
