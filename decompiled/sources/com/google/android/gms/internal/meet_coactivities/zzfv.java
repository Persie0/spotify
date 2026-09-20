package com.google.android.gms.internal.meet_coactivities;

import p196j$.time.Duration;
import p204p.edb;

/* JADX INFO: loaded from: classes.dex */
final class zzfv extends zzgg {
    private final boolean zzb;
    private final Duration zzc;
    private final Duration zzd;
    private final boolean zze;

    public /* synthetic */ zzfv(boolean z, Duration duration, Duration duration2, boolean z2, zzfu zzfuVar) {
        this.zzb = z;
        this.zzc = duration;
        this.zzd = duration2;
        this.zze = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgg) {
            zzgg zzggVar = (zzgg) obj;
            if (this.zzb == zzggVar.zzd() && this.zzc.equals(zzggVar.zza()) && this.zzd.equals(zzggVar.zzb()) && this.zze == zzggVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((true != this.zzb ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ (true != this.zze ? 1237 : 1231);
    }

    public final String toString() {
        Duration duration = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(duration);
        StringBuilder sb = new StringBuilder("ClientConfigInfo{disableHeartbeating=");
        sb.append(this.zzb);
        sb.append(", heartbeatFrequency=");
        sb.append(strValueOf);
        sb.append(", seekDeterminationThreshold=");
        sb.append(strValueOf2);
        sb.append(", alwaysOverride=");
        return edb.m38570s(sb, this.zze, "}");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzgg
    public final Duration zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzgg
    public final Duration zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzgg
    public final boolean zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzgg
    public final boolean zzd() {
        return this.zzb;
    }
}
