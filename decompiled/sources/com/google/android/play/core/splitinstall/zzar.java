package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import p204p.ev61;

/* JADX INFO: loaded from: classes4.dex */
final class zzar extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ ev61 zza;
    final /* synthetic */ zzbc zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(zzbc zzbcVar, ev61 ev61Var, ev61 ev61Var2) {
        super(ev61Var);
        this.zzb = zzbcVar;
        this.zza = ev61Var2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        try {
            ?? Zze = this.zzb.zza.zze();
            zzbc zzbcVar = this.zzb;
            Zze.zzi(zzbcVar.zzd, new zzaz(zzbcVar, this.zza));
        } catch (RemoteException e) {
            zzbc.zzb.zzc(e, "getSessionStates", new Object[0]);
            this.zza.m40098c(new RuntimeException(e));
        }
    }
}
