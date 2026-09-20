package com.google.android.gms.internal.meet_coactivities;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
final class zzmc extends zzlz {
    private static final zzln zzb = new zzma();
    private static final ThreadLocal zze = new zzmb();
    final AtomicInteger zza = new AtomicInteger();

    public static zzlz zza(zzms zzmsVar, zzll zzllVar) {
        Integer num = (Integer) zzmsVar.zzc(zzle.zzc);
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        zzmc zzmcVar = (zzmc) zzb.zzb(zzllVar, zzmsVar);
        return (((Random) zze.get()).nextInt(num.intValue()) == 0 ? zzmcVar.zza.incrementAndGet() : zzmcVar.zza.get()) > 0 ? zzmcVar : zzlz.zzc;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzlz
    public final void zzb() {
        this.zza.decrementAndGet();
    }
}
