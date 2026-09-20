package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class RichMedia extends AbstractC0269h implements RichMediaOrBuilder {
    private static final RichMedia DEFAULT_INSTANCE;
    public static final int GIPHY_GIF_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int STICKER_FIELD_NUMBER = 2;
    public static final int UGC_FIELD_NUMBER = 3;
    private int mediaTypeCase_ = 0;
    private Object mediaType_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.RichMedia$1 */
    public static /* synthetic */ class C04501 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3261xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3261xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3261xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3261xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3261xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3261xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3261xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3261xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements RichMediaOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 build() {
            return build();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clear */
        public /* bridge */ /* synthetic */ ore0 mo98325clear() {
            return mo98325clear();
        }

        public Builder clearGiphyGif() {
            copyOnWrite();
            ((RichMedia) this.instance).clearGiphyGif();
            return this;
        }

        public Builder clearMediaType() {
            copyOnWrite();
            ((RichMedia) this.instance).clearMediaType();
            return this;
        }

        public Builder clearSticker() {
            copyOnWrite();
            ((RichMedia) this.instance).clearSticker();
            return this;
        }

        public Builder clearUgc() {
            copyOnWrite();
            ((RichMedia) this.instance).clearUgc();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public GiphyGif getGiphyGif() {
            return ((RichMedia) this.instance).getGiphyGif();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public MediaTypeCase getMediaTypeCase() {
            return ((RichMedia) this.instance).getMediaTypeCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public Sticker getSticker() {
            return ((RichMedia) this.instance).getSticker();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public UGC getUgc() {
            return ((RichMedia) this.instance).getUgc();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public boolean hasGiphyGif() {
            return ((RichMedia) this.instance).hasGiphyGif();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public boolean hasSticker() {
            return ((RichMedia) this.instance).hasSticker();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public boolean hasUgc() {
            return ((RichMedia) this.instance).hasUgc();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeGiphyGif(GiphyGif giphyGif) {
            copyOnWrite();
            ((RichMedia) this.instance).mergeGiphyGif(giphyGif);
            return this;
        }

        public Builder mergeSticker(Sticker sticker) {
            copyOnWrite();
            ((RichMedia) this.instance).mergeSticker(sticker);
            return this;
        }

        public Builder mergeUgc(UGC ugc) {
            copyOnWrite();
            ((RichMedia) this.instance).mergeUgc(ugc);
            return this;
        }

        public Builder setGiphyGif(GiphyGif giphyGif) {
            copyOnWrite();
            ((RichMedia) this.instance).setGiphyGif(giphyGif);
            return this;
        }

        public Builder setSticker(Sticker sticker) {
            copyOnWrite();
            ((RichMedia) this.instance).setSticker(sticker);
            return this;
        }

        public Builder setUgc(UGC ugc) {
            copyOnWrite();
            ((RichMedia) this.instance).setUgc(ugc);
            return this;
        }

        private Builder() {
            super(RichMedia.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public Builder setGiphyGif(GiphyGif.Builder builder) {
            copyOnWrite();
            ((RichMedia) this.instance).setGiphyGif((GiphyGif) builder.build());
            return this;
        }

        public Builder setSticker(Sticker.Builder builder) {
            copyOnWrite();
            ((RichMedia) this.instance).setSticker((Sticker) builder.build());
            return this;
        }

        public Builder setUgc(UGC.Builder builder) {
            copyOnWrite();
            ((RichMedia) this.instance).setUgc((UGC) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
            return super.mo98372mergeFrom(inputStream, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
            return super.mo98373mergeFrom(gvaVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
            return super.mo98374mergeFrom(gvaVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
            return super.mo98375mergeFrom(oweVar);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
            return super.mergeFrom(pre0Var);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
            return super.mo98376mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
            return super.mo98377mergeFrom(bArr, auxVar);
        }
    }

    public enum MediaTypeCase {
        GIPHY_GIF(1),
        STICKER(2),
        UGC(3),
        MEDIATYPE_NOT_SET(0);

        private final int value;

        MediaTypeCase(int i) {
            this.value = i;
        }

        public static MediaTypeCase forNumber(int i) {
            if (i == 0) {
                return MEDIATYPE_NOT_SET;
            }
            if (i == 1) {
                return GIPHY_GIF;
            }
            if (i == 2) {
                return STICKER;
            }
            if (i != 3) {
                return null;
            }
            return UGC;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static MediaTypeCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        RichMedia richMedia = new RichMedia();
        DEFAULT_INSTANCE = richMedia;
        AbstractC0269h.registerDefaultInstance(RichMedia.class, richMedia);
    }

    private RichMedia() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGiphyGif() {
        if (this.mediaTypeCase_ == 1) {
            this.mediaTypeCase_ = 0;
            this.mediaType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaType() {
        this.mediaTypeCase_ = 0;
        this.mediaType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSticker() {
        if (this.mediaTypeCase_ == 2) {
            this.mediaTypeCase_ = 0;
            this.mediaType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgc() {
        if (this.mediaTypeCase_ == 3) {
            this.mediaTypeCase_ = 0;
            this.mediaType_ = null;
        }
    }

    public static RichMedia getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGiphyGif(GiphyGif giphyGif) {
        giphyGif.getClass();
        if (this.mediaTypeCase_ != 1 || this.mediaType_ == GiphyGif.getDefaultInstance()) {
            this.mediaType_ = giphyGif;
        } else {
            this.mediaType_ = ((GiphyGif.Builder) GiphyGif.newBuilder((GiphyGif) this.mediaType_).mergeFrom((AbstractC0269h) giphyGif)).buildPartial();
        }
        this.mediaTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSticker(Sticker sticker) {
        sticker.getClass();
        if (this.mediaTypeCase_ != 2 || this.mediaType_ == Sticker.getDefaultInstance()) {
            this.mediaType_ = sticker;
        } else {
            this.mediaType_ = ((Sticker.Builder) Sticker.newBuilder((Sticker) this.mediaType_).mergeFrom((AbstractC0269h) sticker)).buildPartial();
        }
        this.mediaTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUgc(UGC ugc) {
        ugc.getClass();
        if (this.mediaTypeCase_ != 3 || this.mediaType_ == UGC.getDefaultInstance()) {
            this.mediaType_ = ugc;
        } else {
            this.mediaType_ = ((UGC.Builder) UGC.newBuilder((UGC) this.mediaType_).mergeFrom((AbstractC0269h) ugc)).buildPartial();
        }
        this.mediaTypeCase_ = 3;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RichMedia parseDelimitedFrom(InputStream inputStream) {
        return (RichMedia) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RichMedia parseFrom(ByteBuffer byteBuffer) {
        return (RichMedia) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGiphyGif(GiphyGif giphyGif) {
        giphyGif.getClass();
        this.mediaType_ = giphyGif;
        this.mediaTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSticker(Sticker sticker) {
        sticker.getClass();
        this.mediaType_ = sticker;
        this.mediaTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgc(UGC ugc) {
        ugc.getClass();
        this.mediaType_ = ugc;
        this.mediaTypeCase_ = 3;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"mediaType_", "mediaTypeCase_", GiphyGif.class, Sticker.class, UGC.class});
        }
        if (iOrdinal == 3) {
            return new RichMedia();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
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
        synchronized (RichMedia.class) {
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
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public GiphyGif getGiphyGif() {
        return this.mediaTypeCase_ == 1 ? (GiphyGif) this.mediaType_ : GiphyGif.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public MediaTypeCase getMediaTypeCase() {
        return MediaTypeCase.forNumber(this.mediaTypeCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public Sticker getSticker() {
        return this.mediaTypeCase_ == 2 ? (Sticker) this.mediaType_ : Sticker.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public UGC getUgc() {
        return this.mediaTypeCase_ == 3 ? (UGC) this.mediaType_ : UGC.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public boolean hasGiphyGif() {
        return this.mediaTypeCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public boolean hasSticker() {
        return this.mediaTypeCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public boolean hasUgc() {
        return this.mediaTypeCase_ == 3;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(RichMedia richMedia) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(richMedia);
    }

    public static RichMedia parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (RichMedia) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static RichMedia parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (RichMedia) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static RichMedia parseFrom(gva gvaVar) {
        return (RichMedia) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static RichMedia parseFrom(gva gvaVar, aux auxVar) {
        return (RichMedia) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static RichMedia parseFrom(byte[] bArr) {
        return (RichMedia) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RichMedia parseFrom(byte[] bArr, aux auxVar) {
        return (RichMedia) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static RichMedia parseFrom(InputStream inputStream) {
        return (RichMedia) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RichMedia parseFrom(InputStream inputStream, aux auxVar) {
        return (RichMedia) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static RichMedia parseFrom(owe oweVar) {
        return (RichMedia) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static RichMedia parseFrom(owe oweVar, aux auxVar) {
        return (RichMedia) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
