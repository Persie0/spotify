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
public final class GiphyGif extends AbstractC0269h implements GiphyGifOrBuilder {
    public static final int AGE_RATING_FIELD_NUMBER = 2;
    private static final GiphyGif DEFAULT_INSTANCE;
    public static final int GIF_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int ageRating_;
    private String gifId_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.GiphyGif$1 */
    public static /* synthetic */ class C03761 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3200xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3200xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3200xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3200xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3200xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3200xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3200xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3200xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GiphyGifOrBuilder {
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

        public Builder clearAgeRating() {
            copyOnWrite();
            ((GiphyGif) this.instance).clearAgeRating();
            return this;
        }

        public Builder clearGifId() {
            copyOnWrite();
            ((GiphyGif) this.instance).clearGifId();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
        public GiphyAgeRating getAgeRating() {
            return ((GiphyGif) this.instance).getAgeRating();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
        public int getAgeRatingValue() {
            return ((GiphyGif) this.instance).getAgeRatingValue();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
        public String getGifId() {
            return ((GiphyGif) this.instance).getGifId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
        public gva getGifIdBytes() {
            return ((GiphyGif) this.instance).getGifIdBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setAgeRating(GiphyAgeRating giphyAgeRating) {
            copyOnWrite();
            ((GiphyGif) this.instance).setAgeRating(giphyAgeRating);
            return this;
        }

        public Builder setAgeRatingValue(int i) {
            copyOnWrite();
            ((GiphyGif) this.instance).setAgeRatingValue(i);
            return this;
        }

        public Builder setGifId(String str) {
            copyOnWrite();
            ((GiphyGif) this.instance).setGifId(str);
            return this;
        }

        public Builder setGifIdBytes(gva gvaVar) {
            copyOnWrite();
            ((GiphyGif) this.instance).setGifIdBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(GiphyGif.DEFAULT_INSTANCE);
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

    static {
        GiphyGif giphyGif = new GiphyGif();
        DEFAULT_INSTANCE = giphyGif;
        AbstractC0269h.registerDefaultInstance(GiphyGif.class, giphyGif);
    }

    private GiphyGif() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgeRating() {
        this.ageRating_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGifId() {
        this.gifId_ = getDefaultInstance().getGifId();
    }

    public static GiphyGif getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GiphyGif parseDelimitedFrom(InputStream inputStream) {
        return (GiphyGif) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GiphyGif parseFrom(ByteBuffer byteBuffer) {
        return (GiphyGif) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeRating(GiphyAgeRating giphyAgeRating) {
        this.ageRating_ = giphyAgeRating.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeRatingValue(int i) {
        this.ageRating_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGifId(String str) {
        str.getClass();
        this.gifId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGifIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.gifId_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"gifId_", "ageRating_"});
        }
        if (iOrdinal == 3) {
            return new GiphyGif();
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
        synchronized (GiphyGif.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
    public GiphyAgeRating getAgeRating() {
        GiphyAgeRating giphyAgeRatingForNumber = GiphyAgeRating.forNumber(this.ageRating_);
        return giphyAgeRatingForNumber == null ? GiphyAgeRating.UNRECOGNIZED : giphyAgeRatingForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
    public int getAgeRatingValue() {
        return this.ageRating_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
    public String getGifId() {
        return this.gifId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
    public gva getGifIdBytes() {
        return gva.m45888f(this.gifId_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GiphyGif giphyGif) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(giphyGif);
    }

    public static GiphyGif parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GiphyGif) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GiphyGif parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GiphyGif) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GiphyGif parseFrom(gva gvaVar) {
        return (GiphyGif) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GiphyGif parseFrom(gva gvaVar, aux auxVar) {
        return (GiphyGif) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GiphyGif parseFrom(byte[] bArr) {
        return (GiphyGif) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GiphyGif parseFrom(byte[] bArr, aux auxVar) {
        return (GiphyGif) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GiphyGif parseFrom(InputStream inputStream) {
        return (GiphyGif) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GiphyGif parseFrom(InputStream inputStream, aux auxVar) {
        return (GiphyGif) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GiphyGif parseFrom(owe oweVar) {
        return (GiphyGif) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GiphyGif parseFrom(owe oweVar, aux auxVar) {
        return (GiphyGif) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
