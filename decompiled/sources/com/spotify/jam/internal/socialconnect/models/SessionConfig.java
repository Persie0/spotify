package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\n¨\u0006\r"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/SessionConfig;", "", "", "receiveDegradedAdsExperience", "<init>", "(Z)V", "copy", "(Z)Lcom/spotify/jam/internal/socialconnect/models/SessionConfig;", "a", "Z", "()Z", "getReceiveDegradedAdsExperience$annotations", "()V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class SessionConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean receiveDegradedAdsExperience;

    public SessionConfig(@gk60(name = "receive_degraded_ads_experience") boolean z) {
        this.receiveDegradedAdsExperience = z;
    }

    @gk60(name = "receive_degraded_ads_experience")
    public static /* synthetic */ void getReceiveDegradedAdsExperience$annotations() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getReceiveDegradedAdsExperience() {
        return this.receiveDegradedAdsExperience;
    }

    public final SessionConfig copy(@gk60(name = "receive_degraded_ads_experience") boolean receiveDegradedAdsExperience) {
        return new SessionConfig(receiveDegradedAdsExperience);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SessionConfig) && this.receiveDegradedAdsExperience == ((SessionConfig) obj).receiveDegradedAdsExperience;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.receiveDegradedAdsExperience);
    }

    public /* synthetic */ SessionConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
