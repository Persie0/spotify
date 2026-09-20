package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzagc implements zzald {
    private final Executor zzc;
    private final zzabm zzd;
    private Runnable zze;
    private Runnable zzf;
    private Runnable zzg;
    private zzalc zzh;
    private final zzyj zza = zzyj.zzb(zzagc.class, null);
    private final Object zzb = new Object();
    private Collection zzi = new LinkedHashSet();
    private volatile zzagb zzj = new zzagb();

    public zzagc(Executor executor, zzabm zzabmVar) {
        this.zzc = executor;
        this.zzd = zzabmVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyn
    public final zzyj zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaex
    public final zzaeu zzd(zzaac zzaacVar, zzzw zzzwVar, zzwe zzweVar, zzwr[] zzwrVarArr) {
        zzaeu zzahhVar;
        zzagb zzagbVar;
        int size;
        zzaex zzaexVarZzb;
        try {
            zzalz zzalzVar = new zzalz(zzaacVar, zzzwVar, zzweVar, new zzalg(zzwrVarArr));
            zzagb zzagbVar2 = this.zzj;
            while (true) {
                zzabe zzabeVar = zzagbVar2.zzb;
                if (zzabeVar == null) {
                    zzzc zzzcVar = zzagbVar2.zza;
                    if (zzzcVar != null && (zzaexVarZzb = zzahx.zzb(zzzcVar.zza(zzalzVar), zzweVar.zzo())) != null) {
                        zzahhVar = zzaexVarZzb.zzd(zzalzVar.zzc(), zzalzVar.zzb(), zzalzVar.zza(), zzwrVarArr);
                        break;
                    }
                    synchronized (this.zzb) {
                        try {
                            zzagbVar = this.zzj;
                            if (zzagbVar2 == zzagbVar) {
                                zzahhVar = new zzafz(this, zzalzVar, zzwrVarArr, null);
                                this.zzi.add(zzahhVar);
                                synchronized (this.zzb) {
                                    size = this.zzi.size();
                                }
                                if (size == 1) {
                                    this.zzd.zzc(this.zze);
                                }
                                for (zzwr zzwrVar : zzwrVarArr) {
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    break;
                }
                zzahhVar = new zzahh(zzabeVar, zzaev.PROCESSED, zzwrVarArr);
                break;
                zzagbVar2 = zzagbVar;
            }
            this.zzd.zzb();
            return zzahhVar;
        } catch (Throwable th2) {
            this.zzd.zzb();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzald
    public final Runnable zze(zzalc zzalcVar) {
        this.zzh = zzalcVar;
        this.zze = new zzafu(this, zzalcVar);
        this.zzf = new zzafv(this, zzalcVar);
        this.zzg = new zzafw(this, zzalcVar);
        return null;
    }

    public final void zzl(zzzc zzzcVar) {
        Runnable runnable;
        synchronized (this.zzb) {
            this.zzj = this.zzj.zza(zzzcVar);
            if (zzzcVar != null && zzn()) {
                ArrayList arrayList = new ArrayList(this.zzi);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    zzafz zzafzVar = (zzafz) arrayList.get(i);
                    zzyw zzywVarZza = zzzcVar.zza(zzafzVar.zzb);
                    zzwe zzweVarZza = zzafzVar.zzb.zza();
                    zzaex zzaexVarZzb = zzahx.zzb(zzywVarZza, zzweVarZza.zzo());
                    if (zzaexVarZzb != null) {
                        Executor executorZzn = this.zzc;
                        if (zzweVarZza.zzn() != null) {
                            executorZzn = zzweVarZza.zzn();
                        }
                        Runnable runnableZzp = zzafz.zzp(zzafzVar, zzaexVarZzb);
                        if (runnableZzp != null) {
                            executorZzn.execute(runnableZzp);
                        }
                        arrayList2.add(zzafzVar);
                    }
                }
                synchronized (this.zzb) {
                    try {
                        if (zzn()) {
                            this.zzi.removeAll(arrayList2);
                            if (this.zzi.isEmpty()) {
                                this.zzi = new LinkedHashSet();
                            }
                            if (!zzn()) {
                                this.zzd.zzc(this.zzf);
                                if (this.zzj.zzb != null && (runnable = this.zzg) != null) {
                                    this.zzd.zzc(runnable);
                                    this.zzg = null;
                                }
                            }
                            this.zzd.zzb();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzald
    public final void zzm(zzabe zzabeVar) {
        Runnable runnable;
        synchronized (this.zzb) {
            try {
                if (this.zzj.zzb != null) {
                    return;
                }
                this.zzj = this.zzj.zzb(zzabeVar);
                this.zzd.zzc(new zzafx(this, zzabeVar));
                if (!zzn() && (runnable = this.zzg) != null) {
                    this.zzd.zzc(runnable);
                    this.zzg = null;
                }
                this.zzd.zzb();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzn() {
        boolean z;
        synchronized (this.zzb) {
            z = !this.zzi.isEmpty();
        }
        return z;
    }
}
