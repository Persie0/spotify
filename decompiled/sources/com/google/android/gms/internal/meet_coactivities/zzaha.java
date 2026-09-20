package com.google.android.gms.internal.meet_coactivities;

import java.io.IOException;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzaha implements Runnable {
    final /* synthetic */ zzahd zza;
    private final zzaaj zzb;

    public zzaha(zzahd zzahdVar, zzaaj zzaajVar) {
        this.zza = zzahdVar;
        c95.m31848n(zzaajVar, "savedListener");
        this.zzb = zzaajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        zzagz zzagzVar;
        zzabm zzabmVar;
        Logger logger = zzahd.zzg;
        Level level = Level.FINER;
        if (logger.isLoggable(level)) {
            zzahd.zzg.logp(level, "io.grpc.internal.DnsNameResolver$Resolve", "run", "Attempting DNS resolution of ".concat(String.valueOf(this.zza.zzq)));
        }
        zzagx zzagxVarZzi = null;
        try {
            try {
                zzxn zzxnVarZzg = zzahd.zzg(this.zza);
                zzaak zzaakVarZzc = zzaal.zzc();
                if (zzxnVarZzg == null) {
                    zzagxVarZzi = this.zza.zzi(false);
                    if (zzagxVarZzi.zza != null) {
                        this.zzb.zza(zzagxVarZzi.zza);
                        z = zzagxVarZzi.zza == null;
                        zzabmVar = this.zza.zzu;
                        zzagzVar = new zzagz(this, z);
                    } else {
                        if (zzagxVarZzi.zzb != null) {
                            zzaakVarZzc.zza(zzagxVarZzi.zzb);
                        }
                        if (zzagxVarZzi.zzc != null) {
                            zzaakVarZzc.zzc(zzagxVarZzi.zzc);
                        }
                    }
                    zzabmVar.zzc(zzagzVar);
                    zzabmVar.zzb();
                }
                if (zzahd.zzg.isLoggable(level)) {
                    zzahd.zzg.logp(level, "io.grpc.internal.DnsNameResolver$Resolve", "run", "Using proxy address " + zzxnVarZzg.toString());
                }
                zzaakVarZzc.zza(Collections.singletonList(zzxnVarZzg));
                this.zzb.zzb(zzaakVarZzc.zzd());
            } catch (IOException e) {
                this.zzb.zza(zzabe.zzk.zze("Unable to resolve host " + this.zza.zzq).zzd(e));
            }
            z = zzagxVarZzi != null && zzagxVarZzi.zza == null;
            zzabmVar = this.zza.zzu;
            zzagzVar = new zzagz(this, z);
            zzabmVar.zzc(zzagzVar);
            zzabmVar.zzb();
        } catch (Throwable th) {
            z = 0 != 0 && null.zza == null;
            zzabm zzabmVar2 = this.zza.zzu;
            zzabmVar2.zzc(new zzagz(this, z));
            zzabmVar2.zzb();
            throw th;
        }
    }
}
