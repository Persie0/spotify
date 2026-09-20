package com.google.android.gms.internal.meet_coactivities;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zznl extends zznp {
    private final zzms zza;
    private final zzms zzb;
    private final int[] zzc;
    private final int zzd;

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    public /* synthetic */ zznl(zzms zzmsVar, zzms zzmsVar2, zznk zznkVar) {
        super(null);
        this.zza = zzmsVar;
        this.zzb = zzmsVar2;
        int iZza = zzmsVar2.zza();
        zzpj.zzc(iZza <= 28, "metadata size too large");
        int[] iArr = new int[iZza];
        this.zzc = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            zzlt zzltVarZzi = zzi(i);
            long jZzc = zzltVarZzi.zzc() | j;
            if (jZzc == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (zzltVarZzi.equals(zzi(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = zzltVarZzi.zzi() ? iArr[i3] | (1 << (i + 4)) : i;
                } else {
                    iArr[i2] = i;
                    i2++;
                }
            } else {
                iArr[i2] = i;
                i2++;
            }
            i++;
            j = jZzc;
        }
        this.zzd = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzlt zzi(int i) {
        return (i >= 0 ? this.zzb : this.zza).zzb(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzj(int i) {
        return (i >= 0 ? this.zzb : this.zza).zzd(i);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zznp
    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zznp
    public final Set zzb() {
        return new zznh(this);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zznp
    public final void zzc(zznb zznbVar, Object obj) {
        for (int i = 0; i < this.zzd; i++) {
            int i2 = this.zzc[i];
            zzlt zzltVarZzi = zzi(i2 & 31);
            if (zzltVarZzi.zzi()) {
                zznbVar.zzb(zzltVarZzi, new zznj(this, zzltVarZzi, i2, null), obj);
            } else {
                zznbVar.zza(zzltVarZzi, zzltVarZzi.zze(zzj(i2)), obj);
            }
        }
    }
}
