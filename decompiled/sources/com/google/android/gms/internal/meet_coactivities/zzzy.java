package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzy {
    private zzzz zza;
    private zzzz zzb;
    private zzaaa zzc;
    private String zzd;
    private boolean zze;

    private zzzy() {
        throw null;
    }

    public final zzzy zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzzy zzb(zzzz zzzzVar) {
        this.zza = zzzzVar;
        return this;
    }

    public final zzzy zzc(zzzz zzzzVar) {
        this.zzb = zzzzVar;
        return this;
    }

    public final zzzy zzd(boolean z) {
        this.zze = true;
        return this;
    }

    public final zzzy zze(zzaaa zzaaaVar) {
        this.zzc = zzaaaVar;
        return this;
    }

    public final zzaac zzf() {
        return new zzaac(this.zzc, this.zzd, this.zza, this.zzb, null, false, false, this.zze, null);
    }

    public /* synthetic */ zzzy(zzzx zzzxVar) {
    }
}
