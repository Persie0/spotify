package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import p204p.ilf1;

/* JADX INFO: loaded from: classes.dex */
public final class zzvg {
    private static final zzvg zza = new zzvg(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzvg(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzvg zzc() {
        return zza;
    }

    public static zzvg zze(zzvg zzvgVar, zzvg zzvgVar2) {
        int i = zzvgVar.zzb + zzvgVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzvgVar.zzc, i);
        System.arraycopy(zzvgVar2.zzc, 0, iArrCopyOf, zzvgVar.zzb, zzvgVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzvgVar.zzd, i);
        System.arraycopy(zzvgVar2.zzd, 0, objArrCopyOf, zzvgVar.zzb, zzvgVar2.zzb);
        return new zzvg(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzvg zzf() {
        return new zzvg(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzvg)) {
            return false;
        }
        zzvg zzvgVar = (zzvg) obj;
        int i = this.zzb;
        if (i == zzvgVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzvgVar.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzvgVar.zzd;
            int i3 = this.zzb;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzz;
        int iZzA;
        int iZzz2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzz3 = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        zzrr zzrrVar = (zzrr) this.zzd[i2];
                        int iZzz4 = zzsc.zzz(i6);
                        int iZzd = zzrrVar.zzd();
                        iZzz3 = zzsc.zzz(iZzd) + iZzd + iZzz4 + iZzz3;
                    } else if (i5 == 3) {
                        int iZzz5 = zzsc.zzz(i4 << 3);
                        iZzz = iZzz5 + iZzz5;
                        iZzA = ((zzvg) this.zzd[i2]).zza();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(zztj.zza());
                        }
                        ((Integer) this.zzd[i2]).getClass();
                        iZzz2 = zzsc.zzz(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i2]).getClass();
                    iZzz2 = zzsc.zzz(i4 << 3) + 8;
                }
                iZzz3 = iZzz2 + iZzz3;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.zzd[i2]).longValue();
                iZzz = zzsc.zzz(i7);
                iZzA = zzsc.zzA(jLongValue);
            }
            iZzz3 = iZzA + iZzz + iZzz3;
        }
        this.zze = iZzz3;
        return iZzz3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iM51028p = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzrr zzrrVar = (zzrr) this.zzd[i2];
            int iZzz = zzsc.zzz(8);
            int iZzz2 = zzsc.zzz(i3) + zzsc.zzz(16);
            int iZzz3 = zzsc.zzz(24);
            int iZzd = zzrrVar.zzd();
            iM51028p += iZzz + iZzz + iZzz2 + ilf1.m51028p(iZzd, iZzd, iZzz3);
        }
        this.zze = iM51028p;
        return iM51028p;
    }

    public final zzvg zzd(zzvg zzvgVar) {
        if (zzvgVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzvgVar.zzb;
        zzm(i);
        System.arraycopy(zzvgVar.zzc, 0, this.zzc, this.zzb, zzvgVar.zzb);
        System.arraycopy(zzvgVar.zzd, 0, this.zzd, this.zzb, zzvgVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzuh.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzvs zzvsVar) {
        for (int i = 0; i < this.zzb; i++) {
            zzvsVar.zzx(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzvs zzvsVar) {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzvsVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzvsVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzvsVar.zzd(i4, (zzrr) obj);
                } else if (i3 == 3) {
                    zzvsVar.zzG(i4);
                    ((zzvg) obj).zzl(zzvsVar);
                    zzvsVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zztj.zza());
                    }
                    zzvsVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzvg() {
        this(0, new int[8], new Object[8], true);
    }
}
