package com.spotify.decipher.agent.p057v1;

import com.google.protobuf.AbstractC0269h;
import p204p.iu0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class AgentMessage extends AbstractC0269h implements sre0 {
    public static final int AGENT_REPLY_FIELD_NUMBER = 3;
    public static final int CLIENT_EVENT_FIELD_NUMBER = 6;
    public static final int CONNECTED_FIELD_NUMBER = 1;
    public static final int CONVERSATION_STARTERS_FIELD_NUMBER = 5;
    private static final AgentMessage DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_RESET_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int payloadCase_ = 0;
    private Object payload_;

    static {
        AgentMessage agentMessage = new AgentMessage();
        DEFAULT_INSTANCE = agentMessage;
        AbstractC0269h.registerDefaultInstance(AgentMessage.class, agentMessage);
    }

    private AgentMessage() {
    }

    /* JADX INFO: renamed from: o */
    public static AgentMessage m9128o(byte[] bArr) {
        return (AgentMessage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"payload_", "payloadCase_", Connected.class, Status.class, AgentReply.class, Error.class, ConversationStarters.class, ClientEvent.class, SessionReset.class});
        }
        if (iOrdinal == 3) {
            return new AgentMessage();
        }
        if (iOrdinal == 4) {
            return new iu0(DEFAULT_INSTANCE, 13);
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
        synchronized (AgentMessage.class) {
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
    public final int m9129n() {
        switch (this.payloadCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
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
