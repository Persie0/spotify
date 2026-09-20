package com.google.android.play.core.splitinstall.internal;

import p204p.ev61;

/* JADX INFO: loaded from: classes4.dex */
final class zzy extends zzv {
    final /* synthetic */ ev61 zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ zzaf zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(zzaf zzafVar, ev61 ev61Var, ev61 ev61Var2, zzv zzvVar) {
        super(ev61Var);
        this.zzc = zzafVar;
        this.zza = ev61Var2;
        this.zzb = zzvVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        synchronized (this.zzc.zzg) {
            try {
                zzaf.zzn(this.zzc, this.zza);
                if (this.zzc.zzl.getAndIncrement() > 0) {
                    this.zzc.zzc.zzd("Already connected to the service.", new Object[0]);
                }
                zzaf.zzp(this.zzc, this.zzb);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
