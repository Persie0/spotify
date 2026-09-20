package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010\r\u0012\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0003\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\r\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0004\u0010\u000e\"\u0004\b\u0013\u0010\u0010R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u0016\u0012\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR*\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b \u0010\r\u0012\u0004\b\"\u0010\u000b\u001a\u0004\b\b\u0010\u000e\"\u0004\b!\u0010\u0010¨\u0006#"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$Metadata", "Lcom/spotify/interapp/model/a;", "", "isExplicitContent", "is19PlusContent", "", "duration", "timeLeft", "isPlayed", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "()V", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setExplicitContent", "(Ljava/lang/Boolean;)V", "isExplicitContent$annotations", "d", "set19PlusContent", "is19PlusContent$annotations", "e", "Ljava/lang/Long;", "getDuration", "()Ljava/lang/Long;", "setDuration", "(Ljava/lang/Long;)V", "getDuration$annotations", "f", "getTimeLeft", "setTimeLeft", "getTimeLeft$annotations", "g", "setPlayed", "isPlayed$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$Metadata extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public Boolean isExplicitContent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Boolean is19PlusContent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Long duration;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Long timeLeft;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public Boolean isPlayed;

    public AppProtocol$Metadata(@gk60(name = "is_explicit_content") Boolean bool, @gk60(name = "is_19_plus_content") Boolean bool2, @gk60(name = "duration_ms") Long l, @gk60(name = "time_left_ms") Long l2, @gk60(name = "is_played") Boolean bool3) {
        this.isExplicitContent = bool;
        this.is19PlusContent = bool2;
        this.duration = l;
        this.timeLeft = l2;
        this.isPlayed = bool3;
    }

    @gk60(name = "duration_ms")
    public static /* synthetic */ void getDuration$annotations() {
    }

    @gk60(name = "time_left_ms")
    public static /* synthetic */ void getTimeLeft$annotations() {
    }

    @gk60(name = "is_19_plus_content")
    public static /* synthetic */ void is19PlusContent$annotations() {
    }

    @gk60(name = "is_explicit_content")
    public static /* synthetic */ void isExplicitContent$annotations() {
    }

    @gk60(name = "is_played")
    public static /* synthetic */ void isPlayed$annotations() {
    }

    public AppProtocol$Metadata() {
        this(null, null, null, null, null);
    }
}
