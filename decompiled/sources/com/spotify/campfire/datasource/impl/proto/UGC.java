package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.aux;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class UGC extends AbstractC0269h implements UGCOrBuilder {
    private static final UGC DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int VIDEO_FIELD_NUMBER = 2;
    private ae50 image_ = AbstractC0269h.emptyProtobufList();
    private ae50 video_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.UGC$1 */
    public static /* synthetic */ class C04611 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3270xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3270xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3270xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3270xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3270xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3270xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3270xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3270xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements UGCOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllImage(Iterable<? extends Asset> iterable) {
            copyOnWrite();
            ((UGC) this.instance).addAllImage(iterable);
            return this;
        }

        public Builder addAllVideo(Iterable<? extends Asset> iterable) {
            copyOnWrite();
            ((UGC) this.instance).addAllVideo(iterable);
            return this;
        }

        public Builder addImage(Asset asset) {
            copyOnWrite();
            ((UGC) this.instance).addImage(asset);
            return this;
        }

        public Builder addVideo(Asset asset) {
            copyOnWrite();
            ((UGC) this.instance).addVideo(asset);
            return this;
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

        public Builder clearImage() {
            copyOnWrite();
            ((UGC) this.instance).clearImage();
            return this;
        }

        public Builder clearVideo() {
            copyOnWrite();
            ((UGC) this.instance).clearVideo();
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

        @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
        public Asset getImage(int i) {
            return ((UGC) this.instance).getImage(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
        public int getImageCount() {
            return ((UGC) this.instance).getImageCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
        public List<Asset> getImageList() {
            return Collections.unmodifiableList(((UGC) this.instance).getImageList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
        public Asset getVideo(int i) {
            return ((UGC) this.instance).getVideo(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
        public int getVideoCount() {
            return ((UGC) this.instance).getVideoCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
        public List<Asset> getVideoList() {
            return Collections.unmodifiableList(((UGC) this.instance).getVideoList());
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder removeImage(int i) {
            copyOnWrite();
            ((UGC) this.instance).removeImage(i);
            return this;
        }

        public Builder removeVideo(int i) {
            copyOnWrite();
            ((UGC) this.instance).removeVideo(i);
            return this;
        }

        public Builder setImage(int i, Asset asset) {
            copyOnWrite();
            ((UGC) this.instance).setImage(i, asset);
            return this;
        }

        public Builder setVideo(int i, Asset asset) {
            copyOnWrite();
            ((UGC) this.instance).setVideo(i, asset);
            return this;
        }

        private Builder() {
            super(UGC.DEFAULT_INSTANCE);
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

        public Builder addImage(int i, Asset asset) {
            copyOnWrite();
            ((UGC) this.instance).addImage(i, asset);
            return this;
        }

        public Builder addVideo(int i, Asset asset) {
            copyOnWrite();
            ((UGC) this.instance).addVideo(i, asset);
            return this;
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

        public Builder setImage(int i, Asset.Builder builder) {
            copyOnWrite();
            ((UGC) this.instance).setImage(i, (Asset) builder.build());
            return this;
        }

        public Builder setVideo(int i, Asset.Builder builder) {
            copyOnWrite();
            ((UGC) this.instance).setVideo(i, (Asset) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public Builder addImage(Asset.Builder builder) {
            copyOnWrite();
            ((UGC) this.instance).addImage((Asset) builder.build());
            return this;
        }

        public Builder addVideo(Asset.Builder builder) {
            copyOnWrite();
            ((UGC) this.instance).addVideo((Asset) builder.build());
            return this;
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

        public Builder addImage(int i, Asset.Builder builder) {
            copyOnWrite();
            ((UGC) this.instance).addImage(i, (Asset) builder.build());
            return this;
        }

        public Builder addVideo(int i, Asset.Builder builder) {
            copyOnWrite();
            ((UGC) this.instance).addVideo(i, (Asset) builder.build());
            return this;
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
        UGC ugc = new UGC();
        DEFAULT_INSTANCE = ugc;
        AbstractC0269h.registerDefaultInstance(UGC.class, ugc);
    }

    private UGC() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllImage(Iterable<? extends Asset> iterable) {
        ensureImageIsMutable();
        AbstractC2118m8.addAll(iterable, this.image_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVideo(Iterable<? extends Asset> iterable) {
        ensureVideoIsMutable();
        AbstractC2118m8.addAll(iterable, this.video_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImage(Asset asset) {
        asset.getClass();
        ensureImageIsMutable();
        this.image_.add(asset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideo(Asset asset) {
        asset.getClass();
        ensureVideoIsMutable();
        this.video_.add(asset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImage() {
        this.image_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideo() {
        this.video_ = AbstractC0269h.emptyProtobufList();
    }

    private void ensureImageIsMutable() {
        ae50 ae50Var = this.image_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.image_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    private void ensureVideoIsMutable() {
        ae50 ae50Var = this.video_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.video_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static UGC getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static UGC parseDelimitedFrom(InputStream inputStream) {
        return (UGC) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UGC parseFrom(ByteBuffer byteBuffer) {
        return (UGC) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeImage(int i) {
        ensureImageIsMutable();
        this.image_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVideo(int i) {
        ensureVideoIsMutable();
        this.video_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImage(int i, Asset asset) {
        asset.getClass();
        ensureImageIsMutable();
        this.image_.set(i, asset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideo(int i, Asset asset) {
        asset.getClass();
        ensureVideoIsMutable();
        this.video_.set(i, asset);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"image_", Asset.class, "video_", Asset.class});
        }
        if (iOrdinal == 3) {
            return new UGC();
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
        synchronized (UGC.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
    public Asset getImage(int i) {
        return (Asset) this.image_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
    public int getImageCount() {
        return this.image_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
    public List<Asset> getImageList() {
        return this.image_;
    }

    public AssetOrBuilder getImageOrBuilder(int i) {
        return (AssetOrBuilder) this.image_.get(i);
    }

    public List<? extends AssetOrBuilder> getImageOrBuilderList() {
        return this.image_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
    public Asset getVideo(int i) {
        return (Asset) this.video_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
    public int getVideoCount() {
        return this.video_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
    public List<Asset> getVideoList() {
        return this.video_;
    }

    public AssetOrBuilder getVideoOrBuilder(int i) {
        return (AssetOrBuilder) this.video_.get(i);
    }

    public List<? extends AssetOrBuilder> getVideoOrBuilderList() {
        return this.video_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(UGC ugc) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(ugc);
    }

    public static UGC parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (UGC) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static UGC parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (UGC) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static UGC parseFrom(gva gvaVar) {
        return (UGC) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImage(int i, Asset asset) {
        asset.getClass();
        ensureImageIsMutable();
        this.image_.add(i, asset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideo(int i, Asset asset) {
        asset.getClass();
        ensureVideoIsMutable();
        this.video_.add(i, asset);
    }

    public static UGC parseFrom(gva gvaVar, aux auxVar) {
        return (UGC) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static UGC parseFrom(byte[] bArr) {
        return (UGC) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UGC parseFrom(byte[] bArr, aux auxVar) {
        return (UGC) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static UGC parseFrom(InputStream inputStream) {
        return (UGC) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UGC parseFrom(InputStream inputStream, aux auxVar) {
        return (UGC) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static UGC parseFrom(owe oweVar) {
        return (UGC) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static UGC parseFrom(owe oweVar, aux auxVar) {
        return (UGC) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
