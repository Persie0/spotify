package com.spotify.recentlyplayed.recentlyplayed;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p204p.avp0;
import p204p.be00;
import p204p.dd41;
import p204p.fka1;
import p204p.gn80;
import p204p.he41;
import p204p.hk60;
import p204p.ivp0;
import p204p.j3v0;
import p204p.jx71;
import p204p.ltf1;
import p204p.mqg1;
import p204p.mt60;
import p204p.nau;
import p204p.r2v0;
import p204p.r46;
import p204p.rm60;
import p204p.s2v0;
import p204p.s571;
import p204p.t2v0;
import p204p.t4u0;
import p204p.tjr0;
import p204p.u2v0;
import p204p.ujr0;
import p204p.v2v0;
import p204p.w2v0;
import p204p.wj11;
import p204p.wj50;
import p204p.x2v0;
import p204p.xl60;
import p204p.xl81;
import p204p.xoc1;
import p204p.y2v0;
import p204p.y85;
import p204p.z2l0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 |2\u00020\u0001:\u0005}r~w|Bë\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010+J\u0010\u0010/\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b.\u0010+J\u0010\u00101\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b0\u0010+J\u0010\u00103\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b2\u0010+J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010+J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010+J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010+J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u0010+J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u0010+J\u0010\u00109\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b;\u0010:J\u0010\u0010=\u001a\u00020\u000eHÀ\u0003¢\u0006\u0004\b<\u0010:J\u0010\u0010>\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b>\u0010:J\u0010\u0010?\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b?\u0010:J\u0010\u0010@\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b@\u0010:J\u0010\u0010A\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bA\u0010)J\u0010\u0010B\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bB\u0010)J\u0010\u0010D\u001a\u00020\u0015HÀ\u0003¢\u0006\u0004\bC\u0010)J\u0010\u0010E\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bE\u0010+J\u001e\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aHÀ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u0010+J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010+J\u0012\u0010M\u001a\u0004\u0018\u00010\u000eHÀ\u0003¢\u0006\u0004\bK\u0010LJ\u0010\u0010N\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bN\u0010:J¨\u0002\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00022\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bQ\u0010+J\u0010\u0010R\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\bR\u0010)J\u001a\u0010U\u001a\u00020\u000e2\b\u0010T\u001a\u0004\u0018\u00010SHÖ\u0003¢\u0006\u0004\bU\u0010VR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010W\u001a\u0004\bX\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010W\u001a\u0004\bY\u0010+R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010W\u001a\u0004\bZ\u0010+R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010W\u001a\u0004\b[\u0010+R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010W\u001a\u0004\b\\\u0010+R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010W\u001a\u0004\b]\u0010+R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010W\u001a\u0004\b^\u0010+R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010W\u001a\u0004\b_\u0010+R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010W\u001a\u0004\b`\u0010+R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010W\u001a\u0004\ba\u0010+R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010W\u001a\u0004\bb\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010c\u001a\u0004\bd\u0010:R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010c\u001a\u0004\b\u0010\u0010:R\u001a\u0010\u0011\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010c\u001a\u0004\be\u0010:R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010c\u001a\u0004\b\u0012\u0010:R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010c\u001a\u0004\b\u0013\u0010:R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010c\u001a\u0004\bf\u0010:R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010g\u001a\u0004\bh\u0010)R\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010g\u001a\u0004\bi\u0010)R\u001a\u0010\u0018\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010g\u001a\u0004\bj\u0010)R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010W\u001a\u0004\bk\u0010+R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010l\u001a\u0004\bm\u0010GR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010W\u001a\u0004\bn\u0010+R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010W\u001a\u0004\bo\u0010+R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010p\u001a\u0004\bq\u0010LR\u0017\u0010\u001f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010c\u001a\u0004\b\u001f\u0010:R\u0017\u0010s\u001a\u00020r8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u0017\u0010x\u001a\u00020w8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{¨\u0006\u007f"}, m24212d2 = {"Lcom/spotify/recentlyplayed/recentlyplayed/RecentlyPlayedEntity;", "Landroid/os/Parcelable;", "", "link", "collectionLink", "name", "imageUri", "type", "offline", "ownerName", "publisher", "artistName", ContextTrack.Metadata.KEY_SUBTITLE, "mediaType", "", "available", "isCollaborative", "isLoading", "isOwnedBySelf", "isFollowing", "inCollection", "", "numTracks", "tracksInCollectionCount", "syncProgress", "formatListType", "", "formatListAttributes", "madeForName", "madeForUsername", "isOnDemandInFree", "isBook", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V", "Landroid/os/Parcel;", "destination", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "component4", "component5$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "component5", "component6$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Z", "component13", "component14$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "component14", "component15", "component16", "component17", "component18", "component19", "component20$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "component20", "component21", "component22$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "()Ljava/util/Map;", "component22", "component23", "component24", "component25$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "()Ljava/lang/Boolean;", "component25", "component26", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)Lcom/spotify/recentlyplayed/recentlyplayed/RecentlyPlayedEntity;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "getCollectionLink", "getName", "getImageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "getType$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "getOffline$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "getOwnerName", "getPublisher", "getArtistName", "getSubtitle", "getMediaType", "Z", "getAvailable", "isLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "getInCollection", "I", "getNumTracks", "getTracksInCollectionCount", "getSyncProgress$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "getFormatListType", "Ljava/util/Map;", "getFormatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "getMadeForName", "getMadeForUsername", "Ljava/lang/Boolean;", "isOnDemandInFree$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "Lp/s2v0;", "derivedData", "Lp/s2v0;", "getDerivedData", "()Lp/s2v0;", "Lp/w2v0;", "labels", "Lp/w2v0;", "getLabels", "()Lp/w2v0;", "CREATOR", "p/x2v0", "p/v2v0", "src_main_java_com_spotify_recentlyplayed_recentlyplayed-recentlyplayed"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class RecentlyPlayedEntity implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final String artistName;
    private final boolean available;
    private final String collectionLink;
    private final s2v0 derivedData;
    private final Map<String, String> formatListAttributes;
    private final String formatListType;
    private final String imageUri;
    private final boolean inCollection;
    private final boolean isBook;
    private final boolean isCollaborative;
    private final boolean isFollowing;
    private final boolean isLoading;
    private final Boolean isOnDemandInFree;
    private final boolean isOwnedBySelf;
    private final w2v0 labels;
    private final String link;
    private final String madeForName;
    private final String madeForUsername;
    private final String mediaType;
    private final String name;
    private final int numTracks;
    private final String offline;
    private final String ownerName;
    private final String publisher;
    private final String subtitle;
    private final int syncProgress;
    private final int tracksInCollectionCount;
    private final String type;

    /* JADX INFO: renamed from: com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity$CREATOR, reason: from kotlin metadata */
    @Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/recentlyplayed/recentlyplayed/RecentlyPlayedEntity$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/spotify/recentlyplayed/recentlyplayed/RecentlyPlayedEntity;", "Lp/hk60;", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/recentlyplayed/recentlyplayed/RecentlyPlayedEntity;", "Lp/rm60;", "writer", "entity", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/recentlyplayed/recentlyplayed/RecentlyPlayedEntity;)V", "src_main_java_com_spotify_recentlyplayed_recentlyplayed-recentlyplayed"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion extends hk60<RecentlyPlayedEntity> implements Parcelable.Creator<RecentlyPlayedEntity> {
        @Override // android.os.Parcelable.Creator
        public final RecentlyPlayedEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            if (string == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String string2 = parcel.readString();
            if (string2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String string3 = parcel.readString();
            if (string3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String string4 = parcel.readString();
            if (string4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String string5 = parcel.readString();
            if (string5 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String string6 = parcel.readString();
            if (string6 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String string7 = parcel.readString();
            if (string7 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String string8 = parcel.readString();
            if (string8 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String string9 = parcel.readString();
            if (string9 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String string10 = parcel.readString();
            if (string10 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String string11 = parcel.readString();
            if (string11 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String string12 = parcel.readString();
            if (string12 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            boolean z = false;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            int i = parcel.readInt();
            if (i != -1) {
                boolValueOf = Boolean.valueOf(i != 0 ? z2 : false);
            } else {
                boolValueOf = null;
            }
            return new RecentlyPlayedEntity(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, z, z2, z2, z2, z2, z2, parcel.readInt(), parcel.readInt(), parcel.readInt(), string12, mqg1.m62558r(parcel, ltf1.f136773a), parcel.readString(), parcel.readString(), boolValueOf, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RecentlyPlayedEntity[] newArray(int i) {
            return new RecentlyPlayedEntity[i];
        }

        public final String toString() {
            return "RecentlyPlayedEntity-Parcel-Json-Creator";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p204p.hk60
        @be00
        public RecentlyPlayedEntity fromJson(xl60 reader) {
            hk60 hk60Var = j3v0.f108485a;
            hk60 hk60Var2 = j3v0.f108489e;
            hk60 hk60Var3 = j3v0.f108487c;
            hk60 hk60Var4 = j3v0.f108486b;
            hk60 hk60Var5 = j3v0.f108485a;
            reader.mo51076c();
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Boolean bool7 = null;
            String str12 = null;
            Map map = null;
            String str13 = null;
            String str14 = null;
            Boolean bool8 = null;
            while (reader.mo51079i()) {
                Boolean bool9 = bool;
                switch (reader.mo51071K(j3v0.f108491g)) {
                    case 0:
                        str = (String) hk60Var5.fromJson(reader);
                        break;
                    case 1:
                        str2 = (String) hk60Var5.fromJson(reader);
                        break;
                    case 2:
                        str3 = (String) hk60Var5.fromJson(reader);
                        break;
                    case 3:
                        str4 = (String) hk60Var5.fromJson(reader);
                        break;
                    case 4:
                        str5 = (String) hk60Var5.fromJson(reader);
                        break;
                    case 5:
                        str6 = (String) hk60Var5.fromJson(reader);
                        break;
                    case 6:
                        str7 = (String) hk60Var5.fromJson(reader);
                        break;
                    case 7:
                        str8 = (String) hk60Var5.fromJson(reader);
                        break;
                    case 8:
                        str9 = (String) hk60Var5.fromJson(reader);
                        break;
                    case 9:
                        str10 = (String) hk60Var5.fromJson(reader);
                        break;
                    case 10:
                        str11 = (String) hk60Var5.fromJson(reader);
                        break;
                    case 11:
                        bool = (Boolean) hk60Var4.fromJson(reader);
                        continue;
                    case 12:
                        bool2 = (Boolean) hk60Var4.fromJson(reader);
                        break;
                    case 13:
                        bool3 = (Boolean) hk60Var4.fromJson(reader);
                        break;
                    case 14:
                        bool4 = (Boolean) hk60Var4.fromJson(reader);
                        break;
                    case 15:
                        bool5 = (Boolean) hk60Var4.fromJson(reader);
                        break;
                    case 16:
                        bool6 = (Boolean) hk60Var4.fromJson(reader);
                        break;
                    case 17:
                        num = (Integer) hk60Var3.fromJson(reader);
                        break;
                    case 18:
                        num2 = (Integer) hk60Var3.fromJson(reader);
                        break;
                    case 19:
                        num3 = (Integer) hk60Var3.fromJson(reader);
                        break;
                    case 20:
                        str12 = (String) hk60Var5.fromJson(reader);
                        break;
                    case 21:
                        map = (Map) j3v0.f108488d.fromJson(reader);
                        break;
                    case 22:
                        str13 = (String) hk60Var2.fromJson(reader);
                        break;
                    case 23:
                        str14 = (String) hk60Var2.fromJson(reader);
                        break;
                    case 24:
                        bool8 = (Boolean) j3v0.f108490f.fromJson(reader);
                        break;
                    case 25:
                        bool7 = (Boolean) hk60Var4.fromJson(reader);
                        break;
                    default:
                        reader.mo51073P();
                        reader.mo51074Q();
                        break;
                }
                bool = bool9;
            }
            Boolean bool10 = bool;
            reader.mo51078f();
            Boolean bool11 = bool2;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (str3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (str4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (str5 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (str6 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (str7 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (str8 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (str9 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (str10 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (str11 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (bool10 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            boolean zBooleanValue = bool10.booleanValue();
            if (bool11 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            boolean zBooleanValue2 = bool11.booleanValue();
            if (bool3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            boolean zBooleanValue3 = bool3.booleanValue();
            if (bool4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            boolean zBooleanValue4 = bool4.booleanValue();
            if (bool5 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            boolean zBooleanValue5 = bool5.booleanValue();
            if (bool6 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            boolean zBooleanValue6 = bool6.booleanValue();
            if (num == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iIntValue = num.intValue();
            if (num2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iIntValue2 = num2.intValue();
            if (num3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iIntValue3 = num3.intValue();
            if (str12 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (bool7 != null) {
                return new RecentlyPlayedEntity(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, iIntValue, iIntValue2, iIntValue3, str12, map, str13, str14, bool8, bool7.booleanValue());
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // p204p.hk60
        @jx71
        public void toJson(rm60 writer, RecentlyPlayedEntity entity) {
            if (entity != null) {
                hk60 hk60Var = j3v0.f108485a;
                writer.mo56891e();
                writer.mo56894s("link");
                hk60 hk60Var2 = j3v0.f108485a;
                hk60Var2.toJson(writer, entity.getLink());
                writer.mo56894s("collectionLink");
                hk60Var2.toJson(writer, entity.getCollectionLink());
                writer.mo56894s("name");
                hk60Var2.toJson(writer, entity.getName());
                writer.mo56894s("imageUri");
                hk60Var2.toJson(writer, entity.m20321xcf36ce4d());
                writer.mo56894s("type");
                hk60Var2.toJson(writer, entity.m20324x53726e04());
                writer.mo56894s("offline");
                hk60Var2.toJson(writer, entity.m20322x2268bd67());
                writer.mo56894s("ownerName");
                hk60Var2.toJson(writer, entity.getOwnerName());
                writer.mo56894s("publisher");
                hk60Var2.toJson(writer, entity.getPublisher());
                writer.mo56894s("artistName");
                hk60Var2.toJson(writer, entity.getArtistName());
                writer.mo56894s(ContextTrack.Metadata.KEY_SUBTITLE);
                hk60Var2.toJson(writer, entity.getSubtitle());
                writer.mo56894s("mediaType");
                hk60Var2.toJson(writer, entity.getMediaType());
                writer.mo56894s("available");
                hk60 hk60Var3 = j3v0.f108486b;
                hk60Var3.toJson(writer, Boolean.valueOf(entity.getAvailable()));
                writer.mo56894s("isCollaborative");
                hk60Var3.toJson(writer, Boolean.valueOf(entity.isCollaborative()));
                writer.mo56894s("isLoading");
                hk60Var3.toJson(writer, Boolean.valueOf(entity.m20325x1b2a86c2()));
                writer.mo56894s("isOwnedBySelf");
                hk60Var3.toJson(writer, Boolean.valueOf(entity.isOwnedBySelf()));
                writer.mo56894s("isFollowing");
                hk60Var3.toJson(writer, Boolean.valueOf(entity.isFollowing()));
                writer.mo56894s("inCollection");
                hk60Var3.toJson(writer, Boolean.valueOf(entity.getInCollection()));
                writer.mo56894s("numTracks");
                hk60 hk60Var4 = j3v0.f108487c;
                hk60Var4.toJson(writer, Integer.valueOf(entity.getNumTracks()));
                writer.mo56894s("tracksInCollectionCount");
                hk60Var4.toJson(writer, Integer.valueOf(entity.getTracksInCollectionCount()));
                writer.mo56894s("syncProgress");
                hk60Var4.toJson(writer, Integer.valueOf(entity.m20323x9f204d96()));
                writer.mo56894s("formatListType");
                hk60Var2.toJson(writer, entity.getFormatListType());
                writer.mo56894s("formatListAttributes");
                j3v0.f108488d.toJson(writer, entity.m20320x2877cc92());
                writer.mo56894s("madeForName");
                hk60 hk60Var5 = j3v0.f108489e;
                hk60Var5.toJson(writer, entity.getMadeForName());
                writer.mo56894s("madeForUsername");
                hk60Var5.toJson(writer, entity.getMadeForUsername());
                writer.mo56894s("isOnDemandInFree");
                j3v0.f108490f.toJson(writer, entity.m20326x430dfd6f());
                writer.mo56894s("isBook");
                hk60Var3.toJson(writer, Boolean.valueOf(entity.isBook()));
                writer.mo56893i();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x0284  */
    /* JADX WARN: Code duplicated, block: B:110:0x028d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0296 A[PHI: r2
      0x0296: PHI (r2v16 p.v2v0) = (r2v4 p.v2v0), (r2v4 p.v2v0), (r2v4 p.v2v0), (r2v25 p.v2v0) binds: [B:62:0x0193, B:138:0x0325, B:135:0x0311, B:110:0x028d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x0299  */
    /* JADX WARN: Code duplicated, block: B:114:0x029f  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:121:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:130:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:131:0x0300  */
    /* JADX WARN: Code duplicated, block: B:133:0x0306  */
    /* JADX WARN: Code duplicated, block: B:134:0x0309  */
    /* JADX WARN: Code duplicated, block: B:136:0x0313  */
    /* JADX WARN: Code duplicated, block: B:137:0x031d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0327  */
    /* JADX WARN: Code duplicated, block: B:140:0x0331  */
    /* JADX WARN: Code duplicated, block: B:142:0x0337  */
    /* JADX WARN: Code duplicated, block: B:143:0x033a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0343  */
    /* JADX WARN: Code duplicated, block: B:146:0x0349  */
    /* JADX WARN: Code duplicated, block: B:147:0x034c  */
    /* JADX WARN: Code duplicated, block: B:148:0x035c A[PHI: r0
      0x035c: PHI (r0v1 p.v2v0) = 
      (r0v0 p.v2v0)
      (r0v3 p.v2v0)
      (r0v4 p.v2v0)
      (r0v6 p.v2v0)
      (r0v7 p.v2v0)
      (r0v10 p.v2v0)
      (r0v14 p.v2v0)
      (r0v15 p.v2v0)
      (r0v19 p.v2v0)
      (r0v22 p.v2v0)
      (r0v24 p.v2v0)
      (r0v25 p.v2v0)
      (r0v27 p.v2v0)
      (r0v28 p.v2v0)
      (r0v29 p.v2v0)
      (r0v0 p.v2v0)
      (r0v31 p.v2v0)
      (r0v36 p.v2v0)
      (r0v37 p.v2v0)
      (r0v40 p.v2v0)
      (r0v41 p.v2v0)
      (r0v43 p.v2v0)
      (r0v44 p.v2v0)
     binds: [B:62:0x0193, B:147:0x034c, B:146:0x0349, B:143:0x033a, B:142:0x0337, B:139:0x0327, B:136:0x0313, B:133:0x0306, B:130:0x02f7, B:129:0x02e6, B:124:0x02c4, B:118:0x02b3, B:115:0x02a3, B:114:0x029f, B:111:0x0296, B:109:0x028b, B:85:0x0230, B:80:0x0200, B:79:0x01ee, B:76:0x01d2, B:71:0x01be, B:68:0x01a6, B:67:0x01a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0134  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137  */
    /* JADX WARN: Code duplicated, block: B:55:0x0164  */
    /* JADX WARN: Code duplicated, block: B:57:0x016a  */
    /* JADX WARN: Code duplicated, block: B:58:0x016c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0175  */
    /* JADX WARN: Code duplicated, block: B:60:0x017e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0196  */
    /* JADX WARN: Code duplicated, block: B:65:0x019c  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01be  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x0200  */
    /* JADX WARN: Code duplicated, block: B:81:0x0212  */
    /* JADX WARN: Code duplicated, block: B:83:0x022c  */
    /* JADX WARN: Code duplicated, block: B:86:0x023b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0240  */
    /* JADX WARN: Code duplicated, block: B:89:0x0245  */
    /* JADX WARN: Code duplicated, block: B:92:0x024a  */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Object, java.util.Map] */
    public RecentlyPlayedEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, int i3, String str12, Map<String, String> map, String str13, String str14, Boolean bool, boolean z7) {
        String collectionLink;
        int i4;
        int iOrdinal;
        String strM20321xcf36ce4d;
        v2v0 u2v0Var;
        v2v0 t2v0Var;
        String madeForName;
        dd41 dd41VarM74726U;
        he41 he41Var;
        Integer numValueOf;
        fka1 type;
        v2v0 t2v0Var2 = ujr0.f231106f;
        this.link = str;
        this.collectionLink = str2;
        this.name = str3;
        this.imageUri = str4;
        this.type = str5;
        this.offline = str6;
        this.ownerName = str7;
        this.publisher = str8;
        this.artistName = str9;
        this.subtitle = str10;
        this.mediaType = str11;
        this.available = z;
        this.isCollaborative = z2;
        this.isLoading = z3;
        this.isOwnedBySelf = z4;
        this.isFollowing = z5;
        this.inCollection = z6;
        this.numTracks = i;
        this.tracksInCollectionCount = i2;
        this.syncProgress = i3;
        this.formatListType = str12;
        this.formatListAttributes = map;
        this.madeForName = str13;
        this.madeForUsername = str14;
        this.isOnDemandInFree = bool;
        this.isBook = z7;
        x2v0 x2v0Var = (x2v0) r2v0.f195231a.get(m20324x53726e04());
        x2v0Var = x2v0Var == null ? x2v0.f257574Y : x2v0Var;
        x2v0 x2v0Var2 = x2v0.f257576a;
        if (x2v0Var == x2v0Var2 && getInCollection()) {
            collectionLink = getCollectionLink();
        } else if (x2v0Var == x2v0Var2) {
            collectionLink = getLink();
        } else if (x2v0Var == x2v0.f257578c) {
            collectionLink = xoc1.f264153o2.f243453a;
        } else if (x2v0Var == x2v0.f257579d) {
            collectionLink = xoc1.f264161p2.f243453a;
        } else {
            collectionLink = getCollectionLink().length() > 0 ? getCollectionLink() : getLink();
        }
        wj11 wj11Var = wj50.m88271j(getMediaType(), "video") ? wj11.f251829c : wj11.f251828b;
        z2l0 z2l0VarM93070o = y85.m93070o(m20323x9f204d96(), m20322x2268bd67());
        boolean zM20325x1b2a86c2 = true;
        if (r2v0.f195232b.contains(x2v0Var) || wj50.m88271j(m20326x430dfd6f(), Boolean.TRUE)) {
            i4 = 1;
        } else {
            i4 = wj50.m88271j(m20326x430dfd6f(), Boolean.FALSE) ? 2 : 3;
        }
        Map<String, String> mapM20320x2877cc92 = m20320x2877cc92();
        mapM20320x2877cc92 = mapM20320x2877cc92 == null ? nau.f152117a : mapM20320x2877cc92;
        String link = getLink();
        switch (x2v0Var.ordinal()) {
            case 0:
            case 1:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                if (getName().length() != 0) {
                }
                iOrdinal = x2v0Var.ordinal();
                if (iOrdinal == 2) {
                    strM20321xcf36ce4d = "https://misc.scdn.co/liked-songs/liked-songs-300.png";
                } else if (iOrdinal != 3) {
                    strM20321xcf36ce4d = m20321xcf36ce4d();
                } else {
                    strM20321xcf36ce4d = "https://misc.scdn.co/your-episodes/SE-300.png";
                }
                this.derivedData = new s2v0(x2v0Var, wj11Var, z2l0VarM93070o, collectionLink, i4, mapM20320x2877cc92, link, collectionLink, zM20325x1b2a86c2, strM20321xcf36ce4d);
                switch (getDerivedData().f205077a.ordinal()) {
                    case 0:
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        u2v0Var = new u2v0(getName());
                        break;
                    case 2:
                        u2v0Var = new t2v0(R.string.recently_played_liked_songs);
                        break;
                    case 3:
                        u2v0Var = new t2v0(R.string.recently_played_your_episodes);
                        break;
                    case 11:
                        u2v0Var = t2v0Var2;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                t2v0Var = tjr0.f221006f;
                switch (getDerivedData().f205077a.ordinal()) {
                    case 0:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_album_by, Collections.singletonList(getArtistName()));
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 1:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_artist);
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 2:
                    case 3:
                        t2v0Var2 = t2v0Var;
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 4:
                        if (getSubtitle().length() > 0) {
                            t2v0Var2 = new u2v0(getSubtitle());
                        } else {
                            t2v0Var2 = t2v0Var;
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 5:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else if (getSubtitle().length() > 0) {
                            t2v0Var2 = new u2v0(getSubtitle());
                        } else {
                            t2v0Var2 = t2v0Var;
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 6:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            madeForName = getMadeForName();
                            if (madeForName == null && madeForName.length() != 0) {
                                t2v0Var2 = new t2v0(R.string.recently_played_made_for, Collections.singletonList(getMadeForName()));
                            } else if (!isOwnedBySelf() || getOwnerName().length() <= 0) {
                                t2v0Var2 = new t2v0(R.string.recently_played_playlist);
                            } else {
                                t2v0Var2 = new t2v0(R.string.recently_played_playlist_by, Collections.singletonList(getOwnerName()));
                            }
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 7:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_user_profile);
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 8:
                        Set set = dd41.f47702f;
                        dd41VarM74726U = r46.m74726U(t4u0.m80076a(getLink()));
                        gn80 gn80Var = dd41VarM74726U.f47709c;
                        if (getSubtitle().length() > 0 || gn80Var != gn80.STATION_CLUSTER) {
                            he41Var = dd41VarM74726U.f47710d;
                            numValueOf = null;
                            if (he41Var != null) {
                                type = he41Var.getType();
                            } else {
                                type = null;
                            }
                            if (type != avp0.f20242e || type == ivp0.f106258f) {
                                numValueOf = Integer.valueOf(R.string.radio_section_your_stations_playlist_subtitle);
                            } else {
                                int iOrdinal2 = gn80Var.ordinal();
                                if (iOrdinal2 == 30) {
                                    numValueOf = Integer.valueOf(R.string.radio_section_your_stations_album_subtitle);
                                } else if (iOrdinal2 == 42) {
                                    numValueOf = Integer.valueOf(R.string.radio_section_your_stations_artist_subtitle);
                                } else if (iOrdinal2 == 109) {
                                    numValueOf = Integer.valueOf(R.string.radio_section_your_stations_genre_subtitle);
                                } else if (iOrdinal2 == 925) {
                                    numValueOf = Integer.valueOf(R.string.radio_section_your_stations_song_subtitle);
                                }
                            }
                            if (numValueOf != null) {
                                t2v0Var = new t2v0(numValueOf.intValue());
                                t2v0Var2 = t2v0Var;
                            }
                        } else {
                            t2v0Var2 = new u2v0(getSubtitle());
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 9:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else if (!isBook() && getPublisher().length() > 0) {
                            t2v0Var2 = new t2v0(R.string.recently_played_audiobook_by, Collections.singletonList(getPublisher()));
                        } else if (getDerivedData().f205078b == wj11.f251829c) {
                            t2v0Var2 = new t2v0(R.string.recently_played_video_show_by, Collections.singletonList(getPublisher()));
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_show_by, Collections.singletonList(getPublisher()));
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 10:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_song_by, Collections.singletonList(getArtistName()));
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 11:
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 2:
            case 3:
            case 11:
                zM20325x1b2a86c2 = false;
                iOrdinal = x2v0Var.ordinal();
                if (iOrdinal == 2) {
                    strM20321xcf36ce4d = "https://misc.scdn.co/liked-songs/liked-songs-300.png";
                } else if (iOrdinal != 3) {
                    strM20321xcf36ce4d = m20321xcf36ce4d();
                } else {
                    strM20321xcf36ce4d = "https://misc.scdn.co/your-episodes/SE-300.png";
                }
                this.derivedData = new s2v0(x2v0Var, wj11Var, z2l0VarM93070o, collectionLink, i4, mapM20320x2877cc92, link, collectionLink, zM20325x1b2a86c2, strM20321xcf36ce4d);
                switch (getDerivedData().f205077a.ordinal()) {
                    case 0:
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        u2v0Var = new u2v0(getName());
                        break;
                    case 2:
                        u2v0Var = new t2v0(R.string.recently_played_liked_songs);
                        break;
                    case 3:
                        u2v0Var = new t2v0(R.string.recently_played_your_episodes);
                        break;
                    case 11:
                        u2v0Var = t2v0Var2;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                t2v0Var = tjr0.f221006f;
                switch (getDerivedData().f205077a.ordinal()) {
                    case 0:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_album_by, Collections.singletonList(getArtistName()));
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 1:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_artist);
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 2:
                    case 3:
                        t2v0Var2 = t2v0Var;
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 4:
                        if (getSubtitle().length() > 0) {
                            t2v0Var2 = new u2v0(getSubtitle());
                        } else {
                            t2v0Var2 = t2v0Var;
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 5:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else if (getSubtitle().length() > 0) {
                            t2v0Var2 = new u2v0(getSubtitle());
                        } else {
                            t2v0Var2 = t2v0Var;
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 6:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            madeForName = getMadeForName();
                            if (madeForName == null) {
                                if (isOwnedBySelf()) {
                                    t2v0Var2 = new t2v0(R.string.recently_played_playlist);
                                } else {
                                    t2v0Var2 = new t2v0(R.string.recently_played_playlist);
                                }
                            } else if (isOwnedBySelf()) {
                                t2v0Var2 = new t2v0(R.string.recently_played_playlist);
                            } else {
                                t2v0Var2 = new t2v0(R.string.recently_played_playlist);
                            }
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 7:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_user_profile);
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 8:
                        Set set2 = dd41.f47702f;
                        dd41VarM74726U = r46.m74726U(t4u0.m80076a(getLink()));
                        gn80 gn80Var2 = dd41VarM74726U.f47709c;
                        if (getSubtitle().length() > 0) {
                            he41Var = dd41VarM74726U.f47710d;
                            numValueOf = null;
                            if (he41Var != null) {
                                type = he41Var.getType();
                            } else {
                                type = null;
                            }
                            if (type != avp0.f20242e) {
                                numValueOf = Integer.valueOf(R.string.radio_section_your_stations_playlist_subtitle);
                            } else {
                                numValueOf = Integer.valueOf(R.string.radio_section_your_stations_playlist_subtitle);
                            }
                            if (numValueOf != null) {
                                t2v0Var = new t2v0(numValueOf.intValue());
                                t2v0Var2 = t2v0Var;
                            }
                        } else {
                            he41Var = dd41VarM74726U.f47710d;
                            numValueOf = null;
                            if (he41Var != null) {
                                type = he41Var.getType();
                            } else {
                                type = null;
                            }
                            if (type != avp0.f20242e) {
                                numValueOf = Integer.valueOf(R.string.radio_section_your_stations_playlist_subtitle);
                            } else {
                                numValueOf = Integer.valueOf(R.string.radio_section_your_stations_playlist_subtitle);
                            }
                            if (numValueOf != null) {
                                t2v0Var = new t2v0(numValueOf.intValue());
                                t2v0Var2 = t2v0Var;
                            }
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 9:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else if (!isBook()) {
                            if (getDerivedData().f205078b == wj11.f251829c) {
                                t2v0Var2 = new t2v0(R.string.recently_played_video_show_by, Collections.singletonList(getPublisher()));
                            } else {
                                t2v0Var2 = new t2v0(R.string.recently_played_show_by, Collections.singletonList(getPublisher()));
                            }
                        } else if (getDerivedData().f205078b == wj11.f251829c) {
                            t2v0Var2 = new t2v0(R.string.recently_played_video_show_by, Collections.singletonList(getPublisher()));
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_show_by, Collections.singletonList(getPublisher()));
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 10:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_song_by, Collections.singletonList(getArtistName()));
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 11:
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 6:
                zM20325x1b2a86c2 = m20325x1b2a86c2();
                iOrdinal = x2v0Var.ordinal();
                if (iOrdinal == 2) {
                    strM20321xcf36ce4d = "https://misc.scdn.co/liked-songs/liked-songs-300.png";
                } else if (iOrdinal != 3) {
                    strM20321xcf36ce4d = m20321xcf36ce4d();
                } else {
                    strM20321xcf36ce4d = "https://misc.scdn.co/your-episodes/SE-300.png";
                }
                this.derivedData = new s2v0(x2v0Var, wj11Var, z2l0VarM93070o, collectionLink, i4, mapM20320x2877cc92, link, collectionLink, zM20325x1b2a86c2, strM20321xcf36ce4d);
                switch (getDerivedData().f205077a.ordinal()) {
                    case 0:
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        u2v0Var = new u2v0(getName());
                        break;
                    case 2:
                        u2v0Var = new t2v0(R.string.recently_played_liked_songs);
                        break;
                    case 3:
                        u2v0Var = new t2v0(R.string.recently_played_your_episodes);
                        break;
                    case 11:
                        u2v0Var = t2v0Var2;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                t2v0Var = tjr0.f221006f;
                switch (getDerivedData().f205077a.ordinal()) {
                    case 0:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_album_by, Collections.singletonList(getArtistName()));
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 1:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_artist);
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 2:
                    case 3:
                        t2v0Var2 = t2v0Var;
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 4:
                        if (getSubtitle().length() > 0) {
                            t2v0Var2 = new u2v0(getSubtitle());
                        } else {
                            t2v0Var2 = t2v0Var;
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 5:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else if (getSubtitle().length() > 0) {
                            t2v0Var2 = new u2v0(getSubtitle());
                        } else {
                            t2v0Var2 = t2v0Var;
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 6:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            madeForName = getMadeForName();
                            if (madeForName == null) {
                                if (isOwnedBySelf()) {
                                    t2v0Var2 = new t2v0(R.string.recently_played_playlist);
                                } else {
                                    t2v0Var2 = new t2v0(R.string.recently_played_playlist);
                                }
                            } else if (isOwnedBySelf()) {
                                t2v0Var2 = new t2v0(R.string.recently_played_playlist);
                            } else {
                                t2v0Var2 = new t2v0(R.string.recently_played_playlist);
                            }
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 7:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_user_profile);
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 8:
                        Set set3 = dd41.f47702f;
                        dd41VarM74726U = r46.m74726U(t4u0.m80076a(getLink()));
                        gn80 gn80Var3 = dd41VarM74726U.f47709c;
                        if (getSubtitle().length() > 0) {
                            he41Var = dd41VarM74726U.f47710d;
                            numValueOf = null;
                            if (he41Var != null) {
                                type = he41Var.getType();
                            } else {
                                type = null;
                            }
                            if (type != avp0.f20242e) {
                                numValueOf = Integer.valueOf(R.string.radio_section_your_stations_playlist_subtitle);
                            } else {
                                numValueOf = Integer.valueOf(R.string.radio_section_your_stations_playlist_subtitle);
                            }
                            if (numValueOf != null) {
                                t2v0Var = new t2v0(numValueOf.intValue());
                                t2v0Var2 = t2v0Var;
                            }
                        } else {
                            he41Var = dd41VarM74726U.f47710d;
                            numValueOf = null;
                            if (he41Var != null) {
                                type = he41Var.getType();
                            } else {
                                type = null;
                            }
                            if (type != avp0.f20242e) {
                                numValueOf = Integer.valueOf(R.string.radio_section_your_stations_playlist_subtitle);
                            } else {
                                numValueOf = Integer.valueOf(R.string.radio_section_your_stations_playlist_subtitle);
                            }
                            if (numValueOf != null) {
                                t2v0Var = new t2v0(numValueOf.intValue());
                                t2v0Var2 = t2v0Var;
                            }
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 9:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else if (!isBook()) {
                            if (getDerivedData().f205078b == wj11.f251829c) {
                                t2v0Var2 = new t2v0(R.string.recently_played_video_show_by, Collections.singletonList(getPublisher()));
                            } else {
                                t2v0Var2 = new t2v0(R.string.recently_played_show_by, Collections.singletonList(getPublisher()));
                            }
                        } else if (getDerivedData().f205078b == wj11.f251829c) {
                            t2v0Var2 = new t2v0(R.string.recently_played_video_show_by, Collections.singletonList(getPublisher()));
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_show_by, Collections.singletonList(getPublisher()));
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 10:
                        if (m20325x1b2a86c2()) {
                            t2v0Var2 = y2v0.f268684a;
                        } else {
                            t2v0Var2 = new t2v0(R.string.recently_played_song_by, Collections.singletonList(getArtistName()));
                        }
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    case 11:
                        this.labels = new w2v0(u2v0Var, t2v0Var2);
                        return;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecentlyPlayedEntity copy$default(RecentlyPlayedEntity recentlyPlayedEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, int i3, String str12, Map map, String str13, String str14, Boolean bool, boolean z7, int i4, Object obj) {
        boolean z8;
        Boolean bool2;
        String str15 = (i4 & 1) != 0 ? recentlyPlayedEntity.link : str;
        String str16 = (i4 & 2) != 0 ? recentlyPlayedEntity.collectionLink : str2;
        String str17 = (i4 & 4) != 0 ? recentlyPlayedEntity.name : str3;
        String str18 = (i4 & 8) != 0 ? recentlyPlayedEntity.imageUri : str4;
        String str19 = (i4 & 16) != 0 ? recentlyPlayedEntity.type : str5;
        String str20 = (i4 & 32) != 0 ? recentlyPlayedEntity.offline : str6;
        String str21 = (i4 & 64) != 0 ? recentlyPlayedEntity.ownerName : str7;
        String str22 = (i4 & 128) != 0 ? recentlyPlayedEntity.publisher : str8;
        String str23 = (i4 & 256) != 0 ? recentlyPlayedEntity.artistName : str9;
        String str24 = (i4 & 512) != 0 ? recentlyPlayedEntity.subtitle : str10;
        String str25 = (i4 & 1024) != 0 ? recentlyPlayedEntity.mediaType : str11;
        boolean z9 = (i4 & 2048) != 0 ? recentlyPlayedEntity.available : z;
        boolean z10 = (i4 & 4096) != 0 ? recentlyPlayedEntity.isCollaborative : z2;
        boolean z11 = (i4 & 8192) != 0 ? recentlyPlayedEntity.isLoading : z3;
        String str26 = str15;
        boolean z12 = (i4 & 16384) != 0 ? recentlyPlayedEntity.isOwnedBySelf : z4;
        boolean z13 = (i4 & 32768) != 0 ? recentlyPlayedEntity.isFollowing : z5;
        boolean z14 = (i4 & 65536) != 0 ? recentlyPlayedEntity.inCollection : z6;
        int i5 = (i4 & 131072) != 0 ? recentlyPlayedEntity.numTracks : i;
        int i6 = (i4 & 262144) != 0 ? recentlyPlayedEntity.tracksInCollectionCount : i2;
        int i7 = (i4 & 524288) != 0 ? recentlyPlayedEntity.syncProgress : i3;
        String str27 = (i4 & 1048576) != 0 ? recentlyPlayedEntity.formatListType : str12;
        Map map2 = (i4 & 2097152) != 0 ? recentlyPlayedEntity.formatListAttributes : map;
        String str28 = (i4 & 4194304) != 0 ? recentlyPlayedEntity.madeForName : str13;
        String str29 = (i4 & 8388608) != 0 ? recentlyPlayedEntity.madeForUsername : str14;
        Boolean bool3 = (i4 & 16777216) != 0 ? recentlyPlayedEntity.isOnDemandInFree : bool;
        if ((i4 & 33554432) != 0) {
            bool2 = bool3;
            z8 = recentlyPlayedEntity.isBook;
        } else {
            z8 = z7;
            bool2 = bool3;
        }
        return recentlyPlayedEntity.copy(str26, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, z9, z10, z11, z12, z13, z14, i5, i6, i7, str27, map2, str28, str29, bool2, z8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsCollaborative() {
        return this.isCollaborative;
    }

    /* JADX INFO: renamed from: component14$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsOwnedBySelf() {
        return this.isOwnedBySelf;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsFollowing() {
        return this.isFollowing;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getInCollection() {
        return this.inCollection;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getNumTracks() {
        return this.numTracks;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getTracksInCollectionCount() {
        return this.tracksInCollectionCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCollectionLink() {
        return this.collectionLink;
    }

    /* JADX INFO: renamed from: component20$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, reason: from getter */
    public final int getSyncProgress() {
        return this.syncProgress;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getFormatListType() {
        return this.formatListType;
    }

    /* JADX INFO: renamed from: component22$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed */
    public final Map<String, String> m20315xdad8f517() {
        return this.formatListAttributes;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getMadeForName() {
        return this.madeForName;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getMadeForUsername() {
        return this.madeForUsername;
    }

    /* JADX INFO: renamed from: component25$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, reason: from getter */
    public final Boolean getIsOnDemandInFree() {
        return this.isOnDemandInFree;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getIsBook() {
        return this.isBook;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, reason: from getter */
    public final String getImageUri() {
        return this.imageUri;
    }

    /* JADX INFO: renamed from: component5$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, reason: from getter */
    public final String getOffline() {
        return this.offline;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOwnerName() {
        return this.ownerName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPublisher() {
        return this.publisher;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getArtistName() {
        return this.artistName;
    }

    public final RecentlyPlayedEntity copy(String link, String collectionLink, String name, String imageUri, String type, String offline, String ownerName, String publisher, String artistName, String subtitle, String mediaType, boolean available, boolean isCollaborative, boolean isLoading, boolean isOwnedBySelf, boolean isFollowing, boolean inCollection, int numTracks, int tracksInCollectionCount, int syncProgress, String formatListType, Map<String, String> formatListAttributes, String madeForName, String madeForUsername, Boolean isOnDemandInFree, boolean isBook) {
        return new RecentlyPlayedEntity(link, collectionLink, name, imageUri, type, offline, ownerName, publisher, artistName, subtitle, mediaType, available, isCollaborative, isLoading, isOwnedBySelf, isFollowing, inCollection, numTracks, tracksInCollectionCount, syncProgress, formatListType, formatListAttributes, madeForName, madeForUsername, isOnDemandInFree, isBook);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentlyPlayedEntity)) {
            return false;
        }
        RecentlyPlayedEntity recentlyPlayedEntity = (RecentlyPlayedEntity) other;
        return wj50.m88271j(this.link, recentlyPlayedEntity.link) && wj50.m88271j(this.collectionLink, recentlyPlayedEntity.collectionLink) && wj50.m88271j(this.name, recentlyPlayedEntity.name) && wj50.m88271j(this.imageUri, recentlyPlayedEntity.imageUri) && wj50.m88271j(this.type, recentlyPlayedEntity.type) && wj50.m88271j(this.offline, recentlyPlayedEntity.offline) && wj50.m88271j(this.ownerName, recentlyPlayedEntity.ownerName) && wj50.m88271j(this.publisher, recentlyPlayedEntity.publisher) && wj50.m88271j(this.artistName, recentlyPlayedEntity.artistName) && wj50.m88271j(this.subtitle, recentlyPlayedEntity.subtitle) && wj50.m88271j(this.mediaType, recentlyPlayedEntity.mediaType) && this.available == recentlyPlayedEntity.available && this.isCollaborative == recentlyPlayedEntity.isCollaborative && this.isLoading == recentlyPlayedEntity.isLoading && this.isOwnedBySelf == recentlyPlayedEntity.isOwnedBySelf && this.isFollowing == recentlyPlayedEntity.isFollowing && this.inCollection == recentlyPlayedEntity.inCollection && this.numTracks == recentlyPlayedEntity.numTracks && this.tracksInCollectionCount == recentlyPlayedEntity.tracksInCollectionCount && this.syncProgress == recentlyPlayedEntity.syncProgress && wj50.m88271j(this.formatListType, recentlyPlayedEntity.formatListType) && wj50.m88271j(this.formatListAttributes, recentlyPlayedEntity.formatListAttributes) && wj50.m88271j(this.madeForName, recentlyPlayedEntity.madeForName) && wj50.m88271j(this.madeForUsername, recentlyPlayedEntity.madeForUsername) && wj50.m88271j(this.isOnDemandInFree, recentlyPlayedEntity.isOnDemandInFree) && this.isBook == recentlyPlayedEntity.isBook;
    }

    public final String getArtistName() {
        return this.artistName;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final String getCollectionLink() {
        return this.collectionLink;
    }

    public final s2v0 getDerivedData() {
        return this.derivedData;
    }

    /* JADX INFO: renamed from: getFormatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed */
    public final Map<String, String> m20320x2877cc92() {
        return this.formatListAttributes;
    }

    public final String getFormatListType() {
        return this.formatListType;
    }

    /* JADX INFO: renamed from: getImageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed */
    public final String m20321xcf36ce4d() {
        return this.imageUri;
    }

    public final boolean getInCollection() {
        return this.inCollection;
    }

    public final w2v0 getLabels() {
        return this.labels;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getMadeForName() {
        return this.madeForName;
    }

    public final String getMadeForUsername() {
        return this.madeForUsername;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNumTracks() {
        return this.numTracks;
    }

    /* JADX INFO: renamed from: getOffline$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed */
    public final String m20322x2268bd67() {
        return this.offline;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getPublisher() {
        return this.publisher;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: getSyncProgress$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed */
    public final int m20323x9f204d96() {
        return this.syncProgress;
    }

    public final int getTracksInCollectionCount() {
        return this.tracksInCollectionCount;
    }

    /* JADX INFO: renamed from: getType$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed */
    public final String m20324x53726e04() {
        return this.type;
    }

    public int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.syncProgress, mt60.m62800g(this.tracksInCollectionCount, mt60.m62800g(this.numTracks, s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.link.hashCode() * 31, 31, this.collectionLink), 31, this.name), 31, this.imageUri), 31, this.type), 31, this.offline), 31, this.ownerName), 31, this.publisher), 31, this.artistName), 31, this.subtitle), 31, this.mediaType), 31, this.available), 31, this.isCollaborative), 31, this.isLoading), 31, this.isOwnedBySelf), 31, this.isFollowing), 31, this.inCollection), 31), 31), 31), 31, this.formatListType);
        Map<String, String> map = this.formatListAttributes;
        int iHashCode = (iM77243b + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.madeForName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.madeForUsername;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isOnDemandInFree;
        return Boolean.hashCode(this.isBook) + ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final boolean isBook() {
        return this.isBook;
    }

    public final boolean isCollaborative() {
        return this.isCollaborative;
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    /* JADX INFO: renamed from: isLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed */
    public final boolean m20325x1b2a86c2() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: isOnDemandInFree$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed */
    public final Boolean m20326x430dfd6f() {
        return this.isOnDemandInFree;
    }

    public final boolean isOwnedBySelf() {
        return this.isOwnedBySelf;
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel destination, int flags) {
        destination.writeString(getLink());
        destination.writeString(getCollectionLink());
        destination.writeString(getName());
        destination.writeString(m20321xcf36ce4d());
        destination.writeString(m20324x53726e04());
        destination.writeString(m20322x2268bd67());
        destination.writeString(getOwnerName());
        destination.writeString(getPublisher());
        destination.writeString(getArtistName());
        destination.writeString(getSubtitle());
        destination.writeString(getMediaType());
        destination.writeString(getFormatListType());
        destination.writeInt(getAvailable() ? 1 : 0);
        destination.writeInt(isCollaborative() ? 1 : 0);
        destination.writeInt(m20325x1b2a86c2() ? 1 : 0);
        destination.writeInt(isOwnedBySelf() ? 1 : 0);
        destination.writeInt(isFollowing() ? 1 : 0);
        destination.writeInt(getInCollection() ? 1 : 0);
        if (m20326x430dfd6f() != null) {
            destination.writeInt(m20326x430dfd6f().booleanValue() ? 1 : 0);
        } else {
            destination.writeInt(-1);
        }
        destination.writeInt(getNumTracks());
        destination.writeInt(getTracksInCollectionCount());
        destination.writeInt(m20323x9f204d96());
        Map<String, String> mapM20320x2877cc92 = m20320x2877cc92();
        if (mapM20320x2877cc92 == null) {
            mapM20320x2877cc92 = nau.f152117a;
        }
        Iterator itM91403l = xl81.m91403l(destination, mapM20320x2877cc92);
        while (itM91403l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM91403l.next();
            entry.getKey().getClass();
            entry.getValue().getClass();
            String str = (String) entry.getKey();
            str.getClass();
            destination.writeString(str);
            String str2 = (String) entry.getValue();
            str2.getClass();
            destination.writeString(str2);
        }
        destination.writeString(getMadeForName());
        destination.writeString(getMadeForUsername());
        destination.writeInt(isBook() ? 1 : 0);
    }
}
