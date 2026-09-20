package com.google.android.gms.internal.meet_coactivities;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzans implements zzaeu {
    private static final zzabe zza;
    private static final Random zzb;
    static final zzzr zze;
    static final zzzr zzf;
    private zzanc zzA;
    private long zzB;
    private zzabe zzC;
    private boolean zzD;
    private final zzaac zzc;
    private final Executor zzd;
    private final ScheduledExecutorService zzh;
    private final zzzw zzi;
    private final zzant zzj;
    private final zzahy zzk;
    private final boolean zzl;
    private final zzanb zzn;
    private final long zzo;
    private final long zzp;
    private final zzanr zzq;
    private zzanf zzw;
    private long zzx;
    private zzaew zzy;
    private zzanc zzz;
    private final Executor zzg = new zzabm(new zzamj(this));
    private final Object zzm = new Object();
    private final zzaia zzr = new zzaia();
    private volatile zzanh zzs = new zzanh(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
    private final AtomicBoolean zzt = new AtomicBoolean();
    private final AtomicInteger zzu = new AtomicInteger();
    private final AtomicInteger zzv = new AtomicInteger();

    static {
        zzzp zzzpVar = zzzw.zza;
        zze = zzzr.zzc("grpc-previous-rpc-attempts", zzzpVar);
        zzf = zzzr.zzc("grpc-retry-pushback-ms", zzzpVar);
        zza = zzabe.zzb.zze("Stream thrown away because RetriableStream committed");
        zzb = new Random();
    }

    public zzans(zzaac zzaacVar, zzzw zzzwVar, zzanb zzanbVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, zzant zzantVar, zzahy zzahyVar, zzanr zzanrVar) {
        this.zzc = zzaacVar;
        this.zzn = zzanbVar;
        this.zzo = j;
        this.zzp = j2;
        this.zzd = executor;
        this.zzh = scheduledExecutorService;
        this.zzi = zzzwVar;
        this.zzj = zzantVar;
        if (zzantVar != null) {
            this.zzB = zzantVar.zzb;
        }
        this.zzk = zzahyVar;
        c95.m31844j(zzantVar == null || zzahyVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.zzl = zzahyVar != null;
        this.zzq = zzanrVar;
    }

    public static /* bridge */ /* synthetic */ void zzV(zzans zzansVar, zzanq zzanqVar) {
        Runnable runnableZzaf = zzansVar.zzaf(zzanqVar);
        if (runnableZzaf != null) {
            zzansVar.zzd.execute(runnableZzaf);
        }
    }

    public static /* bridge */ /* synthetic */ void zzY(zzans zzansVar, Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            zzansVar.zzai();
            return;
        }
        synchronized (zzansVar.zzm) {
            try {
                zzanc zzancVar = zzansVar.zzA;
                if (zzancVar == null) {
                    return;
                }
                Future futureZza = zzancVar.zza();
                zzanc zzancVar2 = new zzanc(zzansVar.zzm);
                zzansVar.zzA = zzancVar2;
                if (futureZza != null) {
                    futureZza.cancel(false);
                }
                zzancVar2.zzb(zzansVar.zzh.schedule(new zzane(zzansVar, zzancVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzanq zzae(int i, boolean z) {
        int i2;
        do {
            i2 = this.zzv.get();
            if (i2 < 0) {
                return null;
            }
        } while (!this.zzv.compareAndSet(i2, i2 + 1));
        zzanq zzanqVar = new zzanq(i);
        zzamw zzamwVar = new zzamw(this, new zzana(this, zzanqVar));
        zzzw zzzwVar = this.zzi;
        zzzw zzzwVar2 = new zzzw();
        zzzwVar2.zze(zzzwVar);
        if (i > 0) {
            zzzwVar2.zzf(zze, String.valueOf(i));
        }
        zzanqVar.zza = zzp(zzzwVar2, zzamwVar, i, z);
        return zzanqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable zzaf(zzanq zzanqVar) {
        List list;
        Collection collectionSingleton;
        boolean z;
        Future future;
        Future future2;
        synchronized (this.zzm) {
            try {
                if (this.zzs.zzf != null) {
                    return null;
                }
                Collection collection = this.zzs.zzc;
                zzanh zzanhVar = this.zzs;
                c95.m31856v(zzanhVar.zzf == null, "Already committed");
                List list2 = zzanhVar.zzb;
                if (zzanhVar.zzc.contains(zzanqVar)) {
                    list = null;
                    collectionSingleton = Collections.singleton(zzanqVar);
                    z = true;
                } else {
                    list = list2;
                    collectionSingleton = Collections.EMPTY_LIST;
                    z = false;
                }
                this.zzs = new zzanh(list, collectionSingleton, zzanhVar.zzd, zzanqVar, zzanhVar.zzg, z, zzanhVar.zzh, zzanhVar.zze);
                this.zzn.zza(-this.zzx);
                zzanc zzancVar = this.zzz;
                boolean z2 = zzancVar != null ? zzancVar.zzc : false;
                if (zzancVar != null) {
                    Future futureZza = zzancVar.zza();
                    this.zzz = null;
                    future = futureZza;
                } else {
                    future = null;
                }
                zzanc zzancVar2 = this.zzA;
                if (zzancVar2 != null) {
                    Future futureZza2 = zzancVar2.zza();
                    this.zzA = null;
                    future2 = futureZza2;
                } else {
                    future2 = null;
                }
                return new zzaml(this, collection, zzanqVar, future, z2, future2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzag(zzamz zzamzVar) {
        Collection collection;
        synchronized (this.zzm) {
            try {
                if (!this.zzs.zza) {
                    this.zzs.zzb.add(zzamzVar);
                }
                collection = this.zzs.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzamzVar.zza((zzanq) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0093, code lost:
    
        if (r5 >= r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
    
        r6 = (com.google.android.gms.internal.meet_coactivities.zzamz) r3.get(r5);
        r6.zza(r10);
        r4 = r4 | (r6 instanceof com.google.android.gms.internal.meet_coactivities.zzang);
        r6 = r9.zzs;
        r8 = r6.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
    
        if (r8 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a7, code lost:
    
        if (r8 != r10) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a9, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        if (r6.zzg == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzah(zzanq zzanqVar) {
        int iMin;
        zzamx zzamxVar = null;
        int i = 0;
        boolean z = false;
        ArrayList arrayList = null;
        while (true) {
            synchronized (this.zzm) {
                try {
                    zzanh zzanhVar = this.zzs;
                    zzanq zzanqVar2 = zzanhVar.zzf;
                    if (zzanqVar2 == null || zzanqVar2 == zzanqVar) {
                        if (!zzanhVar.zzg) {
                            if (i == zzanhVar.zzb.size()) {
                                this.zzs = zzanhVar.zzc(zzanqVar);
                                if (!zzn()) {
                                    return;
                                } else {
                                    zzamxVar = new zzamx(this);
                                }
                            } else {
                                if (zzanqVar.zzb) {
                                    return;
                                }
                                iMin = Math.min(i + 128, zzanhVar.zzb.size());
                                if (arrayList == null) {
                                    arrayList = new ArrayList(zzanhVar.zzb.subList(i, iMin));
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(zzanhVar.zzb.subList(i, iMin));
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i = iMin;
        }
        if (zzamxVar != null) {
            zzabm zzabmVar = (zzabm) this.zzg;
            zzabmVar.zzc(zzamxVar);
            zzabmVar.zzb();
        } else {
            if (!z) {
                zzanqVar.zza.zzl(new zzanp(this, zzanqVar));
            }
            zzanqVar.zza.zzb(this.zzs.zzf == zzanqVar ? this.zzC : zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzai() {
        Future future;
        synchronized (this.zzm) {
            try {
                zzanc zzancVar = this.zzA;
                future = null;
                if (zzancVar != null) {
                    Future futureZza = zzancVar.zza();
                    this.zzA = null;
                    future = futureZza;
                }
                this.zzs = this.zzs.zzb();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaj(zzabe zzabeVar, zzaev zzaevVar, zzzw zzzwVar) {
        this.zzw = new zzanf(zzabeVar, zzaevVar, zzzwVar);
        if (this.zzv.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            zzabm zzabmVar = (zzabm) this.zzg;
            zzabmVar.zzc(new zzamy(this, zzabeVar, zzaevVar, zzzwVar));
            zzabmVar.zzb();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzak(zzanh zzanhVar) {
        return zzanhVar.zzf == null && zzanhVar.zze < this.zzk.zza && !zzanhVar.zzh;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zza(zzaia zzaiaVar) {
        zzanh zzanhVar;
        synchronized (this.zzm) {
            zzaiaVar.zzb("closed", this.zzr);
            zzanhVar = this.zzs;
        }
        if (zzanhVar.zzf != null) {
            zzaia zzaiaVar2 = new zzaia();
            zzanhVar.zzf.zza.zza(zzaiaVar2);
            zzaiaVar.zzb("committed", zzaiaVar2);
            return;
        }
        zzaia zzaiaVar3 = new zzaia();
        for (zzanq zzanqVar : zzanhVar.zzc) {
            zzaia zzaiaVar4 = new zzaia();
            zzanqVar.zza.zza(zzaiaVar4);
            zzaiaVar3.zza(zzaiaVar4);
        }
        zzaiaVar.zzb("open", zzaiaVar3);
    }

    public final void zzaa(Object obj) {
        zzanh zzanhVar = this.zzs;
        if (zzanhVar.zza) {
            zzanhVar.zzf.zza.zzm(this.zzc.zzc(obj));
        } else {
            zzag(new zzamv(this, obj));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzb(zzabe zzabeVar) {
        zzanq zzanqVar;
        zzanq zzanqVar2 = new zzanq(0);
        zzanqVar2.zza = new zzale();
        Runnable runnableZzaf = zzaf(zzanqVar2);
        if (runnableZzaf != null) {
            synchronized (this.zzm) {
                this.zzs = this.zzs.zzc(zzanqVar2);
            }
            runnableZzaf.run();
            zzaj(zzabeVar, zzaev.PROCESSED, new zzzw());
            return;
        }
        synchronized (this.zzm) {
            try {
                if (this.zzs.zzc.contains(this.zzs.zzf)) {
                    zzanqVar = this.zzs.zzf;
                } else {
                    this.zzC = zzabeVar;
                    zzanqVar = null;
                }
                zzanh zzanhVar = this.zzs;
                this.zzs = new zzanh(zzanhVar.zzb, zzanhVar.zzc, zzanhVar.zzd, zzanhVar.zzf, true, zzanhVar.zza, zzanhVar.zzh, zzanhVar.zze);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzanqVar != null) {
            zzanqVar.zza.zzb(zzabeVar);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zzc() {
        zzanh zzanhVar = this.zzs;
        if (zzanhVar.zza) {
            zzanhVar.zzf.zza.zzc();
        } else {
            zzag(new zzamp(this));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzd() {
        zzag(new zzamq(this));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zze() {
        zzag(new zzamt(this));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zzf(int i) {
        zzanh zzanhVar = this.zzs;
        if (zzanhVar.zza) {
            zzanhVar.zzf.zza.zzf(i);
        } else {
            zzag(new zzamu(this, i));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zzg(zzww zzwwVar) {
        zzag(new zzamm(this, zzwwVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzh(zzxj zzxjVar) {
        zzag(new zzamn(this, zzxjVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzi(zzxm zzxmVar) {
        zzag(new zzamo(this, zzxmVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzj(int i) {
        zzag(new zzamr(this, i));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzk(int i) {
        zzag(new zzams(this, i));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzl(zzaew zzaewVar) {
        zzanc zzancVar;
        zzanr zzanrVar;
        this.zzy = zzaewVar;
        zzabe zzabeVarZzo = zzo();
        if (zzabeVarZzo != null) {
            zzb(zzabeVarZzo);
            return;
        }
        synchronized (this.zzm) {
            this.zzs.zzb.add(new zzang(this));
        }
        zzanq zzanqVarZzae = zzae(0, false);
        if (zzanqVarZzae == null) {
            return;
        }
        if (this.zzl) {
            synchronized (this.zzm) {
                try {
                    this.zzs = this.zzs.zza(zzanqVarZzae);
                    zzancVar = null;
                    if (zzak(this.zzs) && ((zzanrVar = this.zzq) == null || zzanrVar.zza())) {
                        zzancVar = new zzanc(this.zzm);
                        this.zzA = zzancVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zzancVar != null) {
                zzancVar.zzb(this.zzh.schedule(new zzane(this, zzancVar), this.zzk.zzb, TimeUnit.NANOSECONDS));
            }
        }
        zzah(zzanqVarZzae);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zzm(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final boolean zzn() {
        Iterator it = this.zzs.zzc.iterator();
        while (it.hasNext()) {
            if (((zzanq) it.next()).zza.zzn()) {
                return true;
            }
        }
        return false;
    }

    public abstract zzabe zzo();

    public abstract zzaeu zzp(zzzw zzzwVar, zzwo zzwoVar, int i, boolean z);

    public abstract void zzq();
}
