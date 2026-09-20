package com.google.android.gms.internal.meet_coactivities;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import p204p.c95;
import p204p.j561;
import p204p.m12;
import p204p.s571;
import p204p.u651;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
final class zzakp extends zzzj implements zzyi {
    static final Logger zza = Logger.getLogger(zzakp.class.getName());
    static final zzabe zzb;
    static final zzabe zzc;
    private static final zzalb zzf;
    private static final zzyf zzg;
    private static final zzyv zzh;
    private static final zzwj zzi;
    private final zzwf zzA;
    private final List zzB;
    private zzaan zzC;
    private boolean zzD;
    private zzajv zzE;
    private volatile zzzc zzF;
    private boolean zzG;
    private final Set zzH;
    private Collection zzI;
    private final Object zzJ;
    private final Set zzK;
    private final zzagc zzL;
    private final zzako zzM;
    private final AtomicBoolean zzN;
    private boolean zzO;
    private volatile boolean zzP;
    private final CountDownLatch zzQ;
    private final zzaej zzR;
    private final zzaek zzS;
    private final zzaem zzT;
    private final zzwh zzU;
    private final zzya zzV;
    private final zzakh zzW;
    private zzalb zzX;
    private boolean zzY;
    private final boolean zzZ;
    private final zzanb zzaa;
    private final long zzab;
    private final long zzac;
    private final boolean zzad;
    private final zzalc zzae;
    private final zzaji zzaf;
    private final zzami zzag;
    private int zzah;
    private final zzahf zzai;
    final zzabm zzd;
    final zzahz zze;
    private final zzyj zzj;
    private final String zzk;
    private final URI zzl;
    private final zzaao zzm;
    private final zzaag zzn;
    private final zzaee zzo;
    private final zzaez zzp;
    private final zzakj zzq;
    private final Executor zzr;
    private final zzalf zzs;
    private final zzajn zzt;
    private final zzajn zzu;
    private final zzaox zzv;
    private final zzxm zzw;
    private final j561 zzx;
    private final long zzy;
    private final zzafc zzz;

    static {
        zzabe zzabeVar = zzabe.zzk;
        zzabeVar.zze("Channel shutdownNow invoked");
        zzb = zzabeVar.zze("Channel shutdown invoked");
        zzc = zzabeVar.zze("Subchannel shutdown invoked");
        zzf = new zzalb(null, new HashMap(), new HashMap(), null, null, null);
        zzg = new zzaja();
        zzh = new zzajd();
        zzi = new zzajf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzakp(zzakv zzakvVar, zzaez zzaezVar, URI uri, zzaao zzaaoVar, zzahf zzahfVar, zzalf zzalfVar, j561 j561Var, List list, zzaox zzaoxVar) {
        zzabm zzabmVar = new zzabm(new zzaje(this));
        this.zzd = zzabmVar;
        this.zzz = new zzafc();
        this.zzH = new HashSet(16, 0.75f);
        this.zzJ = new Object();
        this.zzK = new HashSet(1, 0.75f);
        this.zzM = new zzako(this, null);
        this.zzN = new AtomicBoolean(false);
        this.zzQ = new CountDownLatch(1);
        this.zzah = 1;
        this.zzX = zzf;
        this.zzY = false;
        this.zzaa = new zzanb();
        int i = zzxj.zza;
        zzajm zzajmVar = new zzajm(this, 0 == true ? 1 : 0);
        this.zzae = zzajmVar;
        this.zze = new zzajp(this, 0 == true ? 1 : 0);
        this.zzaf = new zzaji(this, null);
        String str = zzakvVar.zzh;
        c95.m31848n(str, "target");
        this.zzk = str;
        zzyj zzyjVarZzc = zzyj.zzc("Channel", str);
        this.zzj = zzyjVarZzc;
        c95.m31848n(zzaoxVar, "timeProvider");
        this.zzv = zzaoxVar;
        zzalf zzalfVar2 = zzakvVar.zzd;
        c95.m31848n(zzalfVar2, "executorPool");
        this.zzs = zzalfVar2;
        Executor executor = (Executor) zzalfVar2.zza();
        c95.m31848n(executor, "executor");
        Executor executor2 = executor;
        this.zzr = executor2;
        zzalf zzalfVar3 = zzakvVar.zze;
        c95.m31848n(zzalfVar3, "offloadExecutorPool");
        zzajn zzajnVar = new zzajn(zzalfVar3);
        this.zzu = zzajnVar;
        zzaei zzaeiVar = new zzaei(zzaezVar, null, zzajnVar);
        this.zzp = zzaeiVar;
        new zzaei(zzaezVar, null, zzajnVar);
        zzakj zzakjVar = new zzakj(zzaeiVar.zzb(), null);
        this.zzq = zzakjVar;
        zzaem zzaemVar = new zzaem(zzyjVarZzc, 0, zzaoxVar.zza(), s571.m77251j("Channel for '", str, "'"));
        this.zzT = zzaemVar;
        zzael zzaelVar = new zzael(zzaemVar, zzaoxVar);
        this.zzU = zzaelVar;
        zzaau zzaauVar = zzahx.zzg;
        this.zzad = true;
        zzaee zzaeeVar = new zzaee(zzzi.zzb(), zzakvVar.zzi);
        this.zzo = zzaeeVar;
        c95.m31848n(uri, "targetUri");
        this.zzl = uri;
        c95.m31848n(zzaaoVar, "nameResolverProvider");
        this.zzm = zzaaoVar;
        zzaoa zzaoaVar = new zzaoa(true, 5, 5, zzaeeVar);
        zzaae zzaaeVarZzb = zzaag.zzb();
        zzaaeVarZzb.zzb(443);
        zzaaeVarZzb.zzd(zzaauVar);
        zzaaeVarZzb.zzg(zzabmVar);
        zzaaeVarZzb.zze(zzakjVar);
        zzaaeVarZzb.zzf(zzaoaVar);
        zzaaeVarZzb.zza(zzaelVar);
        zzaaeVarZzb.zzc(zzajnVar);
        zzaag zzaagVarZzh = zzaaeVarZzb.zzh();
        this.zzn = zzaagVarZzh;
        this.zzC = zzn(uri, null, zzaaoVar, zzaagVarZzh);
        c95.m31848n(zzalfVar, "balancerRpcExecutorPool");
        this.zzt = new zzajn(zzalfVar);
        zzagc zzagcVar = new zzagc(executor2, zzabmVar);
        this.zzL = zzagcVar;
        zzagcVar.zze(zzajmVar);
        this.zzai = zzahfVar;
        this.zzZ = true;
        zzakh zzakhVar = new zzakh(this, this.zzC.zza(), null);
        this.zzW = zzakhVar;
        this.zzA = zzwn.zza(zzakhVar, list);
        this.zzB = new ArrayList(zzakvVar.zzg);
        c95.m31848n(j561Var, "stopwatchSupplier");
        this.zzx = j561Var;
        long j = zzakvVar.zzl;
        if (j == -1) {
            this.zzy = -1L;
        } else {
            c95.m31840f(j, "invalid idleTimeoutMillis %s", j >= zzakv.zzb);
            this.zzy = zzakvVar.zzl;
        }
        this.zzag = new zzami(new zzajr(this, null), zzabmVar, zzaeiVar.zzb(), new u651());
        zzxm zzxmVar = zzakvVar.zzj;
        c95.m31848n(zzxmVar, "decompressorRegistry");
        this.zzw = zzxmVar;
        c95.m31848n(zzakvVar.zzk, "compressorRegistry");
        this.zzac = 16777216L;
        this.zzab = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        zzajb zzajbVar = new zzajb(this, zzaoxVar);
        this.zzR = zzajbVar;
        this.zzS = zzajbVar.zza();
        zzya zzyaVar = zzakvVar.zzm;
        zzyaVar.getClass();
        this.zzV = zzyaVar;
        zzyaVar.zzc(this);
        zzaad.zza();
    }

    public static /* bridge */ /* synthetic */ Executor zzI(zzakp zzakpVar, zzwe zzweVar) {
        Executor executorZzn = zzweVar.zzn();
        return executorZzn == null ? zzakpVar.zzr : executorZzn;
    }

    public static /* bridge */ /* synthetic */ void zzO(zzakp zzakpVar) {
        zzakpVar.zzaf(true);
        zzakpVar.zzL.zzl(null);
        zzakpVar.zzU.zza(2, "Entering IDLE state");
        zzakpVar.zzz.zza(zzxa.IDLE);
        if (zzakpVar.zze.zzd(zzakpVar.zzJ, zzakpVar.zzL)) {
            zzakpVar.zzU();
        }
    }

    public static /* bridge */ /* synthetic */ void zzP(zzakp zzakpVar) {
        if (!zzakpVar.zzP && zzakpVar.zzN.get() && zzakpVar.zzH.isEmpty() && zzakpVar.zzK.isEmpty()) {
            zzakpVar.zzU.zza(2, "Terminated");
            zzakpVar.zzV.zzf(zzakpVar);
            zzakpVar.zzs.zzb(zzakpVar.zzr);
            zzakpVar.zzt.zzb();
            zzakpVar.zzu.zzb();
            zzakpVar.zzp.close();
            zzakpVar.zzP = true;
            zzakpVar.zzQ.countDown();
        }
    }

    public static /* bridge */ /* synthetic */ void zzQ(zzakp zzakpVar) {
        zzakpVar.zzd.zzd();
        if (zzakpVar.zzD) {
            zzakpVar.zzC.zzb();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzae() {
        long j = this.zzy;
        if (j == -1) {
            return;
        }
        this.zzag.zzi(j, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf(boolean z) {
        this.zzd.zzd();
        if (z) {
            c95.m31856v(this.zzD, "nameResolver is not started");
            c95.m31856v(this.zzE != null, "lbHelper is null");
        }
        zzaan zzaanVar = this.zzC;
        if (zzaanVar != null) {
            zzaanVar.zzc();
            this.zzD = false;
            if (z) {
                this.zzC = zzn(this.zzl, null, this.zzm, this.zzn);
            } else {
                this.zzC = null;
            }
        }
        zzajv zzajvVar = this.zzE;
        if (zzajvVar != null) {
            zzajvVar.zza.zzc();
            this.zzE = null;
        }
        this.zzF = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzag(zzzc zzzcVar) {
        this.zzF = zzzcVar;
        this.zzL.zzl(zzzcVar);
    }

    public static zzaan zzn(URI uri, String str, zzaao zzaaoVar, zzaag zzaagVar) {
        zzaan zzaanVarZza = zzaaoVar.zza(uri, zzaagVar);
        if (zzaanVarZza != null) {
            return new zzanz(zzaanVarZza, new zzaeg(new zzahf(), zzaagVar.zzg(), zzaagVar.zze()), zzaagVar.zze());
        }
        throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(uri)));
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60522v(this.zzj.zza(), "logId");
        m12VarM85614C.m60523w(this.zzk, "target");
        return m12VarM85614C.toString();
    }

    public final void zzU() {
        this.zzd.zzd();
        if (this.zzN.get() || this.zzG) {
            return;
        }
        if (this.zze.zze()) {
            this.zzag.zzh(false);
        } else {
            zzae();
        }
        if (this.zzE == null) {
            this.zzU.zza(2, "Exiting idle mode");
            zzajv zzajvVar = new zzajv(this, null);
            zzajvVar.zza = new zzadw(this.zzo, zzajvVar);
            this.zzE = zzajvVar;
            this.zzz.zza(zzxa.CONNECTING);
            this.zzC.zzd(new zzajy(this, zzajvVar, this.zzC));
            this.zzD = true;
        }
    }

    public final void zzV(Throwable th) {
        if (this.zzG) {
            return;
        }
        this.zzG = true;
        this.zzag.zzh(true);
        zzaf(false);
        zzag(new zzajc(this, th));
        this.zzW.zzg(null);
        this.zzU.zza(4, "PANIC! Entering TRANSIENT_FAILURE");
        this.zzz.zza(zzxa.TRANSIENT_FAILURE);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwf
    public final zzwj zza(zzaac zzaacVar, zzwe zzweVar) {
        return this.zzA.zza(zzaacVar, zzweVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwf
    public final String zzb() {
        return this.zzA.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyn
    public final zzyj zzc() {
        return this.zzj;
    }
}
