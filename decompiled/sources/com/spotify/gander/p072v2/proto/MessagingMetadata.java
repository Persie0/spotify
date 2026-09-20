package com.spotify.gander.p072v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.e0f0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class MessagingMetadata extends AbstractC0269h implements sre0 {
    private static final MessagingMetadata DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String opportunityId_ = "";
    private String messageId_ = "";

    static {
        MessagingMetadata messagingMetadata = new MessagingMetadata();
        DEFAULT_INSTANCE = messagingMetadata;
        AbstractC0269h.registerDefaultInstance(MessagingMetadata.class, messagingMetadata);
    }

    private MessagingMetadata() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11076n(MessagingMetadata messagingMetadata, String str) {
        messagingMetadata.getClass();
        messagingMetadata.messageId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m11077o(MessagingMetadata messagingMetadata, String str) {
        messagingMetadata.getClass();
        messagingMetadata.opportunityId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static MessagingMetadata m11078p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static e0f0 m11079r() {
        return (e0f0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"opportunityId_", "messageId_"});
        }
        if (iOrdinal == 3) {
            return new MessagingMetadata();
        }
        if (iOrdinal == 4) {
            return new e0f0(DEFAULT_INSTANCE);
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
        synchronized (MessagingMetadata.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final String m11080q() {
        return this.opportunityId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
