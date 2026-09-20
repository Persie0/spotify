package com.google.android.gms.internal.meet_coactivities;

import p204p.edb;
import p204p.fg90;
import p204p.kj90;
import p204p.klh;

/* JADX INFO: loaded from: classes.dex */
final class zzge extends zzin {
    private final fg90 zza;
    private final kj90 zzb;
    private final fg90 zzc;
    private final fg90 zzd;
    private final fg90 zze;
    private final fg90 zzf;

    public /* synthetic */ zzge(fg90 fg90Var, kj90 kj90Var, fg90 fg90Var2, fg90 fg90Var3, fg90 fg90Var4, fg90 fg90Var5, zzgd zzgdVar) {
        this.zza = fg90Var;
        this.zzb = kj90Var;
        this.zzc = fg90Var2;
        this.zzd = fg90Var3;
        this.zze = fg90Var4;
        this.zzf = fg90Var5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzin) {
            zzin zzinVar = (zzin) obj;
            if (this.zza.equals(zzinVar.zzd()) && this.zzb.equals(zzinVar.zzf()) && this.zzc.equals(zzinVar.zzb()) && this.zzd.equals(zzinVar.zza()) && this.zze.equals(zzinVar.zze()) && this.zzf.equals(zzinVar.zzc())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode();
    }

    public final String toString() {
        fg90 fg90Var = this.zzf;
        fg90 fg90Var2 = this.zze;
        fg90 fg90Var3 = this.zzd;
        fg90 fg90Var4 = this.zzc;
        kj90 kj90Var = this.zzb;
        String string = this.zza.toString();
        String string2 = kj90Var.toString();
        String string3 = fg90Var4.toString();
        String string4 = fg90Var3.toString();
        String string5 = fg90Var2.toString();
        String string6 = fg90Var.toString();
        StringBuilder sbM38573v = edb.m38573v("LiveSharingExecutors{internalExecutor=", string, ", heartbeatExecutor=", string2, ", coWatchingHandlerExecutor=");
        klh.m56844p(sbM38573v, string3, ", coDoingHandlerExecutor=", string4, ", outgoingIpcExecutor=");
        return klh.m56837i(sbM38573v, string5, ", incomingIpcExecutor=", string6, "}");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzin
    public final fg90 zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzin
    public final fg90 zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzin
    public final fg90 zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzin
    public final fg90 zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzin
    public final fg90 zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzin
    public final kj90 zzf() {
        return this.zzb;
    }
}
