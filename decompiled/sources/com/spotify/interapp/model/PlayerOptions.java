package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/interapp/model/PlayerOptions;", "", "", "shuffle", "", "repeat", "<init>", "(ZI)V", "a", "Z", "getShuffle", "()Z", "getShuffle$annotations", "()V", "b", "I", "getRepeat", "()I", "getRepeat$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class PlayerOptions {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean shuffle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int repeat;

    public PlayerOptions(@gk60(name = "shuffle") boolean z, @gk60(name = "repeat") int i) {
        this.shuffle = z;
        this.repeat = i;
    }

    @gk60(name = "repeat")
    public static /* synthetic */ void getRepeat$annotations() {
    }

    @gk60(name = "shuffle")
    public static /* synthetic */ void getShuffle$annotations() {
    }
}
