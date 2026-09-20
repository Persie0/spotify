package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class GetConversationResponse extends AbstractC0269h implements sre0 {
    public static final int CONVERSATION_NAME_FIELD_NUMBER = 3;
    private static final GetConversationResponse DEFAULT_INSTANCE;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private ae50 messages_ = AbstractC0269h.emptyProtobufList();
    private String nextPageToken_ = "";
    private String conversationName_ = "";

    static {
        GetConversationResponse getConversationResponse = new GetConversationResponse();
        DEFAULT_INSTANCE = getConversationResponse;
        AbstractC0269h.registerDefaultInstance(GetConversationResponse.class, getConversationResponse);
    }

    private GetConversationResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ", new Object[]{"messages_", Message.class, "nextPageToken_", "conversationName_"});
        }
        if (iOrdinal == 3) {
            return new GetConversationResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 25);
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
        synchronized (GetConversationResponse.class) {
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

    public final List getMessagesList() {
        return this.messages_;
    }

    public final String getNextPageToken() {
        return this.nextPageToken_;
    }

    /* JADX INFO: renamed from: n */
    public final String m2917n() {
        return this.conversationName_;
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
