package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ChatEntryPoint extends AbstractC0269h implements sre0 {
    public static final int CHAT_STARTER_ITEMS_FIELD_NUMBER = 2;
    public static final int CONVERSATION_ID_FIELD_NUMBER = 3;
    private static final ChatEntryPoint DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 1;
    private String placeholder_ = "";
    private ae50 chatStarterItems_ = AbstractC0269h.emptyProtobufList();
    private String conversationId_ = "";

    static {
        ChatEntryPoint chatEntryPoint = new ChatEntryPoint();
        DEFAULT_INSTANCE = chatEntryPoint;
        AbstractC0269h.registerDefaultInstance(ChatEntryPoint.class, chatEntryPoint);
    }

    private ChatEntryPoint() {
    }

    /* JADX INFO: renamed from: p */
    public static ChatEntryPoint m20785p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"placeholder_", "chatStarterItems_", ConversationStarterItem.class, "conversationId_"});
        }
        if (iOrdinal == 3) {
            return new ChatEntryPoint();
        }
        if (iOrdinal == 4) {
            return new ioc(DEFAULT_INSTANCE, 9);
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
        synchronized (ChatEntryPoint.class) {
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
    public final ae50 m20786n() {
        return this.chatStarterItems_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m20787o() {
        return this.conversationId_;
    }

    /* JADX INFO: renamed from: q */
    public final String m20788q() {
        return this.placeholder_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
