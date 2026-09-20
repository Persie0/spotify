package com.spotify.interapp.model;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Locale;
import kotlin.Metadata;
import p204p.bif1;
import p204p.gk60;
import p204p.hcj0;
import p204p.ok60;
import p204p.v4j0;
import p204p.wj50;
import p204p.xxv;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0094\u0001\u0010\u0012\u001a\u00020\u00112\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u0015\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b \u0010\u0015\u0012\u0004\b#\u0010\u001b\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b$\u0010\u0015\u0012\u0004\b'\u0010\u001b\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010\u0015\u0012\u0004\b+\u0010\u001b\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010\u0019R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010-\u0012\u0004\b2\u0010\u001b\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b3\u0010-\u0012\u0004\b6\u0010\u001b\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R*\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b7\u0010-\u0012\u0004\b:\u0010\u001b\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R*\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010-\u0012\u0004\b>\u0010\u001b\u001a\u0004\b<\u0010/\"\u0004\b=\u00101R*\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b?\u0010-\u0012\u0004\bB\u0010\u001b\u001a\u0004\b@\u0010/\"\u0004\bA\u00101R*\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bC\u0010-\u0012\u0004\bF\u0010\u001b\u001a\u0004\bD\u0010/\"\u0004\bE\u00101¨\u0006G"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$Context", "Lcom/spotify/interapp/model/a;", "", "id", "uri", ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_SUBTITLE, "type", "", "repeatTrack", "repeatContext", "shuffle", "canRepeatTrack", "canRepeatContext", "canShuffle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lcom/spotify/interapp/model/AppProtocol$Context;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/spotify/interapp/model/AppProtocol$Context;", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getId$annotations", "()V", "d", "getUri", "setUri", "getUri$annotations", "e", "getTitle", "setTitle", "getTitle$annotations", "f", "getSubtitle", "setSubtitle", "getSubtitle$annotations", "g", "getType", "setType", "getType$annotations", "h", "Ljava/lang/Boolean;", "getRepeatTrack", "()Ljava/lang/Boolean;", "setRepeatTrack", "(Ljava/lang/Boolean;)V", "getRepeatTrack$annotations", "i", "getRepeatContext", "setRepeatContext", "getRepeatContext$annotations", "j", "getShuffle", "setShuffle", "getShuffle$annotations", "k", "getCanRepeatTrack", "setCanRepeatTrack", "getCanRepeatTrack$annotations", "l", "getCanRepeatContext", "setCanRepeatContext", "getCanRepeatContext$annotations", "m", "getCanShuffle", "setCanShuffle", "getCanShuffle$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class AppProtocol$Context extends AbstractC0800a {

    /* JADX INFO: renamed from: n */
    public static final AppProtocol$Context f4294n = new AppProtocol$Context("", "", null, null, "no_context", null, null, null, null, null, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String uri;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String subtitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String type;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final Boolean repeatTrack;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final Boolean repeatContext;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final Boolean shuffle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final Boolean canRepeatTrack;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final Boolean canRepeatContext;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final Boolean canShuffle;

    public AppProtocol$Context(@gk60(name = "id") String str, @gk60(name = "uri") String str2, @gk60(name = ContextTrack.Metadata.KEY_TITLE) String str3, @gk60(name = ContextTrack.Metadata.KEY_SUBTITLE) String str4, @gk60(name = "type") String str5, @gk60(name = "repeat_track") Boolean bool, @gk60(name = "repeat_context") Boolean bool2, @gk60(name = "shuffle") Boolean bool3, @gk60(name = "can_repeat_track") Boolean bool4, @gk60(name = "can_repeat_context") Boolean bool5, @gk60(name = "can_shuffle") Boolean bool6) {
        this.id = str;
        this.uri = str2;
        this.title = str3;
        this.subtitle = str4;
        this.type = str5;
        this.repeatTrack = bool;
        this.repeatContext = bool2;
        this.shuffle = bool3;
        this.canRepeatTrack = bool4;
        this.canRepeatContext = bool5;
        this.canShuffle = bool6;
    }

    @gk60(name = "can_repeat_context")
    public static /* synthetic */ void getCanRepeatContext$annotations() {
    }

    @gk60(name = "can_repeat_track")
    public static /* synthetic */ void getCanRepeatTrack$annotations() {
    }

    @gk60(name = "can_shuffle")
    public static /* synthetic */ void getCanShuffle$annotations() {
    }

    @gk60(name = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @gk60(name = "repeat_context")
    public static /* synthetic */ void getRepeatContext$annotations() {
    }

    @gk60(name = "repeat_track")
    public static /* synthetic */ void getRepeatTrack$annotations() {
    }

    @gk60(name = "shuffle")
    public static /* synthetic */ void getShuffle$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_SUBTITLE)
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_TITLE)
    public static /* synthetic */ void getTitle$annotations() {
    }

    @gk60(name = "type")
    public static /* synthetic */ void getType$annotations() {
    }

    @gk60(name = "uri")
    public static /* synthetic */ void getUri$annotations() {
    }

    public final AppProtocol$Context copy(@gk60(name = "id") String id, @gk60(name = "uri") String uri, @gk60(name = ContextTrack.Metadata.KEY_TITLE) String title, @gk60(name = ContextTrack.Metadata.KEY_SUBTITLE) String subtitle, @gk60(name = "type") String type, @gk60(name = "repeat_track") Boolean repeatTrack, @gk60(name = "repeat_context") Boolean repeatContext, @gk60(name = "shuffle") Boolean shuffle, @gk60(name = "can_repeat_track") Boolean canRepeatTrack, @gk60(name = "can_repeat_context") Boolean canRepeatContext, @gk60(name = "can_shuffle") Boolean canShuffle) {
        return new AppProtocol$Context(id, uri, title, subtitle, type, repeatTrack, repeatContext, shuffle, canRepeatTrack, canRepeatContext, canShuffle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppProtocol$Context)) {
            return false;
        }
        AppProtocol$Context appProtocol$Context = (AppProtocol$Context) obj;
        return wj50.m88271j(this.id, appProtocol$Context.id) && wj50.m88271j(this.uri, appProtocol$Context.uri) && wj50.m88271j(this.title, appProtocol$Context.title) && wj50.m88271j(this.subtitle, appProtocol$Context.subtitle) && wj50.m88271j(this.type, appProtocol$Context.type) && wj50.m88271j(this.repeatTrack, appProtocol$Context.repeatTrack) && wj50.m88271j(this.repeatContext, appProtocol$Context.repeatContext) && wj50.m88271j(this.shuffle, appProtocol$Context.shuffle) && wj50.m88271j(this.canRepeatTrack, appProtocol$Context.canRepeatTrack) && wj50.m88271j(this.canRepeatContext, appProtocol$Context.canRepeatContext) && wj50.m88271j(this.canShuffle, appProtocol$Context.canShuffle);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uri;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.repeatTrack;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.repeatContext;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.shuffle;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canRepeatTrack;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canRepeatContext;
        int iHashCode10 = (iHashCode9 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.canShuffle;
        return iHashCode10 + (bool6 != null ? bool6.hashCode() : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppProtocol$Context(v4j0 v4j0Var, PlayerState playerState) {
        String strM29339t = bif1.m29339t(playerState.contextUri());
        String strM29339t2 = bif1.m29339t(playerState.contextUri());
        String str = v4j0Var.f237190b;
        String str2 = v4j0Var.f237189a;
        xxv.f267092c.getClass();
        this(strM29339t, strM29339t2, str, str2, hcj0.m47123c(playerState).name().toLowerCase(Locale.US), Boolean.valueOf(playerState.options().repeatingTrack()), Boolean.valueOf(playerState.options().repeatingContext()), Boolean.valueOf(playerState.options().shufflingContext()), Boolean.valueOf(playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()), Boolean.valueOf(playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty()), Boolean.valueOf(playerState.restrictions().disallowTogglingShuffleReasons().isEmpty()));
    }
}
