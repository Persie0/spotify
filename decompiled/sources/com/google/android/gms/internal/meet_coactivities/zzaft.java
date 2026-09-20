package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p204p.c95;
import p204p.m12;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
public class zzaft extends zzwj {
    private static final zzwj zza;
    private final ScheduledFuture zzb;
    private final Executor zzc;
    private final zzxf zzd;
    private volatile boolean zze;
    private zzwi zzf;
    private zzwj zzg;
    private zzabe zzh;
    private List zzi = new ArrayList();
    private zzafs zzj;

    static {
        Logger.getLogger(zzaft.class.getName());
        zza = new zzafm();
    }

    public zzaft(Executor executor, ScheduledExecutorService scheduledExecutorService, zzxj zzxjVar) {
        ScheduledFuture<?> scheduledFutureSchedule;
        c95.m31848n(executor, "callExecutor");
        this.zzc = executor;
        c95.m31848n(scheduledExecutorService, "scheduler");
        this.zzd = zzxf.zzb();
        if (zzxjVar == null) {
            scheduledFutureSchedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jZzb = zzxjVar.zzb(timeUnit);
            long jAbs = Math.abs(jZzb);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit2.toNanos(1L);
            long jAbs2 = Math.abs(jZzb) % timeUnit2.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            if (jZzb < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(nanos);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            scheduledFutureSchedule = scheduledExecutorService.schedule(new zzaff(this, sb), jZzb, timeUnit);
        }
        this.zzb = scheduledFutureSchedule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(zzabe zzabeVar, boolean z) {
        zzwi zzwiVar;
        boolean z2;
        synchronized (this) {
            try {
                if (this.zzg == null) {
                    zzo(zza);
                    zzwiVar = this.zzf;
                    this.zzh = zzabeVar;
                    z2 = false;
                } else {
                    if (z) {
                        return;
                    }
                    zzwiVar = null;
                    z2 = true;
                }
                if (z2) {
                    zzm(new zzafi(this, zzabeVar));
                } else {
                    if (zzwiVar != null) {
                        this.zzc.execute(new zzafn(this, zzwiVar, zzabeVar));
                    }
                    zzn();
                }
                zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzm(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.zze) {
                    runnable.run();
                } else {
                    this.zzi.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzn() {
        zzafs zzafsVar;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.zzi.isEmpty()) {
                    break;
                }
                list = this.zzi;
                this.zzi = arrayList;
            }
            if (zzafsVar != null) {
                this.zzc.execute(new zzafg(this, zzafsVar));
            }
            list.clear();
            arrayList = list;
        }
        this.zzi = null;
        this.zze = true;
        zzafsVar = this.zzj;
        if (zzafsVar != null) {
            this.zzc.execute(new zzafg(this, zzafsVar));
        }
    }

    private final void zzo(zzwj zzwjVar) {
        zzwj zzwjVar2 = this.zzg;
        c95.m31857w(zzwjVar2 == null, "realCall already set to %s", zzwjVar2);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzg = zzwjVar;
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(this.zzg, "realCall");
        return m12VarM85614C.toString();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zza(String str, Throwable th) {
        zzabe zzabeVar = zzabe.zzb;
        zzabe zzabeVarZze = str != null ? zzabeVar.zze(str) : zzabeVar.zze("Call cancelled without message");
        if (th != null) {
            zzabeVarZze = zzabeVarZze.zzd(th);
        }
        zzl(zzabeVarZze, false);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzb() {
        zzm(new zzafl(this));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzc(int i) {
        if (this.zze) {
            this.zzg.zzc(i);
        } else {
            zzm(new zzafk(this, i));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzd(Object obj) {
        if (this.zze) {
            this.zzg.zzd(obj);
        } else {
            zzm(new zzafj(this, obj));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zze(zzwi zzwiVar, zzzw zzzwVar) {
        zzabe zzabeVar;
        boolean z;
        c95.m31856v(this.zzf == null, "already started");
        synchronized (this) {
            try {
                c95.m31848n(zzwiVar, "listener");
                this.zzf = zzwiVar;
                zzabeVar = this.zzh;
                z = this.zze;
                if (!z) {
                    zzafs zzafsVar = new zzafs(zzwiVar);
                    this.zzj = zzafsVar;
                    zzwiVar = zzafsVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzabeVar != null) {
            this.zzc.execute(new zzafn(this, zzwiVar, zzabeVar));
        } else if (z) {
            this.zzg.zze(zzwiVar, zzzwVar);
        } else {
            zzm(new zzafh(this, zzwiVar, zzzwVar));
        }
    }

    public final Runnable zzh(zzwj zzwjVar) {
        synchronized (this) {
            try {
                if (this.zzg != null) {
                    return null;
                }
                c95.m31848n(zzwjVar, "call");
                zzo(zzwjVar);
                return new zzafe(this, this.zzd);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void zzk() {
    }
}
