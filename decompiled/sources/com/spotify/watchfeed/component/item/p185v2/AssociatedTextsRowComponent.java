package com.spotify.watchfeed.component.item.p185v2;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeed.component.model.p187v1.proto.Image;
import java.util.List;
import p204p.ae50;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.q96;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class AssociatedTextsRowComponent extends AbstractC0269h implements sre0 {
    private static final AssociatedTextsRowComponent DEFAULT_INSTANCE;
    public static final int DURATION_PER_ITEM_FIELD_NUMBER = 2;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int durationPerItem_;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();

    public static final class Item extends AbstractC0269h implements sre0 {
        public static final int ATTRIBUTION_FIELD_NUMBER = 3;
        private static final Item DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private Attribution attribution_;
        private int bitField0_;
        private String text_ = "";

        public static final class Attribution extends AbstractC0269h implements sre0 {
            public static final int ACCESSIBILITY_FIELD_NUMBER = 5;
            public static final int AUTHOR_IMAGE_FIELD_NUMBER = 1;
            public static final int AUTHOR_NAME_FIELD_NUMBER = 3;
            public static final int AUTHOR_TYPE_FIELD_NUMBER = 2;
            public static final int DATE_TEXT_FIELD_NUMBER = 4;
            private static final Attribution DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER;
            private Image authorImage_;
            private int authorType_;
            private int bitField0_;
            private String authorName_ = "";
            private String dateText_ = "";
            private String accessibility_ = "";

            static {
                Attribution attribution = new Attribution();
                DEFAULT_INSTANCE = attribution;
                AbstractC0269h.registerDefaultInstance(Attribution.class, attribution);
            }

            private Attribution() {
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: r */
            public static Attribution m22768r() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"bitField0_", "authorImage_", "authorType_", "authorName_", "dateText_", "accessibility_"});
                }
                if (iOrdinal == 3) {
                    return new Attribution();
                }
                if (iOrdinal == 4) {
                    return new C1348b(DEFAULT_INSTANCE);
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
                synchronized (Attribution.class) {
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
            public final Image m22769n() {
                Image image = this.authorImage_;
                return image == null ? Image.m22897n() : image;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            /* JADX INFO: renamed from: o */
            public final String m22770o() {
                return this.authorName_;
            }

            /* JADX INFO: renamed from: p */
            public final q96 m22771p() {
                q96 q96Var;
                int i = this.authorType_;
                if (i == 0) {
                    q96Var = q96.DEFAULT;
                } else if (i == 1) {
                    q96Var = q96.ARTIST;
                } else if (i != 2) {
                    q96Var = i != 3 ? null : q96.USER;
                } else {
                    q96Var = q96.SHOW;
                }
                return q96Var == null ? q96.UNRECOGNIZED : q96Var;
            }

            /* JADX INFO: renamed from: q */
            public final String m22772q() {
                return this.dateText_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Item item = new Item();
            DEFAULT_INSTANCE = item;
            AbstractC0269h.registerDefaultInstance(Item.class, item);
        }

        private Item() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "text_", "attribution_"});
            }
            if (iOrdinal == 3) {
                return new Item();
            }
            if (iOrdinal == 4) {
                return new C1349c(DEFAULT_INSTANCE);
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
            synchronized (Item.class) {
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
        public final Attribution m22766n() {
            Attribution attribution = this.attribution_;
            return attribution == null ? Attribution.m22768r() : attribution;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m22767o() {
            return this.text_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        AssociatedTextsRowComponent associatedTextsRowComponent = new AssociatedTextsRowComponent();
        DEFAULT_INSTANCE = associatedTextsRowComponent;
        AbstractC0269h.registerDefaultInstance(AssociatedTextsRowComponent.class, associatedTextsRowComponent);
    }

    private AssociatedTextsRowComponent() {
    }

    /* JADX INFO: renamed from: o */
    public static AssociatedTextsRowComponent m22764o(gva gvaVar) {
        return (AssociatedTextsRowComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"items_", Item.class, "durationPerItem_"});
        }
        if (iOrdinal == 3) {
            return new AssociatedTextsRowComponent();
        }
        if (iOrdinal == 4) {
            return new C1347a(DEFAULT_INSTANCE);
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
        synchronized (AssociatedTextsRowComponent.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    /* JADX INFO: renamed from: n */
    public final int m22765n() {
        return this.durationPerItem_;
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
