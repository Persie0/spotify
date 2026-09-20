package com.google.android.gms.internal.meet_coactivities;

import android.content.ComponentName;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p204p.c95;
import p204p.ui71;

/* JADX INFO: loaded from: classes4.dex */
public final class zzacl extends zzacn implements zzafa, zzacb {
    private final zzalf zzf;
    private final Executor zzg;
    private final zzaby zzh;
    private final zzacc zzi;
    private final AtomicInteger zzj;
    private final zzadk zzk;
    private zzalc zzl;
    private int zzm;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.meet_coactivities.zzacj] */
    public zzacl(zzacf zzacfVar, zzabo zzaboVar, zzaey zzaeyVar) {
        zzalf zzalfVar = zzacfVar.zzd;
        zzvz zzvzVarZza = zzaeyVar.zza();
        Context context = zzacfVar.zza;
        zzabv zzabvVar = zzacfVar.zzh;
        zzvw zzvwVarZza = zzvz.zza();
        zzvwVarZza.zzb(zzahp.zza, zzaav.NONE);
        zzvwVarZza.zzb(zzahp.zzb, zzvzVarZza);
        zzvwVarZza.zzb(zzxr.zzb, zzabo.zzb(new ComponentName(context, context.getClass())));
        zzvwVarZza.zzb(zzxr.zza, zzaboVar);
        zzvwVarZza.zzb(zzacn.zzb, zzabvVar);
        super(zzalfVar, zzvwVarZza.zzc(), zzacfVar.zzk, zzyj.zzb(zzacl.class, zzacfVar.zza.getClass().getSimpleName() + "->" + String.valueOf(zzaboVar)), null);
        this.zzm = 1001;
        zzalf zzalfVar2 = zzacfVar.zze;
        this.zzf = zzalfVar2;
        this.zzh = zzacfVar.zzf;
        this.zzg = (Executor) zzalfVar2.zza();
        this.zzj = new AtomicInteger();
        this.zzk = new zzadk(ui71.f230613a, new Object(this) { // from class: com.google.android.gms.internal.meet_coactivities.zzacj
        });
        this.zzi = new zzado(zzacfVar.zzc, zzacfVar.zza, zzacfVar.zzb, zzaboVar.zza(), null, zzacfVar.zzg.zza(), this);
    }

    private static zzaeu zzA(zzabe zzabeVar, zzvz zzvzVar, zzzw zzzwVar, zzwr[] zzwrVarArr) {
        zzaos.zza(zzwrVarArr, zzvzVar, zzzwVar).zzd();
        return new zzahh(zzabeVar, zzaev.PROCESSED, zzwrVarArr);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzacb
    public final synchronized void zza(IBinder iBinder) {
        zzq(zzade.zzb(iBinder, this.zzg));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzacb
    public final synchronized void zzb(zzabe zzabeVar) {
        zzs(zzabeVar, true);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaex
    public final synchronized zzaeu zzd(zzaac zzaacVar, zzzw zzzwVar, zzwe zzweVar, zzwr[] zzwrVarArr) throws Throwable {
        Throwable th;
        try {
            try {
                try {
                    if (!zzz(3)) {
                        return zzA(zzw() ? this.zze : zzabe.zzj.zze("newStream() before transportReady()"), this.zzd, zzzwVar, zzwrVarArr);
                    }
                    int i = this.zzm;
                    int i2 = i + 1;
                    this.zzm = i2;
                    if (i2 == 16777215) {
                        this.zzm = 1001;
                    }
                    zzaos zzaosVarZza = zzaos.zza(zzwrVarArr, this.zzd, zzzwVar);
                    zzacr zzacrVar = new zzacr(this, this.zzd, i, !Boolean.TRUE.equals(zzweVar.zzl(zzahx.zzh)));
                    if (this.zzc.putIfAbsent(Integer.valueOf(i), zzacrVar) != null) {
                        zzabe zzabeVarZze = zzabe.zzj.zze("Clashing call IDs");
                        zzs(zzabeVarZze, true);
                        return zzA(zzabeVarZze, this.zzd, zzzwVar, zzwrVarArr);
                    }
                    if (zzacrVar.zze() && this.zzj.getAndIncrement() == 0) {
                        this.zzl.zzb(true);
                    }
                    zzadf zzadfVar = new zzadf(this, i, zzaacVar, zzzwVar, zzaosVarZza);
                    if (zzaacVar.zzb().zza()) {
                        return new zzadp(zzacrVar, zzadfVar, this.zzd);
                    }
                    return new zzacz(zzacrVar, zzadfVar, this.zzd);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzald
    public final synchronized Runnable zze(zzalc zzalcVar) {
        zzalcVar.getClass();
        this.zzl = zzalcVar;
        return new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzaci
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi();
            }
        };
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzacn
    public final void zzf(Parcel parcel) {
        this.zzk.zza(parcel.readInt());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzacn
    public final void zzg(Parcel parcel) {
        zzvz zzvzVar = this.zzd;
        int callingUid = Binder.getCallingUid();
        zzvw zzvwVarZzb = zzvzVar.zzb();
        zzvwVarZzb.zzb(zzacn.zza, Integer.valueOf(callingUid));
        zzvwVarZzb.zzb(zzahp.zza, callingUid == Process.myUid() ? zzaav.PRIVACY_AND_INTEGRITY : zzaav.INTEGRITY);
        this.zzd = zzvwVarZzb.zzc();
        if (zzz(2)) {
            int i = parcel.readInt();
            final IBinder strongBinder = parcel.readStrongBinder();
            if (i != 1) {
                zzs(zzabe.zzk.zze("Wire format version mismatch"), true);
            } else if (strongBinder == null) {
                zzs(zzabe.zzk.zze("Malformed SETUP_TRANSPORT data"), true);
            } else {
                this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzack
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzh(strongBinder);
                    }
                });
            }
        }
    }

    public final /* synthetic */ void zzh(IBinder iBinder) {
        Integer num;
        synchronized (this) {
            num = (Integer) this.zzd.zzc(zzacn.zza);
        }
        zzabe zzabeVarZze = num == null ? zzabe.zzf.zze("No remote UID available") : this.zzh.zza(num.intValue());
        synchronized (this) {
            try {
                if (zzz(2)) {
                    if (!zzabeVarZze.zzj()) {
                        zzs(zzabeVarZze, true);
                    } else if (!zzx(zzade.zzb(iBinder, this.zzg))) {
                        zzs(zzabe.zzk.zze("Failed to observe outgoing binder"), true);
                    } else if (!zzw()) {
                        zzy(3);
                        zzalc zzalcVar = this.zzl;
                        zzvz zzvzVar = this.zzd;
                        zzalcVar.zza(zzvzVar);
                        this.zzd = zzvzVar;
                        this.zzl.zzc();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzi() {
        synchronized (this) {
            try {
                if (zzz(1)) {
                    zzy(2);
                    this.zzi.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzacn
    public final void zzj(zzabe zzabeVar) {
        this.zzl.zzd(zzabeVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzacn
    public final void zzk() {
        if (this.zzj.getAndSet(0) > 0) {
            this.zzl.zzb(false);
        }
        ((zzado) this.zzi).zzd(zzabe.zzb);
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzacn
    public final void zzl() {
        super.zzl();
        this.zzf.zzb(this.zzg);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzald
    public final synchronized void zzm(zzabe zzabeVar) {
        c95.m31848n(zzabeVar, "reason");
        zzs(zzabeVar, false);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzacn
    public final void zzn(zzacv zzacvVar) {
        if (zzacvVar.zze() && this.zzj.decrementAndGet() == 0) {
            this.zzl.zzb(false);
        }
        zzt(zzacvVar.zzc);
    }
}
