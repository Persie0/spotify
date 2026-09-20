package com.spotify.corex.readalongtranscript.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EntitySection extends AbstractC0269h implements sre0 {
    public static final int CONTENT_TYPE_LABEL_FIELD_NUMBER = 3;
    private static final EntitySection DEFAULT_INSTANCE;
    public static final int IMAGES_FIELD_NUMBER = 5;
    public static final int LIKE_URI_FIELD_NUMBER = 7;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Subtitle subtitle_;
    private String uri_ = "";
    private String title_ = "";
    private String contentTypeLabel_ = "";
    private ae50 images_ = AbstractC0269h.emptyProtobufList();
    private String navigateUri_ = "";
    private String likeUri_ = "";

    public static final class Subtitle extends AbstractC0269h implements sre0 {
        private static final Subtitle DEFAULT_INSTANCE;
        public static final int FULL_TEXT_FIELD_NUMBER = 1;
        public static final int LINKS_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private String fullText_ = "";
        private ae50 links_ = AbstractC0269h.emptyProtobufList();

        static {
            Subtitle subtitle = new Subtitle();
            DEFAULT_INSTANCE = subtitle;
            AbstractC0269h.registerDefaultInstance(Subtitle.class, subtitle);
        }

        private Subtitle() {
        }

        /* JADX INFO: renamed from: n */
        public static Subtitle m8069n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ለ\u0000\u0002\u001b", new Object[]{"bitField0_", "fullText_", "links_", NavigableTitle.class});
            }
            if (iOrdinal == 3) {
                return new Subtitle();
            }
            if (iOrdinal == 4) {
                return new C0572b(DEFAULT_INSTANCE);
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
            synchronized (Subtitle.class) {
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
        public final String m8070o() {
            return this.fullText_;
        }

        /* JADX INFO: renamed from: p */
        public final ae50 m8071p() {
            return this.links_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EntitySection entitySection = new EntitySection();
        DEFAULT_INSTANCE = entitySection;
        AbstractC0269h.registerDefaultInstance(EntitySection.class, entitySection);
    }

    private EntitySection() {
    }

    /* JADX INFO: renamed from: o */
    public static EntitySection m8061o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005\u001b\u0006ለ\u0001\u0007ለ\u0002", new Object[]{"bitField0_", "uri_", "title_", "contentTypeLabel_", "subtitle_", "images_", Image.class, "navigateUri_", "likeUri_"});
        }
        if (iOrdinal == 3) {
            return new EntitySection();
        }
        if (iOrdinal == 4) {
            return new C0571a(DEFAULT_INSTANCE);
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
        synchronized (EntitySection.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m8062n() {
        return this.contentTypeLabel_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m8063p() {
        return this.images_;
    }

    /* JADX INFO: renamed from: q */
    public final String m8064q() {
        return this.likeUri_;
    }

    /* JADX INFO: renamed from: r */
    public final String m8065r() {
        return this.navigateUri_;
    }

    /* JADX INFO: renamed from: s */
    public final Subtitle m8066s() {
        Subtitle subtitle = this.subtitle_;
        return subtitle == null ? Subtitle.m8069n() : subtitle;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m8067t() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m8068u() {
        return (this.bitField0_ & 2) != 0;
    }
}
