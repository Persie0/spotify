package com.spotify.extendedmetadata.extensions.extendedcreditsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ExtendedCredits extends AbstractC0269h implements sre0 {
    public static final int CREDITS_FIELD_NUMBER = 1;
    private static final ExtendedCredits DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private ae50 credits_ = AbstractC0269h.emptyProtobufList();

    public static final class Credit extends AbstractC0269h implements sre0 {
        public static final int ARTIST_NAME_FIELD_NUMBER = 2;
        public static final int ARTIST_URI_FIELD_NUMBER = 1;
        private static final Credit DEFAULT_INSTANCE;
        public static final int IS_ARTIST_URI_LINKABLE_FIELD_NUMBER = 5;
        public static final int ORDINAL_FIELD_NUMBER = 4;
        private static volatile r2n0 PARSER = null;
        public static final int ROLE_FIELD_NUMBER = 3;
        private boolean isArtistUriLinkable_;
        private int ordinal_;
        private String artistUri_ = "";
        private String artistName_ = "";
        private String role_ = "";

        static {
            Credit credit = new Credit();
            DEFAULT_INSTANCE = credit;
            AbstractC0269h.registerDefaultInstance(Credit.class, credit);
        }

        private Credit() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\u0007", new Object[]{"artistUri_", "artistName_", "role_", "ordinal_", "isArtistUriLinkable_"});
            }
            if (iOrdinal == 3) {
                return new Credit();
            }
            if (iOrdinal == 4) {
                return new C0748b(DEFAULT_INSTANCE);
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
            synchronized (Credit.class) {
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

        public final String getRole() {
            return this.role_;
        }

        /* JADX INFO: renamed from: n */
        public final String m10128n() {
            return this.artistName_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m10129o() {
            return this.artistUri_;
        }

        /* JADX INFO: renamed from: p */
        public final boolean m10130p() {
            return this.isArtistUriLinkable_;
        }

        /* JADX INFO: renamed from: q */
        public final int m10131q() {
            return this.ordinal_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ExtendedCredits extendedCredits = new ExtendedCredits();
        DEFAULT_INSTANCE = extendedCredits;
        AbstractC0269h.registerDefaultInstance(ExtendedCredits.class, extendedCredits);
    }

    private ExtendedCredits() {
    }

    /* JADX INFO: renamed from: o */
    public static ExtendedCredits m10126o(byte[] bArr) {
        return (ExtendedCredits) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"credits_", Credit.class});
        }
        if (iOrdinal == 3) {
            return new ExtendedCredits();
        }
        if (iOrdinal == 4) {
            return new C0747a(DEFAULT_INSTANCE);
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
        synchronized (ExtendedCredits.class) {
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
    public final ae50 m10127n() {
        return this.credits_;
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
