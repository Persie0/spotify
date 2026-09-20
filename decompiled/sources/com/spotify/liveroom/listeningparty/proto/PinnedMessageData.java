package com.spotify.liveroom.listeningparty.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PinnedMessageData extends AbstractC0269h implements sre0 {
    private static final PinnedMessageData DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PINNED_MESSAGES_FIELD_NUMBER = 1;
    private ae50 pinnedMessages_ = AbstractC0269h.emptyProtobufList();

    public static final class PinnedMessage extends AbstractC0269h implements sre0 {
        private static final PinnedMessage DEFAULT_INSTANCE;
        public static final int GIFMESSAGE_FIELD_NUMBER = 4;
        public static final int MESSAGEUUID_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int SENDER_FIELD_NUMBER = 2;
        public static final int SENDER_USER_FIELD_NUMBER = 6;
        public static final int SENTAT_FIELD_NUMBER = 5;
        public static final int TEXTMESSAGE_FIELD_NUMBER = 3;
        private int bitField0_;
        private Object payload_;
        private User senderUser_;
        private UserIdentifier sender_;
        private Timestamp sentAt_;
        private int payloadCase_ = 0;
        private String messageUuid_ = "";

        public static final class GifMessage extends AbstractC0269h implements sre0 {
            private static final GifMessage DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int URL_FIELD_NUMBER = 1;
            private String url_ = "";

            static {
                GifMessage gifMessage = new GifMessage();
                DEFAULT_INSTANCE = gifMessage;
                AbstractC0269h.registerDefaultInstance(GifMessage.class, gifMessage);
            }

            private GifMessage() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
                }
                if (iOrdinal == 3) {
                    return new GifMessage();
                }
                if (iOrdinal == 4) {
                    return new C0842g(DEFAULT_INSTANCE);
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
                synchronized (GifMessage.class) {
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

        public static final class TextMessage extends AbstractC0269h implements sre0 {
            public static final int BODY_FIELD_NUMBER = 1;
            private static final TextMessage DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER;
            private String body_ = "";

            static {
                TextMessage textMessage = new TextMessage();
                DEFAULT_INSTANCE = textMessage;
                AbstractC0269h.registerDefaultInstance(TextMessage.class, textMessage);
            }

            private TextMessage() {
            }

            /* JADX INFO: renamed from: o */
            public static TextMessage m13098o() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"body_"});
                }
                if (iOrdinal == 3) {
                    return new TextMessage();
                }
                if (iOrdinal == 4) {
                    return new C0843h(DEFAULT_INSTANCE);
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
                synchronized (TextMessage.class) {
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
            public final String m13099n() {
                return this.body_;
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

        static {
            PinnedMessage pinnedMessage = new PinnedMessage();
            DEFAULT_INSTANCE = pinnedMessage;
            AbstractC0269h.registerDefaultInstance(PinnedMessage.class, pinnedMessage);
        }

        private PinnedMessage() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003<\u0000\u0004<\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"payload_", "payloadCase_", "bitField0_", "messageUuid_", "sender_", TextMessage.class, GifMessage.class, "sentAt_", "senderUser_"});
            }
            if (iOrdinal == 3) {
                return new PinnedMessage();
            }
            if (iOrdinal == 4) {
                return new C0841f(DEFAULT_INSTANCE);
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
            synchronized (PinnedMessage.class) {
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
        public final String m13092n() {
            return this.messageUuid_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final User m13093o() {
            User user = this.senderUser_;
            return user == null ? User.m13100o() : user;
        }

        /* JADX INFO: renamed from: p */
        public final Timestamp m13094p() {
            Timestamp timestamp = this.sentAt_;
            return timestamp == null ? Timestamp.m1965q() : timestamp;
        }

        /* JADX INFO: renamed from: q */
        public final TextMessage m13095q() {
            return this.payloadCase_ == 3 ? (TextMessage) this.payload_ : TextMessage.m13098o();
        }

        /* JADX INFO: renamed from: r */
        public final boolean m13096r() {
            return (this.bitField0_ & 4) != 0;
        }

        /* JADX INFO: renamed from: s */
        public final boolean m13097s() {
            return this.payloadCase_ == 3;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PinnedMessageData pinnedMessageData = new PinnedMessageData();
        DEFAULT_INSTANCE = pinnedMessageData;
        AbstractC0269h.registerDefaultInstance(PinnedMessageData.class, pinnedMessageData);
    }

    private PinnedMessageData() {
    }

    /* JADX INFO: renamed from: n */
    public static PinnedMessageData m13090n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"pinnedMessages_", PinnedMessage.class});
        }
        if (iOrdinal == 3) {
            return new PinnedMessageData();
        }
        if (iOrdinal == 4) {
            return new C0840e(DEFAULT_INSTANCE);
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
        synchronized (PinnedMessageData.class) {
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

    /* JADX INFO: renamed from: o */
    public final ae50 m13091o() {
        return this.pinnedMessages_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
