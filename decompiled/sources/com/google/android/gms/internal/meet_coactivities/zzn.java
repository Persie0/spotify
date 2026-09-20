package com.google.android.gms.internal.meet_coactivities;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzn extends zzsz implements zzug {
    private static final zzn zzb;
    private static volatile zzum zze;
    private zztg zzf = zzsz.zzG();
    private String zzg = "";
    private long zzh;

    static {
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzsz.zzN(zzn.class, zznVar);
    }

    private zzn() {
    }

    public static zzm zza() {
        return (zzm) zzb.zzA();
    }

    public static zzn zzc() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzn zznVar, zzrr zzrrVar) {
        zzrrVar.getClass();
        zztg zztgVar = zznVar.zzf;
        if (!zztgVar.zzc()) {
            zznVar.zzf = zzsz.zzH(zztgVar);
        }
        zznVar.zzf.add(zzrrVar);
    }

    public static /* synthetic */ void zzf(zzn zznVar, String str) {
        str.getClass();
        zznVar.zzg = str;
    }

    public final List zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001c\u0002Ȉ\u0003\u0002", new Object[]{"zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzn();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzm(zzeVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzum zzumVar = zze;
        if (zzumVar != null) {
            return zzumVar;
        }
        synchronized (zzn.class) {
            try {
                zzsuVar = zze;
                if (zzsuVar == null) {
                    zzsuVar = new zzsu(zzb);
                    zze = zzsuVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzsuVar;
    }
}
