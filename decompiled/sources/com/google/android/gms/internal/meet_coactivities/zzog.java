package com.google.android.gms.internal.meet_coactivities;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class zzog implements zznx {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zznb zzd;
    private final int zze;

    private zzog(String str, boolean z, int i, Level level, boolean z2, Set set, zznb zznbVar) {
        this.zza = "";
        this.zze = 2;
        this.zzb = level;
        this.zzc = set;
        this.zzd = zznbVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zznx
    public final zzmo zza(String str) {
        return new zzoj(this.zza, str, true, 2, this.zzb, this.zzc, this.zzd, null);
    }

    public final zzog zzb(boolean z) {
        Set set = this.zzc;
        zznb zznbVar = this.zzd;
        return new zzog(this.zza, true, 2, Level.OFF, false, set, zznbVar);
    }

    private zzog() {
        this("", true, 2, Level.ALL, false, zzoj.zza, zzoj.zzb);
    }
}
