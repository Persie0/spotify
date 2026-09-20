package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v9k;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class ConversationStarterIntentGroup extends AbstractC0269h implements sre0 {
    private static final ConversationStarterIntentGroup DEFAULT_INSTANCE;
    public static final int INTENT_DETAILS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SUGGESTIONS_FIELD_NUMBER = 2;
    private int bitField0_;
    private ConversationStarterIntent intentDetails_;
    private ae50 suggestions_ = AbstractC0269h.emptyProtobufList();

    static {
        ConversationStarterIntentGroup conversationStarterIntentGroup = new ConversationStarterIntentGroup();
        DEFAULT_INSTANCE = conversationStarterIntentGroup;
        AbstractC0269h.registerDefaultInstance(ConversationStarterIntentGroup.class, conversationStarterIntentGroup);
    }

    private ConversationStarterIntentGroup() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "intentDetails_", "suggestions_", ConversationStarter.class});
        }
        if (iOrdinal == 3) {
            return new ConversationStarterIntentGroup();
        }
        if (iOrdinal == 4) {
            return new v9k(DEFAULT_INSTANCE, 10);
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
        synchronized (ConversationStarterIntentGroup.class) {
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
    public final ConversationStarterIntent m2885n() {
        ConversationStarterIntent conversationStarterIntent = this.intentDetails_;
        return conversationStarterIntent == null ? ConversationStarterIntent.m2883n() : conversationStarterIntent;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m2886o() {
        return this.suggestions_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2887p() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
