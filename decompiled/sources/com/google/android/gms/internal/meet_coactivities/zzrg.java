package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzrg {
    public static int zza(byte[] bArr, int i, zzrf zzrfVar) throws zztj {
        int iZzi = zzi(bArr, i, zzrfVar);
        int i2 = zzrfVar.zza;
        if (i2 < 0) {
            throw zztj.zzf();
        }
        if (i2 > bArr.length - iZzi) {
            throw zztj.zzi();
        }
        if (i2 == 0) {
            zzrfVar.zzc = zzrr.zzb;
            return iZzi;
        }
        zzrfVar.zzc = zzrr.zzk(bArr, iZzi, i2);
        return iZzi + i2;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int zzc(zzur zzurVar, byte[] bArr, int i, int i2, int i3, zzrf zzrfVar) {
        Object objZze = zzurVar.zze();
        int iZzm = zzm(objZze, zzurVar, bArr, i, i2, i3, zzrfVar);
        zzurVar.zzf(objZze);
        zzrfVar.zzc = objZze;
        return iZzm;
    }

    public static int zzd(zzur zzurVar, byte[] bArr, int i, int i2, zzrf zzrfVar) throws zztj {
        Object objZze = zzurVar.zze();
        int iZzn = zzn(objZze, zzurVar, bArr, i, i2, zzrfVar);
        zzurVar.zzf(objZze);
        zzrfVar.zzc = objZze;
        return iZzn;
    }

    public static int zze(zzur zzurVar, int i, byte[] bArr, int i2, int i3, zztg zztgVar, zzrf zzrfVar) throws zztj {
        int iZzd = zzd(zzurVar, bArr, i2, i3, zzrfVar);
        zztgVar.add(zzrfVar.zzc);
        while (iZzd < i3) {
            int iZzi = zzi(bArr, iZzd, zzrfVar);
            if (i != zzrfVar.zza) {
                break;
            }
            iZzd = zzd(zzurVar, bArr, iZzi, i3, zzrfVar);
            zztgVar.add(zzrfVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zztg zztgVar, zzrf zzrfVar) throws zztj {
        zzta zztaVar = (zzta) zztgVar;
        int iZzi = zzi(bArr, i, zzrfVar);
        int i2 = zzrfVar.zza + iZzi;
        while (iZzi < i2) {
            iZzi = zzi(bArr, iZzi, zzrfVar);
            zztaVar.zzh(zzrfVar.zza);
        }
        if (iZzi == i2) {
            return iZzi;
        }
        throw zztj.zzi();
    }

    public static int zzg(byte[] bArr, int i, zzrf zzrfVar) throws zztj {
        int iZzi = zzi(bArr, i, zzrfVar);
        int i2 = zzrfVar.zza;
        if (i2 < 0) {
            throw zztj.zzf();
        }
        if (i2 == 0) {
            zzrfVar.zzc = "";
            return iZzi;
        }
        zzrfVar.zzc = zzvp.zzd(bArr, iZzi, i2);
        return iZzi + i2;
    }

    public static int zzh(int i, byte[] bArr, int i2, int i3, zzvg zzvgVar, zzrf zzrfVar) throws zztj {
        if ((i >>> 3) == 0) {
            throw zztj.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzl = zzl(bArr, i2, zzrfVar);
            zzvgVar.zzj(i, Long.valueOf(zzrfVar.zzb));
            return iZzl;
        }
        if (i4 == 1) {
            zzvgVar.zzj(i, Long.valueOf(zzp(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzi = zzi(bArr, i2, zzrfVar);
            int i5 = zzrfVar.zza;
            if (i5 < 0) {
                throw zztj.zzf();
            }
            if (i5 > bArr.length - iZzi) {
                throw zztj.zzi();
            }
            if (i5 == 0) {
                zzvgVar.zzj(i, zzrr.zzb);
            } else {
                zzvgVar.zzj(i, zzrr.zzk(bArr, iZzi, i5));
            }
            return iZzi + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zztj.zzc();
            }
            zzvgVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzvg zzvgVarZzf = zzvg.zzf();
        int i7 = 0;
        while (i2 < i3) {
            int iZzi2 = zzi(bArr, i2, zzrfVar);
            i7 = zzrfVar.zza;
            if (i7 == i6) {
                i2 = iZzi2;
                break;
            }
            i2 = zzh(i7, bArr, iZzi2, i3, zzvgVarZzf, zzrfVar);
        }
        if (i2 > i3 || i7 != i6) {
            throw zztj.zzg();
        }
        zzvgVar.zzj(i, zzvgVarZzf);
        return i2;
    }

    public static int zzi(byte[] bArr, int i, zzrf zzrfVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzj(b, bArr, i2, zzrfVar);
        }
        zzrfVar.zza = b;
        return i2;
    }

    public static int zzj(int i, byte[] bArr, int i2, zzrf zzrfVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzrfVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzrfVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzrfVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzrfVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzrfVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int zzk(int i, byte[] bArr, int i2, int i3, zztg zztgVar, zzrf zzrfVar) {
        zzta zztaVar = (zzta) zztgVar;
        int iZzi = zzi(bArr, i2, zzrfVar);
        zztaVar.zzh(zzrfVar.zza);
        while (iZzi < i3) {
            int iZzi2 = zzi(bArr, iZzi, zzrfVar);
            if (i != zzrfVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzrfVar);
            zztaVar.zzh(zzrfVar.zza);
        }
        return iZzi;
    }

    public static int zzl(byte[] bArr, int i, zzrf zzrfVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzrfVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        zzrfVar.zzb = j2;
        return i3;
    }

    public static int zzm(Object obj, zzur zzurVar, byte[] bArr, int i, int i2, int i3, zzrf zzrfVar) {
        int iZzc = ((zzui) zzurVar).zzc(obj, bArr, i, i2, i3, zzrfVar);
        zzrfVar.zzc = obj;
        return iZzc;
    }

    public static int zzn(Object obj, zzur zzurVar, byte[] bArr, int i, int i2, zzrf zzrfVar) throws zztj {
        int iZzj = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzj = zzj(i3, bArr, iZzj, zzrfVar);
            i3 = zzrfVar.zza;
        }
        int i4 = iZzj;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zztj.zzi();
        }
        int i5 = i4 + i3;
        zzurVar.zzi(obj, bArr, i4, i5, zzrfVar);
        zzrfVar.zzc = obj;
        return i5;
    }

    public static int zzo(int i, byte[] bArr, int i2, int i3, zzrf zzrfVar) throws zztj {
        if ((i >>> 3) == 0) {
            throw zztj.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzl(bArr, i2, zzrfVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzi(bArr, i2, zzrfVar) + zzrfVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw zztj.zzc();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzi(bArr, i2, zzrfVar);
            i6 = zzrfVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzo(i6, bArr, i2, i3, zzrfVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw zztj.zzg();
        }
        return i2;
    }

    public static long zzp(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}
