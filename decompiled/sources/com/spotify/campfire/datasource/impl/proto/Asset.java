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
public final class Asset extends AbstractC0269h implements AssetOrBuilder {
    public static final int ASSET_REF_FIELD_NUMBER = 1;
    private static final Asset DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int THUMBNAIL_ASSET_REF_FIELD_NUMBER = 2;
    private String assetRef_ = "";
    private String thumbnailAssetRef_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.Asset$1 */
    public static /* synthetic */ class C03341 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3162xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3162xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3162xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3162xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3162xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3162xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3162xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3162xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements AssetOrBuilder {
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

        public Builder clearAssetRef() {
            copyOnWrite();
            ((Asset) this.instance).clearAssetRef();
            return this;
        }

        public Builder clearThumbnailAssetRef() {
            copyOnWrite();
            ((Asset) this.instance).clearThumbnailAssetRef();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
        public String getAssetRef() {
            return ((Asset) this.instance).getAssetRef();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
        public gva getAssetRefBytes() {
            return ((Asset) this.instance).getAssetRefBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
        public String getThumbnailAssetRef() {
            return ((Asset) this.instance).getThumbnailAssetRef();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
        public gva getThumbnailAssetRefBytes() {
            return ((Asset) this.instance).getThumbnailAssetRefBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setAssetRef(String str) {
            copyOnWrite();
            ((Asset) this.instance).setAssetRef(str);
            return this;
        }

        public Builder setAssetRefBytes(gva gvaVar) {
            copyOnWrite();
            ((Asset) this.instance).setAssetRefBytes(gvaVar);
            return this;
        }

        public Builder setThumbnailAssetRef(String str) {
            copyOnWrite();
            ((Asset) this.instance).setThumbnailAssetRef(str);
            return this;
        }

        public Builder setThumbnailAssetRefBytes(gva gvaVar) {
            copyOnWrite();
            ((Asset) this.instance).setThumbnailAssetRefBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(Asset.DEFAULT_INSTANCE);
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
        Asset asset = new Asset();
        DEFAULT_INSTANCE = asset;
        AbstractC0269h.registerDefaultInstance(Asset.class, asset);
    }

    private Asset() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssetRef() {
        this.assetRef_ = getDefaultInstance().getAssetRef();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThumbnailAssetRef() {
        this.thumbnailAssetRef_ = getDefaultInstance().getThumbnailAssetRef();
    }

    public static Asset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Asset parseDelimitedFrom(InputStream inputStream) {
        return (Asset) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Asset parseFrom(ByteBuffer byteBuffer) {
        return (Asset) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssetRef(String str) {
        str.getClass();
        this.assetRef_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssetRefBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.assetRef_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbnailAssetRef(String str) {
        str.getClass();
        this.thumbnailAssetRef_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbnailAssetRefBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.thumbnailAssetRef_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"assetRef_", "thumbnailAssetRef_"});
        }
        if (iOrdinal == 3) {
            return new Asset();
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
        synchronized (Asset.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
    public String getAssetRef() {
        return this.assetRef_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
    public gva getAssetRefBytes() {
        return gva.m45888f(this.assetRef_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
    public String getThumbnailAssetRef() {
        return this.thumbnailAssetRef_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
    public gva getThumbnailAssetRefBytes() {
        return gva.m45888f(this.thumbnailAssetRef_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(Asset asset) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(asset);
    }

    public static Asset parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (Asset) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Asset parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (Asset) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static Asset parseFrom(gva gvaVar) {
        return (Asset) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static Asset parseFrom(gva gvaVar, aux auxVar) {
        return (Asset) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static Asset parseFrom(byte[] bArr) {
        return (Asset) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Asset parseFrom(byte[] bArr, aux auxVar) {
        return (Asset) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static Asset parseFrom(InputStream inputStream) {
        return (Asset) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Asset parseFrom(InputStream inputStream, aux auxVar) {
        return (Asset) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Asset parseFrom(owe oweVar) {
        return (Asset) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static Asset parseFrom(owe oweVar, aux auxVar) {
        return (Asset) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
