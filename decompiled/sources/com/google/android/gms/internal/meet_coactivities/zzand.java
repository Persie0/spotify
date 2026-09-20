package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class zzand implements Runnable {
    final /* synthetic */ zzanq zza;
    final /* synthetic */ zzane zzb;

    public zzand(zzane zzaneVar, zzanq zzanqVar) {
        this.zza = zzanqVar;
        this.zzb = zzaneVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:4:0x0009, B:19:0x0072, B:7:0x0014, B:9:0x0032, B:11:0x003c, B:16:0x0049, B:18:0x005b), top: B:29:0x0009 }] */
    @Override // java.lang.Runnable
    public final void run() {
        zzanc zzancVar;
        boolean z;
        synchronized (this.zzb.zzb.zzm) {
            try {
                zzane zzaneVar = this.zzb;
                zzancVar = null;
                if (zzaneVar.zza.zzc) {
                    z = true;
                } else {
                    zzans zzansVar = zzaneVar.zzb;
                    zzansVar.zzs = zzansVar.zzs.zza(this.zza);
                    zzans zzansVar2 = this.zzb.zzb;
                    if (zzansVar2.zzak(zzansVar2.zzs)) {
                        zzans zzansVar3 = this.zzb.zzb;
                        if (zzansVar3.zzq == null || zzansVar3.zzq.zza()) {
                            zzans zzansVar4 = this.zzb.zzb;
                            zzancVar = new zzanc(zzansVar4.zzm);
                            zzansVar4.zzA = zzancVar;
                        } else {
                            zzans zzansVar5 = this.zzb.zzb;
                            zzansVar5.zzs = zzansVar5.zzs.zzb();
                            this.zzb.zzb.zzA = null;
                        }
                    } else {
                        zzans zzansVar6 = this.zzb.zzb;
                        zzansVar6.zzs = zzansVar6.zzs.zzb();
                        this.zzb.zzb.zzA = null;
                    }
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            zzanq zzanqVar = this.zza;
            zzanqVar.zza.zzl(new zzanp(this.zzb.zzb, zzanqVar));
            this.zza.zza.zzb(zzabe.zzb.zze("Unneeded hedging"));
            return;
        }
        if (zzancVar != null) {
            zzans zzansVar7 = this.zzb.zzb;
            zzancVar.zzb(zzansVar7.zzh.schedule(new zzane(zzansVar7, zzancVar), zzansVar7.zzk.zzb, TimeUnit.NANOSECONDS));
        }
        this.zzb.zzb.zzah(this.zza);
    }
}
