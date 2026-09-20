package com.spotify.interapp.model;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\t\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\t\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\t\u0012\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006\u0018"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$LogMessage", "Lcom/spotify/interapp/model/a;", "", "message", "severity", ContextTrack.Metadata.KEY_TITLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "c", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getMessage$annotations", "()V", "d", "getSeverity", "setSeverity", "getSeverity$annotations", "e", "getTitle", "setTitle", "getTitle$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$LogMessage extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String message;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String severity;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String title;

    public AppProtocol$LogMessage(@gk60(name = "message") String str, @gk60(name = "severity") String str2, @gk60(name = ContextTrack.Metadata.KEY_TITLE) String str3) {
        this.message = str;
        this.severity = str2;
        this.title = str3;
    }

    @gk60(name = "message")
    public static /* synthetic */ void getMessage$annotations() {
    }

    @gk60(name = "severity")
    public static /* synthetic */ void getSeverity$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_TITLE)
    public static /* synthetic */ void getTitle$annotations() {
    }
}
