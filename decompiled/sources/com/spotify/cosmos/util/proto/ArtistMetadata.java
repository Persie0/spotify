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
public final class ArtistMetadata extends AbstractC0269h implements ArtistMetadataOrBuilder {
    private static final ArtistMetadata DEFAULT_INSTANCE;
    public static final int IS_VARIOUS_ARTISTS_FIELD_NUMBER = 3;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PORTRAITS_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean isVariousArtists_;
    private String link_ = "";
    private String name_ = "";
    private ImageGroup portraits_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.ArtistMetadata$1 */
    public static /* synthetic */ class C06601 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3511xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3511xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3511xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3511xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3511xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3511xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3511xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3511xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ArtistMetadataOrBuilder {
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

        public Builder clearIsVariousArtists() {
            copyOnWrite();
            ((ArtistMetadata) this.instance).clearIsVariousArtists();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((ArtistMetadata) this.instance).clearLink();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((ArtistMetadata) this.instance).clearName();
            return this;
        }

        public Builder clearPortraits() {
            copyOnWrite();
            ((ArtistMetadata) this.instance).clearPortraits();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public boolean getIsVariousArtists() {
            return ((ArtistMetadata) this.instance).getIsVariousArtists();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public String getLink() {
            return ((ArtistMetadata) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public gva getLinkBytes() {
            return ((ArtistMetadata) this.instance).getLinkBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public String getName() {
            return ((ArtistMetadata) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public gva getNameBytes() {
            return ((ArtistMetadata) this.instance).getNameBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public ImageGroup getPortraits() {
            return ((ArtistMetadata) this.instance).getPortraits();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public boolean hasIsVariousArtists() {
            return ((ArtistMetadata) this.instance).hasIsVariousArtists();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public boolean hasLink() {
            return ((ArtistMetadata) this.instance).hasLink();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public boolean hasName() {
            return ((ArtistMetadata) this.instance).hasName();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public boolean hasPortraits() {
            return ((ArtistMetadata) this.instance).hasPortraits();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergePortraits(ImageGroup imageGroup) {
            copyOnWrite();
            ((ArtistMetadata) this.instance).mergePortraits(imageGroup);
            return this;
        }

        public Builder setIsVariousArtists(boolean z) {
            copyOnWrite();
            ((ArtistMetadata) this.instance).setIsVariousArtists(z);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((ArtistMetadata) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(gva gvaVar) {
            copyOnWrite();
            ((ArtistMetadata) this.instance).setLinkBytes(gvaVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((ArtistMetadata) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(gva gvaVar) {
            copyOnWrite();
            ((ArtistMetadata) this.instance).setNameBytes(gvaVar);
            return this;
        }

        public Builder setPortraits(ImageGroup imageGroup) {
            copyOnWrite();
            ((ArtistMetadata) this.instance).setPortraits(imageGroup);
            return this;
        }

        private Builder() {
            super(ArtistMetadata.DEFAULT_INSTANCE);
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

        public Builder setPortraits(ImageGroup.Builder builder) {
            copyOnWrite();
            ((ArtistMetadata) this.instance).setPortraits((ImageGroup) builder.build());
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
        ArtistMetadata artistMetadata = new ArtistMetadata();
        DEFAULT_INSTANCE = artistMetadata;
        AbstractC0269h.registerDefaultInstance(ArtistMetadata.class, artistMetadata);
    }

    private ArtistMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsVariousArtists() {
        this.bitField0_ &= -5;
        this.isVariousArtists_ = false;
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
    public void clearPortraits() {
        this.portraits_ = null;
        this.bitField0_ &= -9;
    }

    public static ArtistMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePortraits(ImageGroup imageGroup) {
        imageGroup.getClass();
        ImageGroup imageGroup2 = this.portraits_;
        if (imageGroup2 == null || imageGroup2 == ImageGroup.getDefaultInstance()) {
            this.portraits_ = imageGroup;
        } else {
            this.portraits_ = (ImageGroup) ((ImageGroup.Builder) ImageGroup.newBuilder(this.portraits_).mergeFrom((AbstractC0269h) imageGroup)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ArtistMetadata parseDelimitedFrom(InputStream inputStream) {
        return (ArtistMetadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistMetadata parseFrom(ByteBuffer byteBuffer) {
        return (ArtistMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsVariousArtists(boolean z) {
        this.bitField0_ |= 4;
        this.isVariousArtists_ = z;
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
    public void setPortraits(ImageGroup imageGroup) {
        imageGroup.getClass();
        this.portraits_ = imageGroup;
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "link_", "name_", "isVariousArtists_", "portraits_"});
        }
        if (iOrdinal == 3) {
            return new ArtistMetadata();
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
        synchronized (ArtistMetadata.class) {
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

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public boolean getIsVariousArtists() {
        return this.isVariousArtists_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public gva getLinkBytes() {
        return gva.m45888f(this.link_);
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public gva getNameBytes() {
        return gva.m45888f(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public ImageGroup getPortraits() {
        ImageGroup imageGroup = this.portraits_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public boolean hasIsVariousArtists() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public boolean hasLink() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public boolean hasPortraits() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ArtistMetadata artistMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(artistMetadata);
    }

    public static ArtistMetadata parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ArtistMetadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ArtistMetadata parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ArtistMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ArtistMetadata parseFrom(gva gvaVar) {
        return (ArtistMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ArtistMetadata parseFrom(gva gvaVar, aux auxVar) {
        return (ArtistMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ArtistMetadata parseFrom(byte[] bArr) {
        return (ArtistMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArtistMetadata parseFrom(byte[] bArr, aux auxVar) {
        return (ArtistMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ArtistMetadata parseFrom(InputStream inputStream) {
        return (ArtistMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistMetadata parseFrom(InputStream inputStream, aux auxVar) {
        return (ArtistMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ArtistMetadata parseFrom(owe oweVar) {
        return (ArtistMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ArtistMetadata parseFrom(owe oweVar, aux auxVar) {
        return (ArtistMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
