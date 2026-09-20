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

/* JADX INFO: loaded from: classes.dex */
public final class TrackAlbumMetadata extends AbstractC0269h implements TrackAlbumMetadataOrBuilder {
    public static final int ARTIST_FIELD_NUMBER = 1;
    public static final int COVERS_FIELD_NUMBER = 4;
    private static final TrackAlbumMetadata DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private TrackAlbumArtistMetadata artist_;
    private int bitField0_;
    private ImageGroup covers_;
    private String link_ = "";
    private String name_ = "";

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.TrackAlbumMetadata$1 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C06801 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3526xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3526xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3526xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3526xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3526xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3526xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3526xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3526xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder extends AbstractC0268g implements TrackAlbumMetadataOrBuilder {
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

        public Builder clearArtist() {
            copyOnWrite();
            ((TrackAlbumMetadata) this.instance).clearArtist();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((TrackAlbumMetadata) this.instance).clearCovers();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((TrackAlbumMetadata) this.instance).clearLink();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((TrackAlbumMetadata) this.instance).clearName();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
        public TrackAlbumArtistMetadata getArtist() {
            return ((TrackAlbumMetadata) this.instance).getArtist();
        }

        @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
        public ImageGroup getCovers() {
            return ((TrackAlbumMetadata) this.instance).getCovers();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
        public String getLink() {
            return ((TrackAlbumMetadata) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
        public gva getLinkBytes() {
            return ((TrackAlbumMetadata) this.instance).getLinkBytes();
        }

        @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
        public String getName() {
            return ((TrackAlbumMetadata) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
        public gva getNameBytes() {
            return ((TrackAlbumMetadata) this.instance).getNameBytes();
        }

        @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
        public boolean hasArtist() {
            return ((TrackAlbumMetadata) this.instance).hasArtist();
        }

        @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
        public boolean hasCovers() {
            return ((TrackAlbumMetadata) this.instance).hasCovers();
        }

        @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
        public boolean hasLink() {
            return ((TrackAlbumMetadata) this.instance).hasLink();
        }

        @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
        public boolean hasName() {
            return ((TrackAlbumMetadata) this.instance).hasName();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeArtist(TrackAlbumArtistMetadata trackAlbumArtistMetadata) {
            copyOnWrite();
            ((TrackAlbumMetadata) this.instance).mergeArtist(trackAlbumArtistMetadata);
            return this;
        }

        public Builder mergeCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((TrackAlbumMetadata) this.instance).mergeCovers(imageGroup);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setArtist(TrackAlbumArtistMetadata trackAlbumArtistMetadata) {
            copyOnWrite();
            ((TrackAlbumMetadata) this.instance).setArtist(trackAlbumArtistMetadata);
            return this;
        }

        public Builder setCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((TrackAlbumMetadata) this.instance).setCovers(imageGroup);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((TrackAlbumMetadata) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(gva gvaVar) {
            copyOnWrite();
            ((TrackAlbumMetadata) this.instance).setLinkBytes(gvaVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((TrackAlbumMetadata) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(gva gvaVar) {
            copyOnWrite();
            ((TrackAlbumMetadata) this.instance).setNameBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(TrackAlbumMetadata.DEFAULT_INSTANCE);
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

        public Builder setArtist(TrackAlbumArtistMetadata.Builder builder) {
            copyOnWrite();
            ((TrackAlbumMetadata) this.instance).setArtist((TrackAlbumArtistMetadata) builder.build());
            return this;
        }

        public Builder setCovers(ImageGroup.Builder builder) {
            copyOnWrite();
            ((TrackAlbumMetadata) this.instance).setCovers((ImageGroup) builder.build());
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
        TrackAlbumMetadata trackAlbumMetadata = new TrackAlbumMetadata();
        DEFAULT_INSTANCE = trackAlbumMetadata;
        AbstractC0269h.registerDefaultInstance(TrackAlbumMetadata.class, trackAlbumMetadata);
    }

    private TrackAlbumMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArtist() {
        this.artist_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.bitField0_ &= -3;
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -5;
        this.name_ = getDefaultInstance().getName();
    }

    public static TrackAlbumMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArtist(TrackAlbumArtistMetadata trackAlbumArtistMetadata) {
        trackAlbumArtistMetadata.getClass();
        TrackAlbumArtistMetadata trackAlbumArtistMetadata2 = this.artist_;
        if (trackAlbumArtistMetadata2 == null || trackAlbumArtistMetadata2 == TrackAlbumArtistMetadata.getDefaultInstance()) {
            this.artist_ = trackAlbumArtistMetadata;
        } else {
            this.artist_ = (TrackAlbumArtistMetadata) ((TrackAlbumArtistMetadata.Builder) TrackAlbumArtistMetadata.newBuilder(this.artist_).mergeFrom((AbstractC0269h) trackAlbumArtistMetadata)).buildPartial();
        }
        this.bitField0_ |= 1;
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

    public static TrackAlbumMetadata parseDelimitedFrom(InputStream inputStream) {
        return (TrackAlbumMetadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackAlbumMetadata parseFrom(ByteBuffer byteBuffer) {
        return (TrackAlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArtist(TrackAlbumArtistMetadata trackAlbumArtistMetadata) {
        trackAlbumArtistMetadata.getClass();
        this.artist_ = trackAlbumArtistMetadata;
        this.bitField0_ |= 1;
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
        this.bitField0_ |= 2;
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(gva gvaVar) {
        this.link_ = gvaVar.m45892u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(gva gvaVar) {
        this.name_ = gvaVar.m45892u();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "artist_", "link_", "name_", "covers_"});
        }
        if (iOrdinal == 3) {
            return new TrackAlbumMetadata();
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
        synchronized (TrackAlbumMetadata.class) {
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

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public TrackAlbumArtistMetadata getArtist() {
        TrackAlbumArtistMetadata trackAlbumArtistMetadata = this.artist_;
        return trackAlbumArtistMetadata == null ? TrackAlbumArtistMetadata.getDefaultInstance() : trackAlbumArtistMetadata;
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public ImageGroup getCovers() {
        ImageGroup imageGroup = this.covers_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public gva getLinkBytes() {
        return gva.m45888f(this.link_);
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public gva getNameBytes() {
        return gva.m45888f(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public boolean hasArtist() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public boolean hasCovers() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public boolean hasLink() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public boolean hasName() {
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

    public static Builder newBuilder(TrackAlbumMetadata trackAlbumMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(trackAlbumMetadata);
    }

    public static TrackAlbumMetadata parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (TrackAlbumMetadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static TrackAlbumMetadata parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (TrackAlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static TrackAlbumMetadata parseFrom(gva gvaVar) {
        return (TrackAlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static TrackAlbumMetadata parseFrom(gva gvaVar, aux auxVar) {
        return (TrackAlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static TrackAlbumMetadata parseFrom(byte[] bArr) {
        return (TrackAlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackAlbumMetadata parseFrom(byte[] bArr, aux auxVar) {
        return (TrackAlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static TrackAlbumMetadata parseFrom(InputStream inputStream) {
        return (TrackAlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackAlbumMetadata parseFrom(InputStream inputStream, aux auxVar) {
        return (TrackAlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static TrackAlbumMetadata parseFrom(owe oweVar) {
        return (TrackAlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static TrackAlbumMetadata parseFrom(owe oweVar, aux auxVar) {
        return (TrackAlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
