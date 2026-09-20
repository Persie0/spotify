package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.nnq;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class DeleteConversationRequest extends AbstractC0269h implements sre0 {
    public static final int CONVERSATION_ID_FIELD_NUMBER = 1;
    private static final DeleteConversationRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private String conversationId_ = "";

    static {
        DeleteConversationRequest deleteConversationRequest = new DeleteConversationRequest();
        DEFAULT_INSTANCE = deleteConversationRequest;
        AbstractC0269h.registerDefaultInstance(DeleteConversationRequest.class, deleteConversationRequest);
    }

    private DeleteConversationRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2906n(DeleteConversationRequest deleteConversationRequest, String str) {
        deleteConversationRequest.getClass();
        str.getClass();
        deleteConversationRequest.conversationId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static nnq m2908p() {
        return (nnq) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"conversationId_"});
        }
        if (iOrdinal == 3) {
            return new DeleteConversationRequest();
        }
        if (iOrdinal == 4) {
            return new nnq();
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
        synchronized (DeleteConversationRequest.class) {
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
