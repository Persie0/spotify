package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzas extends zzsz implements zzug {
    private static final zzas zzb;
    private static volatile zzum zze;
    private int zzf;
    private int zzg;

    static {
        zzas zzasVar = new zzas();
        zzb = zzasVar;
        zzsz.zzN(zzas.class, zzasVar);
    }

    private zzas() {
    }

    public static zzar zza() {
        return (zzar) zzb.zzA();
    }

    public final zzqx zzc() {
        zzqx zzqxVar;
        int i = this.zzg;
        if (i == 0) {
            zzqxVar = zzqx.UNKNOWN;
        } else if (i != 1) {
            zzqxVar = i != 2 ? null : zzqx.OUTGOING;
        } else {
            zzqxVar = zzqx.INCOMING;
        }
        return zzqxVar == null ? zzqx.UNRECOGNIZED : zzqxVar;
    }

    public final zzqy zzd() {
        zzqy zzqyVar;
        int i = this.zzf;
        if (i == 0) {
            zzqyVar = zzqy.UNDEFINED;
        } else if (i != 1) {
            zzqyVar = i != 2 ? null : zzqy.UPDATE;
        } else {
            zzqyVar = zzqy.HEARTBEAT;
        }
        return zzqyVar == null ? zzqy.UNRECOGNIZED : zzqyVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzas();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzar(zzeVar);
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
        synchronized (zzas.class) {
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
