package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzais implements zzalc {
    final zzafa zza;
    boolean zzb = false;
    final /* synthetic */ zzaiu zzc;

    public zzais(zzaiu zzaiuVar, zzafa zzafaVar) {
        this.zzc = zzaiuVar;
        this.zza = zzafaVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzalc
    public final zzvz zza(zzvz zzvzVar) {
        Iterator it = this.zzc.zzi.iterator();
        if (!it.hasNext()) {
            return zzvzVar;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzalc
    public final void zzb(boolean z) {
        zzaiu.zzC(this.zzc, this.zza, z);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzalc
    public final void zzc() {
        this.zzc.zzh.zza(2, "READY");
        zzabm zzabmVar = this.zzc.zzj;
        zzabmVar.zzc(new zzaip(this));
        zzabmVar.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzalc
    public final void zzd(zzabe zzabeVar) {
        zzwh zzwhVar = this.zzc.zzh;
        zzyj zzyjVarZzc = this.zza.zzc();
        zzaiu zzaiuVar = this.zzc;
        zzwhVar.zzb(2, "{0} SHUTDOWN with {1}", zzyjVarZzc, zzaiu.zzK(zzabeVar));
        this.zzb = true;
        zzabm zzabmVar = this.zzc.zzj;
        zzabmVar.zzc(new zzaiq(this, zzabeVar));
        zzabmVar.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzalc
    public final void zze() {
        c95.m31856v(this.zzb, "transportShutdown() must be called before transportTerminated().");
        this.zzc.zzh.zzb(2, "{0} Terminated", this.zza.zzc());
        this.zzc.zzf.zze(this.zza);
        zzaiu.zzC(this.zzc, this.zza, false);
        Iterator it = this.zzc.zzi.iterator();
        if (it.hasNext()) {
            this.zza.zzo();
            throw null;
        }
        zzabm zzabmVar = this.zzc.zzj;
        zzabmVar.zzc(new zzair(this));
        zzabmVar.zzb();
    }
}
