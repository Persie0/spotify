package com.google.android.gms.internal.meet_coactivities;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzku extends zzlg implements zzlq {
    public zzku(Level level, boolean z) {
        super(level, false);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzlg
    public final zzpf zza() {
        return zzpd.zza();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzlg
    public final boolean zzb(zzll zzllVar) {
        zzms zzmsVarZzi = zzi();
        int iZza = zzmsVarZzi.zza();
        for (int i = 0; i < iZza; i++) {
            if (zzmsVarZzi.zzb(i).zzf() == "eye3tag") {
                if (zzmsVarZzi.zzc(zzle.zza) != null) {
                    break;
                }
                zzlt zzltVar = zzle.zzi;
                if (zzmsVarZzi.zzc(zzltVar) != null) {
                    break;
                }
                zzm(zzltVar, zzme.SMALL);
                break;
            }
        }
        return super.zzb(zzllVar);
    }
}
