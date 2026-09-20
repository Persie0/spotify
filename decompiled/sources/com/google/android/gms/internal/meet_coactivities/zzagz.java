package com.google.android.gms.internal.meet_coactivities;

import p204p.u651;

/* JADX INFO: loaded from: classes4.dex */
final class zzagz implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzaha zzb;

    public zzagz(zzaha zzahaVar, boolean z) {
        this.zza = z;
        this.zzb = zzahaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza) {
            zzahd zzahdVar = this.zzb.zza;
            zzahdVar.zzf = true;
            if (zzahdVar.zzt > 0) {
                u651 u651Var = zzahdVar.zzv;
                u651Var.f227227a = false;
                u651Var.m82435a();
            }
        }
        this.zzb.zza.zzA = false;
    }
}
