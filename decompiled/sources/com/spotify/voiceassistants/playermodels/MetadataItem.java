package com.spotify.voiceassistants.playermodels;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.edo;
import p204p.fr70;
import p204p.hrh;
import p204p.jqv0;
import p204p.ktz0;
import p204p.l8a;
import p204p.lau;
import p204p.pk60;
import p204p.q3d0;
import p204p.ql51;
import p204p.qoy0;
import p204p.qpv0;
import p204p.rr60;
import p204p.rtz0;
import p204p.s571;
import p204p.up60;
import p204p.utz0;
import p204p.wj50;

/* JADX INFO: loaded from: classes11.dex */
@rtz0
@pk60(discriminator = "entity_type")
@Metadata(m24211d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00152\u00020\u0001:\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0005\u0082\u0001\u0007\u0016\u0017\u0018\u0019\u001a\u001b\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem;", "", "uri", "", "getUri", "()Ljava/lang/String;", "artwork", "", "Lcom/spotify/voiceassistants/playermodels/Image;", "getArtwork", "()Ljava/util/List;", "displayName", "getDisplayName", "getSubtitle", "Album", "Artist", "Episode", "Playlist", "Show", "Track", "Error", "Companion", "Lcom/spotify/voiceassistants/playermodels/MetadataItem$Album;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem$Artist;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem$Episode;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem$Error;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem$Playlist;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem$Show;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem$Track;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface MetadataItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m24211d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001aR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001aR\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001a¨\u00067"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Album;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem;", "", "uri", "", "Lcom/spotify/voiceassistants/playermodels/Image;", "artwork", "albumName", "artistName", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels", "(Lcom/spotify/voiceassistants/playermodels/MetadataItem$Album;Lp/hrh;Lp/ktz0;)V", "write$Self", "getSubtitle", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/List;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/voiceassistants/playermodels/MetadataItem$Album;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "Ljava/util/List;", "getArtwork", "getAlbumName", "getAlbumName$annotations", "()V", "getArtistName", "getArtistName$annotations", "getDisplayName", "displayName", "Companion", "$serializer", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class Album implements MetadataItem {
        private final String albumName;
        private final String artistName;
        private final List<Image> artwork;
        private final String uri;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final fr70[] $childSerializers = {null, q3d0.m72078I(2, MetadataItem$Album$Companion$$childSerializers$1.INSTANCE), null, null};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Album$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem$Album;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return MetadataItem$Album$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Album(int i, String str, List list, String str2, String str3, utz0 utz0Var) {
            if (15 != (i & 15)) {
                edo.m38617p(i, 15, MetadataItem$Album$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.uri = str;
            this.artwork = list;
            this.albumName = str2;
            this.artistName = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Album copy$default(Album album, String str, List list, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = album.uri;
            }
            if ((i & 2) != 0) {
                list = album.artwork;
            }
            if ((i & 4) != 0) {
                str2 = album.albumName;
            }
            if ((i & 8) != 0) {
                str3 = album.artistName;
            }
            return album.copy(str, list, str2, str3);
        }

        public static /* synthetic */ void getAlbumName$annotations() {
        }

        public static /* synthetic */ void getArtistName$annotations() {
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels */
        public static final /* synthetic */ void m22343xf1ee467f(Album self, hrh output, ktz0 serialDesc) {
            fr70[] fr70VarArr = $childSerializers;
            output.mo44931G(serialDesc, 0, self.getUri());
            output.mo44941k(serialDesc, 1, (rr60) fr70VarArr[1].getValue(), self.getArtwork());
            output.mo44931G(serialDesc, 2, self.albumName);
            output.mo44931G(serialDesc, 3, self.artistName);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final List<Image> component2() {
            return this.artwork;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAlbumName() {
            return this.albumName;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getArtistName() {
            return this.artistName;
        }

        public final Album copy(String uri, List<Image> artwork, String albumName, String artistName) {
            return new Album(uri, artwork, albumName, artistName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Album)) {
                return false;
            }
            Album album = (Album) other;
            return wj50.m88271j(this.uri, album.uri) && wj50.m88271j(this.artwork, album.artwork) && wj50.m88271j(this.albumName, album.albumName) && wj50.m88271j(this.artistName, album.artistName);
        }

        public final String getAlbumName() {
            return this.albumName;
        }

        public final String getArtistName() {
            return this.artistName;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public List<Image> getArtwork() {
            return this.artwork;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getDisplayName() {
            return this.albumName;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getSubtitle() {
            return this.artistName;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.artistName.hashCode() + s571.m77243b(s571.m77244c(this.uri.hashCode() * 31, 31, this.artwork), 31, this.albumName);
        }

        public String toString() {
            return super.toString();
        }

        public Album(String str, List<Image> list, String str2, String str3) {
            this.uri = str;
            this.artwork = list;
            this.albumName = str2;
            this.artistName = str3;
        }
    }

    @Metadata(m24211d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0019R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0019¨\u00062"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Artist;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem;", "", "uri", "", "Lcom/spotify/voiceassistants/playermodels/Image;", "artwork", "artistName", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels", "(Lcom/spotify/voiceassistants/playermodels/MetadataItem$Artist;Lp/hrh;Lp/ktz0;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/spotify/voiceassistants/playermodels/MetadataItem$Artist;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "Ljava/util/List;", "getArtwork", "getArtistName", "getArtistName$annotations", "()V", "getDisplayName", "displayName", "Companion", "$serializer", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class Artist implements MetadataItem {
        private final String artistName;
        private final List<Image> artwork;
        private final String uri;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final fr70[] $childSerializers = {null, q3d0.m72078I(2, MetadataItem$Artist$Companion$$childSerializers$1.INSTANCE), null};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Artist$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem$Artist;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return MetadataItem$Artist$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Artist(int i, String str, List list, String str2, utz0 utz0Var) {
            if (7 != (i & 7)) {
                edo.m38617p(i, 7, MetadataItem$Artist$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.uri = str;
            this.artwork = list;
            this.artistName = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Artist copy$default(Artist artist, String str, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = artist.uri;
            }
            if ((i & 2) != 0) {
                list = artist.artwork;
            }
            if ((i & 4) != 0) {
                str2 = artist.artistName;
            }
            return artist.copy(str, list, str2);
        }

        public static /* synthetic */ void getArtistName$annotations() {
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels */
        public static final /* synthetic */ void m22344xf1ee467f(Artist self, hrh output, ktz0 serialDesc) {
            fr70[] fr70VarArr = $childSerializers;
            output.mo44931G(serialDesc, 0, self.getUri());
            output.mo44941k(serialDesc, 1, (rr60) fr70VarArr[1].getValue(), self.getArtwork());
            output.mo44931G(serialDesc, 2, self.artistName);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final List<Image> component2() {
            return this.artwork;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getArtistName() {
            return this.artistName;
        }

        public final Artist copy(String uri, List<Image> artwork, String artistName) {
            return new Artist(uri, artwork, artistName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Artist)) {
                return false;
            }
            Artist artist = (Artist) other;
            return wj50.m88271j(this.uri, artist.uri) && wj50.m88271j(this.artwork, artist.artwork) && wj50.m88271j(this.artistName, artist.artistName);
        }

        public final String getArtistName() {
            return this.artistName;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public List<Image> getArtwork() {
            return this.artwork;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getDisplayName() {
            return this.artistName;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.artistName.hashCode() + s571.m77244c(this.uri.hashCode() * 31, 31, this.artwork);
        }

        public String toString() {
            return super.toString();
        }

        public Artist(String str, List<Image> list, String str2) {
            this.uri = str;
            this.artwork = list;
            this.artistName = str2;
        }
    }

    @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final rr60 serializer() {
            jqv0 jqv0Var = qpv0.f191387a;
            return new qoy0("com.spotify.voiceassistants.playermodels.MetadataItem", jqv0Var.mo54112b(MetadataItem.class), new up60[]{jqv0Var.mo54112b(Album.class), jqv0Var.mo54112b(Artist.class), jqv0Var.mo54112b(Episode.class), jqv0Var.mo54112b(Error.class), jqv0Var.mo54112b(Playlist.class), jqv0Var.mo54112b(Show.class), jqv0Var.mo54112b(Track.class)}, new rr60[]{MetadataItem$Album$$serializer.INSTANCE, MetadataItem$Artist$$serializer.INSTANCE, MetadataItem$Episode$$serializer.INSTANCE, MetadataItem$Error$$serializer.INSTANCE, MetadataItem$Playlist$$serializer.INSTANCE, MetadataItem$Show$$serializer.INSTANCE, MetadataItem$Track$$serializer.INSTANCE}, new Annotation[]{new C1323x29fa1b48("entity_type")});
        }
    }

    @Metadata(m24211d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0019R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0019¨\u00062"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Episode;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem;", "", "uri", "", "Lcom/spotify/voiceassistants/playermodels/Image;", "artwork", "episodeName", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels", "(Lcom/spotify/voiceassistants/playermodels/MetadataItem$Episode;Lp/hrh;Lp/ktz0;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/spotify/voiceassistants/playermodels/MetadataItem$Episode;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "Ljava/util/List;", "getArtwork", "getEpisodeName", "getEpisodeName$annotations", "()V", "getDisplayName", "displayName", "Companion", "$serializer", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class Episode implements MetadataItem {
        private final List<Image> artwork;
        private final String episodeName;
        private final String uri;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final fr70[] $childSerializers = {null, q3d0.m72078I(2, MetadataItem$Episode$Companion$$childSerializers$1.INSTANCE), null};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Episode$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem$Episode;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return MetadataItem$Episode$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Episode(int i, String str, List list, String str2, utz0 utz0Var) {
            if (7 != (i & 7)) {
                edo.m38617p(i, 7, MetadataItem$Episode$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.uri = str;
            this.artwork = list;
            this.episodeName = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Episode copy$default(Episode episode, String str, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = episode.uri;
            }
            if ((i & 2) != 0) {
                list = episode.artwork;
            }
            if ((i & 4) != 0) {
                str2 = episode.episodeName;
            }
            return episode.copy(str, list, str2);
        }

        public static /* synthetic */ void getEpisodeName$annotations() {
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels */
        public static final /* synthetic */ void m22345xf1ee467f(Episode self, hrh output, ktz0 serialDesc) {
            fr70[] fr70VarArr = $childSerializers;
            output.mo44931G(serialDesc, 0, self.getUri());
            output.mo44941k(serialDesc, 1, (rr60) fr70VarArr[1].getValue(), self.getArtwork());
            output.mo44931G(serialDesc, 2, self.episodeName);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final List<Image> component2() {
            return this.artwork;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getEpisodeName() {
            return this.episodeName;
        }

        public final Episode copy(String uri, List<Image> artwork, String episodeName) {
            return new Episode(uri, artwork, episodeName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Episode)) {
                return false;
            }
            Episode episode = (Episode) other;
            return wj50.m88271j(this.uri, episode.uri) && wj50.m88271j(this.artwork, episode.artwork) && wj50.m88271j(this.episodeName, episode.episodeName);
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public List<Image> getArtwork() {
            return this.artwork;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getDisplayName() {
            return this.episodeName;
        }

        public final String getEpisodeName() {
            return this.episodeName;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.episodeName.hashCode() + s571.m77244c(this.uri.hashCode() * 31, 31, this.artwork);
        }

        public String toString() {
            return super.toString();
        }

        public Episode(String str, List<Image> list, String str2) {
            this.uri = str;
            this.artwork = list;
            this.episodeName = str2;
        }
    }

    @Metadata(m24211d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015R\u0014\u0010%\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0015¨\u0006/"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Error;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem;", "", "error", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels", "(Lcom/spotify/voiceassistants/playermodels/MetadataItem$Error;Lp/hrh;Lp/ktz0;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/spotify/voiceassistants/playermodels/MetadataItem$Error;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError", "getError$annotations", "()V", "getUri", "uri", "", "Lcom/spotify/voiceassistants/playermodels/Image;", "getArtwork", "()Ljava/util/List;", "artwork", "getDisplayName", "displayName", "Companion", "$serializer", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class Error implements MetadataItem {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String error;

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Error$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem$Error;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return MetadataItem$Error$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.error;
            }
            return error.copy(str);
        }

        public static /* synthetic */ void getError$annotations() {
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels */
        public static final /* synthetic */ void m22346xf1ee467f(Error self, hrh output, ktz0 serialDesc) {
            String str = self.error;
            if (str != null) {
                output.mo44943s(serialDesc, 0, ql51.f189738a, str);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getError() {
            return this.error;
        }

        public final Error copy(String error) {
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && wj50.m88271j(this.error, ((Error) other).error);
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public List<Image> getArtwork() {
            return lau.f131415a;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getDisplayName() {
            return "";
        }

        public final String getError() {
            return this.error;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getUri() {
            return "";
        }

        public int hashCode() {
            String str = this.error;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Error(int i, String str, utz0 utz0Var) {
            if ((i & 1) == 0) {
                this.error = null;
            } else {
                this.error = str;
            }
        }

        public Error(String str) {
            this.error = str;
        }

        public /* synthetic */ Error(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @Metadata(m24211d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0019R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0019¨\u00062"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Playlist;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem;", "", "uri", "", "Lcom/spotify/voiceassistants/playermodels/Image;", "artwork", "playlistName", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels", "(Lcom/spotify/voiceassistants/playermodels/MetadataItem$Playlist;Lp/hrh;Lp/ktz0;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/spotify/voiceassistants/playermodels/MetadataItem$Playlist;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "Ljava/util/List;", "getArtwork", "getPlaylistName", "getPlaylistName$annotations", "()V", "getDisplayName", "displayName", "Companion", "$serializer", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class Playlist implements MetadataItem {
        private final List<Image> artwork;
        private final String playlistName;
        private final String uri;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final fr70[] $childSerializers = {null, q3d0.m72078I(2, MetadataItem$Playlist$Companion$$childSerializers$1.INSTANCE), null};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Playlist$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem$Playlist;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return MetadataItem$Playlist$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Playlist(int i, String str, List list, String str2, utz0 utz0Var) {
            if (7 != (i & 7)) {
                edo.m38617p(i, 7, MetadataItem$Playlist$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.uri = str;
            this.artwork = list;
            this.playlistName = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Playlist copy$default(Playlist playlist, String str, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = playlist.uri;
            }
            if ((i & 2) != 0) {
                list = playlist.artwork;
            }
            if ((i & 4) != 0) {
                str2 = playlist.playlistName;
            }
            return playlist.copy(str, list, str2);
        }

        public static /* synthetic */ void getPlaylistName$annotations() {
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels */
        public static final /* synthetic */ void m22347xf1ee467f(Playlist self, hrh output, ktz0 serialDesc) {
            fr70[] fr70VarArr = $childSerializers;
            output.mo44931G(serialDesc, 0, self.getUri());
            output.mo44941k(serialDesc, 1, (rr60) fr70VarArr[1].getValue(), self.getArtwork());
            output.mo44931G(serialDesc, 2, self.playlistName);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final List<Image> component2() {
            return this.artwork;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPlaylistName() {
            return this.playlistName;
        }

        public final Playlist copy(String uri, List<Image> artwork, String playlistName) {
            return new Playlist(uri, artwork, playlistName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Playlist)) {
                return false;
            }
            Playlist playlist = (Playlist) other;
            return wj50.m88271j(this.uri, playlist.uri) && wj50.m88271j(this.artwork, playlist.artwork) && wj50.m88271j(this.playlistName, playlist.playlistName);
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public List<Image> getArtwork() {
            return this.artwork;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getDisplayName() {
            return this.playlistName;
        }

        public final String getPlaylistName() {
            return this.playlistName;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.playlistName.hashCode() + s571.m77244c(this.uri.hashCode() * 31, 31, this.artwork);
        }

        public String toString() {
            return super.toString();
        }

        public Playlist(String str, List<Image> list, String str2) {
            this.uri = str;
            this.artwork = list;
            this.playlistName = str2;
        }
    }

    @Metadata(m24211d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001aR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001aR\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001a¨\u00067"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Show;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem;", "", "uri", "", "Lcom/spotify/voiceassistants/playermodels/Image;", "artwork", "showName", "publisherName", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels", "(Lcom/spotify/voiceassistants/playermodels/MetadataItem$Show;Lp/hrh;Lp/ktz0;)V", "write$Self", "getSubtitle", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/List;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/voiceassistants/playermodels/MetadataItem$Show;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "Ljava/util/List;", "getArtwork", "getShowName", "getShowName$annotations", "()V", "getPublisherName", "getPublisherName$annotations", "getDisplayName", "displayName", "Companion", "$serializer", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class Show implements MetadataItem {
        private final List<Image> artwork;
        private final String publisherName;
        private final String showName;
        private final String uri;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final fr70[] $childSerializers = {null, q3d0.m72078I(2, MetadataItem$Show$Companion$$childSerializers$1.INSTANCE), null, null};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Show$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem$Show;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return MetadataItem$Show$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Show(int i, String str, List list, String str2, String str3, utz0 utz0Var) {
            if (15 != (i & 15)) {
                edo.m38617p(i, 15, MetadataItem$Show$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.uri = str;
            this.artwork = list;
            this.showName = str2;
            this.publisherName = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Show copy$default(Show show, String str, List list, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = show.uri;
            }
            if ((i & 2) != 0) {
                list = show.artwork;
            }
            if ((i & 4) != 0) {
                str2 = show.showName;
            }
            if ((i & 8) != 0) {
                str3 = show.publisherName;
            }
            return show.copy(str, list, str2, str3);
        }

        public static /* synthetic */ void getPublisherName$annotations() {
        }

        public static /* synthetic */ void getShowName$annotations() {
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels */
        public static final /* synthetic */ void m22348xf1ee467f(Show self, hrh output, ktz0 serialDesc) {
            fr70[] fr70VarArr = $childSerializers;
            output.mo44931G(serialDesc, 0, self.getUri());
            output.mo44941k(serialDesc, 1, (rr60) fr70VarArr[1].getValue(), self.getArtwork());
            output.mo44931G(serialDesc, 2, self.showName);
            output.mo44931G(serialDesc, 3, self.publisherName);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final List<Image> component2() {
            return this.artwork;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getShowName() {
            return this.showName;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPublisherName() {
            return this.publisherName;
        }

        public final Show copy(String uri, List<Image> artwork, String showName, String publisherName) {
            return new Show(uri, artwork, showName, publisherName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Show)) {
                return false;
            }
            Show show = (Show) other;
            return wj50.m88271j(this.uri, show.uri) && wj50.m88271j(this.artwork, show.artwork) && wj50.m88271j(this.showName, show.showName) && wj50.m88271j(this.publisherName, show.publisherName);
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public List<Image> getArtwork() {
            return this.artwork;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getDisplayName() {
            return this.showName;
        }

        public final String getPublisherName() {
            return this.publisherName;
        }

        public final String getShowName() {
            return this.showName;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getSubtitle() {
            return this.publisherName;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.publisherName.hashCode() + s571.m77243b(s571.m77244c(this.uri.hashCode() * 31, 31, this.artwork), 31, this.showName);
        }

        public String toString() {
            return super.toString();
        }

        public Show(String str, List<Image> list, String str2, String str3) {
            this.uri = str;
            this.artwork = list;
            this.showName = str2;
            this.publisherName = str3;
        }
    }

    @Metadata(m24211d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b8\u00103\u001a\u0004\b7\u0010\u001cR\u0014\u0010:\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u001c¨\u0006="}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Track;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem;", "", "uri", "", "Lcom/spotify/voiceassistants/playermodels/Image;", "artwork", "trackName", "", "explicit", "artistName", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels", "(Lcom/spotify/voiceassistants/playermodels/MetadataItem$Track;Lp/hrh;Lp/ktz0;)V", "write$Self", "getSubtitle", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/List;", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/spotify/voiceassistants/playermodels/MetadataItem$Track;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "Ljava/util/List;", "getArtwork", "getTrackName", "getTrackName$annotations", "()V", "Ljava/lang/Boolean;", "getExplicit", "getExplicit$annotations", "getArtistName", "getArtistName$annotations", "getDisplayName", "displayName", "Companion", "$serializer", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class Track implements MetadataItem {
        private final String artistName;
        private final List<Image> artwork;
        private final Boolean explicit;
        private final String trackName;
        private final String uri;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final fr70[] $childSerializers = {null, q3d0.m72078I(2, MetadataItem$Track$Companion$$childSerializers$1.INSTANCE), null, null, null};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/MetadataItem$Track$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/voiceassistants/playermodels/MetadataItem$Track;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return MetadataItem$Track$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Track(int i, String str, List list, String str2, Boolean bool, String str3, utz0 utz0Var) {
            if (7 != (i & 7)) {
                edo.m38617p(i, 7, MetadataItem$Track$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.uri = str;
            this.artwork = list;
            this.trackName = str2;
            if ((i & 8) == 0) {
                this.explicit = null;
            } else {
                this.explicit = bool;
            }
            if ((i & 16) == 0) {
                this.artistName = null;
            } else {
                this.artistName = str3;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Track copy$default(Track track, String str, List list, String str2, Boolean bool, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = track.uri;
            }
            if ((i & 2) != 0) {
                list = track.artwork;
            }
            if ((i & 4) != 0) {
                str2 = track.trackName;
            }
            if ((i & 8) != 0) {
                bool = track.explicit;
            }
            if ((i & 16) != 0) {
                str3 = track.artistName;
            }
            String str4 = str3;
            String str5 = str2;
            return track.copy(str, list, str5, bool, str4);
        }

        public static /* synthetic */ void getArtistName$annotations() {
        }

        public static /* synthetic */ void getExplicit$annotations() {
        }

        public static /* synthetic */ void getTrackName$annotations() {
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels */
        public static final /* synthetic */ void m22349xf1ee467f(Track self, hrh output, ktz0 serialDesc) {
            fr70[] fr70VarArr = $childSerializers;
            output.mo44931G(serialDesc, 0, self.getUri());
            output.mo44941k(serialDesc, 1, (rr60) fr70VarArr[1].getValue(), self.getArtwork());
            output.mo44931G(serialDesc, 2, self.trackName);
            Boolean bool = self.explicit;
            if (bool != null) {
                output.mo44943s(serialDesc, 3, l8a.f130828a, bool);
            }
            String str = self.artistName;
            if (str != null) {
                output.mo44943s(serialDesc, 4, ql51.f189738a, str);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final List<Image> component2() {
            return this.artwork;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTrackName() {
            return this.trackName;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Boolean getExplicit() {
            return this.explicit;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getArtistName() {
            return this.artistName;
        }

        public final Track copy(String uri, List<Image> artwork, String trackName, Boolean explicit, String artistName) {
            return new Track(uri, artwork, trackName, explicit, artistName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Track)) {
                return false;
            }
            Track track = (Track) other;
            return wj50.m88271j(this.uri, track.uri) && wj50.m88271j(this.artwork, track.artwork) && wj50.m88271j(this.trackName, track.trackName) && wj50.m88271j(this.explicit, track.explicit) && wj50.m88271j(this.artistName, track.artistName);
        }

        public final String getArtistName() {
            return this.artistName;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public List<Image> getArtwork() {
            return this.artwork;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getDisplayName() {
            return this.trackName;
        }

        public final Boolean getExplicit() {
            return this.explicit;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getSubtitle() {
            return this.artistName;
        }

        public final String getTrackName() {
            return this.trackName;
        }

        @Override // com.spotify.voiceassistants.playermodels.MetadataItem
        public String getUri() {
            return this.uri;
        }

        public int hashCode() {
            int iM77243b = s571.m77243b(s571.m77244c(this.uri.hashCode() * 31, 31, this.artwork), 31, this.trackName);
            Boolean bool = this.explicit;
            int iHashCode = (iM77243b + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.artistName;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return super.toString();
        }

        public Track(String str, List<Image> list, String str2, Boolean bool, String str3) {
            this.uri = str;
            this.artwork = list;
            this.trackName = str2;
            this.explicit = bool;
            this.artistName = str3;
        }

        public /* synthetic */ Track(String str, List list, String str2, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str3);
        }
    }

    List<Image> getArtwork();

    String getDisplayName();

    default String getSubtitle() {
        return null;
    }

    String getUri();
}
