package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class zzamf implements Runnable {
    final /* synthetic */ zzami zza;

    public /* synthetic */ zzamf(zzami zzamiVar, zzame zzameVar) {
        this.zza = zzamiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzami zzamiVar = this.zza;
        zzamg zzamgVar = null;
        if (!zzamiVar.zzf) {
            zzamiVar.zzg = null;
            return;
        }
        long jZzk = zzamiVar.zzk();
        if (zzamiVar.zze - jZzk > 0) {
            zzami zzamiVar2 = this.zza;
            zzamiVar2.zzg = zzamiVar2.zza.schedule(new zzamh(zzamiVar2, zzamgVar), zzamiVar2.zze - jZzk, TimeUnit.NANOSECONDS);
        } else {
            this.zza.zzf = false;
            this.zza.zzg = null;
            this.zza.zzc.run();
        }
    }
}
