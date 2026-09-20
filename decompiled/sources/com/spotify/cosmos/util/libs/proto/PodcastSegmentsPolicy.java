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
public final class PodcastSegmentsPolicy extends AbstractC0269h implements PodcastSegmentsPolicyOrBuilder {
    public static final int ALBUM_MOSAIC_URI_FIELD_NUMBER = 4;
    public static final int ARTISTS_FIELD_NUMBER = 5;
    public static final int CAN_UPSELL_FIELD_NUMBER = 3;
    private static final PodcastSegmentsPolicy DEFAULT_INSTANCE;
    public static final int EMBEDDED_SEGMENTS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_SEGMENTS_FIELD_NUMBER = 1;
    private boolean albumMosaicUri_;
    private boolean artists_;
    private boolean canUpsell_;
    private boolean embeddedSegments_;
    private boolean playbackSegments_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicy$1 */
    public static /* synthetic */ class C06281 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3482xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3482xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3482xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3482xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3482xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3482xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3482xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3482xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements PodcastSegmentsPolicyOrBuilder {
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

        public Builder clearAlbumMosaicUri() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).clearAlbumMosaicUri();
            return this;
        }

        public Builder clearArtists() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).clearArtists();
            return this;
        }

        public Builder clearCanUpsell() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).clearCanUpsell();
            return this;
        }

        public Builder clearEmbeddedSegments() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).clearEmbeddedSegments();
            return this;
        }

        public Builder clearPlaybackSegments() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).clearPlaybackSegments();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getAlbumMosaicUri() {
            return ((PodcastSegmentsPolicy) this.instance).getAlbumMosaicUri();
        }

        @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getArtists() {
            return ((PodcastSegmentsPolicy) this.instance).getArtists();
        }

        @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getCanUpsell() {
            return ((PodcastSegmentsPolicy) this.instance).getCanUpsell();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getEmbeddedSegments() {
            return ((PodcastSegmentsPolicy) this.instance).getEmbeddedSegments();
        }

        @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getPlaybackSegments() {
            return ((PodcastSegmentsPolicy) this.instance).getPlaybackSegments();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setAlbumMosaicUri(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).setAlbumMosaicUri(z);
            return this;
        }

        public Builder setArtists(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).setArtists(z);
            return this;
        }

        public Builder setCanUpsell(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).setCanUpsell(z);
            return this;
        }

        public Builder setEmbeddedSegments(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).setEmbeddedSegments(z);
            return this;
        }

        public Builder setPlaybackSegments(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).setPlaybackSegments(z);
            return this;
        }

        private Builder() {
            super(PodcastSegmentsPolicy.DEFAULT_INSTANCE);
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
        PodcastSegmentsPolicy podcastSegmentsPolicy = new PodcastSegmentsPolicy();
        DEFAULT_INSTANCE = podcastSegmentsPolicy;
        AbstractC0269h.registerDefaultInstance(PodcastSegmentsPolicy.class, podcastSegmentsPolicy);
    }

    private PodcastSegmentsPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlbumMosaicUri() {
        this.albumMosaicUri_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArtists() {
        this.artists_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanUpsell() {
        this.canUpsell_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmbeddedSegments() {
        this.embeddedSegments_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaybackSegments() {
        this.playbackSegments_ = false;
    }

    public static PodcastSegmentsPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PodcastSegmentsPolicy parseDelimitedFrom(InputStream inputStream) {
        return (PodcastSegmentsPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PodcastSegmentsPolicy parseFrom(ByteBuffer byteBuffer) {
        return (PodcastSegmentsPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlbumMosaicUri(boolean z) {
        this.albumMosaicUri_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArtists(boolean z) {
        this.artists_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanUpsell(boolean z) {
        this.canUpsell_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmbeddedSegments(boolean z) {
        this.embeddedSegments_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSegments(boolean z) {
        this.playbackSegments_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"playbackSegments_", "embeddedSegments_", "canUpsell_", "albumMosaicUri_", "artists_"});
        }
        if (iOrdinal == 3) {
            return new PodcastSegmentsPolicy();
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
        synchronized (PodcastSegmentsPolicy.class) {
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

    @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getAlbumMosaicUri() {
        return this.albumMosaicUri_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getArtists() {
        return this.artists_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getCanUpsell() {
        return this.canUpsell_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getEmbeddedSegments() {
        return this.embeddedSegments_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getPlaybackSegments() {
        return this.playbackSegments_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(PodcastSegmentsPolicy podcastSegmentsPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(podcastSegmentsPolicy);
    }

    public static PodcastSegmentsPolicy parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (PodcastSegmentsPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static PodcastSegmentsPolicy parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (PodcastSegmentsPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static PodcastSegmentsPolicy parseFrom(gva gvaVar) {
        return (PodcastSegmentsPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static PodcastSegmentsPolicy parseFrom(gva gvaVar, aux auxVar) {
        return (PodcastSegmentsPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static PodcastSegmentsPolicy parseFrom(byte[] bArr) {
        return (PodcastSegmentsPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PodcastSegmentsPolicy parseFrom(byte[] bArr, aux auxVar) {
        return (PodcastSegmentsPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static PodcastSegmentsPolicy parseFrom(InputStream inputStream) {
        return (PodcastSegmentsPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PodcastSegmentsPolicy parseFrom(InputStream inputStream, aux auxVar) {
        return (PodcastSegmentsPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static PodcastSegmentsPolicy parseFrom(owe oweVar) {
        return (PodcastSegmentsPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static PodcastSegmentsPolicy parseFrom(owe oweVar, aux auxVar) {
        return (PodcastSegmentsPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
