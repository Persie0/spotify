package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
final class zzkt extends zzlz {
    private static final zzln zza = new zzkr();
    private final AtomicLong zzb = new AtomicLong(-1);

    public static zzlz zza(zzms zzmsVar, zzll zzllVar, long j) {
        if (((zzks) zzmsVar.zzc(zzle.zzd)) == null) {
            return null;
        }
        zzkt zzktVar = (zzkt) zza.zzb(zzllVar, zzmsVar);
        zzpj.zzc(j >= 0, "timestamp cannot be negative");
        long j2 = zzktVar.zzb.get();
        if (j2 >= 0) {
            throw null;
        }
        zzktVar.zzb.compareAndSet(j2, -j);
        return zzktVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzlz
    public final void zzb() {
        this.zzb.set(Math.max(-this.zzb.get(), 0L));
    }
}
