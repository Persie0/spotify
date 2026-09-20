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
public final class ArtistCollectionState extends AbstractC0269h implements ArtistCollectionStateOrBuilder {
    public static final int CAN_BAN_FIELD_NUMBER = 6;
    public static final int COLLECTION_LINK_FIELD_NUMBER = 1;
    private static final ArtistCollectionState DEFAULT_INSTANCE;
    public static final int FOLLOWED_FIELD_NUMBER = 2;
    public static final int IS_BANNED_FIELD_NUMBER = 5;
    public static final int NUM_ALBUMS_IN_COLLECTION_FIELD_NUMBER = 4;
    public static final int NUM_EXPLICITLY_LIKED_TRACKS_FIELD_NUMBER = 7;
    public static final int NUM_TRACKS_IN_COLLECTION_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private boolean canBan_;
    private String collectionLink_ = "";
    private boolean followed_;
    private boolean isBanned_;
    private int numAlbumsInCollection_;
    private int numExplicitlyLikedTracks_;
    private int numTracksInCollection_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.ArtistCollectionState$1 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C06591 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3510xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3510xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3510xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3510xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3510xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3510xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3510xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3510xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder extends AbstractC0268g implements ArtistCollectionStateOrBuilder {
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

        public Builder clearCanBan() {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).clearCanBan();
            return this;
        }

        public Builder clearCollectionLink() {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).clearCollectionLink();
            return this;
        }

        public Builder clearFollowed() {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).clearFollowed();
            return this;
        }

        public Builder clearIsBanned() {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).clearIsBanned();
            return this;
        }

        public Builder clearNumAlbumsInCollection() {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).clearNumAlbumsInCollection();
            return this;
        }

        public Builder clearNumExplicitlyLikedTracks() {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).clearNumExplicitlyLikedTracks();
            return this;
        }

        public Builder clearNumTracksInCollection() {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).clearNumTracksInCollection();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public boolean getCanBan() {
            return ((ArtistCollectionState) this.instance).getCanBan();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public String getCollectionLink() {
            return ((ArtistCollectionState) this.instance).getCollectionLink();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public gva getCollectionLinkBytes() {
            return ((ArtistCollectionState) this.instance).getCollectionLinkBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public boolean getFollowed() {
            return ((ArtistCollectionState) this.instance).getFollowed();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public boolean getIsBanned() {
            return ((ArtistCollectionState) this.instance).getIsBanned();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public int getNumAlbumsInCollection() {
            return ((ArtistCollectionState) this.instance).getNumAlbumsInCollection();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public int getNumExplicitlyLikedTracks() {
            return ((ArtistCollectionState) this.instance).getNumExplicitlyLikedTracks();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public int getNumTracksInCollection() {
            return ((ArtistCollectionState) this.instance).getNumTracksInCollection();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public boolean hasCanBan() {
            return ((ArtistCollectionState) this.instance).hasCanBan();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public boolean hasCollectionLink() {
            return ((ArtistCollectionState) this.instance).hasCollectionLink();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public boolean hasFollowed() {
            return ((ArtistCollectionState) this.instance).hasFollowed();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public boolean hasIsBanned() {
            return ((ArtistCollectionState) this.instance).hasIsBanned();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public boolean hasNumAlbumsInCollection() {
            return ((ArtistCollectionState) this.instance).hasNumAlbumsInCollection();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public boolean hasNumExplicitlyLikedTracks() {
            return ((ArtistCollectionState) this.instance).hasNumExplicitlyLikedTracks();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
        public boolean hasNumTracksInCollection() {
            return ((ArtistCollectionState) this.instance).hasNumTracksInCollection();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setCanBan(boolean z) {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).setCanBan(z);
            return this;
        }

        public Builder setCollectionLink(String str) {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).setCollectionLink(str);
            return this;
        }

        public Builder setCollectionLinkBytes(gva gvaVar) {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).setCollectionLinkBytes(gvaVar);
            return this;
        }

        public Builder setFollowed(boolean z) {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).setFollowed(z);
            return this;
        }

        public Builder setIsBanned(boolean z) {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).setIsBanned(z);
            return this;
        }

        public Builder setNumAlbumsInCollection(int i) {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).setNumAlbumsInCollection(i);
            return this;
        }

        public Builder setNumExplicitlyLikedTracks(int i) {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).setNumExplicitlyLikedTracks(i);
            return this;
        }

        public Builder setNumTracksInCollection(int i) {
            copyOnWrite();
            ((ArtistCollectionState) this.instance).setNumTracksInCollection(i);
            return this;
        }

        private Builder() {
            super(ArtistCollectionState.DEFAULT_INSTANCE);
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
        ArtistCollectionState artistCollectionState = new ArtistCollectionState();
        DEFAULT_INSTANCE = artistCollectionState;
        AbstractC0269h.registerDefaultInstance(ArtistCollectionState.class, artistCollectionState);
    }

    private ArtistCollectionState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanBan() {
        this.bitField0_ &= -33;
        this.canBan_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectionLink() {
        this.bitField0_ &= -2;
        this.collectionLink_ = getDefaultInstance().getCollectionLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowed() {
        this.bitField0_ &= -3;
        this.followed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBanned() {
        this.bitField0_ &= -17;
        this.isBanned_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumAlbumsInCollection() {
        this.bitField0_ &= -9;
        this.numAlbumsInCollection_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumExplicitlyLikedTracks() {
        this.bitField0_ &= -65;
        this.numExplicitlyLikedTracks_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumTracksInCollection() {
        this.bitField0_ &= -5;
        this.numTracksInCollection_ = 0;
    }

    public static ArtistCollectionState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ArtistCollectionState parseDelimitedFrom(InputStream inputStream) {
        return (ArtistCollectionState) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistCollectionState parseFrom(ByteBuffer byteBuffer) {
        return (ArtistCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanBan(boolean z) {
        this.bitField0_ |= 32;
        this.canBan_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionLink(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.collectionLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionLinkBytes(gva gvaVar) {
        this.collectionLink_ = gvaVar.m45892u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowed(boolean z) {
        this.bitField0_ |= 2;
        this.followed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBanned(boolean z) {
        this.bitField0_ |= 16;
        this.isBanned_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumAlbumsInCollection(int i) {
        this.bitField0_ |= 8;
        this.numAlbumsInCollection_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumExplicitlyLikedTracks(int i) {
        this.bitField0_ |= 64;
        this.numExplicitlyLikedTracks_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumTracksInCollection(int i) {
        this.bitField0_ |= 4;
        this.numTracksInCollection_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဋ\u0006", new Object[]{"bitField0_", "collectionLink_", "followed_", "numTracksInCollection_", "numAlbumsInCollection_", "isBanned_", "canBan_", "numExplicitlyLikedTracks_"});
        }
        if (iOrdinal == 3) {
            return new ArtistCollectionState();
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
        synchronized (ArtistCollectionState.class) {
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

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean getCanBan() {
        return this.canBan_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public String getCollectionLink() {
        return this.collectionLink_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public gva getCollectionLinkBytes() {
        return gva.m45888f(this.collectionLink_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean getFollowed() {
        return this.followed_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean getIsBanned() {
        return this.isBanned_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public int getNumAlbumsInCollection() {
        return this.numAlbumsInCollection_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public int getNumExplicitlyLikedTracks() {
        return this.numExplicitlyLikedTracks_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public int getNumTracksInCollection() {
        return this.numTracksInCollection_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean hasCanBan() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean hasCollectionLink() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean hasFollowed() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean hasIsBanned() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean hasNumAlbumsInCollection() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean hasNumExplicitlyLikedTracks() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean hasNumTracksInCollection() {
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

    public static Builder newBuilder(ArtistCollectionState artistCollectionState) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(artistCollectionState);
    }

    public static ArtistCollectionState parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ArtistCollectionState) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ArtistCollectionState parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ArtistCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ArtistCollectionState parseFrom(gva gvaVar) {
        return (ArtistCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ArtistCollectionState parseFrom(gva gvaVar, aux auxVar) {
        return (ArtistCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ArtistCollectionState parseFrom(byte[] bArr) {
        return (ArtistCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArtistCollectionState parseFrom(byte[] bArr, aux auxVar) {
        return (ArtistCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ArtistCollectionState parseFrom(InputStream inputStream) {
        return (ArtistCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistCollectionState parseFrom(InputStream inputStream, aux auxVar) {
        return (ArtistCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ArtistCollectionState parseFrom(owe oweVar) {
        return (ArtistCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ArtistCollectionState parseFrom(owe oweVar, aux auxVar) {
        return (ArtistCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
