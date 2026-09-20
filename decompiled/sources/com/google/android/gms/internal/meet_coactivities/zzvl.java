package com.google.android.gms.internal.meet_coactivities;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class zzvl {
    final Unsafe zza;

    public zzvl(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j);

    public abstract float zzb(Object obj, long j);

    public abstract void zzc(Object obj, long j, boolean z);

    public abstract void zzd(Object obj, long j, byte b);

    public abstract void zze(Object obj, long j, double d);

    public abstract void zzf(Object obj, long j, float f);

    public abstract boolean zzg(Object obj, long j);
}
