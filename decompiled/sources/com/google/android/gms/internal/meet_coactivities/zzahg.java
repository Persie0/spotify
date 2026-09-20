package com.google.android.gms.internal.meet_coactivities;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahg {
    private final Random zza = new Random();
    private final long zzb;
    private final long zzc;
    private long zzd;

    public zzahg() {
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.zzb = nanos;
        this.zzc = TimeUnit.MINUTES.toNanos(2L);
        this.zzd = nanos;
    }

    public final long zza() {
        long j = this.zzd;
        double d = j;
        this.zzd = Math.min((long) (1.6d * d), this.zzc);
        double d2 = 0.2d * d;
        double d3 = d * (-0.2d);
        c95.m31843i(d2 >= d3);
        return j + ((long) ((this.zza.nextDouble() * (d2 - d3)) + d3));
    }
}
