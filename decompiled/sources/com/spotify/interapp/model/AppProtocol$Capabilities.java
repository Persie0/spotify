package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\n\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005¨\u0006\u0010"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$Capabilities", "Lcom/spotify/interapp/model/a;", "", "canPlayOnDemand", "<init>", "(Ljava/lang/Boolean;)V", "Lcom/spotify/interapp/model/AppProtocol$Capabilities;", "copy", "(Ljava/lang/Boolean;)Lcom/spotify/interapp/model/AppProtocol$Capabilities;", "c", "Ljava/lang/Boolean;", "getCanPlayOnDemand", "()Ljava/lang/Boolean;", "setCanPlayOnDemand", "getCanPlayOnDemand$annotations", "()V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class AppProtocol$Capabilities extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Boolean canPlayOnDemand;

    public AppProtocol$Capabilities(@gk60(name = "can_play_on_demand") Boolean bool) {
        this.canPlayOnDemand = bool;
    }

    @gk60(name = "can_play_on_demand")
    public static /* synthetic */ void getCanPlayOnDemand$annotations() {
    }

    public final AppProtocol$Capabilities copy(@gk60(name = "can_play_on_demand") Boolean canPlayOnDemand) {
        return new AppProtocol$Capabilities(canPlayOnDemand);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppProtocol$Capabilities) && wj50.m88271j(this.canPlayOnDemand, ((AppProtocol$Capabilities) obj).canPlayOnDemand);
    }

    public final int hashCode() {
        Boolean bool = this.canPlayOnDemand;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
