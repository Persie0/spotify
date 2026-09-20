package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.list_collection.save_source.proto.SaveSource;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.g6f0;
import p204p.nq6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sp5;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ModificationRequest extends AbstractC0269h implements sre0 {
    public static final int AFTER_FIELD_NUMBER = 3;
    public static final int ATTRIBUTES_FIELD_NUMBER = 6;
    public static final int ATTRIBUTES_TO_CLEAR_FIELD_NUMBER = 11;
    public static final int BEFORE_FIELD_NUMBER = 2;
    public static final int CONTENTS_FIELD_NUMBER = 9;
    public static final int CREATE_ITEM_KIND_FIELD_NUMBER = 12;
    public static final int CREATION_INFO_FIELD_NUMBER = 14;
    private static final ModificationRequest DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 10;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int OPERATION_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 5;
    public static final int ROWS_FIELD_NUMBER = 8;
    public static final int SAVE_SOURCE_FIELD_NUMBER = 13;
    public static final int URIS_FIELD_NUMBER = 7;
    private static final vd50 attributesToClear_converter_ = new sp5(17);
    private Attributes attributes_;
    private int bitField0_;
    private boolean contents_;
    private int createItemKind_;
    private CreationInfo creationInfo_;
    private boolean playlist_;
    private SaveSource saveSource_;
    private String operation_ = "";
    private String before_ = "";
    private String after_ = "";
    private String name_ = "";
    private ae50 uris_ = AbstractC0269h.emptyProtobufList();
    private ae50 rows_ = AbstractC0269h.emptyProtobufList();
    private String itemId_ = "";
    private ud50 attributesToClear_ = AbstractC0269h.emptyIntList();

    public static final class Attributes extends AbstractC0269h implements sre0 {
        public static final int AI_CURATION_REFERENCE_ID_FIELD_NUMBER = 7;
        public static final int COLLABORATIVE_FIELD_NUMBER = 2;
        private static final Attributes DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 4;
        public static final int IMAGEURI_FIELD_NUMBER = 5;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile r2n0 PARSER = null;
        public static final int PICTURE_FIELD_NUMBER = 6;
        public static final int PUBLISHED_FIELD_NUMBER = 1;
        public static final int PUBLISHED_STATE_FIELD_NUMBER = 8;
        private int bitField0_;
        private boolean collaborative_;
        private int publishedState_;
        private boolean published_;
        private String name_ = "";
        private String description_ = "";
        private String imageUri_ = "";
        private String picture_ = "";
        private String aiCurationReferenceId_ = "";

        static {
            Attributes attributes = new Attributes();
            DEFAULT_INSTANCE = attributes;
            AbstractC0269h.registerDefaultInstance(Attributes.class, attributes);
        }

        private Attributes() {
        }

        /* JADX INFO: renamed from: n */
        public static void m18502n(Attributes attributes, String str) {
            attributes.getClass();
            attributes.bitField0_ |= 64;
            attributes.aiCurationReferenceId_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static void m18503o(Attributes attributes, String str) {
            attributes.getClass();
            str.getClass();
            attributes.bitField0_ |= 8;
            attributes.description_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static void m18504p(Attributes attributes, String str) {
            attributes.getClass();
            str.getClass();
            attributes.bitField0_ |= 4;
            attributes.name_ = str;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static void m18505q(Attributes attributes, String str) {
            attributes.getClass();
            str.getClass();
            attributes.bitField0_ |= 32;
            attributes.picture_ = str;
        }

        /* JADX INFO: renamed from: r */
        public static void m18506r(Attributes attributes, boolean z) {
            attributes.bitField0_ |= 1;
            attributes.published_ = z;
        }

        /* JADX INFO: renamed from: s */
        public static C1203a m18507s() {
            return (C1203a) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\b᠌\u0007", new Object[]{"bitField0_", "published_", "collaborative_", "name_", "description_", "imageUri_", "picture_", "aiCurationReferenceId_", "publishedState_", g6f0.f77038k});
            }
            if (iOrdinal == 3) {
                return new Attributes();
            }
            if (iOrdinal == 4) {
                return new C1203a(DEFAULT_INSTANCE);
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
            synchronized (Attributes.class) {
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
        ModificationRequest modificationRequest = new ModificationRequest();
        DEFAULT_INSTANCE = modificationRequest;
        AbstractC0269h.registerDefaultInstance(ModificationRequest.class, modificationRequest);
    }

    private ModificationRequest() {
    }

    /* JADX INFO: renamed from: A */
    public static void m18487A(ModificationRequest modificationRequest, SaveSource saveSource) {
        modificationRequest.getClass();
        modificationRequest.saveSource_ = saveSource;
        modificationRequest.bitField0_ |= 512;
    }

    /* JADX INFO: renamed from: B */
    public static C1204b m18488B() {
        return (C1204b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m18489n(ModificationRequest modificationRequest, Iterable iterable) {
        ae50 ae50Var = modificationRequest.rows_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            modificationRequest.rows_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, modificationRequest.rows_);
    }

    /* JADX INFO: renamed from: o */
    public static void m18490o(ModificationRequest modificationRequest, Iterable iterable) {
        ae50 ae50Var = modificationRequest.uris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            modificationRequest.uris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, modificationRequest.uris_);
    }

    /* JADX INFO: renamed from: p */
    public static void m18491p(ModificationRequest modificationRequest, String str) {
        modificationRequest.getClass();
        str.getClass();
        ae50 ae50Var = modificationRequest.rows_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            modificationRequest.rows_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        modificationRequest.rows_.add(str);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m18492q(ModificationRequest modificationRequest, String str) {
        modificationRequest.getClass();
        str.getClass();
        ae50 ae50Var = modificationRequest.uris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            modificationRequest.uris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        modificationRequest.uris_.add(str);
    }

    /* JADX INFO: renamed from: r */
    public static void m18493r(ModificationRequest modificationRequest, String str) {
        modificationRequest.getClass();
        str.getClass();
        modificationRequest.bitField0_ |= 4;
        modificationRequest.after_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m18494s(ModificationRequest modificationRequest, Attributes attributes) {
        modificationRequest.getClass();
        attributes.getClass();
        modificationRequest.attributes_ = attributes;
        modificationRequest.bitField0_ |= 32;
    }

    /* JADX INFO: renamed from: t */
    public static void m18495t(ModificationRequest modificationRequest, String str) {
        modificationRequest.getClass();
        str.getClass();
        modificationRequest.bitField0_ |= 2;
        modificationRequest.before_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m18496u(ModificationRequest modificationRequest, boolean z) {
        modificationRequest.bitField0_ |= 64;
        modificationRequest.contents_ = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m18497v(ModificationRequest modificationRequest, CreationInfo creationInfo) {
        modificationRequest.getClass();
        modificationRequest.creationInfo_ = creationInfo;
        modificationRequest.bitField0_ |= 1024;
    }

    /* JADX INFO: renamed from: w */
    public static void m18498w(ModificationRequest modificationRequest, String str) {
        modificationRequest.getClass();
        str.getClass();
        modificationRequest.bitField0_ |= 128;
        modificationRequest.itemId_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m18499x(ModificationRequest modificationRequest, String str) {
        modificationRequest.getClass();
        str.getClass();
        modificationRequest.bitField0_ |= 8;
        modificationRequest.name_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m18500y(ModificationRequest modificationRequest, String str) {
        modificationRequest.getClass();
        modificationRequest.bitField0_ |= 1;
        modificationRequest.operation_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m18501z(ModificationRequest modificationRequest, boolean z) {
        modificationRequest.bitField0_ |= 16;
        modificationRequest.playlist_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007\u001a\b\u001a\tဇ\u0006\nဈ\u0007\u000bࠞ\f᠌\b\rဉ\t\u000eဉ\n", new Object[]{"bitField0_", "operation_", "before_", "after_", "name_", "playlist_", "attributes_", "uris_", "rows_", "contents_", "itemId_", "attributesToClear_", nq6.f157152i, "createItemKind_", nq6.f157146c, "saveSource_", "creationInfo_"});
        }
        if (iOrdinal == 3) {
            return new ModificationRequest();
        }
        if (iOrdinal == 4) {
            return new C1204b(DEFAULT_INSTANCE);
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
        synchronized (ModificationRequest.class) {
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
