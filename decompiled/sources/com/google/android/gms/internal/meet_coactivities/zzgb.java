package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import p204p.dq60;
import p204p.edb;
import p204p.klh;
import p204p.xv1;

/* JADX INFO: loaded from: classes4.dex */
final class zzgb extends zzil {
    private final Context zza;
    private final zzcf zzb;
    private final String zzc;
    private final zzp zzd;
    private final xv1 zze;

    public /* synthetic */ zzgb(Context context, zzcf zzcfVar, String str, zzp zzpVar, xv1 xv1Var, zzga zzgaVar) {
        this.zza = context;
        this.zzb = zzcfVar;
        this.zzc = str;
        this.zzd = zzpVar;
        this.zze = xv1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzil) {
            zzil zzilVar = (zzil) obj;
            if (this.zza.equals(zzilVar.zza()) && this.zzb.equals(zzilVar.zzc()) && this.zzc.equals(zzilVar.zze()) && this.zzd.equals(zzilVar.zzb()) && this.zze.equals(zzilVar.zzd())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode();
    }

    public final String toString() {
        xv1 xv1Var = this.zze;
        zzp zzpVar = this.zzd;
        zzcf zzcfVar = this.zzb;
        String string = this.zza.toString();
        String string2 = zzcfVar.toString();
        String string3 = zzpVar.toString();
        String string4 = xv1Var.toString();
        StringBuilder sbM38573v = edb.m38573v("LiveSharingConnection{appContext=", string, ", ipcManager=", string2, ", activityName=");
        klh.m56844p(sbM38573v, this.zzc, ", startInfo=", string3, ", addonSessionHandler=");
        return dq60.m36616p(string4, "}", sbM38573v);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzil
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzil
    public final zzp zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzil
    public final zzcf zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzil
    public final xv1 zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzil
    public final String zze() {
        return this.zzc;
    }
}
