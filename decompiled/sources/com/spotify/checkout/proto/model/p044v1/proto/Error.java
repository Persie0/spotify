package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class Error extends AbstractC0269h implements sre0 {
    public static final int ACTION_CLOSE_FIELD_NUMBER = 10;
    public static final int ACTION_DOUBLE_LINK_FIELD_NUMBER = 12;
    public static final int ACTION_LINK_AND_CLOSE_FIELD_NUMBER = 13;
    public static final int ACTION_LINK_FIELD_NUMBER = 11;
    private static final Error DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Object actions_;
    private int actionsCase_ = 0;
    private String title_ = "";
    private String description_ = "";

    public static final class CloseCta extends AbstractC0269h implements sre0 {
        private static final CloseCta DEFAULT_INSTANCE;
        public static final int LABEL_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String label_ = "";

        static {
            CloseCta closeCta = new CloseCta();
            DEFAULT_INSTANCE = closeCta;
            AbstractC0269h.registerDefaultInstance(CloseCta.class, closeCta);
        }

        private CloseCta() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6017n(CloseCta closeCta, String str) {
            closeCta.getClass();
            closeCta.label_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static CloseCta m6018o() {
            return DEFAULT_INSTANCE;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C0499k m6019q() {
            return (C0499k) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"label_"});
            }
            if (iOrdinal == 3) {
                return new CloseCta();
            }
            if (iOrdinal == 4) {
                return new C0499k(DEFAULT_INSTANCE);
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
            synchronized (CloseCta.class) {
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

        /* JADX INFO: renamed from: p */
        public final String m6020p() {
            return this.label_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class DoubleFollowLinkCta extends AbstractC0269h implements sre0 {
        private static final DoubleFollowLinkCta DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int PRIMARY_FIELD_NUMBER = 1;
        public static final int SECONDARY_FIELD_NUMBER = 2;
        private int bitField0_;
        private FollowLinkCta primary_;
        private FollowLinkCta secondary_;

        static {
            DoubleFollowLinkCta doubleFollowLinkCta = new DoubleFollowLinkCta();
            DEFAULT_INSTANCE = doubleFollowLinkCta;
            AbstractC0269h.registerDefaultInstance(DoubleFollowLinkCta.class, doubleFollowLinkCta);
        }

        private DoubleFollowLinkCta() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6021n(DoubleFollowLinkCta doubleFollowLinkCta, FollowLinkCta followLinkCta) {
            doubleFollowLinkCta.getClass();
            followLinkCta.getClass();
            doubleFollowLinkCta.primary_ = followLinkCta;
            doubleFollowLinkCta.bitField0_ |= 1;
        }

        /* JADX INFO: renamed from: o */
        public static void m6022o(DoubleFollowLinkCta doubleFollowLinkCta, FollowLinkCta followLinkCta) {
            doubleFollowLinkCta.getClass();
            followLinkCta.getClass();
            doubleFollowLinkCta.secondary_ = followLinkCta;
            doubleFollowLinkCta.bitField0_ |= 2;
        }

        /* JADX INFO: renamed from: p */
        public static DoubleFollowLinkCta m6023p() {
            return DEFAULT_INSTANCE;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: s */
        public static C0502l m6024s() {
            return (C0502l) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "primary_", "secondary_"});
            }
            if (iOrdinal == 3) {
                return new DoubleFollowLinkCta();
            }
            if (iOrdinal == 4) {
                return new C0502l(DEFAULT_INSTANCE);
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
            synchronized (DoubleFollowLinkCta.class) {
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

        /* JADX INFO: renamed from: q */
        public final FollowLinkCta m6025q() {
            FollowLinkCta followLinkCta = this.primary_;
            return followLinkCta == null ? FollowLinkCta.m6042p() : followLinkCta;
        }

        /* JADX INFO: renamed from: r */
        public final FollowLinkCta m6026r() {
            FollowLinkCta followLinkCta = this.secondary_;
            return followLinkCta == null ? FollowLinkCta.m6042p() : followLinkCta;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class PrimaryLinkSecondaryCloseCta extends AbstractC0269h implements sre0 {
        private static final PrimaryLinkSecondaryCloseCta DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int PRIMARY_FIELD_NUMBER = 1;
        public static final int SECONDARY_FIELD_NUMBER = 2;
        private int bitField0_;
        private FollowLinkCta primary_;
        private CloseCta secondary_;

        static {
            PrimaryLinkSecondaryCloseCta primaryLinkSecondaryCloseCta = new PrimaryLinkSecondaryCloseCta();
            DEFAULT_INSTANCE = primaryLinkSecondaryCloseCta;
            AbstractC0269h.registerDefaultInstance(PrimaryLinkSecondaryCloseCta.class, primaryLinkSecondaryCloseCta);
        }

        private PrimaryLinkSecondaryCloseCta() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6027n(PrimaryLinkSecondaryCloseCta primaryLinkSecondaryCloseCta, FollowLinkCta followLinkCta) {
            primaryLinkSecondaryCloseCta.getClass();
            followLinkCta.getClass();
            primaryLinkSecondaryCloseCta.primary_ = followLinkCta;
            primaryLinkSecondaryCloseCta.bitField0_ |= 1;
        }

        /* JADX INFO: renamed from: o */
        public static void m6028o(PrimaryLinkSecondaryCloseCta primaryLinkSecondaryCloseCta, CloseCta closeCta) {
            primaryLinkSecondaryCloseCta.getClass();
            closeCta.getClass();
            primaryLinkSecondaryCloseCta.secondary_ = closeCta;
            primaryLinkSecondaryCloseCta.bitField0_ |= 2;
        }

        /* JADX INFO: renamed from: p */
        public static PrimaryLinkSecondaryCloseCta m6029p() {
            return DEFAULT_INSTANCE;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: s */
        public static C0505m m6030s() {
            return (C0505m) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "primary_", "secondary_"});
            }
            if (iOrdinal == 3) {
                return new PrimaryLinkSecondaryCloseCta();
            }
            if (iOrdinal == 4) {
                return new C0505m(DEFAULT_INSTANCE);
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
            synchronized (PrimaryLinkSecondaryCloseCta.class) {
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

        /* JADX INFO: renamed from: q */
        public final FollowLinkCta m6031q() {
            FollowLinkCta followLinkCta = this.primary_;
            return followLinkCta == null ? FollowLinkCta.m6042p() : followLinkCta;
        }

        /* JADX INFO: renamed from: r */
        public final CloseCta m6032r() {
            CloseCta closeCta = this.secondary_;
            return closeCta == null ? CloseCta.m6018o() : closeCta;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Error error = new Error();
        DEFAULT_INSTANCE = error;
        AbstractC0269h.registerDefaultInstance(Error.class, error);
    }

    private Error() {
    }

    /* JADX INFO: renamed from: A */
    public static Error m6003A(byte[] bArr) {
        return (Error) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: renamed from: n */
    public static void m6004n(Error error, CloseCta closeCta) {
        error.getClass();
        closeCta.getClass();
        error.actions_ = closeCta;
        error.actionsCase_ = 10;
    }

    /* JADX INFO: renamed from: o */
    public static void m6005o(Error error, DoubleFollowLinkCta doubleFollowLinkCta) {
        error.getClass();
        doubleFollowLinkCta.getClass();
        error.actions_ = doubleFollowLinkCta;
        error.actionsCase_ = 12;
    }

    /* JADX INFO: renamed from: p */
    public static void m6006p(Error error, FollowLinkCta followLinkCta) {
        error.getClass();
        followLinkCta.getClass();
        error.actions_ = followLinkCta;
        error.actionsCase_ = 11;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m6007q(Error error, PrimaryLinkSecondaryCloseCta primaryLinkSecondaryCloseCta) {
        error.getClass();
        primaryLinkSecondaryCloseCta.getClass();
        error.actions_ = primaryLinkSecondaryCloseCta;
        error.actionsCase_ = 13;
    }

    /* JADX INFO: renamed from: r */
    public static void m6008r(Error error, String str) {
        error.getClass();
        error.description_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m6009s(Error error, String str) {
        error.getClass();
        error.title_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static Error m6010y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static C0496j m6011z() {
        return (C0496j) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\r\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"actions_", "actionsCase_", "title_", "description_", CloseCta.class, FollowLinkCta.class, DoubleFollowLinkCta.class, PrimaryLinkSecondaryCloseCta.class});
        }
        if (iOrdinal == 3) {
            return new Error();
        }
        if (iOrdinal == 4) {
            return new C0496j(DEFAULT_INSTANCE);
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
        synchronized (Error.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: t */
    public final CloseCta m6012t() {
        return this.actionsCase_ == 10 ? (CloseCta) this.actions_ : CloseCta.m6018o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final DoubleFollowLinkCta m6013u() {
        return this.actionsCase_ == 12 ? (DoubleFollowLinkCta) this.actions_ : DoubleFollowLinkCta.m6023p();
    }

    /* JADX INFO: renamed from: v */
    public final FollowLinkCta m6014v() {
        return this.actionsCase_ == 11 ? (FollowLinkCta) this.actions_ : FollowLinkCta.m6042p();
    }

    /* JADX INFO: renamed from: w */
    public final PrimaryLinkSecondaryCloseCta m6015w() {
        return this.actionsCase_ == 13 ? (PrimaryLinkSecondaryCloseCta) this.actions_ : PrimaryLinkSecondaryCloseCta.m6029p();
    }

    /* JADX INFO: renamed from: x */
    public final int m6016x() {
        int i = this.actionsCase_;
        if (i == 0) {
            return 5;
        }
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 2;
            case 12:
                return 3;
            case 13:
                return 4;
            default:
                return 0;
        }
    }
}
