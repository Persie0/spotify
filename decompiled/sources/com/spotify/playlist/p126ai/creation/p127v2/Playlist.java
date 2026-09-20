package com.spotify.playlist.p126ai.creation.p127v2;

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

/* JADX INFO: loaded from: classes9.dex */
public final class Playlist extends AbstractC0269h implements PlaylistOrBuilder {
    public static final int COVER_ART_LINK_FIELD_NUMBER = 4;
    private static final Playlist DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TRACKS_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    private String uri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String coverArtLink_ = "";
    private ae50 tracks_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.Playlist$1 */
    public static /* synthetic */ class C11891 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6444xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6444xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6444xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6444xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6444xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6444xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6444xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6444xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements PlaylistOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final Builder addAllTracks(Iterable<? extends Item> iterable) {
            copyOnWrite();
            ((Playlist) this.instance).addAllTracks(iterable);
            return this;
        }

        public final Builder addTracks(Item item) {
            copyOnWrite();
            ((Playlist) this.instance).addTracks(item);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public final /* bridge */ /* synthetic */ pre0 build() {
            return build();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public final /* bridge */ /* synthetic */ pre0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clear */
        public final /* bridge */ /* synthetic */ ore0 mo98325clear() {
            return mo98325clear();
        }

        public final Builder clearCoverArtLink() {
            copyOnWrite();
            ((Playlist) this.instance).clearCoverArtLink();
            return this;
        }

        public final Builder clearSubtitle() {
            copyOnWrite();
            ((Playlist) this.instance).clearSubtitle();
            return this;
        }

        public final Builder clearTitle() {
            copyOnWrite();
            ((Playlist) this.instance).clearTitle();
            return this;
        }

        public final Builder clearTracks() {
            copyOnWrite();
            ((Playlist) this.instance).clearTracks();
            return this;
        }

        public final Builder clearUri() {
            copyOnWrite();
            ((Playlist) this.instance).clearUri();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
        public final String getCoverArtLink() {
            return ((Playlist) this.instance).getCoverArtLink();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
        public final gva getCoverArtLinkBytes() {
            return ((Playlist) this.instance).getCoverArtLinkBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
        public final String getSubtitle() {
            return ((Playlist) this.instance).getSubtitle();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
        public final gva getSubtitleBytes() {
            return ((Playlist) this.instance).getSubtitleBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
        public final String getTitle() {
            return ((Playlist) this.instance).getTitle();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
        public final gva getTitleBytes() {
            return ((Playlist) this.instance).getTitleBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
        public final Item getTracks(int i) {
            return ((Playlist) this.instance).getTracks(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
        public final int getTracksCount() {
            return ((Playlist) this.instance).getTracksCount();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
        public final List<Item> getTracksList() {
            return Collections.unmodifiableList(((Playlist) this.instance).getTracksList());
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
        public final String getUri() {
            return ((Playlist) this.instance).getUri();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
        public final gva getUriBytes() {
            return ((Playlist) this.instance).getUriBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder removeTracks(int i) {
            copyOnWrite();
            ((Playlist) this.instance).removeTracks(i);
            return this;
        }

        public final Builder setCoverArtLink(String str) {
            copyOnWrite();
            ((Playlist) this.instance).setCoverArtLink(str);
            return this;
        }

        public final Builder setCoverArtLinkBytes(gva gvaVar) {
            copyOnWrite();
            ((Playlist) this.instance).setCoverArtLinkBytes(gvaVar);
            return this;
        }

        public final Builder setSubtitle(String str) {
            copyOnWrite();
            ((Playlist) this.instance).setSubtitle(str);
            return this;
        }

        public final Builder setSubtitleBytes(gva gvaVar) {
            copyOnWrite();
            ((Playlist) this.instance).setSubtitleBytes(gvaVar);
            return this;
        }

        public final Builder setTitle(String str) {
            copyOnWrite();
            ((Playlist) this.instance).setTitle(str);
            return this;
        }

        public final Builder setTitleBytes(gva gvaVar) {
            copyOnWrite();
            ((Playlist) this.instance).setTitleBytes(gvaVar);
            return this;
        }

        public final Builder setTracks(int i, Item item) {
            copyOnWrite();
            ((Playlist) this.instance).setTracks(i, item);
            return this;
        }

        public final Builder setUri(String str) {
            copyOnWrite();
            ((Playlist) this.instance).setUri(str);
            return this;
        }

        public final Builder setUriBytes(gva gvaVar) {
            copyOnWrite();
            ((Playlist) this.instance).setUriBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(Playlist.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        public final Builder addTracks(int i, Item item) {
            copyOnWrite();
            ((Playlist) this.instance).addTracks(i, item);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ ore0 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public final Builder setTracks(int i, Item.Builder builder) {
            copyOnWrite();
            ((Playlist) this.instance).setTracks(i, (Item) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public final Builder addTracks(Item.Builder builder) {
            copyOnWrite();
            ((Playlist) this.instance).addTracks((Item) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
            return super.mo98372mergeFrom(inputStream, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
            return super.mo98373mergeFrom(gvaVar);
        }

        public final Builder addTracks(int i, Item.Builder builder) {
            copyOnWrite();
            ((Playlist) this.instance).addTracks(i, (Item) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
            return super.mo98374mergeFrom(gvaVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
            return super.mo98375mergeFrom(oweVar);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public final /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
            return super.mergeFrom(pre0Var);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
            return super.mo98376mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
            return super.mo98377mergeFrom(bArr, auxVar);
        }
    }

    static {
        Playlist playlist = new Playlist();
        DEFAULT_INSTANCE = playlist;
        AbstractC0269h.registerDefaultInstance(Playlist.class, playlist);
    }

    private Playlist() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTracks(Iterable<? extends Item> iterable) {
        ensureTracksIsMutable();
        AbstractC2118m8.addAll(iterable, this.tracks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTracks(Item item) {
        item.getClass();
        ensureTracksIsMutable();
        this.tracks_.add(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverArtLink() {
        this.coverArtLink_ = DEFAULT_INSTANCE.coverArtLink_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = DEFAULT_INSTANCE.subtitle_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = DEFAULT_INSTANCE.title_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTracks() {
        this.tracks_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = DEFAULT_INSTANCE.uri_;
    }

    private void ensureTracksIsMutable() {
        ae50 ae50Var = this.tracks_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.tracks_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static Playlist getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Playlist parseDelimitedFrom(InputStream inputStream) {
        return (Playlist) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Playlist parseFrom(ByteBuffer byteBuffer) {
        return (Playlist) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTracks(int i) {
        ensureTracksIsMutable();
        this.tracks_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverArtLink(String str) {
        str.getClass();
        this.coverArtLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverArtLinkBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.coverArtLink_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(String str) {
        str.getClass();
        this.subtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.subtitle_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.title_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTracks(int i, Item item) {
        item.getClass();
        ensureTracksIsMutable();
        this.tracks_.set(i, item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.uri_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u001b", new Object[]{"uri_", "title_", "subtitle_", "coverArtLink_", "tracks_", Item.class});
        }
        if (iOrdinal == 3) {
            return new Playlist();
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
        synchronized (Playlist.class) {
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

    @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
    public final String getCoverArtLink() {
        return this.coverArtLink_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
    public final gva getCoverArtLinkBytes() {
        return gva.m45888f(this.coverArtLink_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
    public final String getSubtitle() {
        return this.subtitle_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
    public final gva getSubtitleBytes() {
        return gva.m45888f(this.subtitle_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
    public final String getTitle() {
        return this.title_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
    public final gva getTitleBytes() {
        return gva.m45888f(this.title_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
    public final Item getTracks(int i) {
        return (Item) this.tracks_.get(i);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
    public final int getTracksCount() {
        return this.tracks_.size();
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
    public final List<Item> getTracksList() {
        return this.tracks_;
    }

    public final ItemOrBuilder getTracksOrBuilder(int i) {
        return (ItemOrBuilder) this.tracks_.get(i);
    }

    public final List<? extends ItemOrBuilder> getTracksOrBuilderList() {
        return this.tracks_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
    public final String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.PlaylistOrBuilder
    public final gva getUriBytes() {
        return gva.m45888f(this.uri_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(Playlist playlist) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(playlist);
    }

    public static Playlist parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (Playlist) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Playlist parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (Playlist) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static Playlist parseFrom(gva gvaVar) {
        return (Playlist) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTracks(int i, Item item) {
        item.getClass();
        ensureTracksIsMutable();
        this.tracks_.add(i, item);
    }

    public static Playlist parseFrom(gva gvaVar, aux auxVar) {
        return (Playlist) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static Playlist parseFrom(byte[] bArr) {
        return (Playlist) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Playlist parseFrom(byte[] bArr, aux auxVar) {
        return (Playlist) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static Playlist parseFrom(InputStream inputStream) {
        return (Playlist) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Playlist parseFrom(InputStream inputStream, aux auxVar) {
        return (Playlist) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Playlist parseFrom(owe oweVar) {
        return (Playlist) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static Playlist parseFrom(owe oweVar, aux auxVar) {
        return (Playlist) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
