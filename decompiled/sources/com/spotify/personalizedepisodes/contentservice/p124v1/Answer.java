package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.aw2;
import p204p.g35;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Answer extends AbstractC0269h implements sre0 {
    public static final int ANSWER_SOURCE_FIELD_NUMBER = 4;
    private static final Answer DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SELECTED_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_NUMBER = 2;
    private int answerSource_;
    private int bitField0_;
    private boolean selected_;
    private String id_ = "";
    private String text_ = "";
    private String description_ = "";

    static {
        Answer answer = new Answer();
        DEFAULT_INSTANCE = answer;
        AbstractC0269h.registerDefaultInstance(Answer.class, answer);
    }

    private Answer() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004\f\u0005\u0007", new Object[]{"bitField0_", "id_", "text_", "description_", "answerSource_", "selected_"});
        }
        if (iOrdinal == 3) {
            return new Answer();
        }
        if (iOrdinal == 4) {
            return new aw2(DEFAULT_INSTANCE, 14);
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
        synchronized (Answer.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getId() {
        return this.id_;
    }

    public final boolean hasDescription() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final g35 m17359n() {
        g35 g35Var;
        int i = this.answerSource_;
        if (i == 0) {
            g35Var = g35.ANSWER_SOURCE_UNSPECIFIED;
        } else if (i == 1) {
            g35Var = g35.ANSWER_SOURCE_PRESET;
        } else if (i != 2) {
            g35Var = i != 3 ? null : g35.ANSWER_SOURCE_USER;
        } else {
            g35Var = g35.ANSWER_SOURCE_USER_PROFILE;
        }
        return g35Var == null ? g35.UNRECOGNIZED : g35Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m17360o() {
        return this.selected_;
    }

    /* JADX INFO: renamed from: p */
    public final String m17361p() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
