package com.spotify.liveroom.listeningparty.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class User extends AbstractC0269h implements sre0 {
    public static final int ATTENDEE_FIELD_NUMBER = 2;
    private static final User DEFAULT_INSTANCE;
    public static final int HOST_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int userDataCase_ = 0;
    private Object userData_;

    public static final class Attendee extends AbstractC0269h implements sre0 {
        private static final Attendee DEFAULT_INSTANCE;
        public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
        public static final int IMAGE_URL_FIELD_NUMBER = 4;
        private static volatile r2n0 PARSER = null;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private String username_ = "";
        private String displayName_ = "";
        private String imageUrl_ = "";

        static {
            Attendee attendee = new Attendee();
            DEFAULT_INSTANCE = attendee;
            AbstractC0269h.registerDefaultInstance(Attendee.class, attendee);
        }

        private Attendee() {
        }

        /* JADX INFO: renamed from: n */
        public static Attendee m13104n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"username_", "displayName_", "imageUrl_"});
            }
            if (iOrdinal == 3) {
                return new Attendee();
            }
            if (iOrdinal == 4) {
                return new C0844i(DEFAULT_INSTANCE);
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
            synchronized (Attendee.class) {
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

        public final String getDisplayName() {
            return this.displayName_;
        }

        public final String getImageUrl() {
            return this.imageUrl_;
        }

        public final String getUsername() {
            return this.username_;
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

    public static final class Host extends AbstractC0269h implements sre0 {
        private static final Host DEFAULT_INSTANCE;
        public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
        public static final int HOST_ID_FIELD_NUMBER = 2;
        public static final int IMAGE_URL_FIELD_NUMBER = 4;
        private static volatile r2n0 PARSER;
        private String hostId_ = "";
        private String displayName_ = "";
        private String imageUrl_ = "";

        static {
            Host host = new Host();
            DEFAULT_INSTANCE = host;
            AbstractC0269h.registerDefaultInstance(Host.class, host);
        }

        private Host() {
        }

        /* JADX INFO: renamed from: n */
        public static Host m13105n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"hostId_", "displayName_", "imageUrl_"});
            }
            if (iOrdinal == 3) {
                return new Host();
            }
            if (iOrdinal == 4) {
                return new C0846k(DEFAULT_INSTANCE);
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
            synchronized (Host.class) {
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

        public final String getDisplayName() {
            return this.displayName_;
        }

        public final String getImageUrl() {
            return this.imageUrl_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m13106o() {
            return this.hostId_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        User user = new User();
        DEFAULT_INSTANCE = user;
        AbstractC0269h.registerDefaultInstance(User.class, user);
    }

    private User() {
    }

    /* JADX INFO: renamed from: o */
    public static User m13100o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"userData_", "userDataCase_", Host.class, Attendee.class});
        }
        if (iOrdinal == 3) {
            return new User();
        }
        if (iOrdinal == 4) {
            return new C0845j(DEFAULT_INSTANCE);
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
        synchronized (User.class) {
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
    public final Attendee m13101n() {
        return this.userDataCase_ == 2 ? (Attendee) this.userData_ : Attendee.m13104n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Host m13102p() {
        return this.userDataCase_ == 1 ? (Host) this.userData_ : Host.m13105n();
    }

    /* JADX INFO: renamed from: q */
    public final int m13103q() {
        int i = this.userDataCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
