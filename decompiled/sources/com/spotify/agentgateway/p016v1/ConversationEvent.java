package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.bnk;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class ConversationEvent extends AbstractC0269h implements sre0 {
    private static final ConversationEvent DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_UPDATED_FIELD_NUMBER = 2;
    public static final int SESSION_SAVED_FIELD_NUMBER = 1;
    private int eventCase_ = 0;
    private Object event_;

    static {
        ConversationEvent conversationEvent = new ConversationEvent();
        DEFAULT_INSTANCE = conversationEvent;
        AbstractC0269h.registerDefaultInstance(ConversationEvent.class, conversationEvent);
    }

    private ConversationEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2879n(ConversationEvent conversationEvent, PlaylistUpdatedEvent playlistUpdatedEvent) {
        conversationEvent.getClass();
        playlistUpdatedEvent.getClass();
        conversationEvent.event_ = playlistUpdatedEvent;
        conversationEvent.eventCase_ = 2;
    }

    /* JADX INFO: renamed from: o */
    public static bnk m2880o() {
        return (bnk) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"event_", "eventCase_", SessionSavedEvent.class, PlaylistUpdatedEvent.class});
        }
        if (iOrdinal == 3) {
            return new ConversationEvent();
        }
        if (iOrdinal == 4) {
            return new bnk(DEFAULT_INSTANCE);
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
        synchronized (ConversationEvent.class) {
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
