package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class GetConversationStartersResponse extends AbstractC0269h implements sre0 {
    public static final int BIG_CHAT_HIGHLIGHTED_INTENT_ID_FIELD_NUMBER = 6;
    public static final int CONVERSATION_STARTERS_FIELD_NUMBER = 2;
    private static final GetConversationStartersResponse DEFAULT_INSTANCE;
    public static final int GROUPED_CONVERSATION_STARTERS_FIELD_NUMBER = 4;
    public static final int MINI_CHAT_HIGHLIGHTED_INTENT_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PROSUP_REQUEST_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private ae50 conversationStarters_ = AbstractC0269h.emptyProtobufList();
    private String prosupRequestId_ = "";
    private ae50 groupedConversationStarters_ = AbstractC0269h.emptyProtobufList();
    private String miniChatHighlightedIntentId_ = "";
    private String bigChatHighlightedIntentId_ = "";

    static {
        GetConversationStartersResponse getConversationStartersResponse = new GetConversationStartersResponse();
        DEFAULT_INSTANCE = getConversationStartersResponse;
        AbstractC0269h.registerDefaultInstance(GetConversationStartersResponse.class, getConversationStartersResponse);
    }

    private GetConversationStartersResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0002\u0000\u0002\u001b\u0003Ȉ\u0004\u001b\u0005ለ\u0000\u0006ለ\u0001", new Object[]{"bitField0_", "conversationStarters_", ConversationStarter.class, "prosupRequestId_", "groupedConversationStarters_", ConversationStarterIntentGroup.class, "miniChatHighlightedIntentId_", "bigChatHighlightedIntentId_"});
        }
        if (iOrdinal == 3) {
            return new GetConversationStartersResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 26);
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
        synchronized (GetConversationStartersResponse.class) {
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
    public final String m2924n() {
        return this.bigChatHighlightedIntentId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m2925o() {
        return this.conversationStarters_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m2926p() {
        return this.groupedConversationStarters_;
    }

    /* JADX INFO: renamed from: q */
    public final String m2927q() {
        return this.miniChatHighlightedIntentId_;
    }

    /* JADX INFO: renamed from: r */
    public final String m2928r() {
        return this.prosupRequestId_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2929s() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2930t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
