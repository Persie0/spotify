package com.spotify.collection2.itemdata.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CollectionItemdata$HiddenFromHomeItemData extends AbstractC0269h implements sre0 {
    private static final CollectionItemdata$HiddenFromHomeItemData DEFAULT_INSTANCE;
    public static final int HIDDEN_FROM_SECTION_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 hiddenFromSection_ = AbstractC0269h.emptyProtobufList();

    public static final class HiddenFromSection extends AbstractC0269h implements sre0 {
        private static final HiddenFromSection DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int SECTION_NAME_FIELD_NUMBER = 1;
        public static final int UPDATED_AT_FIELD_NUMBER = 2;
        private int bitField0_;
        private String sectionName_ = "";
        private Timestamp updatedAt_;

        static {
            HiddenFromSection hiddenFromSection = new HiddenFromSection();
            DEFAULT_INSTANCE = hiddenFromSection;
            AbstractC0269h.registerDefaultInstance(HiddenFromSection.class, hiddenFromSection);
        }

        private HiddenFromSection() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "sectionName_", "updatedAt_"});
            }
            if (iOrdinal == 3) {
                return new HiddenFromSection();
            }
            if (iOrdinal == 4) {
                return new C0543b(DEFAULT_INSTANCE);
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
            synchronized (HiddenFromSection.class) {
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
        CollectionItemdata$HiddenFromHomeItemData collectionItemdata$HiddenFromHomeItemData = new CollectionItemdata$HiddenFromHomeItemData();
        DEFAULT_INSTANCE = collectionItemdata$HiddenFromHomeItemData;
        AbstractC0269h.registerDefaultInstance(CollectionItemdata$HiddenFromHomeItemData.class, collectionItemdata$HiddenFromHomeItemData);
    }

    private CollectionItemdata$HiddenFromHomeItemData() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"hiddenFromSection_", HiddenFromSection.class});
        }
        if (iOrdinal == 3) {
            return new CollectionItemdata$HiddenFromHomeItemData();
        }
        if (iOrdinal == 4) {
            return new C0542a(DEFAULT_INSTANCE);
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
        synchronized (CollectionItemdata$HiddenFromHomeItemData.class) {
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
