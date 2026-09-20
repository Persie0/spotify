package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.internal.zzbz;
import com.google.android.play.core.splitinstall.internal.zzcb;

/* JADX INFO: loaded from: classes.dex */
public final class zzm implements zzcb {
    private final zzcb zza;
    private final zzcb zzb;
    private final zzcb zzc;

    public zzm(zzcb zzcbVar, zzcb zzcbVar2, zzcb zzcbVar3) {
        this.zza = zzcbVar;
        this.zzb = zzcbVar2;
        this.zzc = zzcbVar3;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* bridge */ /* synthetic */ Object zza() {
        return new zzl(zzbz.zzb(this.zza), zzbz.zzb(this.zzb), zzbz.zzb(this.zzc));
    }
}
