package com.google.android.gms.internal.meet_coactivities;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzrt extends zzrx {
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzrt(byte[] bArr, int i, int i2, boolean z, zzrs zzrsVar) {
        super(null);
        this.zzk = Alert.DURATION_SHOW_INDEFINITELY;
        this.zzf = bArr;
        this.zzg = i2;
        this.zzi = 0;
    }

    private final void zzL() {
        int i = this.zzg + this.zzh;
        this.zzg = i;
        int i2 = this.zzk;
        if (i <= i2) {
            this.zzh = 0;
            return;
        }
        int i3 = i - i2;
        this.zzh = i3;
        this.zzg = i - i3;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final void zzA(int i) {
        this.zzk = i;
        zzL();
    }

    public final void zzB(int i) throws zztj {
        if (i >= 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (i <= i2 - i3) {
                this.zzi = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zztj.zzi();
        }
        throw zztj.zzf();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final boolean zzC() {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final boolean zzE(int i) throws zztj {
        int iZzm;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i3 < 10) {
                    if (zza() < 0) {
                        i3++;
                    }
                }
                throw zztj.zze();
            }
            while (i3 < 10) {
                byte[] bArr = this.zzf;
                int i4 = this.zzi;
                this.zzi = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zztj.zze();
            return true;
        }
        if (i2 == 1) {
            zzB(8);
            return true;
        }
        if (i2 == 2) {
            zzB(zzj());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zztj.zza();
            }
            zzB(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        zzz(((i >>> 3) << 3) | 4);
        return true;
    }

    public final byte zza() throws zztj {
        int i = this.zzi;
        if (i == this.zzg) {
            throw zztj.zzi();
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final int zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final int zze(int i) throws zztj {
        if (i < 0) {
            throw zztj.zzf();
        }
        int i2 = i + this.zzi;
        if (i2 < 0) {
            throw zztj.zzg();
        }
        int i3 = this.zzk;
        if (i2 > i3) {
            throw zztj.zzi();
        }
        this.zzk = i2;
        zzL();
        return i3;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final int zzf() {
        return zzj();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final int zzg() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final int zzh() {
        return zzj();
    }

    public final int zzi() throws zztj {
        int i = this.zzi;
        if (this.zzg - i < 4) {
            throw zztj.zzi();
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final int zzj() {
        int i;
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            byte[] bArr = this.zzf;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzi = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.zzi = i5;
                return i;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final int zzk() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final int zzl() {
        return zzrx.zzF(zzj());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final int zzm() throws zztj {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzj = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw zztj.zzc();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final int zzn() {
        return zzj();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final long zzo() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final long zzp() {
        return zzr();
    }

    public final long zzq() throws zztj {
        int i = this.zzi;
        if (this.zzg - i < 8) {
            throw zztj.zzi();
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final long zzr() {
        long j;
        long j2;
        int i = this.zzi;
        int i2 = this.zzg;
        if (i2 != i) {
            byte[] bArr = this.zzf;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzi = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j3 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j3;
                        } else {
                            i6 = i + 5;
                            long j4 = (((long) bArr[i8]) << 28) ^ ((long) i9);
                            if (j4 >= 0) {
                                j = j4 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j5 = (((long) bArr[i6]) << 35) ^ j4;
                                if (j5 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j6 = j5 ^ (((long) bArr[i4]) << 42);
                                    if (j6 >= 0) {
                                        j = j6 ^ 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j5 = j6 ^ (((long) bArr[i10]) << 49);
                                        if (j5 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            long j7 = (j5 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i10] >= 0) {
                                                    j = j7;
                                                }
                                            } else {
                                                j = j7;
                                            }
                                        }
                                    }
                                    i4 = i10;
                                }
                                j = j5 ^ j2;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.zzi = i4;
                return j;
            }
        }
        return zzs();
    }

    public final long zzs() throws zztj {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bZza = zza();
            j |= ((long) (bZza & 127)) << i;
            if ((bZza & 128) == 0) {
                return j;
            }
        }
        throw zztj.zze();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final long zzt() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final long zzu() {
        return zzrx.zzH(zzr());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final long zzv() {
        return zzr();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final zzrr zzw() throws zztj {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (iZzj <= i - i2) {
                zzrr zzrrVarZzk = zzrr.zzk(this.zzf, i2, iZzj);
                this.zzi += iZzj;
                return zzrrVarZzk;
            }
        }
        if (iZzj == 0) {
            return zzrr.zzb;
        }
        if (iZzj > 0) {
            int i3 = this.zzg;
            int i4 = this.zzi;
            if (iZzj <= i3 - i4) {
                int i5 = iZzj + i4;
                this.zzi = i5;
                return new zzrq(Arrays.copyOfRange(this.zzf, i4, i5));
            }
        }
        if (iZzj <= 0) {
            throw zztj.zzf();
        }
        throw zztj.zzi();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final String zzx() throws zztj {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (iZzj <= i - i2) {
                String str = new String(this.zzf, i2, iZzj, zzth.zza);
                this.zzi += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw zztj.zzf();
        }
        throw zztj.zzi();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final String zzy() throws zztj {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (iZzj <= i - i2) {
                String strZzd = zzvp.zzd(this.zzf, i2, iZzj);
                this.zzi += iZzj;
                return strZzd;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw zztj.zzf();
        }
        throw zztj.zzi();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrx
    public final void zzz(int i) throws zztj {
        if (this.zzj != i) {
            throw zztj.zzb();
        }
    }
}
