package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qm71;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class TopSuggestion extends AbstractC0269h implements sre0 {
    public static final int CONTENT_FIELD_NUMBER = 3;
    private static final TopSuggestion DEFAULT_INSTANCE;
    public static final int DISPLAY_TEXT_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String id_ = "";
    private String title_ = "";
    private String content_ = "";
    private String displayText_ = "";

    static {
        TopSuggestion topSuggestion = new TopSuggestion();
        DEFAULT_INSTANCE = topSuggestion;
        AbstractC0269h.registerDefaultInstance(TopSuggestion.class, topSuggestion);
    }

    private TopSuggestion() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"id_", "title_", "content_", "displayText_"});
        }
        if (iOrdinal == 3) {
            return new TopSuggestion();
        }
        if (iOrdinal == 4) {
            return new qm71(DEFAULT_INSTANCE, 26);
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
        synchronized (TopSuggestion.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m17529n() {
        return this.content_;
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
