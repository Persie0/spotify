package com.spotify.interapp.model;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b6\b\u0007\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u0012\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u0012\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b!\u0010\u0012\u0012\u0004\b$\u0010\u0018\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010\u0012\u0012\u0004\b(\u0010\u0018\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R*\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b)\u0010\u0012\u0012\u0004\b,\u0010\u0018\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R*\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u0010\u0018\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u0010.\u0012\u0004\b7\u0010\u0018\u001a\u0004\b5\u00100\"\u0004\b6\u00102R*\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b8\u0010.\u0012\u0004\b;\u0010\u0018\u001a\u0004\b9\u00100\"\u0004\b:\u00102R*\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bB\u0010\u0018\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006C"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$ListItem", "Lcom/spotify/interapp/model/a;", "", "id", "uid", "uri", "imageUri", ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_SUBTITLE, "", "playable", "hasChildren", "availableOffline", "Lcom/spotify/interapp/model/AppProtocol$Metadata;", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/spotify/interapp/model/AppProtocol$Metadata;)V", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getId$annotations", "()V", "d", "getUid", "setUid", "getUid$annotations", "e", "getUri", "setUri", "getUri$annotations", "f", "getImageUri", "setImageUri", "getImageUri$annotations", "g", "getTitle", "setTitle", "getTitle$annotations", "h", "getSubtitle", "setSubtitle", "getSubtitle$annotations", "i", "Ljava/lang/Boolean;", "getPlayable", "()Ljava/lang/Boolean;", "setPlayable", "(Ljava/lang/Boolean;)V", "getPlayable$annotations", "j", "getHasChildren", "setHasChildren", "getHasChildren$annotations", "k", "getAvailableOffline", "setAvailableOffline", "getAvailableOffline$annotations", "l", "Lcom/spotify/interapp/model/AppProtocol$Metadata;", "getMetadata", "()Lcom/spotify/interapp/model/AppProtocol$Metadata;", "setMetadata", "(Lcom/spotify/interapp/model/AppProtocol$Metadata;)V", "getMetadata$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$ListItem extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String uid;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String uri;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String imageUri;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final String subtitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final Boolean playable;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final Boolean hasChildren;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final Boolean availableOffline;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final AppProtocol$Metadata metadata;

    public AppProtocol$ListItem(@gk60(name = "id") String str, @gk60(name = "uid") String str2, @gk60(name = "uri") String str3, @gk60(name = "image_id") String str4, @gk60(name = ContextTrack.Metadata.KEY_TITLE) String str5, @gk60(name = ContextTrack.Metadata.KEY_SUBTITLE) String str6, @gk60(name = "playable") Boolean bool, @gk60(name = "has_children") Boolean bool2, @gk60(name = "available_offline") Boolean bool3, @gk60(name = "metadata") AppProtocol$Metadata appProtocol$Metadata) {
        this.id = str;
        this.uid = str2;
        this.uri = str3;
        this.imageUri = str4;
        this.title = str5;
        this.subtitle = str6;
        this.playable = bool;
        this.hasChildren = bool2;
        this.availableOffline = bool3;
        this.metadata = appProtocol$Metadata;
    }

    @gk60(name = "available_offline")
    public static /* synthetic */ void getAvailableOffline$annotations() {
    }

    @gk60(name = "has_children")
    public static /* synthetic */ void getHasChildren$annotations() {
    }

    @gk60(name = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @gk60(name = "image_id")
    public static /* synthetic */ void getImageUri$annotations() {
    }

    @gk60(name = "metadata")
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @gk60(name = "playable")
    public static /* synthetic */ void getPlayable$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_SUBTITLE)
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_TITLE)
    public static /* synthetic */ void getTitle$annotations() {
    }

    @gk60(name = "uid")
    public static /* synthetic */ void getUid$annotations() {
    }

    @gk60(name = "uri")
    public static /* synthetic */ void getUri$annotations() {
    }
}
