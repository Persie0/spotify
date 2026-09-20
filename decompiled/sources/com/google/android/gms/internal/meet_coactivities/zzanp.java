package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzanp implements zzaew {
    final zzanq zza;
    final /* synthetic */ zzans zzb;

    public zzanp(zzans zzansVar, zzanq zzanqVar) {
        this.zzb = zzansVar;
        this.zza = zzanqVar;
    }

    private static final Integer zza(zzzw zzzwVar) {
        String str = (String) zzzwVar.zzb(zzans.zzf);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x01de  */
    @Override // com.google.android.gms.internal.meet_coactivities.zzaew
    public final void zzd(zzabe zzabeVar, zzaev zzaevVar, zzzw zzzwVar) {
        boolean z;
        zzanc zzancVar;
        synchronized (this.zzb.zzm) {
            try {
                zzans zzansVar = this.zzb;
                zzanh zzanhVar = zzansVar.zzs;
                zzanq zzanqVar = this.zza;
                zzanqVar.zzb = true;
                if (zzanhVar.zzc.contains(zzanqVar)) {
                    ArrayList arrayList = new ArrayList(zzanhVar.zzc);
                    arrayList.remove(zzanqVar);
                    zzanhVar = new zzanh(zzanhVar.zzb, Collections.unmodifiableCollection(arrayList), zzanhVar.zzd, zzanhVar.zzf, zzanhVar.zzg, zzanhVar.zza, zzanhVar.zzh, zzanhVar.zze);
                }
                zzansVar.zzs = zzanhVar;
                this.zzb.zzr.zza(zzabeVar.zza());
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.zzb.zzv.decrementAndGet() == Integer.MIN_VALUE) {
            zzabm zzabmVar = (zzabm) this.zzb.zzg;
            zzabmVar.zzc(new zzanl(this));
            zzabmVar.zzb();
            return;
        }
        zzanq zzanqVar2 = this.zza;
        if (zzanqVar2.zzc) {
            zzans.zzV(this.zzb, zzanqVar2);
            if (this.zzb.zzs.zzf == this.zza) {
                this.zzb.zzaj(zzabeVar, zzaevVar, zzzwVar);
                return;
            }
            return;
        }
        zzaev zzaevVar2 = zzaev.MISCARRIED;
        if (zzaevVar == zzaevVar2 && this.zzb.zzu.incrementAndGet() > 1000) {
            zzans.zzV(this.zzb, this.zza);
            if (this.zzb.zzs.zzf == this.zza) {
                this.zzb.zzaj(zzabe.zzj.zze("Too many transparent retries. Might be a bug in gRPC").zzd(new zzabg(zzabeVar, null)), zzaevVar, zzzwVar);
                return;
            }
            return;
        }
        if (this.zzb.zzs.zzf == null) {
            if (zzaevVar == zzaevVar2 || (zzaevVar == zzaev.REFUSED && this.zzb.zzt.compareAndSet(false, true))) {
                zzanq zzanqVarZzae = this.zzb.zzae(this.zza.zzd, true);
                if (zzanqVarZzae != null) {
                    zzans zzansVar2 = this.zzb;
                    if (zzansVar2.zzl) {
                        synchronized (zzansVar2.zzm) {
                            zzans zzansVar3 = this.zzb;
                            zzanh zzanhVar2 = zzansVar3.zzs;
                            zzanq zzanqVar3 = this.zza;
                            ArrayList arrayList2 = new ArrayList(zzanhVar2.zzd);
                            arrayList2.remove(zzanqVar3);
                            arrayList2.add(zzanqVarZzae);
                            zzansVar3.zzs = new zzanh(zzanhVar2.zzb, zzanhVar2.zzc, Collections.unmodifiableCollection(arrayList2), zzanhVar2.zzf, zzanhVar2.zzg, zzanhVar2.zza, zzanhVar2.zzh, zzanhVar2.zze);
                        }
                    }
                    this.zzb.zzd.execute(new zzanm(this, zzanqVarZzae));
                    return;
                }
                return;
            }
            if (zzaevVar == zzaev.DROPPED) {
                zzans zzansVar4 = this.zzb;
                if (zzansVar4.zzl) {
                    zzansVar4.zzai();
                }
            } else {
                this.zzb.zzt.set(true);
                zzans zzansVar5 = this.zzb;
                if (zzansVar5.zzl) {
                    Integer numZza = zza(zzzwVar);
                    boolean zContains = this.zzb.zzk.zzc.contains(zzabeVar.zza());
                    boolean z2 = (this.zzb.zzq == null || (!zContains && (numZza == null || numZza.intValue() >= 0))) ? false : !this.zzb.zzq.zzb();
                    if (zContains && !z2 && !zzabeVar.zzj() && numZza != null && numZza.intValue() > 0) {
                        numZza = 0;
                    }
                    boolean z3 = zContains && !z2;
                    if (z3) {
                        zzans.zzY(this.zzb, numZza);
                    }
                    synchronized (this.zzb.zzm) {
                        try {
                            zzans zzansVar6 = this.zzb;
                            zzanh zzanhVar3 = zzansVar6.zzs;
                            zzanq zzanqVar4 = this.zza;
                            ArrayList arrayList3 = new ArrayList(zzanhVar3.zzd);
                            arrayList3.remove(zzanqVar4);
                            zzansVar6.zzs = new zzanh(zzanhVar3.zzb, zzanhVar3.zzc, Collections.unmodifiableCollection(arrayList3), zzanhVar3.zzf, zzanhVar3.zzg, zzanhVar3.zza, zzanhVar3.zzh, zzanhVar3.zze);
                            if (z3) {
                                zzans zzansVar7 = this.zzb;
                                if (!zzansVar7.zzak(zzansVar7.zzs)) {
                                    if (!this.zzb.zzs.zzd.isEmpty()) {
                                    }
                                }
                                return;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    long nanos = 0;
                    if (zzansVar5.zzj == null) {
                        z = false;
                    } else {
                        boolean zContains2 = zzansVar5.zzj.zzf.contains(zzabeVar.zza());
                        Integer numZza2 = zza(zzzwVar);
                        boolean z4 = (this.zzb.zzq == null || (!zContains2 && (numZza2 == null || numZza2.intValue() >= 0))) ? false : !this.zzb.zzq.zzb();
                        zzans zzansVar8 = this.zzb;
                        if (zzansVar8.zzj.zza <= this.zza.zzd + 1 || z4) {
                            z = false;
                        } else if (numZza2 == null) {
                            if (zContains2) {
                                double dNextDouble = zzans.zzb.nextDouble() * zzansVar8.zzB;
                                zzans zzansVar9 = this.zzb;
                                zzansVar9.zzB = Math.min((long) (zzansVar9.zzB * zzansVar9.zzj.zzd), zzansVar9.zzj.zzc);
                                nanos = (long) dNextDouble;
                                z = true;
                            } else {
                                z = false;
                            }
                        } else if (numZza2.intValue() >= 0) {
                            nanos = TimeUnit.MILLISECONDS.toNanos(numZza2.intValue());
                            zzans zzansVar10 = this.zzb;
                            zzansVar10.zzB = zzansVar10.zzj.zzb;
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        zzanq zzanqVarZzae2 = this.zzb.zzae(this.zza.zzd + 1, false);
                        if (zzanqVarZzae2 != null) {
                            synchronized (this.zzb.zzm) {
                                zzans zzansVar11 = this.zzb;
                                zzancVar = new zzanc(zzansVar11.zzm);
                                zzansVar11.zzz = zzancVar;
                            }
                            zzancVar.zzb(this.zzb.zzh.schedule(new zzank(this, zzancVar, zzanqVarZzae2), nanos, TimeUnit.NANOSECONDS));
                            return;
                        }
                        return;
                    }
                }
            }
        }
        zzans.zzV(this.zzb, this.zza);
        if (this.zzb.zzs.zzf == this.zza) {
            this.zzb.zzaj(zzabeVar, zzaevVar, zzzwVar);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaew
    public final void zze(zzzw zzzwVar) {
        int i;
        int i2;
        if (this.zza.zzd > 0) {
            zzzr zzzrVar = zzans.zze;
            zzzwVar.zzd(zzzrVar);
            zzzwVar.zzf(zzzrVar, String.valueOf(this.zza.zzd));
        }
        zzans.zzV(this.zzb, this.zza);
        if (this.zzb.zzs.zzf == this.zza) {
            zzans zzansVar = this.zzb;
            if (zzansVar.zzq != null) {
                zzanr zzanrVar = zzansVar.zzq;
                do {
                    i = zzanrVar.zzd.get();
                    i2 = zzanrVar.zza;
                    if (i == i2) {
                        break;
                    }
                } while (!zzanrVar.zzd.compareAndSet(i, Math.min(zzanrVar.zzc + i, i2)));
            }
            zzabm zzabmVar = (zzabm) this.zzb.zzg;
            zzabmVar.zzc(new zzani(this, zzzwVar));
            zzabmVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaov
    public final void zzf(zzaou zzaouVar) {
        zzanh zzanhVar = this.zzb.zzs;
        c95.m31856v(zzanhVar.zzf != null, "Headers should be received prior to messages.");
        if (zzanhVar.zzf != this.zza) {
            zzahx.zze(zzaouVar);
            return;
        }
        zzabm zzabmVar = (zzabm) this.zzb.zzg;
        zzabmVar.zzc(new zzann(this, zzaouVar));
        zzabmVar.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaov
    public final void zzg() {
        if (this.zzb.zzn()) {
            zzabm zzabmVar = (zzabm) this.zzb.zzg;
            zzabmVar.zzc(new zzano(this));
            zzabmVar.zzb();
        }
    }
}
