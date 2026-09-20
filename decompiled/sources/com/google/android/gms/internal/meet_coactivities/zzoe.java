package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
final class zzoe extends zzok {
    private static final zzoe zza = new zzoe(zzok.zze());
    private final AtomicReference zzb;

    public zzoe(zzok zzokVar) {
        this.zzb = new AtomicReference(zzokVar);
    }

    public static final zzoe zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzok
    public final zzms zza() {
        return ((zzok) this.zzb.get()).zza();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzok
    public final zzow zzc() {
        return ((zzok) this.zzb.get()).zzc();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzok
    public final boolean zzd(String str, Level level, boolean z) {
        ((zzok) this.zzb.get()).zzd(str, level, z);
        return false;
    }
}
