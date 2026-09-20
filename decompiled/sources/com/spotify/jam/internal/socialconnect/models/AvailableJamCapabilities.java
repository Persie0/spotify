package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\n¨\u0006\r"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/AvailableJamCapabilities;", "", "", "blockHost", "<init>", "(Z)V", "copy", "(Z)Lcom/spotify/jam/internal/socialconnect/models/AvailableJamCapabilities;", "a", "Z", "()Z", "getBlockHost$annotations", "()V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class AvailableJamCapabilities {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean blockHost;

    public AvailableJamCapabilities(@gk60(name = "block_host") boolean z) {
        this.blockHost = z;
    }

    @gk60(name = "block_host")
    public static /* synthetic */ void getBlockHost$annotations() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getBlockHost() {
        return this.blockHost;
    }

    public final AvailableJamCapabilities copy(@gk60(name = "block_host") boolean blockHost) {
        return new AvailableJamCapabilities(blockHost);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvailableJamCapabilities) && this.blockHost == ((AvailableJamCapabilities) obj).blockHost;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.blockHost);
    }

    public /* synthetic */ AvailableJamCapabilities(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
