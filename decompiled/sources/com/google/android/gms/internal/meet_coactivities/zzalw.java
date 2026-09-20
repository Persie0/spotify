package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.atomic.AtomicBoolean;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzalw extends zzzc {
    final /* synthetic */ zzalx zza;
    private final zzzb zzb;
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzalw(zzalx zzalxVar, zzzb zzzbVar) {
        this.zza = zzalxVar;
        c95.m31848n(zzzbVar, "subchannel");
        this.zzb = zzzbVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzc
    public final zzyw zza(zzyx zzyxVar) {
        if (this.zzc.compareAndSet(false, true)) {
            zzabm zzabmVarZzb = this.zza.zze.zzb();
            zzabmVarZzb.zzc(new zzalv(this));
            zzabmVarZzb.zzb();
        }
        return zzyw.zzc();
    }
}
