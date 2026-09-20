package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe extends zzsz implements zzug {
    private static final zzbe zzb;
    private static volatile zzum zze;
    private int zzf;
    private zzbd zzg;
    private zzbb zzh;
    private zzaq zzi;

    static {
        zzbe zzbeVar = new zzbe();
        zzb = zzbeVar;
        zzsz.zzN(zzbe.class, zzbeVar);
    }

    private zzbe() {
    }

    public static zzav zzb() {
        return (zzav) zzb.zzA();
    }

    public static zzbe zzf(byte[] bArr, zzsk zzskVar) {
        return (zzbe) zzsz.zzE(zzb, bArr, zzskVar);
    }

    public static /* synthetic */ void zzg(zzbe zzbeVar, zzbd zzbdVar) {
        zzbdVar.getClass();
        zzbeVar.zzg = zzbdVar;
        zzbeVar.zzf |= 1;
    }

    public static /* synthetic */ void zzh(zzbe zzbeVar, zzbb zzbbVar) {
        zzbbVar.getClass();
        zzbeVar.zzh = zzbbVar;
        zzbeVar.zzf |= 2;
    }

    public static /* synthetic */ void zzj(zzbe zzbeVar, zzaq zzaqVar) {
        zzaqVar.getClass();
        zzbeVar.zzi = zzaqVar;
        zzbeVar.zzf |= 4;
    }

    public final zzaq zza() {
        zzaq zzaqVar = this.zzi;
        return zzaqVar == null ? zzaq.zzc() : zzaqVar;
    }

    public final zzbb zzc() {
        zzbb zzbbVar = this.zzh;
        return zzbbVar == null ? zzbb.zzd() : zzbbVar;
    }

    public final zzbd zzd() {
        zzbd zzbdVar = this.zzg;
        return zzbdVar == null ? zzbd.zzc() : zzbdVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzbe();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzav(zzeVar);
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
        synchronized (zzbe.class) {
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
