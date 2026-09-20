package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v9k;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ConversationStarterItem extends AbstractC0269h implements sre0 {
    public static final int CONVERSATION_ID_FIELD_NUMBER = 2;
    private static final ConversationStarterItem DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 3;
    private String prompt_ = "";
    private String conversationId_ = "";
    private String uri_ = "";

    static {
        ConversationStarterItem conversationStarterItem = new ConversationStarterItem();
        DEFAULT_INSTANCE = conversationStarterItem;
        AbstractC0269h.registerDefaultInstance(ConversationStarterItem.class, conversationStarterItem);
    }

    private ConversationStarterItem() {
    }

    /* JADX INFO: renamed from: o */
    public static ConversationStarterItem m20800o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"prompt_", "conversationId_", "uri_"});
        }
        if (iOrdinal == 3) {
            return new ConversationStarterItem();
        }
        if (iOrdinal == 4) {
            return new v9k(DEFAULT_INSTANCE, 11);
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
        synchronized (ConversationStarterItem.class) {
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

    public final String getPrompt() {
        return this.prompt_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m20801n() {
        return this.conversationId_;
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
