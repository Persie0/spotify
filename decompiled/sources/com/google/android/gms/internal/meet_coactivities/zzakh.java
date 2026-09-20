package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzakh extends zzwf {
    final /* synthetic */ zzakp zza;
    private final String zzc;
    private final AtomicReference zzb = new AtomicReference(zzakp.zzg);
    private final zzwf zzd = new zzajz(this);

    public /* synthetic */ zzakh(zzakp zzakpVar, String str, zzakg zzakgVar) {
        this.zza = zzakpVar;
        c95.m31848n(str, "authority");
        this.zzc = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzwj zzh(zzaac zzaacVar, zzwe zzweVar) {
        zzyf zzyfVar = (zzyf) this.zzb.get();
        if (zzyfVar == null) {
            return this.zzd.zza(zzaacVar, zzweVar);
        }
        if (!(zzyfVar instanceof zzala)) {
            return new zzajk(zzyfVar, this.zzd, this.zza.zzr, zzaacVar, zzweVar);
        }
        zzaky zzakyVarZzb = ((zzala) zzyfVar).zzb.zzb(zzaacVar);
        if (zzakyVarZzb != null) {
            zzweVar = zzweVar.zze(zzaky.zza, zzakyVarZzb);
        }
        return this.zzd.zza(zzaacVar, zzweVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwf
    public final zzwj zza(zzaac zzaacVar, zzwe zzweVar) {
        if (this.zzb.get() != zzakp.zzg) {
            return zzh(zzaacVar, zzweVar);
        }
        zzakp zzakpVar = this.zza;
        zzaka zzakaVar = new zzaka(this);
        zzabm zzabmVar = zzakpVar.zzd;
        zzabmVar.zzc(zzakaVar);
        zzabmVar.zzb();
        if (this.zzb.get() != zzakp.zzg) {
            return zzh(zzaacVar, zzweVar);
        }
        if (this.zza.zzN.get()) {
            return new zzakb(this);
        }
        zzakf zzakfVar = new zzakf(this, zzxf.zzb(), zzaacVar, zzweVar);
        zzakp zzakpVar2 = this.zza;
        zzakc zzakcVar = new zzakc(this, zzakfVar);
        zzabm zzabmVar2 = zzakpVar2.zzd;
        zzabmVar2.zzc(zzakcVar);
        zzabmVar2.zzb();
        return zzakfVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwf
    public final String zzb() {
        return this.zzc;
    }

    public final void zzf() {
        if (this.zzb.get() == zzakp.zzg) {
            zzg(null);
        }
    }

    public final void zzg(zzyf zzyfVar) {
        zzyf zzyfVar2 = (zzyf) this.zzb.get();
        this.zzb.set(zzyfVar);
        if (zzyfVar2 == zzakp.zzg) {
            zzakp zzakpVar = this.zza;
            if (zzakpVar.zzI != null) {
                Iterator it = zzakpVar.zzI.iterator();
                while (it.hasNext()) {
                    ((zzakf) it.next()).zzl();
                }
            }
        }
    }
}
