package com.spotify.cosmos.util.libs.proto;

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
public final class TrackDecorationPolicy extends AbstractC0269h implements TrackDecorationPolicyOrBuilder {
    private static final TrackDecorationPolicy DEFAULT_INSTANCE;
    public static final int DISC_NUMBER_FIELD_NUMBER = 9;
    public static final int HAS_LYRICS_FIELD_NUMBER = 1;
    public static final int IS_19_PLUS_ONLY_FIELD_NUMBER = 17;
    public static final int IS_AVAILABLE_IN_METADATA_CATALOGUE_FIELD_NUMBER = 6;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 11;
    public static final int IS_LOCAL_FIELD_NUMBER = 13;
    public static final int IS_PREMIUM_ONLY_FIELD_NUMBER = 14;
    public static final int LENGTH_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 2;
    public static final int LOCALLY_PLAYABLE_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYABLE_FIELD_NUMBER = 5;
    public static final int PLAYABLE_LOCAL_TRACK_FIELD_NUMBER = 8;
    public static final int PLAYABLE_TRACK_LINK_FIELD_NUMBER = 15;
    public static final int POPULARITY_FIELD_NUMBER = 16;
    public static final int PREVIEW_ID_FIELD_NUMBER = 12;
    public static final int TO_BE_OBFUSCATED_FIELD_NUMBER = 22;
    public static final int TRACK_DESCRIPTORS_FIELD_NUMBER = 18;
    public static final int TRACK_NUMBER_FIELD_NUMBER = 10;
    private boolean discNumber_;
    private boolean hasLyrics_;
    private boolean is19PlusOnly_;
    private boolean isAvailableInMetadataCatalogue_;
    private boolean isExplicit_;
    private boolean isLocal_;
    private boolean isPremiumOnly_;
    private boolean length_;
    private boolean link_;
    private boolean locallyPlayable_;
    private boolean name_;
    private boolean playableLocalTrack_;
    private boolean playableTrackLink_;
    private boolean playable_;
    private boolean popularity_;
    private boolean previewId_;
    private boolean toBeObfuscated_;
    private boolean trackDescriptors_;
    private boolean trackNumber_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.libs.proto.TrackDecorationPolicy$1 */
    public static /* synthetic */ class C06331 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3487xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3487xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3487xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3487xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3487xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3487xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3487xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3487xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements TrackDecorationPolicyOrBuilder {
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

        public Builder clearDiscNumber() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearDiscNumber();
            return this;
        }

        public Builder clearHasLyrics() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearHasLyrics();
            return this;
        }

        public Builder clearIs19PlusOnly() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIs19PlusOnly();
            return this;
        }

        public Builder clearIsAvailableInMetadataCatalogue() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIsAvailableInMetadataCatalogue();
            return this;
        }

        public Builder clearIsExplicit() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIsExplicit();
            return this;
        }

        public Builder clearIsLocal() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIsLocal();
            return this;
        }

        public Builder clearIsPremiumOnly() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIsPremiumOnly();
            return this;
        }

        public Builder clearLength() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearLength();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearLink();
            return this;
        }

        public Builder clearLocallyPlayable() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearLocallyPlayable();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearName();
            return this;
        }

        public Builder clearPlayable() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPlayable();
            return this;
        }

        public Builder clearPlayableLocalTrack() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPlayableLocalTrack();
            return this;
        }

        public Builder clearPlayableTrackLink() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPlayableTrackLink();
            return this;
        }

        public Builder clearPopularity() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPopularity();
            return this;
        }

        public Builder clearPreviewId() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPreviewId();
            return this;
        }

        public Builder clearToBeObfuscated() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearToBeObfuscated();
            return this;
        }

        public Builder clearTrackDescriptors() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearTrackDescriptors();
            return this;
        }

        public Builder clearTrackNumber() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearTrackNumber();
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

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getDiscNumber() {
            return ((TrackDecorationPolicy) this.instance).getDiscNumber();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getHasLyrics() {
            return ((TrackDecorationPolicy) this.instance).getHasLyrics();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getIs19PlusOnly() {
            return ((TrackDecorationPolicy) this.instance).getIs19PlusOnly();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsAvailableInMetadataCatalogue() {
            return ((TrackDecorationPolicy) this.instance).getIsAvailableInMetadataCatalogue();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsExplicit() {
            return ((TrackDecorationPolicy) this.instance).getIsExplicit();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsLocal() {
            return ((TrackDecorationPolicy) this.instance).getIsLocal();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsPremiumOnly() {
            return ((TrackDecorationPolicy) this.instance).getIsPremiumOnly();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getLength() {
            return ((TrackDecorationPolicy) this.instance).getLength();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((TrackDecorationPolicy) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getLocallyPlayable() {
            return ((TrackDecorationPolicy) this.instance).getLocallyPlayable();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getName() {
            return ((TrackDecorationPolicy) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getPlayable() {
            return ((TrackDecorationPolicy) this.instance).getPlayable();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getPlayableLocalTrack() {
            return ((TrackDecorationPolicy) this.instance).getPlayableLocalTrack();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getPlayableTrackLink() {
            return ((TrackDecorationPolicy) this.instance).getPlayableTrackLink();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getPopularity() {
            return ((TrackDecorationPolicy) this.instance).getPopularity();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getPreviewId() {
            return ((TrackDecorationPolicy) this.instance).getPreviewId();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getToBeObfuscated() {
            return ((TrackDecorationPolicy) this.instance).getToBeObfuscated();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getTrackDescriptors() {
            return ((TrackDecorationPolicy) this.instance).getTrackDescriptors();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getTrackNumber() {
            return ((TrackDecorationPolicy) this.instance).getTrackNumber();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setDiscNumber(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setDiscNumber(z);
            return this;
        }

        public Builder setHasLyrics(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setHasLyrics(z);
            return this;
        }

        public Builder setIs19PlusOnly(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIs19PlusOnly(z);
            return this;
        }

        public Builder setIsAvailableInMetadataCatalogue(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIsAvailableInMetadataCatalogue(z);
            return this;
        }

        public Builder setIsExplicit(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIsExplicit(z);
            return this;
        }

        public Builder setIsLocal(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIsLocal(z);
            return this;
        }

        public Builder setIsPremiumOnly(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIsPremiumOnly(z);
            return this;
        }

        public Builder setLength(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setLength(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setLink(z);
            return this;
        }

        public Builder setLocallyPlayable(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setLocallyPlayable(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setName(z);
            return this;
        }

        public Builder setPlayable(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPlayable(z);
            return this;
        }

        public Builder setPlayableLocalTrack(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPlayableLocalTrack(z);
            return this;
        }

        public Builder setPlayableTrackLink(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPlayableTrackLink(z);
            return this;
        }

        public Builder setPopularity(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPopularity(z);
            return this;
        }

        public Builder setPreviewId(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPreviewId(z);
            return this;
        }

        public Builder setToBeObfuscated(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setToBeObfuscated(z);
            return this;
        }

        public Builder setTrackDescriptors(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setTrackDescriptors(z);
            return this;
        }

        public Builder setTrackNumber(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setTrackNumber(z);
            return this;
        }

        private Builder() {
            super(TrackDecorationPolicy.DEFAULT_INSTANCE);
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
        TrackDecorationPolicy trackDecorationPolicy = new TrackDecorationPolicy();
        DEFAULT_INSTANCE = trackDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(TrackDecorationPolicy.class, trackDecorationPolicy);
    }

    private TrackDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDiscNumber() {
        this.discNumber_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasLyrics() {
        this.hasLyrics_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIs19PlusOnly() {
        this.is19PlusOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAvailableInMetadataCatalogue() {
        this.isAvailableInMetadataCatalogue_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExplicit() {
        this.isExplicit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLocal() {
        this.isLocal_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPremiumOnly() {
        this.isPremiumOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLength() {
        this.length_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocallyPlayable() {
        this.locallyPlayable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayable() {
        this.playable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayableLocalTrack() {
        this.playableLocalTrack_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayableTrackLink() {
        this.playableTrackLink_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularity() {
        this.popularity_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewId() {
        this.previewId_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToBeObfuscated() {
        this.toBeObfuscated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackDescriptors() {
        this.trackDescriptors_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackNumber() {
        this.trackNumber_ = false;
    }

    public static TrackDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (TrackDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (TrackDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDiscNumber(boolean z) {
        this.discNumber_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasLyrics(boolean z) {
        this.hasLyrics_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIs19PlusOnly(boolean z) {
        this.is19PlusOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAvailableInMetadataCatalogue(boolean z) {
        this.isAvailableInMetadataCatalogue_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExplicit(boolean z) {
        this.isExplicit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLocal(boolean z) {
        this.isLocal_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPremiumOnly(boolean z) {
        this.isPremiumOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLength(boolean z) {
        this.length_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(boolean z) {
        this.link_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocallyPlayable(boolean z) {
        this.locallyPlayable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(boolean z) {
        this.name_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayable(boolean z) {
        this.playable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayableLocalTrack(boolean z) {
        this.playableLocalTrack_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayableTrackLink(boolean z) {
        this.playableTrackLink_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopularity(boolean z) {
        this.popularity_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewId(boolean z) {
        this.previewId_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToBeObfuscated(boolean z) {
        this.toBeObfuscated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackDescriptors(boolean z) {
        this.trackDescriptors_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackNumber(boolean z) {
        this.trackNumber_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0000\u0001\u0016\u0013\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0007\u0016\u0007", new Object[]{"hasLyrics_", "link_", "name_", "length_", "playable_", "isAvailableInMetadataCatalogue_", "locallyPlayable_", "playableLocalTrack_", "discNumber_", "trackNumber_", "isExplicit_", "previewId_", "isLocal_", "isPremiumOnly_", "playableTrackLink_", "popularity_", "is19PlusOnly_", "trackDescriptors_", "toBeObfuscated_"});
        }
        if (iOrdinal == 3) {
            return new TrackDecorationPolicy();
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
        synchronized (TrackDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getDiscNumber() {
        return this.discNumber_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getHasLyrics() {
        return this.hasLyrics_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getIs19PlusOnly() {
        return this.is19PlusOnly_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsAvailableInMetadataCatalogue() {
        return this.isAvailableInMetadataCatalogue_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsLocal() {
        return this.isLocal_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsPremiumOnly() {
        return this.isPremiumOnly_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getLength() {
        return this.length_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getLocallyPlayable() {
        return this.locallyPlayable_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getPlayable() {
        return this.playable_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getPlayableLocalTrack() {
        return this.playableLocalTrack_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getPlayableTrackLink() {
        return this.playableTrackLink_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getPopularity() {
        return this.popularity_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getPreviewId() {
        return this.previewId_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getToBeObfuscated() {
        return this.toBeObfuscated_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getTrackDescriptors() {
        return this.trackDescriptors_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getTrackNumber() {
        return this.trackNumber_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(TrackDecorationPolicy trackDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(trackDecorationPolicy);
    }

    public static TrackDecorationPolicy parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (TrackDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static TrackDecorationPolicy parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (TrackDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static TrackDecorationPolicy parseFrom(gva gvaVar) {
        return (TrackDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static TrackDecorationPolicy parseFrom(gva gvaVar, aux auxVar) {
        return (TrackDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static TrackDecorationPolicy parseFrom(byte[] bArr) {
        return (TrackDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackDecorationPolicy parseFrom(byte[] bArr, aux auxVar) {
        return (TrackDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static TrackDecorationPolicy parseFrom(InputStream inputStream) {
        return (TrackDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackDecorationPolicy parseFrom(InputStream inputStream, aux auxVar) {
        return (TrackDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static TrackDecorationPolicy parseFrom(owe oweVar) {
        return (TrackDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static TrackDecorationPolicy parseFrom(owe oweVar, aux auxVar) {
        return (TrackDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
