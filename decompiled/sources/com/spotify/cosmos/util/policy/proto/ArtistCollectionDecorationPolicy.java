package com.spotify.cosmos.util.policy.proto;

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
public final class ArtistCollectionDecorationPolicy extends AbstractC0269h implements ArtistCollectionDecorationPolicyOrBuilder {
    public static final int CAN_BAN_FIELD_NUMBER = 6;
    public static final int COLLECTION_LINK_FIELD_NUMBER = 1;
    private static final ArtistCollectionDecorationPolicy DEFAULT_INSTANCE;
    public static final int IS_BANNED_FIELD_NUMBER = 5;
    public static final int IS_FOLLOWED_FIELD_NUMBER = 2;
    public static final int NUM_ALBUMS_IN_COLLECTION_FIELD_NUMBER = 4;
    public static final int NUM_EXPLICITLY_LIKED_TRACKS_FIELD_NUMBER = 8;
    public static final int NUM_TRACKS_IN_COLLECTION_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private boolean canBan_;
    private boolean collectionLink_;
    private boolean isBanned_;
    private boolean isFollowed_;
    private boolean numAlbumsInCollection_;
    private boolean numExplicitlyLikedTracks_;
    private boolean numTracksInCollection_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy$1 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C06371 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3491xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3491xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3491xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3491xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3491xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3491xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3491xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3491xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder extends AbstractC0268g implements ArtistCollectionDecorationPolicyOrBuilder {
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
            ((ArtistCollectionDecorationPolicy) this.instance).clearCanBan();
            return this;
        }

        public Builder clearCollectionLink() {
            copyOnWrite();
            ((ArtistCollectionDecorationPolicy) this.instance).clearCollectionLink();
            return this;
        }

        public Builder clearIsBanned() {
            copyOnWrite();
            ((ArtistCollectionDecorationPolicy) this.instance).clearIsBanned();
            return this;
        }

        public Builder clearIsFollowed() {
            copyOnWrite();
            ((ArtistCollectionDecorationPolicy) this.instance).clearIsFollowed();
            return this;
        }

        public Builder clearNumAlbumsInCollection() {
            copyOnWrite();
            ((ArtistCollectionDecorationPolicy) this.instance).clearNumAlbumsInCollection();
            return this;
        }

        public Builder clearNumExplicitlyLikedTracks() {
            copyOnWrite();
            ((ArtistCollectionDecorationPolicy) this.instance).clearNumExplicitlyLikedTracks();
            return this;
        }

        public Builder clearNumTracksInCollection() {
            copyOnWrite();
            ((ArtistCollectionDecorationPolicy) this.instance).clearNumTracksInCollection();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
        public boolean getCanBan() {
            return ((ArtistCollectionDecorationPolicy) this.instance).getCanBan();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
        public boolean getCollectionLink() {
            return ((ArtistCollectionDecorationPolicy) this.instance).getCollectionLink();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
        public boolean getIsBanned() {
            return ((ArtistCollectionDecorationPolicy) this.instance).getIsBanned();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
        public boolean getIsFollowed() {
            return ((ArtistCollectionDecorationPolicy) this.instance).getIsFollowed();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
        public boolean getNumAlbumsInCollection() {
            return ((ArtistCollectionDecorationPolicy) this.instance).getNumAlbumsInCollection();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
        public boolean getNumExplicitlyLikedTracks() {
            return ((ArtistCollectionDecorationPolicy) this.instance).getNumExplicitlyLikedTracks();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
        public boolean getNumTracksInCollection() {
            return ((ArtistCollectionDecorationPolicy) this.instance).getNumTracksInCollection();
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
            ((ArtistCollectionDecorationPolicy) this.instance).setCanBan(z);
            return this;
        }

        public Builder setCollectionLink(boolean z) {
            copyOnWrite();
            ((ArtistCollectionDecorationPolicy) this.instance).setCollectionLink(z);
            return this;
        }

        public Builder setIsBanned(boolean z) {
            copyOnWrite();
            ((ArtistCollectionDecorationPolicy) this.instance).setIsBanned(z);
            return this;
        }

        public Builder setIsFollowed(boolean z) {
            copyOnWrite();
            ((ArtistCollectionDecorationPolicy) this.instance).setIsFollowed(z);
            return this;
        }

        public Builder setNumAlbumsInCollection(boolean z) {
            copyOnWrite();
            ((ArtistCollectionDecorationPolicy) this.instance).setNumAlbumsInCollection(z);
            return this;
        }

        public Builder setNumExplicitlyLikedTracks(boolean z) {
            copyOnWrite();
            ((ArtistCollectionDecorationPolicy) this.instance).setNumExplicitlyLikedTracks(z);
            return this;
        }

        public Builder setNumTracksInCollection(boolean z) {
            copyOnWrite();
            ((ArtistCollectionDecorationPolicy) this.instance).setNumTracksInCollection(z);
            return this;
        }

        private Builder() {
            super(ArtistCollectionDecorationPolicy.DEFAULT_INSTANCE);
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
        ArtistCollectionDecorationPolicy artistCollectionDecorationPolicy = new ArtistCollectionDecorationPolicy();
        DEFAULT_INSTANCE = artistCollectionDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(ArtistCollectionDecorationPolicy.class, artistCollectionDecorationPolicy);
    }

    private ArtistCollectionDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanBan() {
        this.canBan_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectionLink() {
        this.collectionLink_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBanned() {
        this.isBanned_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFollowed() {
        this.isFollowed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumAlbumsInCollection() {
        this.numAlbumsInCollection_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumExplicitlyLikedTracks() {
        this.numExplicitlyLikedTracks_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumTracksInCollection() {
        this.numTracksInCollection_ = false;
    }

    public static ArtistCollectionDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ArtistCollectionDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (ArtistCollectionDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (ArtistCollectionDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanBan(boolean z) {
        this.canBan_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionLink(boolean z) {
        this.collectionLink_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBanned(boolean z) {
        this.isBanned_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFollowed(boolean z) {
        this.isFollowed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumAlbumsInCollection(boolean z) {
        this.numAlbumsInCollection_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumExplicitlyLikedTracks(boolean z) {
        this.numExplicitlyLikedTracks_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumTracksInCollection(boolean z) {
        this.numTracksInCollection_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\b\u0007", new Object[]{"collectionLink_", "isFollowed_", "numTracksInCollection_", "numAlbumsInCollection_", "isBanned_", "canBan_", "numExplicitlyLikedTracks_"});
        }
        if (iOrdinal == 3) {
            return new ArtistCollectionDecorationPolicy();
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
        synchronized (ArtistCollectionDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
    public boolean getCanBan() {
        return this.canBan_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
    public boolean getCollectionLink() {
        return this.collectionLink_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
    public boolean getIsBanned() {
        return this.isBanned_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
    public boolean getIsFollowed() {
        return this.isFollowed_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
    public boolean getNumAlbumsInCollection() {
        return this.numAlbumsInCollection_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
    public boolean getNumExplicitlyLikedTracks() {
        return this.numExplicitlyLikedTracks_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
    public boolean getNumTracksInCollection() {
        return this.numTracksInCollection_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ArtistCollectionDecorationPolicy artistCollectionDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(artistCollectionDecorationPolicy);
    }

    public static ArtistCollectionDecorationPolicy parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ArtistCollectionDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ArtistCollectionDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(gva gvaVar) {
        return (ArtistCollectionDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(gva gvaVar, aux auxVar) {
        return (ArtistCollectionDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(byte[] bArr) {
        return (ArtistCollectionDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(byte[] bArr, aux auxVar) {
        return (ArtistCollectionDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(InputStream inputStream) {
        return (ArtistCollectionDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(InputStream inputStream, aux auxVar) {
        return (ArtistCollectionDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(owe oweVar) {
        return (ArtistCollectionDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(owe oweVar, aux auxVar) {
        return (ArtistCollectionDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
