package com.spotify.listeningactivity.p097v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class UserSubscription extends AbstractC0269h implements sre0 {
    private static final UserSubscription DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PUSHER_FIELD_NUMBER = 2;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int WEBHOOK_FIELD_NUMBER = 3;
    private Object channel_;
    private int channelCase_ = 0;
    private String username_ = "";

    public static final class PusherChannel extends AbstractC0269h implements sre0 {
        public static final int CONNECTION_ID_FIELD_NUMBER = 1;
        private static final PusherChannel DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private String connectionId_ = "";

        static {
            PusherChannel pusherChannel = new PusherChannel();
            DEFAULT_INSTANCE = pusherChannel;
            AbstractC0269h.registerDefaultInstance(PusherChannel.class, pusherChannel);
        }

        private PusherChannel() {
        }

        /* JADX INFO: renamed from: n */
        public static void m12979n(PusherChannel pusherChannel, String str) {
            pusherChannel.getClass();
            str.getClass();
            pusherChannel.connectionId_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static C0834d m12980o() {
            return (C0834d) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"connectionId_"});
            }
            if (iOrdinal == 3) {
                return new PusherChannel();
            }
            if (iOrdinal == 4) {
                return new C0834d(DEFAULT_INSTANCE);
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
            synchronized (PusherChannel.class) {
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

    public static final class WebhookChannel extends AbstractC0269h implements sre0 {
        public static final int CALLBACK_URL_FIELD_NUMBER = 1;
        private static final WebhookChannel DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int PROTOCOL_FIELD_NUMBER = 2;
        private String callbackUrl_ = "";
        private String protocol_ = "";

        static {
            WebhookChannel webhookChannel = new WebhookChannel();
            DEFAULT_INSTANCE = webhookChannel;
            AbstractC0269h.registerDefaultInstance(WebhookChannel.class, webhookChannel);
        }

        private WebhookChannel() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"callbackUrl_", "protocol_"});
            }
            if (iOrdinal == 3) {
                return new WebhookChannel();
            }
            if (iOrdinal == 4) {
                return new C0835e(DEFAULT_INSTANCE);
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
            synchronized (WebhookChannel.class) {
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

    static {
        UserSubscription userSubscription = new UserSubscription();
        DEFAULT_INSTANCE = userSubscription;
        AbstractC0269h.registerDefaultInstance(UserSubscription.class, userSubscription);
    }

    private UserSubscription() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12976n(UserSubscription userSubscription, PusherChannel pusherChannel) {
        userSubscription.getClass();
        pusherChannel.getClass();
        userSubscription.channel_ = pusherChannel;
        userSubscription.channelCase_ = 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m12977o(UserSubscription userSubscription, String str) {
        userSubscription.getClass();
        str.getClass();
        userSubscription.username_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static C0833c m12978p() {
        return (C0833c) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000", new Object[]{"channel_", "channelCase_", "username_", PusherChannel.class, WebhookChannel.class});
        }
        if (iOrdinal == 3) {
            return new UserSubscription();
        }
        if (iOrdinal == 4) {
            return new C0833c(DEFAULT_INSTANCE);
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
        synchronized (UserSubscription.class) {
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
