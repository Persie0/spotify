package com.spotify.interapp.model;

import com.spotify.player.model.PlayerState;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\n\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005¨\u0006\u0011"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$Repeat", "Lcom/spotify/interapp/model/a;", "", "repeat", "<init>", "(Ljava/lang/Integer;)V", "Lcom/spotify/interapp/model/AppProtocol$Repeat;", "copy", "(Ljava/lang/Integer;)Lcom/spotify/interapp/model/AppProtocol$Repeat;", "c", "Ljava/lang/Integer;", "getRepeat", "()Ljava/lang/Integer;", "setRepeat", "getRepeat$annotations", "()V", "p/tc5", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class AppProtocol$Repeat extends AbstractC0800a {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f4379d = 0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Integer repeat;

    public AppProtocol$Repeat(@gk60(name = "repeat") Integer num) {
        this.repeat = num;
    }

    @gk60(name = "repeat")
    public static /* synthetic */ void getRepeat$annotations() {
    }

    public final AppProtocol$Repeat copy(@gk60(name = "repeat") Integer repeat) {
        return new AppProtocol$Repeat(repeat);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppProtocol$Repeat) && wj50.m88271j(this.repeat, ((AppProtocol$Repeat) obj).repeat);
    }

    public final int hashCode() {
        Integer num = this.repeat;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    /* JADX WARN: Illegal instructions before constructor call */
    public AppProtocol$Repeat(PlayerState playerState) {
        int i;
        if (playerState == null) {
            i = 0;
        } else if (playerState.options().repeatingTrack()) {
            i = 1;
        } else if (playerState.options().repeatingContext()) {
            i = 2;
        } else {
            i = 0;
        }
        this(Integer.valueOf(i));
    }
}
