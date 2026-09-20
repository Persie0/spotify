package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.iu0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class AgentMessage extends AbstractC0269h implements sre0 {
    public static final int ACTIONS_FIELD_NUMBER = 2;
    public static final int CONTENTS_FIELD_NUMBER = 1;
    private static final AgentMessage DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 3;
    public static final int NAVIGATION_HINT_URI_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ae50 contents_ = AbstractC0269h.emptyProtobufList();
    private ae50 actions_ = AbstractC0269h.emptyProtobufList();
    private String messageId_ = "";
    private String navigationHintUri_ = "";

    static {
        AgentMessage agentMessage = new AgentMessage();
        DEFAULT_INSTANCE = agentMessage;
        AbstractC0269h.registerDefaultInstance(AgentMessage.class, agentMessage);
    }

    private AgentMessage() {
    }

    /* JADX INFO: renamed from: p */
    public static AgentMessage m2862p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003Ȉ\u0005ለ\u0000", new Object[]{"bitField0_", "contents_", Content.class, "actions_", Action.class, "messageId_", "navigationHintUri_"});
        }
        if (iOrdinal == 3) {
            return new AgentMessage();
        }
        if (iOrdinal == 4) {
            return new iu0(DEFAULT_INSTANCE, 14);
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

    public final String getMessageId() {
        return this.messageId_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m2863n() {
        return this.actions_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m2864o() {
        return this.contents_;
    }

    /* JADX INFO: renamed from: q */
    public final String m2865q() {
        return this.navigationHintUri_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2866r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
