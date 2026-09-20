package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v9k;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class CreateConversationResponse extends AbstractC0269h implements sre0 {
    public static final int AUDIO_URL_FIELD_NUMBER = 3;
    public static final int CONVERSATION_ID_FIELD_NUMBER = 1;
    public static final int CONVERSATION_NAME_FIELD_NUMBER = 5;
    private static final CreateConversationResponse DEFAULT_INSTANCE;
    public static final int INITIAL_RESPONSE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private AgentMessage initialResponse_;
    private String conversationId_ = "";
    private String audioUrl_ = "";
    private String conversationName_ = "";

    static {
        CreateConversationResponse createConversationResponse = new CreateConversationResponse();
        DEFAULT_INSTANCE = createConversationResponse;
        AbstractC0269h.registerDefaultInstance(CreateConversationResponse.class, createConversationResponse);
    }

    private CreateConversationResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ለ\u0001\u0005Ȉ", new Object[]{"bitField0_", "conversationId_", "initialResponse_", "audioUrl_", "conversationName_"});
        }
        if (iOrdinal == 3) {
            return new CreateConversationResponse();
        }
        if (iOrdinal == 4) {
            return new v9k(DEFAULT_INSTANCE, 23);
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
        synchronized (CreateConversationResponse.class) {
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
    public final String m2895n() {
        return this.audioUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m2896o() {
        return this.conversationId_;
    }

    /* JADX INFO: renamed from: p */
    public final String m2897p() {
        return this.conversationName_;
    }

    /* JADX INFO: renamed from: q */
    public final AgentMessage m2898q() {
        AgentMessage agentMessage = this.initialResponse_;
        return agentMessage == null ? AgentMessage.m2862p() : agentMessage;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2899r() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2900s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
