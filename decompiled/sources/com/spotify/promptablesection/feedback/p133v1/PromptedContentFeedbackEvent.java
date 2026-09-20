package com.spotify.promptablesection.feedback.p133v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zos0;

/* JADX INFO: loaded from: classes10.dex */
public final class PromptedContentFeedbackEvent extends AbstractC0269h implements sre0 {
    public static final int CATEGORY_FIELD_NUMBER = 7;
    public static final int CONTENT_DESCRIPTION_FIELD_NUMBER = 4;
    private static final PromptedContentFeedbackEvent DEFAULT_INSTANCE;
    public static final int ITEMS_IN_RESPONSE_FIELD_NUMBER = 5;
    public static final int LIKED_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int TEXT_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int USER_PROMPT_FIELD_NUMBER = 2;
    private int category_;
    private boolean liked_;
    private String requestId_ = "";
    private String userPrompt_ = "";
    private String title_ = "";
    private String contentDescription_ = "";
    private ae50 itemsInResponse_ = AbstractC0269h.emptyProtobufList();
    private String text_ = "";

    static {
        PromptedContentFeedbackEvent promptedContentFeedbackEvent = new PromptedContentFeedbackEvent();
        DEFAULT_INSTANCE = promptedContentFeedbackEvent;
        AbstractC0269h.registerDefaultInstance(PromptedContentFeedbackEvent.class, promptedContentFeedbackEvent);
    }

    private PromptedContentFeedbackEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19928n(PromptedContentFeedbackEvent promptedContentFeedbackEvent, Iterable iterable) {
        ae50 ae50Var = promptedContentFeedbackEvent.itemsInResponse_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            promptedContentFeedbackEvent.itemsInResponse_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, promptedContentFeedbackEvent.itemsInResponse_);
    }

    /* JADX INFO: renamed from: o */
    public static void m19929o(PromptedContentFeedbackEvent promptedContentFeedbackEvent, int i) {
        promptedContentFeedbackEvent.category_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m19930p(PromptedContentFeedbackEvent promptedContentFeedbackEvent, String str) {
        promptedContentFeedbackEvent.getClass();
        promptedContentFeedbackEvent.contentDescription_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19931q(PromptedContentFeedbackEvent promptedContentFeedbackEvent, boolean z) {
        promptedContentFeedbackEvent.liked_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m19932r(PromptedContentFeedbackEvent promptedContentFeedbackEvent, String str) {
        promptedContentFeedbackEvent.getClass();
        promptedContentFeedbackEvent.requestId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m19933s(PromptedContentFeedbackEvent promptedContentFeedbackEvent, String str) {
        promptedContentFeedbackEvent.getClass();
        promptedContentFeedbackEvent.text_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m19934t(PromptedContentFeedbackEvent promptedContentFeedbackEvent, String str) {
        promptedContentFeedbackEvent.getClass();
        promptedContentFeedbackEvent.title_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m19935u(PromptedContentFeedbackEvent promptedContentFeedbackEvent, String str) {
        promptedContentFeedbackEvent.getClass();
        promptedContentFeedbackEvent.userPrompt_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static zos0 m19936v() {
        return (zos0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ț\u0006\u0007\u0007\u0004\bȈ", new Object[]{"requestId_", "userPrompt_", "title_", "contentDescription_", "itemsInResponse_", "liked_", "category_", "text_"});
        }
        if (iOrdinal == 3) {
            return new PromptedContentFeedbackEvent();
        }
        if (iOrdinal == 4) {
            return new zos0(DEFAULT_INSTANCE);
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
        synchronized (PromptedContentFeedbackEvent.class) {
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
