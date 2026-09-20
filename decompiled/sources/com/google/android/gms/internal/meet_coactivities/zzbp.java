package com.google.android.gms.internal.meet_coactivities;

import p204p.fg90;

/* JADX INFO: loaded from: classes4.dex */
final class zzbp extends zzbx {
    private fg90 zza;
    private fg90 zzb;

    @Override // com.google.android.gms.internal.meet_coactivities.zzbx
    public final zzbx zza(fg90 fg90Var) {
        this.zzb = fg90Var;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzbx
    public final zzbx zzb(fg90 fg90Var) {
        this.zza = fg90Var;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzbx
    public final zzby zzc() {
        fg90 fg90Var;
        fg90 fg90Var2 = this.zza;
        if (fg90Var2 != null && (fg90Var = this.zzb) != null) {
            return new zzbq(fg90Var2, fg90Var, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" outgoingIpcExecutor");
        }
        if (this.zzb == null) {
            sb.append(" incomingIpcExecutor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
