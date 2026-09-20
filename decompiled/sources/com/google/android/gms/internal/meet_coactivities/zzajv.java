package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.ScheduledExecutorService;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzajv extends zzyu {
    zzadw zza;
    final /* synthetic */ zzakp zzb;

    public /* synthetic */ zzajv(zzakp zzakpVar, zzaju zzajuVar) {
        this.zzb = zzakpVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public final /* bridge */ /* synthetic */ zzzb zza(zzyr zzyrVar) {
        this.zzb.zzd.zzd();
        c95.m31856v(!this.zzb.zzO, "Channel is being terminated");
        return new zzakm(this.zzb, zzyrVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public final zzabm zzb() {
        return this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public final ScheduledExecutorService zzc() {
        return this.zzb.zzq;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public final void zzd() {
        this.zzb.zzd.zzd();
        zzajs zzajsVar = new zzajs(this);
        zzabm zzabmVar = this.zzb.zzd;
        zzabmVar.zzc(zzajsVar);
        zzabmVar.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public final void zze(zzxa zzxaVar, zzzc zzzcVar) {
        this.zzb.zzd.zzd();
        c95.m31848n(zzxaVar, "newState");
        c95.m31848n(zzzcVar, "newPicker");
        zzajt zzajtVar = new zzajt(this, zzzcVar, zzxaVar);
        zzabm zzabmVar = this.zzb.zzd;
        zzabmVar.zzc(zzajtVar);
        zzabmVar.zzb();
    }
}
