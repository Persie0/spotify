package com.spotify.voiceassistants.playermodels;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import kotlin.Metadata;
import p204p.wj50;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/PlayContextWrapper;", "", "context", "Lcom/spotify/player/model/Context;", "playOptions", "Lcom/spotify/player/model/command/options/PreparePlayOptions;", "playOrigin", "Lcom/spotify/player/model/PlayOrigin;", "loggingParams", "Lcom/spotify/player/model/command/options/LoggingParams;", "<init>", "(Lcom/spotify/player/model/Context;Lcom/spotify/player/model/command/options/PreparePlayOptions;Lcom/spotify/player/model/PlayOrigin;Lcom/spotify/player/model/command/options/LoggingParams;)V", "getContext", "()Lcom/spotify/player/model/Context;", "getPlayOptions", "()Lcom/spotify/player/model/command/options/PreparePlayOptions;", "getPlayOrigin", "()Lcom/spotify/player/model/PlayOrigin;", "getLoggingParams", "()Lcom/spotify/player/model/command/options/LoggingParams;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class PlayContextWrapper {
    private final Context context;
    private final LoggingParams loggingParams;
    private final PreparePlayOptions playOptions;
    private final PlayOrigin playOrigin;

    public PlayContextWrapper(Context context, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams) {
        this.context = context;
        this.playOptions = preparePlayOptions;
        this.playOrigin = playOrigin;
        this.loggingParams = loggingParams;
    }

    public static /* synthetic */ PlayContextWrapper copy$default(PlayContextWrapper playContextWrapper, Context context, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams, int i, Object obj) {
        if ((i & 1) != 0) {
            context = playContextWrapper.context;
        }
        if ((i & 2) != 0) {
            preparePlayOptions = playContextWrapper.playOptions;
        }
        if ((i & 4) != 0) {
            playOrigin = playContextWrapper.playOrigin;
        }
        if ((i & 8) != 0) {
            loggingParams = playContextWrapper.loggingParams;
        }
        return playContextWrapper.copy(context, preparePlayOptions, playOrigin, loggingParams);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PreparePlayOptions getPlayOptions() {
        return this.playOptions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PlayOrigin getPlayOrigin() {
        return this.playOrigin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    public final PlayContextWrapper copy(Context context, PreparePlayOptions playOptions, PlayOrigin playOrigin, LoggingParams loggingParams) {
        return new PlayContextWrapper(context, playOptions, playOrigin, loggingParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayContextWrapper)) {
            return false;
        }
        PlayContextWrapper playContextWrapper = (PlayContextWrapper) other;
        return wj50.m88271j(this.context, playContextWrapper.context) && wj50.m88271j(this.playOptions, playContextWrapper.playOptions) && wj50.m88271j(this.playOrigin, playContextWrapper.playOrigin) && wj50.m88271j(this.loggingParams, playContextWrapper.loggingParams);
    }

    public final Context getContext() {
        return this.context;
    }

    public final LoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    public final PreparePlayOptions getPlayOptions() {
        return this.playOptions;
    }

    public final PlayOrigin getPlayOrigin() {
        return this.playOrigin;
    }

    public int hashCode() {
        Context context = this.context;
        int iHashCode = (context == null ? 0 : context.hashCode()) * 31;
        PreparePlayOptions preparePlayOptions = this.playOptions;
        int iHashCode2 = (iHashCode + (preparePlayOptions == null ? 0 : preparePlayOptions.hashCode())) * 31;
        PlayOrigin playOrigin = this.playOrigin;
        int iHashCode3 = (iHashCode2 + (playOrigin == null ? 0 : playOrigin.hashCode())) * 31;
        LoggingParams loggingParams = this.loggingParams;
        return iHashCode3 + (loggingParams != null ? loggingParams.hashCode() : 0);
    }

    public String toString() {
        return super.toString();
    }
}
