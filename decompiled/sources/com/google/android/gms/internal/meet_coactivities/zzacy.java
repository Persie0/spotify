package com.google.android.gms.internal.meet_coactivities;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class zzacy {
    public static zzzw zza(Parcel parcel, zzvz zzvzVar) {
        int i = parcel.readInt();
        if (i == 0) {
            return new zzzw();
        }
        Object[] objArr = new Object[i + i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = parcel.readInt();
            int i5 = i2 + 4;
            byte[] bArrZzb = zzb(parcel, i4, i5);
            int i6 = i5 + i4;
            int i7 = i3 + i3;
            objArr[i7] = bArrZzb;
            int i8 = parcel.readInt();
            if (i8 == -1) {
                throw new zzabf(zzabe.zze.zze("Parcelable metadata values not allowed"), null);
            }
            if (i8 < 0) {
                throw new zzabf(zzabe.zzj.zze("Unrecognized metadata sentinel"), null);
            }
            int i9 = i6 + 4;
            byte[] bArrZzb2 = zzb(parcel, i8, i9);
            i2 = i9 + i8;
            objArr[i7 + 1] = bArrZzb2;
        }
        return zzyl.zzc(i, objArr);
    }

    private static byte[] zzb(Parcel parcel, int i, int i2) throws zzabf {
        if (i2 + i > 8192) {
            throw new zzabf(zzabe.zzg.zze("Metadata too large"), null);
        }
        byte[] bArr = new byte[i];
        if (i > 0) {
            parcel.readByteArray(bArr);
        }
        return bArr;
    }
}
