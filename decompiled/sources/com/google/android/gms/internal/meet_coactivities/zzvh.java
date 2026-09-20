package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes.dex */
final class zzvh extends zzvf {
    @Override // com.google.android.gms.internal.meet_coactivities.zzvf
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzsz zzszVar = (zzsz) obj;
        zzvg zzvgVar = zzszVar.zzc;
        if (zzvgVar != zzvg.zzc()) {
            return zzvgVar;
        }
        zzvg zzvgVarZzf = zzvg.zzf();
        zzszVar.zzc = zzvgVarZzf;
        return zzvgVarZzf;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvf
    public final /* synthetic */ Object zzb() {
        return zzvg.zzf();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvf
    public final /* synthetic */ Object zzc(Object obj) {
        ((zzvg) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvf
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i, int i2) {
        ((zzvg) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvf
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i, long j) {
        ((zzvg) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvf
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i, Object obj2) {
        ((zzvg) obj).zzj((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvf
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i, zzrr zzrrVar) {
        ((zzvg) obj).zzj((i << 3) | 2, zzrrVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvf
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i, long j) {
        ((zzvg) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvf
    public final void zzi(Object obj) {
        ((zzsz) obj).zzc.zzh();
    }
}
