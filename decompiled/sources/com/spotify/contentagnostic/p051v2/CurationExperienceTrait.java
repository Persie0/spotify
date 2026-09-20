package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CurationExperienceTrait extends AbstractC0269h implements sre0 {
    public static final int ALLOWED_METHODS_FIELD_NUMBER = 3;
    private static final CurationExperienceTrait DEFAULT_INSTANCE;
    public static final int DEFAULT_METHOD_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int URI_TO_CURATE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Method defaultMethod_;
    private String uriToCurate_ = "";
    private ae50 allowedMethods_ = AbstractC0269h.emptyProtobufList();

    public static final class Method extends AbstractC0269h implements sre0 {
        public static final int ANY_PLAYLIST_FIELD_NUMBER = 4;
        public static final int COLLECTION_FIELD_NUMBER = 3;
        private static final Method DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int PLAYLIST_FIELD_NUMBER = 2;
        public static final int ROOTLIST_FIELD_NUMBER = 1;
        private int methodCase_ = 0;
        private Object method_;

        public static final class AnyUserPlaylist extends AbstractC0269h implements sre0 {
            private static final AnyUserPlaylist DEFAULT_INSTANCE;
            public static final int EXCLUSIONS_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER;
            private ae50 exclusions_ = AbstractC0269h.emptyProtobufList();

            static {
                AnyUserPlaylist anyUserPlaylist = new AnyUserPlaylist();
                DEFAULT_INSTANCE = anyUserPlaylist;
                AbstractC0269h.registerDefaultInstance(AnyUserPlaylist.class, anyUserPlaylist);
            }

            private AnyUserPlaylist() {
            }

            /* JADX INFO: renamed from: n */
            public static AnyUserPlaylist m7842n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"exclusions_"});
                }
                if (iOrdinal == 3) {
                    return new AnyUserPlaylist();
                }
                if (iOrdinal == 4) {
                    return new C0555b(DEFAULT_INSTANCE);
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
                synchronized (AnyUserPlaylist.class) {
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
            public final ae50 m7843o() {
                return this.exclusions_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Collection extends AbstractC0269h implements sre0 {
            private static final Collection DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int SET_FIELD_NUMBER = 1;
            private String set_ = "";

            static {
                Collection collection = new Collection();
                DEFAULT_INSTANCE = collection;
                AbstractC0269h.registerDefaultInstance(Collection.class, collection);
            }

            private Collection() {
            }

            /* JADX INFO: renamed from: n */
            public static Collection m7844n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"set_"});
                }
                if (iOrdinal == 3) {
                    return new Collection();
                }
                if (iOrdinal == 4) {
                    return new C0557d(DEFAULT_INSTANCE);
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
                synchronized (Collection.class) {
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
            public final String m7845o() {
                return this.set_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Playlist extends AbstractC0269h implements sre0 {
            private static final Playlist DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int URI_FIELD_NUMBER = 1;
            private String uri_ = "";

            static {
                Playlist playlist = new Playlist();
                DEFAULT_INSTANCE = playlist;
                AbstractC0269h.registerDefaultInstance(Playlist.class, playlist);
            }

            private Playlist() {
            }

            /* JADX INFO: renamed from: n */
            public static Playlist m7846n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"uri_"});
                }
                if (iOrdinal == 3) {
                    return new Playlist();
                }
                if (iOrdinal == 4) {
                    return new C0558e(DEFAULT_INSTANCE);
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
                synchronized (Playlist.class) {
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

            public final String getUri() {
                return this.uri_;
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

        public static final class Rootlist extends AbstractC0269h implements sre0 {
            private static final Rootlist DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER;

            static {
                Rootlist rootlist = new Rootlist();
                DEFAULT_INSTANCE = rootlist;
                AbstractC0269h.registerDefaultInstance(Rootlist.class, rootlist);
            }

            private Rootlist() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                }
                if (iOrdinal == 3) {
                    return new Rootlist();
                }
                if (iOrdinal == 4) {
                    return new C0559f(DEFAULT_INSTANCE);
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
                synchronized (Rootlist.class) {
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
            Method method = new Method();
            DEFAULT_INSTANCE = method;
            AbstractC0269h.registerDefaultInstance(Method.class, method);
        }

        private Method() {
        }

        /* JADX INFO: renamed from: p */
        public static Method m7837p() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"method_", "methodCase_", Rootlist.class, Playlist.class, Collection.class, AnyUserPlaylist.class});
            }
            if (iOrdinal == 3) {
                return new Method();
            }
            if (iOrdinal == 4) {
                return new C0556c(DEFAULT_INSTANCE);
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
            synchronized (Method.class) {
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
        public final AnyUserPlaylist m7838n() {
            return this.methodCase_ == 4 ? (AnyUserPlaylist) this.method_ : AnyUserPlaylist.m7842n();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final Collection m7839o() {
            return this.methodCase_ == 3 ? (Collection) this.method_ : Collection.m7844n();
        }

        /* JADX INFO: renamed from: q */
        public final int m7840q() {
            int i = this.methodCase_;
            if (i == 0) {
                return 5;
            }
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 4;
                        if (i != 4) {
                            return 0;
                        }
                    }
                }
            }
            return i2;
        }

        /* JADX INFO: renamed from: r */
        public final Playlist m7841r() {
            return this.methodCase_ == 2 ? (Playlist) this.method_ : Playlist.m7846n();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        CurationExperienceTrait curationExperienceTrait = new CurationExperienceTrait();
        DEFAULT_INSTANCE = curationExperienceTrait;
        AbstractC0269h.registerDefaultInstance(CurationExperienceTrait.class, curationExperienceTrait);
    }

    private CurationExperienceTrait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static CurationExperienceTrait m7833q(byte[] bArr) {
        return (CurationExperienceTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b", new Object[]{"bitField0_", "uriToCurate_", "defaultMethod_", "allowedMethods_", Method.class});
        }
        if (iOrdinal == 3) {
            return new CurationExperienceTrait();
        }
        if (iOrdinal == 4) {
            return new C0554a(DEFAULT_INSTANCE);
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
        synchronized (CurationExperienceTrait.class) {
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
    public final ae50 m7834n() {
        return this.allowedMethods_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Method m7835o() {
        Method method = this.defaultMethod_;
        return method == null ? Method.m7837p() : method;
    }

    /* JADX INFO: renamed from: p */
    public final String m7836p() {
        return this.uriToCurate_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
