package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\t\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u0003\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$CrossfadeState", "Lcom/spotify/interapp/model/a;", "", "isEnabled", "", "duration", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "isEnabled$annotations", "()V", "d", "Ljava/lang/Integer;", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", "getDuration$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$CrossfadeState extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Boolean isEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Integer duration;

    public AppProtocol$CrossfadeState(@gk60(name = "isEnabled") Boolean bool, @gk60(name = "duration") Integer num) {
        this.isEnabled = bool;
        this.duration = num;
    }

    @gk60(name = "duration")
    public static /* synthetic */ void getDuration$annotations() {
    }

    @gk60(name = "isEnabled")
    public static /* synthetic */ void isEnabled$annotations() {
    }
}
