package com.google.android.gms.internal.meet_coactivities;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zznp {
    private static final zznp zza = new zznf();

    public /* synthetic */ zznp(zzno zznoVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zznp zzh(zzms zzmsVar, zzms zzmsVar2) {
        int iZza = zzmsVar2.zza();
        if (iZza == 0) {
            return zza;
        }
        return iZza <= 28 ? new zznl(zzmsVar, zzmsVar2, null) : new zznn(zzmsVar, zzmsVar2, 0 == true ? 1 : 0);
    }

    public abstract int zza();

    public abstract Set zzb();

    public abstract void zzc(zznb zznbVar, Object obj);
}
