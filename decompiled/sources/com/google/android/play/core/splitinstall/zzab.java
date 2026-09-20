package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.internal.zzcb;

/* JADX INFO: loaded from: classes.dex */
public final class zzab implements zzcb {
    private final zzcb zza;
    private final zzcb zzb;
    private final zzcb zzc;
    private final zzcb zzd;

    public zzab(zzcb zzcbVar, zzcb zzcbVar2, zzcb zzcbVar3, zzcb zzcbVar4) {
        this.zza = zzcbVar;
        this.zzb = zzcbVar2;
        this.zzc = zzcbVar3;
        this.zzd = zzcbVar4;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* bridge */ /* synthetic */ Object zza() {
        return new zzaa((zzbc) this.zza.zza(), (zzx) this.zzb.zza(), (zzs) this.zzc.zza(), (zzbe) this.zzd.zza());
    }
}
