package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzagb {
    final zzzc zza;
    final zzabe zzb;

    private zzagb(zzzc zzzcVar, zzabe zzabeVar) {
        this.zza = zzzcVar;
        this.zzb = zzabeVar;
    }

    public final zzagb zza(zzzc zzzcVar) {
        return new zzagb(zzzcVar, this.zzb);
    }

    public final zzagb zzb(zzabe zzabeVar) {
        return new zzagb(this.zza, zzabeVar);
    }
}
