package com.google.android.gms.internal.meet_coactivities;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p204p.c95;
import p204p.j561;
import p204p.m12;
import p204p.u651;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
final class zzaiu implements zzyi, zzaoy {
    private final zzyj zza;
    private final String zzb;
    private final zzain zzc;
    private final zzaez zzd;
    private final ScheduledExecutorService zze;
    private final zzya zzf;
    private final zzaek zzg;
    private final zzwh zzh;
    private final List zzi;
    private final zzabm zzj;
    private final zzaio zzk;
    private volatile List zzl;
    private final u651 zzm;
    private zzabl zzn;
    private zzabl zzo;
    private zzald zzp;
    private zzafa zzs;
    private volatile zzald zzt;
    private zzabe zzv;
    private zzahg zzw;
    private final Collection zzq = new ArrayList();
    private final zzahz zzr = new zzaib(this);
    private volatile zzxb zzu = zzxb.zzb(zzxa.IDLE);

    public zzaiu(List list, String str, String str2, zzahf zzahfVar, zzaez zzaezVar, ScheduledExecutorService scheduledExecutorService, j561 j561Var, zzabm zzabmVar, zzain zzainVar, zzya zzyaVar, zzaek zzaekVar, zzaem zzaemVar, zzyj zzyjVar, zzwh zzwhVar, List list2) {
        c95.m31848n(list, "addressGroups");
        c95.m31844j(!list.isEmpty(), "addressGroups is empty");
        zzI(list, "addressGroups contains null entry");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.zzl = listUnmodifiableList;
        this.zzk = new zzaio(listUnmodifiableList);
        this.zzb = str;
        this.zzd = zzaezVar;
        this.zze = scheduledExecutorService;
        this.zzm = (u651) j561Var.get();
        this.zzj = zzabmVar;
        this.zzc = zzainVar;
        this.zzf = zzyaVar;
        this.zzg = zzaekVar;
        c95.m31848n(zzaemVar, "channelTracer");
        c95.m31848n(zzyjVar, "logId");
        this.zza = zzyjVar;
        c95.m31848n(zzwhVar, "channelLogger");
        this.zzh = zzwhVar;
        this.zzi = list2;
    }

    public static /* bridge */ /* synthetic */ void zzA(zzaiu zzaiuVar, zzxa zzxaVar) {
        zzaiuVar.zzj.zzd();
        zzaiuVar.zzJ(zzxb.zzb(zzxaVar));
    }

    public static /* bridge */ /* synthetic */ void zzB(zzaiu zzaiuVar) {
        zzaih zzaihVar = new zzaih(zzaiuVar);
        zzabm zzabmVar = zzaiuVar.zzj;
        zzabmVar.zzc(zzaihVar);
        zzabmVar.zzb();
    }

    public static /* bridge */ /* synthetic */ void zzC(zzaiu zzaiuVar, zzafa zzafaVar, boolean z) {
        zzaii zzaiiVar = new zzaii(zzaiuVar, zzafaVar, z);
        zzabm zzabmVar = zzaiuVar.zzj;
        zzabmVar.zzc(zzaiiVar);
        zzabmVar.zzb();
    }

    public static void zzD(zzaiu zzaiuVar, zzabe zzabeVar) {
        zzaiuVar.zzj.zzd();
        zzaiuVar.zzJ(zzxb.zzc(zzabeVar));
        if (zzaiuVar.zzw == null) {
            zzaiuVar.zzw = new zzahg();
        }
        long jZza = zzaiuVar.zzw.zza();
        u651 u651Var = zzaiuVar.zzm;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jConvert = jZza - timeUnit.convert(u651Var.f227227a ? System.nanoTime() - u651Var.f227228b : 0L, timeUnit);
        zzaiuVar.zzh.zzb(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", zzK(zzabeVar), Long.valueOf(jConvert));
        c95.m31856v(zzaiuVar.zzn == null, "previous reconnectTask is not done");
        zzaiuVar.zzn = zzaiuVar.zzj.zza(new zzaic(zzaiuVar), jConvert, timeUnit, zzaiuVar.zze);
    }

    public static void zzE(zzaiu zzaiuVar) {
        zzxv zzxvVar;
        zzaiuVar.zzj.zzd();
        c95.m31856v(zzaiuVar.zzn == null, "Should have no reconnectTask scheduled");
        if (zzaiuVar.zzk.zzf()) {
            u651 u651Var = zzaiuVar.zzm;
            u651Var.f227227a = false;
            u651Var.m82435a();
        }
        SocketAddress socketAddressZzb = zzaiuVar.zzk.zzb();
        zzail zzailVar = null;
        if (socketAddressZzb instanceof zzxv) {
            zzxv zzxvVar2 = (zzxv) socketAddressZzb;
            zzxvVar = zzxvVar2;
            socketAddressZzb = zzxvVar2.zzb();
        } else {
            zzxvVar = null;
        }
        zzvz zzvzVarZza = zzaiuVar.zzk.zza();
        String str = (String) zzvzVarZza.zzc(zzxn.zza);
        zzaey zzaeyVar = new zzaey();
        if (str == null) {
            str = zzaiuVar.zzb;
        }
        zzaeyVar.zzb(str);
        zzaeyVar.zzc(zzvzVarZza);
        zzaeyVar.zze(null);
        zzaeyVar.zzd(zzxvVar);
        zzait zzaitVar = new zzait();
        zzaitVar.zza = zzaiuVar.zza;
        zzaim zzaimVar = new zzaim(zzaiuVar.zzd.zza(socketAddressZzb, zzaeyVar, zzaitVar), zzaiuVar.zzg, zzailVar);
        zzaitVar.zza = zzaimVar.zzc();
        zzaiuVar.zzf.zzb(zzaimVar);
        zzaiuVar.zzs = zzaimVar;
        zzaiuVar.zzq.add(zzaimVar);
        zzaiuVar.zzj.zzc(zzaimVar.zze(new zzais(zzaiuVar, zzaimVar)));
        zzaiuVar.zzh.zzb(2, "Started transport {0}", zzaitVar.zza);
    }

    private static void zzI(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c95.m31848n(it.next(), str);
        }
    }

    private final void zzJ(zzxb zzxbVar) {
        this.zzj.zzd();
        if (this.zzu.zza() != zzxbVar.zza()) {
            c95.m31856v(this.zzu.zza() != zzxa.SHUTDOWN, "Cannot transition out of SHUTDOWN to ".concat(zzxbVar.toString()));
            this.zzu = zzxbVar;
            ((zzakk) this.zzc).zza.zza(zzxbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzK(zzabe zzabeVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(zzabeVar.zza());
        if (zzabeVar.zzg() != null) {
            sb.append("(");
            sb.append(zzabeVar.zzg());
            sb.append(")");
        }
        if (zzabeVar.zzh() != null) {
            sb.append("[");
            sb.append(zzabeVar.zzh());
            sb.append("]");
        }
        return sb.toString();
    }

    public static /* bridge */ /* synthetic */ void zzz(zzaiu zzaiuVar) {
        zzaiuVar.zzj.zzd();
        zzabl zzablVar = zzaiuVar.zzn;
        if (zzablVar != null) {
            zzablVar.zza();
            zzaiuVar.zzn = null;
            zzaiuVar.zzw = null;
        }
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60522v(this.zza.zza(), "logId");
        m12VarM85614C.m60523w(this.zzl, "addressGroups");
        return m12VarM85614C.toString();
    }

    public final void zzF(zzabe zzabeVar) {
        zzaig zzaigVar = new zzaig(this, zzabeVar);
        zzabm zzabmVar = this.zzj;
        zzabmVar.zzc(zzaigVar);
        zzabmVar.zzb();
    }

    public final void zzG(List list) {
        c95.m31848n(list, "newAddressGroups");
        zzI(list, "newAddressGroups contains null entry");
        c95.m31844j(!list.isEmpty(), "newAddressGroups is empty");
        zzaif zzaifVar = new zzaif(this, Collections.unmodifiableList(new ArrayList(list)));
        zzabm zzabmVar = this.zzj;
        zzabmVar.zzc(zzaifVar);
        zzabmVar.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyn
    public final zzyj zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaoy
    public final zzaex zzh() {
        zzald zzaldVar = this.zzt;
        if (zzaldVar != null) {
            return zzaldVar;
        }
        zzabm zzabmVar = this.zzj;
        zzabmVar.zzc(new zzaid(this));
        zzabmVar.zzb();
        return null;
    }
}
