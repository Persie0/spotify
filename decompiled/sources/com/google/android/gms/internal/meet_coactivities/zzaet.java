package com.google.android.gms.internal.meet_coactivities;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p204p.c95;
import p204p.ckr;
import p204p.m12;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
final class zzaet extends zzwj {
    private static final Logger zza = Logger.getLogger(zzaet.class.getName());
    private static final double zzb;
    private final zzaac zzc;
    private final Executor zzd;
    private final boolean zze;
    private final zzaek zzf;
    private final zzxf zzg;
    private zzaen zzh;
    private final boolean zzi;
    private zzwe zzj;
    private zzaeu zzk;
    private boolean zzl;
    private boolean zzm;
    private final ScheduledExecutorService zzn;
    private zzxm zzo = zzxm.zza();
    private final zzaji zzp;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        zzb = TimeUnit.SECONDS.toNanos(1L);
    }

    public zzaet(zzaac zzaacVar, Executor executor, zzwe zzweVar, zzaji zzajiVar, ScheduledExecutorService scheduledExecutorService, zzaek zzaekVar, zzyf zzyfVar) {
        int i = zzwx.zza;
        this.zzc = zzaacVar;
        zzaacVar.zzf();
        System.identityHashCode(this);
        int i2 = zzaqa.zza;
        if (executor == ckr.f39074a) {
            this.zzd = new zzaob();
            this.zze = true;
        } else {
            this.zzd = new zzaoi(executor);
            this.zze = false;
        }
        this.zzf = zzaekVar;
        this.zzg = zzxf.zzb();
        this.zzi = zzaacVar.zzb() == zzaaa.UNARY || zzaacVar.zzb() == zzaaa.SERVER_STREAMING;
        this.zzj = zzweVar;
        this.zzp = zzajiVar;
        this.zzn = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzxj zzq() {
        zzxj zzxjVarZzi = this.zzj.zzi();
        if (zzxjVarZzi == null) {
            return null;
        }
        return zzxjVarZzi;
    }

    private final void zzr(Object obj) {
        c95.m31856v(this.zzk != null, "Not started");
        c95.m31856v(!this.zzl, "call was cancelled");
        c95.m31856v(!this.zzm, "call was half-closed");
        try {
            zzaeu zzaeuVar = this.zzk;
            if (zzaeuVar instanceof zzans) {
                ((zzans) zzaeuVar).zzaa(obj);
            } else {
                zzaeuVar.zzm(this.zzc.zzc(obj));
            }
            if (this.zzi) {
                return;
            }
            this.zzk.zzc();
        } catch (Error e) {
            this.zzk.zzb(zzabe.zzb.zze("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.zzk.zzb(zzabe.zzb.zzd(e2).zze("Failed to stream message"));
        }
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(this.zzc, "method");
        return m12VarM85614C.toString();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zza(String str, Throwable th) {
        int i = zzaqa.zza;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            zza.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.zzl) {
            return;
        }
        this.zzl = true;
        try {
            if (this.zzk != null) {
                zzabe zzabeVar = zzabe.zzb;
                zzabe zzabeVarZze = str != null ? zzabeVar.zze(str) : zzabeVar.zze("Call cancelled without message");
                if (th != null) {
                    zzabeVarZze = zzabeVarZze.zzd(th);
                }
                this.zzk.zzb(zzabeVarZze);
            }
            if (this.zzh != null) {
            }
        } finally {
            zzaen zzaenVar = this.zzh;
            if (zzaenVar != null) {
                zzaenVar.zzd();
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzb() {
        int i = zzaqa.zza;
        c95.m31856v(this.zzk != null, "Not started");
        c95.m31856v(!this.zzl, "call was cancelled");
        c95.m31856v(!this.zzm, "call already half-closed");
        this.zzm = true;
        this.zzk.zzd();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzc(int i) {
        int i2 = zzaqa.zza;
        c95.m31856v(this.zzk != null, "Not started");
        this.zzk.zzf(i);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzd(Object obj) {
        int i = zzaqa.zza;
        zzr(obj);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zze(zzwi zzwiVar, zzzw zzzwVar) {
        zzaeu zzajgVar;
        int i = zzaqa.zza;
        c95.m31856v(this.zzk == null, "Already started");
        c95.m31856v(!this.zzl, "call was cancelled");
        c95.m31848n(zzwiVar, "observer");
        c95.m31848n(zzzwVar, "headers");
        zzwe zzweVar = this.zzj;
        zzwc zzwcVar = zzaky.zza;
        zzaky zzakyVar = (zzaky) zzweVar.zzl(zzwcVar);
        if (zzakyVar != null) {
            Long l = zzakyVar.zzb;
            if (l != null) {
                zzxj zzxjVarZzc = zzxj.zzc(l.longValue(), TimeUnit.NANOSECONDS);
                zzxj zzxjVarZzi = this.zzj.zzi();
                if (zzxjVarZzi == null || zzxjVarZzc.compareTo(zzxjVarZzi) < 0) {
                    this.zzj = this.zzj.zza(zzxjVarZzc);
                }
            }
            Boolean bool = zzakyVar.zzc;
            if (bool != null) {
                this.zzj = bool.booleanValue() ? this.zzj.zzg() : this.zzj.zzh();
            }
            if (zzakyVar.zzd != null) {
                Integer numZzj = this.zzj.zzj();
                if (numZzj != null) {
                    this.zzj = this.zzj.zzc(Math.min(numZzj.intValue(), zzakyVar.zzd.intValue()));
                } else {
                    this.zzj = this.zzj.zzc(zzakyVar.zzd.intValue());
                }
            }
            if (zzakyVar.zze != null) {
                Integer numZzk = this.zzj.zzk();
                if (numZzk != null) {
                    this.zzj = this.zzj.zzd(Math.min(numZzk.intValue(), zzakyVar.zze.intValue()));
                } else {
                    this.zzj = this.zzj.zzd(zzakyVar.zze.intValue());
                }
            }
        }
        zzwv zzwvVar = zzwu.zza;
        zzxm zzxmVar = this.zzo;
        zzzwVar.zzd(zzahx.zzf);
        zzzwVar.zzd(zzahx.zzb);
        zzzr zzzrVar = zzahx.zzc;
        zzzwVar.zzd(zzzrVar);
        byte[] bArrZza = zzyh.zza(zzxmVar);
        if (bArrZza.length != 0) {
            zzzwVar.zzf(zzzrVar, bArrZza);
        }
        zzzwVar.zzd(zzahx.zzd);
        zzzwVar.zzd(zzahx.zze);
        zzxj zzxjVarZzq = zzq();
        boolean z = zzxjVarZzq != null && zzxjVarZzq.equals(null);
        zzaen zzaenVar = new zzaen(this, zzxjVarZzq, z);
        this.zzh = zzaenVar;
        if (zzxjVarZzq == null || zzaenVar.zzd > 0) {
            zzaji zzajiVar = this.zzp;
            zzaac zzaacVar = this.zzc;
            zzwe zzweVar2 = this.zzj;
            zzxf zzxfVar = this.zzg;
            if (zzajiVar.zzb.zzad) {
                zzaky zzakyVar2 = (zzaky) zzweVar2.zzl(zzwcVar);
                zzajgVar = new zzajg(zzajiVar, zzaacVar, zzzwVar, zzweVar2, zzakyVar2 == null ? null : zzakyVar2.zzf, zzakyVar2 != null ? zzakyVar2.zzg : null, zzxfVar);
            } else {
                zzwr[] zzwrVarArrZzh = zzahx.zzh(zzweVar2, zzzwVar, 0, false);
                zzxf zzxfVarZza = zzxfVar.zza();
                try {
                    zzajgVar = zzajiVar.zzb.zzL.zzd(zzaacVar, zzzwVar, zzweVar2, zzwrVarArrZzh);
                    zzxfVar.zze(zzxfVarZza);
                } catch (Throwable th) {
                    zzxfVar.zze(zzxfVarZza);
                    throw th;
                }
            }
            this.zzk = zzajgVar;
        } else {
            zzwr[] zzwrVarArrZzh2 = zzahx.zzh(this.zzj, zzzwVar, 0, false);
            String str = true != z ? "CallOptions" : "Context";
            Long l2 = (Long) this.zzj.zzl(zzwr.zza);
            double d = this.zzh.zzd;
            double d2 = zzb;
            this.zzk = new zzahh(zzabe.zzd.zze(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(d / d2), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d2))), zzaev.PROCESSED, zzwrVarArrZzh2);
        }
        if (this.zze) {
            this.zzk.zze();
        }
        if (this.zzj.zzj() != null) {
            this.zzk.zzj(this.zzj.zzj().intValue());
        }
        if (this.zzj.zzk() != null) {
            this.zzk.zzk(this.zzj.zzk().intValue());
        }
        if (zzxjVarZzq != null) {
            this.zzk.zzh(zzxjVarZzq);
        }
        this.zzk.zzg(zzwvVar);
        this.zzk.zzi(this.zzo);
        this.zzf.zzb();
        this.zzk.zzl(new zzaes(this, zzwiVar));
        this.zzh.zzc();
    }

    public final zzaet zzm(zzxm zzxmVar) {
        this.zzo = zzxmVar;
        return this;
    }
}
