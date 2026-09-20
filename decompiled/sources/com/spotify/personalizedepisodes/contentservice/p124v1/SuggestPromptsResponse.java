package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.cm51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class SuggestPromptsResponse extends AbstractC0269h implements sre0 {
    public static final int CATEGORIES_FIELD_NUMBER = 2;
    private static final SuggestPromptsResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPTS_FIELD_NUMBER = 1;
    public static final int TOP_SUGGESTIONS_FIELD_NUMBER = 3;
    private ae50 prompts_ = AbstractC0269h.emptyProtobufList();
    private ae50 categories_ = AbstractC0269h.emptyProtobufList();
    private ae50 topSuggestions_ = AbstractC0269h.emptyProtobufList();

    static {
        SuggestPromptsResponse suggestPromptsResponse = new SuggestPromptsResponse();
        DEFAULT_INSTANCE = suggestPromptsResponse;
        AbstractC0269h.registerDefaultInstance(SuggestPromptsResponse.class, suggestPromptsResponse);
    }

    private SuggestPromptsResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001Ț\u0002\u001b\u0003\u001b", new Object[]{"prompts_", "categories_", PromptCategory.class, "topSuggestions_", TopSuggestion.class});
        }
        if (iOrdinal == 3) {
            return new SuggestPromptsResponse();
        }
        if (iOrdinal == 4) {
            return new cm51(DEFAULT_INSTANCE, 14);
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
        synchronized (SuggestPromptsResponse.class) {
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
    public final ae50 m17523n() {
        return this.categories_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m17524o() {
        return this.topSuggestions_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
