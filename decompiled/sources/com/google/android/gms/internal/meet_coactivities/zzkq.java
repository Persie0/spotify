package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
final class zzkq extends zzlz {
    private static final zzln zza = new zzkp();
    private final AtomicLong zzb = new AtomicLong(2147483647L);

    public static zzlz zza(zzms zzmsVar, zzll zzllVar) {
        Integer num = (Integer) zzmsVar.zzc(zzle.zzb);
        if (num == null) {
            return null;
        }
        zzkq zzkqVar = (zzkq) zza.zzb(zzllVar, zzmsVar);
        return zzkqVar.zzb.incrementAndGet() >= ((long) num.intValue()) ? zzkqVar : zzlz.zzc;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzlz
    public final void zzb() {
        this.zzb.set(0L);
    }
}
