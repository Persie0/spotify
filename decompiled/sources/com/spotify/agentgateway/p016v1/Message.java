package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.dbd0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class Message extends AbstractC0269h implements sre0 {
    public static final int AGENT_MESSAGE_FIELD_NUMBER = 1;
    public static final int CREATE_TIMESTAMP_FIELD_NUMBER = 3;
    private static final Message DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int USER_MESSAGE_FIELD_NUMBER = 2;
    private int bitField0_;
    private long createTimestamp_;
    private int messageContentsCase_ = 0;
    private Object messageContents_;

    static {
        Message message = new Message();
        DEFAULT_INSTANCE = message;
        AbstractC0269h.registerDefaultInstance(Message.class, message);
    }

    private Message() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဂ\u0000", new Object[]{"messageContents_", "messageContentsCase_", "bitField0_", AgentMessage.class, UserMessage.class, "createTimestamp_"});
        }
        if (iOrdinal == 3) {
            return new Message();
        }
        if (iOrdinal == 4) {
            return new dbd0(DEFAULT_INSTANCE, 13);
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
        synchronized (Message.class) {
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
    public final AgentMessage m2942n() {
        return this.messageContentsCase_ == 1 ? (AgentMessage) this.messageContents_ : AgentMessage.m2862p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final long m2943o() {
        return this.createTimestamp_;
    }

    /* JADX INFO: renamed from: p */
    public final UserMessage m2944p() {
        return this.messageContentsCase_ == 2 ? (UserMessage) this.messageContents_ : UserMessage.m3009p();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m2945q() {
        return this.messageContentsCase_ == 1;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2946r() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2947s() {
        return this.messageContentsCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
