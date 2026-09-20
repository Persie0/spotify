package com.google.android.gms.internal.meet_coactivities;

import androidx.car.app.model.Alert;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzrx {
    public static final /* synthetic */ int zze = 0;
    private static volatile int zzf = 100;
    int zza;
    final int zzb = zzf;
    int zzc = Alert.DURATION_SHOW_INDEFINITELY;
    zzry zzd;

    public /* synthetic */ zzrx(zzrw zzrwVar) {
    }

    public static int zzF(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzH(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static zzrx zzI(InputStream inputStream, int i) {
        return new zzrv(inputStream, 4096, null);
    }

    public static zzrx zzJ(byte[] bArr, int i, int i2) {
        return zzK(bArr, 0, i2, false);
    }

    public static zzrx zzK(byte[] bArr, int i, int i2, boolean z) {
        zzrt zzrtVar = new zzrt(bArr, 0, i2, false, null);
        try {
            zzrtVar.zze(i2);
            return zzrtVar;
        } catch (zztj e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract void zzA(int i);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i);

    public final int zzG(int i) {
        int i2 = this.zzc;
        this.zzc = Alert.DURATION_SHOW_INDEFINITELY;
        return i2;
    }

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int i);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zzrr zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int i);
}
