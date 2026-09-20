package com.google.android.gms.internal.meet_coactivities;

import p204p.s571;

/* JADX INFO: loaded from: classes.dex */
class zzrq extends zzrp {
    protected final byte[] zza;

    public zzrq(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrr
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzrr) || zzd() != ((zzrr) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzrq)) {
            return obj.equals(this);
        }
        zzrq zzrqVar = (zzrq) obj;
        int iZzj = zzj();
        int iZzj2 = zzrqVar.zzj();
        if (iZzj != 0 && iZzj2 != 0 && iZzj != iZzj2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzrqVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzrqVar.zzd()) {
            throw new IllegalArgumentException(s571.m77247f(iZzd, "Ran off end of other: 0, ", zzrqVar.zzd(), ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzrqVar.zza;
        zzrqVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < iZzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrr
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrr
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrr
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrr
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrr
    public final int zzf(int i, int i2, int i3) {
        return zzth.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrr
    public final zzrr zzg(int i, int i2) {
        int iZzi = zzrr.zzi(0, i2, zzd());
        return iZzi == 0 ? zzrr.zzb : new zzrl(this.zza, 0, iZzi);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrr
    public final void zzh(zzri zzriVar) {
        ((zzrz) zzriVar).zzc(this.zza, 0, zzd());
    }
}
