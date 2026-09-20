package com.spotify.agentstories.p017v1;

import com.google.protobuf.AbstractC0269h;
import p204p.asz0;
import p204p.bsz0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zrz0;

/* JADX INFO: loaded from: classes4.dex */
public final class SendStoryFeedbackRequest extends AbstractC0269h implements sre0 {
    private static final SendStoryFeedbackRequest DEFAULT_INSTANCE;
    public static final int FEEDBACK_OPTION_FIELD_NUMBER = 4;
    public static final int FEEDBACK_RATING_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STORY_ID_FIELD_NUMBER = 1;
    public static final int TEXT_FIELD_NUMBER = 3;
    private int bitField0_;
    private int feedbackOption_;
    private int feedbackRating_;
    private String storyId_ = "";
    private String text_ = "";

    static {
        SendStoryFeedbackRequest sendStoryFeedbackRequest = new SendStoryFeedbackRequest();
        DEFAULT_INSTANCE = sendStoryFeedbackRequest;
        AbstractC0269h.registerDefaultInstance(SendStoryFeedbackRequest.class, sendStoryFeedbackRequest);
    }

    private SendStoryFeedbackRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3017n(SendStoryFeedbackRequest sendStoryFeedbackRequest, asz0 asz0Var) {
        sendStoryFeedbackRequest.getClass();
        sendStoryFeedbackRequest.feedbackOption_ = asz0Var.getNumber();
        sendStoryFeedbackRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m3018o(SendStoryFeedbackRequest sendStoryFeedbackRequest, bsz0 bsz0Var) {
        sendStoryFeedbackRequest.getClass();
        sendStoryFeedbackRequest.feedbackRating_ = bsz0Var.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m3019p(SendStoryFeedbackRequest sendStoryFeedbackRequest, String str) {
        sendStoryFeedbackRequest.getClass();
        str.getClass();
        sendStoryFeedbackRequest.storyId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3020q(SendStoryFeedbackRequest sendStoryFeedbackRequest, String str) {
        sendStoryFeedbackRequest.getClass();
        sendStoryFeedbackRequest.text_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static zrz0 m3021r() {
        return (zrz0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004ဌ\u0000", new Object[]{"bitField0_", "storyId_", "feedbackRating_", "text_", "feedbackOption_"});
        }
        if (iOrdinal == 3) {
            return new SendStoryFeedbackRequest();
        }
        if (iOrdinal == 4) {
            return new zrz0(DEFAULT_INSTANCE);
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
        synchronized (SendStoryFeedbackRequest.class) {
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
