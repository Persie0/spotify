package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.internal.zzbz;
import com.google.android.play.core.splitinstall.internal.zzcb;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
final class zze implements zzp {
    private final zze zza = this;
    private final zzcb zzb;
    private final zzcb zzc;
    private final zzcb zzd;
    private final zzcb zze;
    private final zzcb zzf;
    private final zzcb zzg;
    private final zzcb zzh;
    private final zzcb zzi;
    private final zzcb zzj;
    private final zzcb zzk;
    private final zzcb zzl;

    public /* synthetic */ zze(zzac zzacVar, zzd zzdVar) {
        zzad zzadVar = new zzad(zzacVar);
        this.zzb = zzadVar;
        zzcb zzcbVarZzc = zzbz.zzc(new zzbd(zzadVar));
        this.zzc = zzcbVarZzc;
        zzcb zzcbVarZzc2 = zzbz.zzc(new zzag(zzacVar));
        this.zzd = zzcbVarZzc2;
        zzcb zzcbVarZzc3 = zzbz.zzc(new zzt(zzadVar));
        this.zze = zzcbVarZzc3;
        zzcb zzcbVarZzc4 = zzbz.zzc(new zzbf(zzadVar));
        this.zzf = zzcbVarZzc4;
        zzcb zzcbVarZzc5 = zzbz.zzc(new zzab(zzcbVarZzc, zzcbVarZzc2, zzcbVarZzc3, zzcbVarZzc4));
        this.zzg = zzcbVarZzc5;
        zzcb zzcbVarZzc6 = zzbz.zzc(new zzaf(zzadVar));
        this.zzh = zzcbVarZzc6;
        zzae zzaeVar = new zzae(zzcbVarZzc6);
        this.zzi = zzaeVar;
        zzcb zzcbVarZzc7 = zzbz.zzc(new com.google.android.play.core.splitinstall.testing.zzt(zzadVar, zzcbVarZzc6, zzcbVarZzc3, zzaeVar));
        this.zzj = zzcbVarZzc7;
        zzcb zzcbVarZzc8 = zzbz.zzc(new zzm(zzcbVarZzc5, zzcbVarZzc7, zzcbVarZzc6));
        this.zzk = zzcbVarZzc8;
        this.zzl = zzbz.zzc(new zzah(zzacVar, zzcbVarZzc8));
    }

    @Override // com.google.android.play.core.splitinstall.zzp
    public final SplitInstallManager zza() {
        return (SplitInstallManager) this.zzl.zza();
    }

    @Override // com.google.android.play.core.splitinstall.zzp
    public final File zzb() {
        return (File) this.zzh.zza();
    }
}
