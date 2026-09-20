package com.spotify.cosmos.util.proto;

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

/* JADX INFO: loaded from: classes6.dex */
public final class AlbumMetadata extends AbstractC0269h implements AlbumMetadataOrBuilder {
    public static final int ARTISTS_FIELD_NUMBER = 1;
    public static final int COPYRIGHT_FIELD_NUMBER = 4;
    public static final int COVERS_FIELD_NUMBER = 5;
    private static final AlbumMetadata DEFAULT_INSTANCE;
    public static final int IS_PREMIUM_ONLY_FIELD_NUMBER = 10;
    public static final int LINK_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int NUM_DISCS_FIELD_NUMBER = 7;
    public static final int NUM_TRACKS_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYABILITY_FIELD_NUMBER = 9;
    public static final int YEAR_FIELD_NUMBER = 6;
    private int bitField0_;
    private ImageGroup covers_;
    private boolean isPremiumOnly_;
    private int numDiscs_;
    private int numTracks_;
    private boolean playability_;
    private int year_;
    private ae50 artists_ = AbstractC0269h.emptyProtobufList();
    private String link_ = "";
    private String name_ = "";
    private ae50 copyright_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.AlbumMetadata$1 */
    public static /* synthetic */ class C06571 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3508xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3508xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3508xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3508xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3508xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3508xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3508xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3508xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements AlbumMetadataOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllArtists(Iterable<? extends AlbumArtistMetadata> iterable) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).addAllArtists(iterable);
            return this;
        }

        public Builder addAllCopyright(Iterable<String> iterable) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).addAllCopyright(iterable);
            return this;
        }

        public Builder addArtists(AlbumArtistMetadata albumArtistMetadata) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).addArtists(albumArtistMetadata);
            return this;
        }

        public Builder addCopyright(String str) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).addCopyright(str);
            return this;
        }

        public Builder addCopyrightBytes(gva gvaVar) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).addCopyrightBytes(gvaVar);
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

        public Builder clearArtists() {
            copyOnWrite();
            ((AlbumMetadata) this.instance).clearArtists();
            return this;
        }

        public Builder clearCopyright() {
            copyOnWrite();
            ((AlbumMetadata) this.instance).clearCopyright();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((AlbumMetadata) this.instance).clearCovers();
            return this;
        }

        public Builder clearIsPremiumOnly() {
            copyOnWrite();
            ((AlbumMetadata) this.instance).clearIsPremiumOnly();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((AlbumMetadata) this.instance).clearLink();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((AlbumMetadata) this.instance).clearName();
            return this;
        }

        public Builder clearNumDiscs() {
            copyOnWrite();
            ((AlbumMetadata) this.instance).clearNumDiscs();
            return this;
        }

        public Builder clearNumTracks() {
            copyOnWrite();
            ((AlbumMetadata) this.instance).clearNumTracks();
            return this;
        }

        public Builder clearPlayability() {
            copyOnWrite();
            ((AlbumMetadata) this.instance).clearPlayability();
            return this;
        }

        public Builder clearYear() {
            copyOnWrite();
            ((AlbumMetadata) this.instance).clearYear();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public AlbumArtistMetadata getArtists(int i) {
            return ((AlbumMetadata) this.instance).getArtists(i);
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public int getArtistsCount() {
            return ((AlbumMetadata) this.instance).getArtistsCount();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public List<AlbumArtistMetadata> getArtistsList() {
            return Collections.unmodifiableList(((AlbumMetadata) this.instance).getArtistsList());
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public String getCopyright(int i) {
            return ((AlbumMetadata) this.instance).getCopyright(i);
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public gva getCopyrightBytes(int i) {
            return ((AlbumMetadata) this.instance).getCopyrightBytes(i);
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public int getCopyrightCount() {
            return ((AlbumMetadata) this.instance).getCopyrightCount();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public List<String> getCopyrightList() {
            return Collections.unmodifiableList(((AlbumMetadata) this.instance).getCopyrightList());
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public ImageGroup getCovers() {
            return ((AlbumMetadata) this.instance).getCovers();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public boolean getIsPremiumOnly() {
            return ((AlbumMetadata) this.instance).getIsPremiumOnly();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public String getLink() {
            return ((AlbumMetadata) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public gva getLinkBytes() {
            return ((AlbumMetadata) this.instance).getLinkBytes();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public String getName() {
            return ((AlbumMetadata) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public gva getNameBytes() {
            return ((AlbumMetadata) this.instance).getNameBytes();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public int getNumDiscs() {
            return ((AlbumMetadata) this.instance).getNumDiscs();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public int getNumTracks() {
            return ((AlbumMetadata) this.instance).getNumTracks();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public boolean getPlayability() {
            return ((AlbumMetadata) this.instance).getPlayability();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public int getYear() {
            return ((AlbumMetadata) this.instance).getYear();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public boolean hasCovers() {
            return ((AlbumMetadata) this.instance).hasCovers();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public boolean hasIsPremiumOnly() {
            return ((AlbumMetadata) this.instance).hasIsPremiumOnly();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public boolean hasLink() {
            return ((AlbumMetadata) this.instance).hasLink();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public boolean hasName() {
            return ((AlbumMetadata) this.instance).hasName();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public boolean hasNumDiscs() {
            return ((AlbumMetadata) this.instance).hasNumDiscs();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public boolean hasNumTracks() {
            return ((AlbumMetadata) this.instance).hasNumTracks();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public boolean hasPlayability() {
            return ((AlbumMetadata) this.instance).hasPlayability();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public boolean hasYear() {
            return ((AlbumMetadata) this.instance).hasYear();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).mergeCovers(imageGroup);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder removeArtists(int i) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).removeArtists(i);
            return this;
        }

        public Builder setArtists(int i, AlbumArtistMetadata albumArtistMetadata) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).setArtists(i, albumArtistMetadata);
            return this;
        }

        public Builder setCopyright(int i, String str) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).setCopyright(i, str);
            return this;
        }

        public Builder setCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).setCovers(imageGroup);
            return this;
        }

        public Builder setIsPremiumOnly(boolean z) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).setIsPremiumOnly(z);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(gva gvaVar) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).setLinkBytes(gvaVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(gva gvaVar) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).setNameBytes(gvaVar);
            return this;
        }

        public Builder setNumDiscs(int i) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).setNumDiscs(i);
            return this;
        }

        public Builder setNumTracks(int i) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).setNumTracks(i);
            return this;
        }

        public Builder setPlayability(boolean z) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).setPlayability(z);
            return this;
        }

        public Builder setYear(int i) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).setYear(i);
            return this;
        }

        private Builder() {
            super(AlbumMetadata.DEFAULT_INSTANCE);
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

        public Builder addArtists(int i, AlbumArtistMetadata albumArtistMetadata) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).addArtists(i, albumArtistMetadata);
            return this;
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

        public Builder setArtists(int i, AlbumArtistMetadata.Builder builder) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).setArtists(i, (AlbumArtistMetadata) builder.build());
            return this;
        }

        public Builder setCovers(ImageGroup.Builder builder) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).setCovers((ImageGroup) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public Builder addArtists(AlbumArtistMetadata.Builder builder) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).addArtists((AlbumArtistMetadata) builder.build());
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

        public Builder addArtists(int i, AlbumArtistMetadata.Builder builder) {
            copyOnWrite();
            ((AlbumMetadata) this.instance).addArtists(i, (AlbumArtistMetadata) builder.build());
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
        AlbumMetadata albumMetadata = new AlbumMetadata();
        DEFAULT_INSTANCE = albumMetadata;
        AbstractC0269h.registerDefaultInstance(AlbumMetadata.class, albumMetadata);
    }

    private AlbumMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllArtists(Iterable<? extends AlbumArtistMetadata> iterable) {
        ensureArtistsIsMutable();
        AbstractC2118m8.addAll(iterable, this.artists_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCopyright(Iterable<String> iterable) {
        ensureCopyrightIsMutable();
        AbstractC2118m8.addAll(iterable, this.copyright_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addArtists(AlbumArtistMetadata albumArtistMetadata) {
        albumArtistMetadata.getClass();
        ensureArtistsIsMutable();
        this.artists_.add(albumArtistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCopyright(String str) {
        str.getClass();
        ensureCopyrightIsMutable();
        this.copyright_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCopyrightBytes(gva gvaVar) {
        ensureCopyrightIsMutable();
        this.copyright_.add(gvaVar.m45892u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArtists() {
        this.artists_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopyright() {
        this.copyright_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPremiumOnly() {
        this.bitField0_ &= -129;
        this.isPremiumOnly_ = false;
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
    public void clearNumDiscs() {
        this.bitField0_ &= -17;
        this.numDiscs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumTracks() {
        this.bitField0_ &= -33;
        this.numTracks_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayability() {
        this.bitField0_ &= -65;
        this.playability_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearYear() {
        this.bitField0_ &= -9;
        this.year_ = 0;
    }

    private void ensureArtistsIsMutable() {
        ae50 ae50Var = this.artists_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.artists_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    private void ensureCopyrightIsMutable() {
        ae50 ae50Var = this.copyright_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.copyright_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static AlbumMetadata getDefaultInstance() {
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
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AlbumMetadata parseDelimitedFrom(InputStream inputStream) {
        return (AlbumMetadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlbumMetadata parseFrom(ByteBuffer byteBuffer) {
        return (AlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeArtists(int i) {
        ensureArtistsIsMutable();
        this.artists_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArtists(int i, AlbumArtistMetadata albumArtistMetadata) {
        albumArtistMetadata.getClass();
        ensureArtistsIsMutable();
        this.artists_.set(i, albumArtistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyright(int i, String str) {
        str.getClass();
        ensureCopyrightIsMutable();
        this.copyright_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(ImageGroup imageGroup) {
        imageGroup.getClass();
        this.covers_ = imageGroup;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPremiumOnly(boolean z) {
        this.bitField0_ |= 128;
        this.isPremiumOnly_ = z;
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
    public void setNumDiscs(int i) {
        this.bitField0_ |= 16;
        this.numDiscs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumTracks(int i) {
        this.bitField0_ |= 32;
        this.numTracks_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayability(boolean z) {
        this.bitField0_ |= 64;
        this.playability_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYear(int i) {
        this.bitField0_ |= 8;
        this.year_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001\u0004\u001a\u0005ဉ\u0002\u0006ဋ\u0003\u0007ဋ\u0004\bဋ\u0005\tဇ\u0006\nဇ\u0007", new Object[]{"bitField0_", "artists_", AlbumArtistMetadata.class, "link_", "name_", "copyright_", "covers_", "year_", "numDiscs_", "numTracks_", "playability_", "isPremiumOnly_"});
        }
        if (iOrdinal == 3) {
            return new AlbumMetadata();
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
        synchronized (AlbumMetadata.class) {
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

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public AlbumArtistMetadata getArtists(int i) {
        return (AlbumArtistMetadata) this.artists_.get(i);
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public int getArtistsCount() {
        return this.artists_.size();
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public List<AlbumArtistMetadata> getArtistsList() {
        return this.artists_;
    }

    public AlbumArtistMetadataOrBuilder getArtistsOrBuilder(int i) {
        return (AlbumArtistMetadataOrBuilder) this.artists_.get(i);
    }

    public List<? extends AlbumArtistMetadataOrBuilder> getArtistsOrBuilderList() {
        return this.artists_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public String getCopyright(int i) {
        return (String) this.copyright_.get(i);
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public gva getCopyrightBytes(int i) {
        return gva.m45888f((String) this.copyright_.get(i));
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public int getCopyrightCount() {
        return this.copyright_.size();
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public List<String> getCopyrightList() {
        return this.copyright_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public ImageGroup getCovers() {
        ImageGroup imageGroup = this.covers_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public boolean getIsPremiumOnly() {
        return this.isPremiumOnly_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public gva getLinkBytes() {
        return gva.m45888f(this.link_);
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public gva getNameBytes() {
        return gva.m45888f(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public int getNumDiscs() {
        return this.numDiscs_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public int getNumTracks() {
        return this.numTracks_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public boolean getPlayability() {
        return this.playability_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public int getYear() {
        return this.year_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public boolean hasCovers() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public boolean hasIsPremiumOnly() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public boolean hasLink() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public boolean hasNumDiscs() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public boolean hasNumTracks() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public boolean hasPlayability() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public boolean hasYear() {
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

    public static Builder newBuilder(AlbumMetadata albumMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(albumMetadata);
    }

    public static AlbumMetadata parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (AlbumMetadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static AlbumMetadata parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (AlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static AlbumMetadata parseFrom(gva gvaVar) {
        return (AlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addArtists(int i, AlbumArtistMetadata albumArtistMetadata) {
        albumArtistMetadata.getClass();
        ensureArtistsIsMutable();
        this.artists_.add(i, albumArtistMetadata);
    }

    public static AlbumMetadata parseFrom(gva gvaVar, aux auxVar) {
        return (AlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static AlbumMetadata parseFrom(byte[] bArr) {
        return (AlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlbumMetadata parseFrom(byte[] bArr, aux auxVar) {
        return (AlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static AlbumMetadata parseFrom(InputStream inputStream) {
        return (AlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlbumMetadata parseFrom(InputStream inputStream, aux auxVar) {
        return (AlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static AlbumMetadata parseFrom(owe oweVar) {
        return (AlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static AlbumMetadata parseFrom(owe oweVar, aux auxVar) {
        return (AlbumMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
