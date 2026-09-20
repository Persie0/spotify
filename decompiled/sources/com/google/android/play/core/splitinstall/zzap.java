package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import java.util.List;
import p204p.ev61;

/* JADX INFO: loaded from: classes4.dex */
final class zzap extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ List zza;
    final /* synthetic */ ev61 zzb;
    final /* synthetic */ zzbc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(zzbc zzbcVar, ev61 ev61Var, List list, ev61 ev61Var2) {
        super(ev61Var);
        this.zzc = zzbcVar;
        this.zza = list;
        this.zzb = ev61Var2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        try {
            this.zzc.zza.zze().zzf(this.zzc.zzd, zzbc.zzm(this.zza), zzbc.zzo(), new zzaw(this.zzc, this.zzb));
        } catch (RemoteException e) {
            zzbc.zzb.zzc(e, "deferredLanguageUninstall(%s)", this.zza);
            this.zzb.m40098c(new RuntimeException(e));
        }
    }
}
