package com.google.android.gms.internal.meet_coactivities;

import com.spotify.playbacknative.AudioDriver;

/* JADX INFO: loaded from: classes4.dex */
final class zzsj {
    private final Object zza;
    private final int zzb;

    public zzsj(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzsj)) {
            return false;
        }
        zzsj zzsjVar = (zzsj) obj;
        return this.zza == zzsjVar.zza && this.zzb == zzsjVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * AudioDriver.SPOTIFY_MAX_VOLUME) + this.zzb;
    }
}
