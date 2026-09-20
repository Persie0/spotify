package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p204p.dq60;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxj implements Comparable {
    public static final /* synthetic */ int zza = 0;
    private static final zzxh zzb = new zzxh(null);
    private static final long zzc;
    private static final long zzd;
    private static final long zze;
    private final zzxi zzf;
    private final long zzg;
    private volatile boolean zzh;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        zzc = nanos;
        zzd = -nanos;
        zze = TimeUnit.SECONDS.toNanos(1L);
    }

    private zzxj(zzxi zzxiVar, long j, long j2, boolean z) {
        this.zzf = zzxiVar;
        long jMin = Math.min(zzc, Math.max(zzd, j2));
        this.zzg = j + jMin;
        this.zzh = jMin <= 0;
    }

    public static zzxj zzc(long j, TimeUnit timeUnit) {
        zzxh zzxhVar = zzb;
        if (timeUnit == null) {
            throw new NullPointerException("units");
        }
        return new zzxj(zzxhVar, System.nanoTime(), timeUnit.toNanos(j), true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzxj)) {
            return false;
        }
        zzxj zzxjVar = (zzxj) obj;
        return this.zzf == zzxjVar.zzf && this.zzg == zzxjVar.zzg;
    }

    public final int hashCode() {
        return Arrays.asList(this.zzf, Long.valueOf(this.zzg)).hashCode();
    }

    public final String toString() {
        long jZzb = zzb(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jZzb);
        long j = zze;
        long j2 = jAbs / j;
        long jAbs2 = Math.abs(jZzb) % j;
        StringBuilder sb = new StringBuilder();
        if (jZzb < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        zzxi zzxiVar = this.zzf;
        if (zzxiVar != zzb) {
            sb.append(" (ticker=" + zzxiVar.toString() + ")");
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxj zzxjVar) {
        zzxi zzxiVar = this.zzf;
        if (zzxiVar != zzxjVar.zzf) {
            throw new AssertionError(dq60.m36615o("Tickers (", zzxiVar.toString(), " and ", zzxjVar.zzf.toString(), ") don't match. Custom Ticker should only be used in tests!"));
        }
        long j = this.zzg - zzxjVar.zzg;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public final long zzb(TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        if (!this.zzh && this.zzg - jNanoTime <= 0) {
            this.zzh = true;
        }
        return timeUnit.convert(this.zzg - jNanoTime, TimeUnit.NANOSECONDS);
    }

    public final boolean zzd() {
        if (!this.zzh) {
            if (this.zzg - System.nanoTime() > 0) {
                return false;
            }
            this.zzh = true;
        }
        return true;
    }
}
