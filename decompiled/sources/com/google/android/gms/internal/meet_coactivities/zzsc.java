package com.google.android.gms.internal.meet_coactivities;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzsc extends zzri {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzsc.class.getName());
    private static final boolean zzd = zzvm.zzx();
    zzsd zza;

    private zzsc() {
        throw null;
    }

    public static int zzA(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static zzsc zzB(byte[] bArr, int i, int i2) {
        return new zzrz(bArr, i, i2);
    }

    @Deprecated
    public static int zzv(int i, zzuf zzufVar, zzur zzurVar) {
        int iZzz = zzz(i << 3);
        return ((zzra) zzufVar).zzv(zzurVar) + iZzz + iZzz;
    }

    public static int zzw(zzuf zzufVar) {
        int iZzz = zzufVar.zzz();
        return zzz(iZzz) + iZzz;
    }

    public static int zzx(zzuf zzufVar, zzur zzurVar) {
        int iZzv = ((zzra) zzufVar).zzv(zzurVar);
        return zzz(iZzv) + iZzv;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzvp.zzc(str);
        } catch (zzvo unused) {
            length = str.getBytes(zzth.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzz(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void zzC() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzD(String str, zzvo zzvoVar) throws zzsa {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzvoVar);
        byte[] bytes = str.getBytes(zzth.zza);
        try {
            int length = bytes.length;
            zzs(length);
            zzm(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzsa(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b);

    public abstract void zzd(int i, boolean z);

    public abstract void zze(int i, zzrr zzrrVar);

    public abstract void zzf(zzrr zzrrVar);

    public abstract void zzg(int i, int i2);

    public abstract void zzh(int i);

    public abstract void zzi(int i, long j);

    public abstract void zzj(long j);

    public abstract void zzk(int i, int i2);

    public abstract void zzl(int i);

    public abstract void zzm(byte[] bArr, int i, int i2);

    public abstract void zzn(zzuf zzufVar);

    public abstract void zzo(int i, String str);

    public abstract void zzp(String str);

    public abstract void zzq(int i, int i2);

    public abstract void zzr(int i, int i2);

    public abstract void zzs(int i);

    public abstract void zzt(int i, long j);

    public abstract void zzu(long j);

    public /* synthetic */ zzsc(zzsb zzsbVar) {
    }
}
