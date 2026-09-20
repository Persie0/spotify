package com.google.android.gms.internal.meet_coactivities;

import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjo extends zzjs {
    public zzjo(String str, long j) {
        super(str, j, zzqe.zzc(), zzjn.zza);
    }

    public final zzju zza(UnaryOperator unaryOperator) {
        zzjh zzjhVar;
        synchronized (this.zza) {
            int iZzk = zzk((zzqe) unaryOperator.apply((zzqe) this.zzd), 1);
            zzpx zzpxVarZzc = zzpy.zzc();
            zzpxVarZzc.zzb(this.zzb);
            zzpxVarZzc.zzd(this.zzc);
            zzqf zzqfVarZzb = zzqg.zzb();
            zzqfVarZzb.zza((zzqe) this.zzd);
            zzpxVarZzc.zze(zzqfVarZzb);
            zzjhVar = new zzjh(iZzk, (zzpy) zzpxVarZzc.zzk());
        }
        return zzjhVar;
    }

    public final zzpy zzb() {
        zzpy zzpyVar;
        synchronized (this.zza) {
            zzpx zzpxVarZzc = zzpy.zzc();
            zzpxVarZzc.zzb(this.zzb);
            zzpxVarZzc.zzg(true);
            zzqf zzqfVarZzb = zzqg.zzb();
            zzqfVarZzb.zza((zzqe) this.zzd);
            zzpxVarZzc.zze(zzqfVarZzb);
            zzpyVar = (zzpy) zzpxVarZzc.zzk();
        }
        return zzpyVar;
    }
}
