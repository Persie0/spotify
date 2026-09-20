package com.spotify.interapp.model;

import com.spotify.player.model.PlayerState;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.xul0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\t\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\t\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\t\u0012\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006\u0018"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$TrackElapsed", "Lcom/spotify/interapp/model/a;", "", "elapsedTime", "durationMs", "percentage", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "c", "Ljava/lang/Integer;", "getElapsedTime", "()Ljava/lang/Integer;", "setElapsedTime", "(Ljava/lang/Integer;)V", "getElapsedTime$annotations", "()V", "d", "getDurationMs", "setDurationMs", "getDurationMs$annotations", "e", "getPercentage", "setPercentage", "getPercentage$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$TrackElapsed extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Integer elapsedTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Integer durationMs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Integer percentage;

    public AppProtocol$TrackElapsed(@gk60(name = "elapsed_time") Integer num, @gk60(name = "duration_ms") Integer num2, @gk60(name = "percentage") Integer num3) {
        this.elapsedTime = num;
        this.durationMs = num2;
        this.percentage = num3;
    }

    @gk60(name = "duration_ms")
    public static /* synthetic */ void getDurationMs$annotations() {
    }

    @gk60(name = "elapsed_time")
    public static /* synthetic */ void getElapsedTime$annotations() {
    }

    @gk60(name = "percentage")
    public static /* synthetic */ void getPercentage$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppProtocol$TrackElapsed(PlayerState playerState) {
        xul0 xul0VarDuration;
        Long l;
        Long l2;
        xul0 xul0VarDuration2;
        Long l3;
        xul0 xul0VarPosition;
        Long l4;
        int i = 0;
        Integer numValueOf = Integer.valueOf((playerState == null || (xul0VarPosition = playerState.position(System.currentTimeMillis())) == null || (l4 = (Long) xul0VarPosition.mo49280e(0L)) == null) ? 0 : (int) l4.longValue());
        Integer numValueOf2 = Integer.valueOf((playerState == null || (xul0VarDuration2 = playerState.duration()) == null || (l3 = (Long) xul0VarDuration2.mo49280e(0L)) == null) ? 0 : (int) l3.longValue());
        if (playerState != null && (xul0VarDuration = playerState.duration()) != null && (l = (Long) xul0VarDuration.mo49280e(0L)) != null) {
            int iLongValue = (int) l.longValue();
            xul0 xul0VarPosition2 = playerState.position(System.currentTimeMillis());
            int iLongValue2 = (xul0VarPosition2 == null || (l2 = (Long) xul0VarPosition2.mo49280e(0L)) == null) ? 0 : (int) l2.longValue();
            if (iLongValue > 0) {
                i = (iLongValue2 * 100) / iLongValue;
            }
        }
        this(numValueOf, numValueOf2, Integer.valueOf(i));
    }
}
