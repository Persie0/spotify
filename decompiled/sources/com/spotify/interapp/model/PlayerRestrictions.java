package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\r\u0012\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0012\u0010\u000fR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u0012\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0015\u0010\u000fR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u0012\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0018\u0010\u000fR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\r\u0012\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001b\u0010\u000fR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\r\u0012\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001e\u0010\u000f¨\u0006 "}, m24212d2 = {"Lcom/spotify/interapp/model/PlayerRestrictions;", "", "", "canSkipNext", "canSkipPrev", "canRepeatTrack", "canRepeatContext", "canToggleShuffle", "canSeek", "<init>", "(ZZZZZZ)V", "()V", "a", "Z", "getCanSkipNext", "()Z", "getCanSkipNext$annotations", "b", "getCanSkipPrev", "getCanSkipPrev$annotations", "c", "getCanRepeatTrack", "getCanRepeatTrack$annotations", "d", "getCanRepeatContext", "getCanRepeatContext$annotations", "e", "getCanToggleShuffle", "getCanToggleShuffle$annotations", "f", "getCanSeek", "getCanSeek$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class PlayerRestrictions {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean canSkipNext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean canSkipPrev;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean canRepeatTrack;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean canRepeatContext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean canToggleShuffle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean canSeek;

    public PlayerRestrictions(@gk60(name = "can_skip_next") boolean z, @gk60(name = "can_skip_prev") boolean z2, @gk60(name = "can_repeat_track") boolean z3, @gk60(name = "can_repeat_context") boolean z4, @gk60(name = "can_toggle_shuffle") boolean z5, @gk60(name = "can_seek") boolean z6) {
        this.canSkipNext = z;
        this.canSkipPrev = z2;
        this.canRepeatTrack = z3;
        this.canRepeatContext = z4;
        this.canToggleShuffle = z5;
        this.canSeek = z6;
    }

    @gk60(name = "can_repeat_context")
    public static /* synthetic */ void getCanRepeatContext$annotations() {
    }

    @gk60(name = "can_repeat_track")
    public static /* synthetic */ void getCanRepeatTrack$annotations() {
    }

    @gk60(name = "can_seek")
    public static /* synthetic */ void getCanSeek$annotations() {
    }

    @gk60(name = "can_skip_next")
    public static /* synthetic */ void getCanSkipNext$annotations() {
    }

    @gk60(name = "can_skip_prev")
    public static /* synthetic */ void getCanSkipPrev$annotations() {
    }

    @gk60(name = "can_toggle_shuffle")
    public static /* synthetic */ void getCanToggleShuffle$annotations() {
    }

    public PlayerRestrictions() {
        this(false, false, false, false, false, false);
    }
}
