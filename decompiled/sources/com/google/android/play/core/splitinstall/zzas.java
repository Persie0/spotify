package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import p204p.ev61;

/* JADX INFO: loaded from: classes4.dex */
final class zzas extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ int zza;
    final /* synthetic */ ev61 zzb;
    final /* synthetic */ zzbc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzas(zzbc zzbcVar, ev61 ev61Var, int i, ev61 ev61Var2) {
        super(ev61Var);
        this.zzc = zzbcVar;
        this.zza = i;
        this.zzb = ev61Var2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        try {
            this.zzc.zza.zze().zzc(this.zzc.zzd, this.zza, zzbc.zzo(), new zzat(this.zzc, this.zzb));
        } catch (RemoteException e) {
            zzbc.zzb.zzc(e, "cancelInstall(%d)", Integer.valueOf(this.zza));
            this.zzb.m40098c(new RuntimeException(e));
        }
    }
}
