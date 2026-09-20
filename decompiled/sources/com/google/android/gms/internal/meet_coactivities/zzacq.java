package com.google.android.gms.internal.meet_coactivities;

import androidx.media3.session.legacy.PlaybackStateCompat;

/* JADX INFO: loaded from: classes4.dex */
final class zzacq {
    private long zza;
    private long zzb;
    private volatile boolean zzc;

    public zzacq(int i) {
    }

    public final synchronized boolean zza(long j) {
        long j2 = this.zzb;
        if (j2 - j >= 0) {
            j = j2;
        }
        this.zzb = j;
        if (this.zza - j >= PlaybackStateCompat.ACTION_PREPARE_FROM_URI || !this.zzc) {
            return false;
        }
        this.zzc = false;
        return true;
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public final synchronized boolean zzc(long j) {
        long j2 = this.zza + j;
        this.zza = j2;
        if (j2 - this.zzb < PlaybackStateCompat.ACTION_PREPARE_FROM_URI || this.zzc) {
            return false;
        }
        this.zzc = true;
        return true;
    }
}
