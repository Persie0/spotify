package com.google.android.gms.internal.meet_coactivities;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class zzoj extends zznv {
    private static final Set zza;
    private static final zznb zzb;
    private static final zzog zzc;
    private final String zzd;
    private final Level zze;
    private final Set zzf;
    private final zznb zzg;
    private final int zzh;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzle.zza, zzmf.zza, zzmg.zza)));
        zza = setUnmodifiableSet;
        zzb = zzne.zza(setUnmodifiableSet).zzc();
        zzc = new zzog();
    }

    public /* synthetic */ zzoj(String str, String str2, boolean z, int i, Level level, Set set, zznb zznbVar, zzoi zzoiVar) {
        super(str2);
        this.zzd = zzoa.zza("", str2, true);
        this.zzh = 2;
        this.zze = level;
        this.zzf = set;
        this.zzg = zznbVar;
    }

    public static zzog zzf() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    public static void zzi(zzmm zzmmVar, String str, int i, Level level, Set set, zznb zznbVar) {
        StringBuilder sb;
        Boolean bool = (Boolean) zzmmVar.zzi().zzc(zzmg.zza);
        if (bool == null || !bool.booleanValue()) {
            zznp zznpVarZzh = zznp.zzh(zzns.zzf(), zzmmVar.zzi());
            boolean z = zzmmVar.zzl().intValue() < level.intValue();
            if (z) {
                sb = new StringBuilder();
                if (zzmn.zza(2, zzmmVar.zzf(), sb)) {
                    sb.append(" ");
                }
                if (z) {
                    zzmh.zzb(zzmmVar, sb);
                    int i2 = zznt.zza;
                    zzml zzmlVar = new zzml("[CONTEXT ", " ]", sb);
                    zznpVarZzh.zzc(zznbVar, zzmlVar);
                    zzmlVar.zzb();
                } else {
                    zzmh.zzb(zzmmVar, sb);
                    int i3 = zznt.zza;
                    zzml zzmlVar2 = new zzml("[CONTEXT ", " ]", sb);
                    zznpVarZzh.zzc(zznbVar, zzmlVar2);
                    zzmlVar2.zzb();
                }
            } else {
                int i4 = zznt.zza;
                if (zzmmVar.zzj() == null && zznpVarZzh.zza() <= set.size() && set.containsAll(zznpVarZzh.zzb())) {
                    zzmq.zza(zzmmVar.zzk());
                } else {
                    sb = new StringBuilder();
                    if (zzmn.zza(2, zzmmVar.zzf(), sb)) {
                        sb.append(" ");
                    }
                    if (z || zzmmVar.zzj() == null) {
                        zzmh.zzb(zzmmVar, sb);
                        int i5 = zznt.zza;
                        zzml zzmlVar3 = new zzml("[CONTEXT ", " ]", sb);
                        zznpVarZzh.zzc(zznbVar, zzmlVar3);
                        zzmlVar3.zzb();
                    } else {
                        sb.append("(REDACTED) ");
                        sb.append(zzmmVar.zzj().zzb());
                    }
                }
            }
            zzoa.zzb(zzmmVar.zzl());
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzmo
    public final void zzc(zzmm zzmmVar) {
        zzi(zzmmVar, this.zzd, 2, this.zze, this.zzf, this.zzg);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzmo
    public final boolean zzd(Level level) {
        String str = this.zzd;
        int iZzb = zzoa.zzb(level);
        return Log.isLoggable(str, iZzb) || Log.isLoggable("all", iZzb);
    }
}
