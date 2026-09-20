package com.google.android.gms.internal.meet_coactivities;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
final class zzoh extends zznv {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zznb zzd;
    private final int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzoh(String str, String str2, boolean z, int i, boolean z2, boolean z3) {
        super(str2);
        Level level = Level.ALL;
        Set set = zzoj.zza;
        zznb zznbVar = zzoj.zzb;
        this.zza = "";
        this.zze = 2;
        this.zzb = level;
        this.zzc = set;
        this.zzd = zznbVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzmo
    public final void zzc(zzmm zzmmVar) {
        String strZzb = (String) zzmmVar.zzi().zzc(zzmf.zza);
        if (strZzb == null) {
            strZzb = zza();
        }
        if (strZzb == null) {
            strZzb = zzmmVar.zzf().zzb();
            int iIndexOf = strZzb.indexOf(36, strZzb.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strZzb = strZzb.substring(0, iIndexOf);
            }
        }
        String str = this.zza;
        zzoj.zzi(zzmmVar, zzoa.zza(str, strZzb, true), 2, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzmo
    public final boolean zzd(Level level) {
        return true;
    }
}
