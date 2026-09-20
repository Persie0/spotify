package com.spotify.listeningactivity.p097v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscribePresenceRequest extends AbstractC0269h implements sre0 {
    private static final SubscribePresenceRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PUSHER_FIELD_NUMBER = 1;
    private int bitField0_;
    private PusherChannel pusher_;

    /* JADX INFO: loaded from: classes7.dex */
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
        public static void m12970n(PusherChannel pusherChannel, String str) {
            pusherChannel.getClass();
            str.getClass();
            pusherChannel.connectionId_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static C0832b m12971o() {
            return (C0832b) DEFAULT_INSTANCE.createBuilder();
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
                return new C0832b(DEFAULT_INSTANCE);
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

    static {
        SubscribePresenceRequest subscribePresenceRequest = new SubscribePresenceRequest();
        DEFAULT_INSTANCE = subscribePresenceRequest;
        AbstractC0269h.registerDefaultInstance(SubscribePresenceRequest.class, subscribePresenceRequest);
    }

    private SubscribePresenceRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12967n(SubscribePresenceRequest subscribePresenceRequest, PusherChannel pusherChannel) {
        subscribePresenceRequest.getClass();
        pusherChannel.getClass();
        subscribePresenceRequest.pusher_ = pusherChannel;
        subscribePresenceRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static C0831a m12969p() {
        return (C0831a) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "pusher_"});
        }
        if (iOrdinal == 3) {
            return new SubscribePresenceRequest();
        }
        if (iOrdinal == 4) {
            return new C0831a();
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
        synchronized (SubscribePresenceRequest.class) {
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
