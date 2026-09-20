package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import p204p.xv1;

/* JADX INFO: loaded from: classes4.dex */
final class zzfz extends zzik {
    private Context zza;
    private zzcf zzb;
    private String zzc;
    private zzp zzd;
    private xv1 zze;

    @Override // com.google.android.gms.internal.meet_coactivities.zzik
    public final zzik zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null activityName");
        }
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzik
    public final zzik zzb(xv1 xv1Var) {
        if (xv1Var == null) {
            throw new NullPointerException("Null addonSessionHandler");
        }
        this.zze = xv1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzik
    public final zzik zzc(Context context) {
        if (context == null) {
            throw new NullPointerException("Null appContext");
        }
        this.zza = context;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzik
    public final zzik zzd(zzcf zzcfVar) {
        if (zzcfVar == null) {
            throw new NullPointerException("Null ipcManager");
        }
        this.zzb = zzcfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzik
    public final zzik zze(zzp zzpVar) {
        if (zzpVar == null) {
            throw new NullPointerException("Null startInfo");
        }
        this.zzd = zzpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzik
    public final zzil zzf() {
        zzcf zzcfVar;
        String str;
        zzp zzpVar;
        xv1 xv1Var;
        Context context = this.zza;
        if (context != null && (zzcfVar = this.zzb) != null && (str = this.zzc) != null && (zzpVar = this.zzd) != null && (xv1Var = this.zze) != null) {
            return new zzgb(context, zzcfVar, str, zzpVar, xv1Var, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" appContext");
        }
        if (this.zzb == null) {
            sb.append(" ipcManager");
        }
        if (this.zzc == null) {
            sb.append(" activityName");
        }
        if (this.zzd == null) {
            sb.append(" startInfo");
        }
        if (this.zze == null) {
            sb.append(" addonSessionHandler");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
