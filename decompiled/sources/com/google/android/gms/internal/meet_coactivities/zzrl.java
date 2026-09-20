package com.google.android.gms.internal.meet_coactivities;

import p204p.s571;

/* JADX INFO: loaded from: classes4.dex */
final class zzrl extends zzrq {
    private final int zzc;

    public zzrl(byte[] bArr, int i, int i2) {
        super(bArr);
        zzrr.zzi(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrq, com.google.android.gms.internal.meet_coactivities.zzrr
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzrq) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(s571.m77246e(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(s571.m77247f(i, "Index > length: ", i2, ", "));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrq, com.google.android.gms.internal.meet_coactivities.zzrr
    public final byte zzb(int i) {
        return ((zzrq) this).zza[i];
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrq
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrq, com.google.android.gms.internal.meet_coactivities.zzrr
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrq, com.google.android.gms.internal.meet_coactivities.zzrr
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(((zzrq) this).zza, 0, bArr, 0, i3);
    }
}
