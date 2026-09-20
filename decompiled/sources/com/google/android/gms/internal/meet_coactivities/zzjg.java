package com.google.android.gms.internal.meet_coactivities;

import p204p.dq60;

/* JADX INFO: loaded from: classes4.dex */
final class zzjg extends zzjt {
    private final Object zza;
    private final Object zzb;

    public zzjg(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("Null state");
        }
        this.zza = obj;
        if (obj2 == null) {
            throw new NullPointerException("Null metadata");
        }
        this.zzb = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzjt) {
            zzjt zzjtVar = (zzjt) obj;
            if (this.zza.equals(zzjtVar.zzb()) && this.zzb.equals(zzjtVar.zza())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        return dq60.m36615o("ThinLocalStateResult{state=", this.zza.toString(), ", metadata=", this.zzb.toString(), "}");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzjt
    public final Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzjt
    public final Object zzb() {
        return this.zza;
    }
}
