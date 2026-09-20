package com.spotify.cosmos.util.proto;

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

/* JADX INFO: loaded from: classes6.dex */
public final class EpisodeShowMetadata extends AbstractC0269h implements EpisodeShowMetadataOrBuilder {
    public static final int COVERS_FIELD_NUMBER = 4;
    private static final EpisodeShowMetadata DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PUBLISHER_FIELD_NUMBER = 3;
    private int bitField0_;
    private ImageGroup covers_;
    private String link_ = "";
    private String name_ = "";
    private String publisher_ = "";

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.EpisodeShowMetadata$1 */
    public static /* synthetic */ class C06691 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3517xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3517xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3517xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3517xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3517xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3517xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3517xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3517xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements EpisodeShowMetadataOrBuilder {
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

        public Builder clearCovers() {
            copyOnWrite();
            ((EpisodeShowMetadata) this.instance).clearCovers();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((EpisodeShowMetadata) this.instance).clearLink();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((EpisodeShowMetadata) this.instance).clearName();
            return this;
        }

        public Builder clearPublisher() {
            copyOnWrite();
            ((EpisodeShowMetadata) this.instance).clearPublisher();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public ImageGroup getCovers() {
            return ((EpisodeShowMetadata) this.instance).getCovers();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public String getLink() {
            return ((EpisodeShowMetadata) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public gva getLinkBytes() {
            return ((EpisodeShowMetadata) this.instance).getLinkBytes();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public String getName() {
            return ((EpisodeShowMetadata) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public gva getNameBytes() {
            return ((EpisodeShowMetadata) this.instance).getNameBytes();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public String getPublisher() {
            return ((EpisodeShowMetadata) this.instance).getPublisher();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public gva getPublisherBytes() {
            return ((EpisodeShowMetadata) this.instance).getPublisherBytes();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public boolean hasCovers() {
            return ((EpisodeShowMetadata) this.instance).hasCovers();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public boolean hasLink() {
            return ((EpisodeShowMetadata) this.instance).hasLink();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public boolean hasName() {
            return ((EpisodeShowMetadata) this.instance).hasName();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public boolean hasPublisher() {
            return ((EpisodeShowMetadata) this.instance).hasPublisher();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((EpisodeShowMetadata) this.instance).mergeCovers(imageGroup);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((EpisodeShowMetadata) this.instance).setCovers(imageGroup);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((EpisodeShowMetadata) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(gva gvaVar) {
            copyOnWrite();
            ((EpisodeShowMetadata) this.instance).setLinkBytes(gvaVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((EpisodeShowMetadata) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(gva gvaVar) {
            copyOnWrite();
            ((EpisodeShowMetadata) this.instance).setNameBytes(gvaVar);
            return this;
        }

        public Builder setPublisher(String str) {
            copyOnWrite();
            ((EpisodeShowMetadata) this.instance).setPublisher(str);
            return this;
        }

        public Builder setPublisherBytes(gva gvaVar) {
            copyOnWrite();
            ((EpisodeShowMetadata) this.instance).setPublisherBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(EpisodeShowMetadata.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public Builder setCovers(ImageGroup.Builder builder) {
            copyOnWrite();
            ((EpisodeShowMetadata) this.instance).setCovers((ImageGroup) builder.build());
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

    static {
        EpisodeShowMetadata episodeShowMetadata = new EpisodeShowMetadata();
        DEFAULT_INSTANCE = episodeShowMetadata;
        AbstractC0269h.registerDefaultInstance(EpisodeShowMetadata.class, episodeShowMetadata);
    }

    private EpisodeShowMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.bitField0_ &= -2;
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublisher() {
        this.bitField0_ &= -5;
        this.publisher_ = getDefaultInstance().getPublisher();
    }

    public static EpisodeShowMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCovers(ImageGroup imageGroup) {
        imageGroup.getClass();
        ImageGroup imageGroup2 = this.covers_;
        if (imageGroup2 == null || imageGroup2 == ImageGroup.getDefaultInstance()) {
            this.covers_ = imageGroup;
        } else {
            this.covers_ = (ImageGroup) ((ImageGroup.Builder) ImageGroup.newBuilder(this.covers_).mergeFrom((AbstractC0269h) imageGroup)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodeShowMetadata parseDelimitedFrom(InputStream inputStream) {
        return (EpisodeShowMetadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeShowMetadata parseFrom(ByteBuffer byteBuffer) {
        return (EpisodeShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(ImageGroup imageGroup) {
        imageGroup.getClass();
        this.covers_ = imageGroup;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(gva gvaVar) {
        this.link_ = gvaVar.m45892u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(gva gvaVar) {
        this.name_ = gvaVar.m45892u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisher(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.publisher_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisherBytes(gva gvaVar) {
        this.publisher_ = gvaVar.m45892u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "link_", "name_", "publisher_", "covers_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeShowMetadata();
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
        synchronized (EpisodeShowMetadata.class) {
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

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public ImageGroup getCovers() {
        ImageGroup imageGroup = this.covers_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public gva getLinkBytes() {
        return gva.m45888f(this.link_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public gva getNameBytes() {
        return gva.m45888f(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public String getPublisher() {
        return this.publisher_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public gva getPublisherBytes() {
        return gva.m45888f(this.publisher_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public boolean hasCovers() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public boolean hasLink() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public boolean hasPublisher() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(EpisodeShowMetadata episodeShowMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(episodeShowMetadata);
    }

    public static EpisodeShowMetadata parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (EpisodeShowMetadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static EpisodeShowMetadata parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (EpisodeShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static EpisodeShowMetadata parseFrom(gva gvaVar) {
        return (EpisodeShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static EpisodeShowMetadata parseFrom(gva gvaVar, aux auxVar) {
        return (EpisodeShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static EpisodeShowMetadata parseFrom(byte[] bArr) {
        return (EpisodeShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeShowMetadata parseFrom(byte[] bArr, aux auxVar) {
        return (EpisodeShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static EpisodeShowMetadata parseFrom(InputStream inputStream) {
        return (EpisodeShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeShowMetadata parseFrom(InputStream inputStream, aux auxVar) {
        return (EpisodeShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static EpisodeShowMetadata parseFrom(owe oweVar) {
        return (EpisodeShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static EpisodeShowMetadata parseFrom(owe oweVar, aux auxVar) {
        return (EpisodeShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
