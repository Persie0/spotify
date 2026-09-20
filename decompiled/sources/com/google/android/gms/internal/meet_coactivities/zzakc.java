package com.google.android.gms.internal.meet_coactivities;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
final class zzakc implements Runnable {
    final /* synthetic */ zzakf zza;
    final /* synthetic */ zzakh zzb;

    public zzakc(zzakh zzakhVar, zzakf zzakfVar) {
        this.zza = zzakfVar;
        this.zzb = zzakhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb.zzb.get() != zzakp.zzg) {
            this.zza.zzl();
            return;
        }
        zzakh zzakhVar = this.zzb;
        if (zzakhVar.zza.zzI == null) {
            zzakhVar.zza.zzI = new LinkedHashSet();
            zzakp zzakpVar = this.zzb.zza;
            zzakpVar.zze.zzc(zzakpVar.zzJ, true);
        }
        zzakh zzakhVar2 = this.zzb;
        zzakhVar2.zza.zzI.add(this.zza);
    }
}
