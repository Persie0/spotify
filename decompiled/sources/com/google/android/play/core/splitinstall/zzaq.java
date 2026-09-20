package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import p204p.ev61;

/* JADX INFO: loaded from: classes4.dex */
final class zzaq extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ int zza;
    final /* synthetic */ ev61 zzb;
    final /* synthetic */ zzbc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaq(zzbc zzbcVar, ev61 ev61Var, int i, ev61 ev61Var2) {
        super(ev61Var);
        this.zzc = zzbcVar;
        this.zza = i;
        this.zzb = ev61Var2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        try {
            ?? Zze = this.zzc.zza.zze();
            zzbc zzbcVar = this.zzc;
            Zze.zzh(zzbcVar.zzd, this.zza, new zzay(zzbcVar, this.zzb));
        } catch (RemoteException e) {
            zzbc.zzb.zzc(e, "getSessionState(%d)", Integer.valueOf(this.zza));
            this.zzb.m40098c(new RuntimeException(e));
        }
    }
}
