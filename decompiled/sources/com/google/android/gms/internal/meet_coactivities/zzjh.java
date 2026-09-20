package com.google.android.gms.internal.meet_coactivities;

import p204p.dq60;

/* JADX INFO: loaded from: classes4.dex */
final class zzjh extends zzju {
    private final zzpy zza;
    private final int zzb;

    public zzjh(int i, zzpy zzpyVar) {
        this.zzb = i;
        if (zzpyVar == null) {
            throw new NullPointerException("Null update");
        }
        this.zza = zzpyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzju) {
            zzju zzjuVar = (zzju) obj;
            if (this.zzb == zzjuVar.zzb() && this.zza.equals(zzjuVar.zza())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzb ^ 1000003) * 1000003) ^ this.zza.hashCode();
    }

    public final String toString() {
        return dq60.m36615o("ThinLocalStateUpdateResult{outcome=", this.zzb != 1 ? "UPDATED" : "NO_OP", ", update=", this.zza.toString(), "}");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzju
    public final zzpy zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzju
    public final int zzb() {
        return this.zzb;
    }
}
