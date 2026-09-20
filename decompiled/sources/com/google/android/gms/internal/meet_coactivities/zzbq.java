package com.google.android.gms.internal.meet_coactivities;

import p204p.fg90;

/* JADX INFO: loaded from: classes4.dex */
final class zzbq extends zzby {
    private final fg90 zza;
    private final fg90 zzb;

    public /* synthetic */ zzbq(fg90 fg90Var, fg90 fg90Var2, zzbo zzboVar) {
        this.zza = fg90Var;
        this.zzb = fg90Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzby) {
            zzby zzbyVar = (zzby) obj;
            if (this.zza.equals(zzbyVar.zzb()) && this.zzb.equals(zzbyVar.zza())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        return "IpcExecutors{outgoingIpcExecutor=" + this.zza + ", incomingIpcExecutor=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzby
    public final fg90 zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzby
    public final fg90 zzb() {
        return this.zza;
    }
}
