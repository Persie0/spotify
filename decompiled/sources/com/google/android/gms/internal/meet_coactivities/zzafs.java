package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzafs extends zzwi {
    private final zzwi zza;
    private volatile boolean zzb;
    private List zzc = new ArrayList();

    public zzafs(zzwi zzwiVar) {
        this.zza = zzwiVar;
    }

    private final void zzg(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.zzb) {
                    runnable.run();
                } else {
                    this.zzc.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwi
    public final void zza(zzabe zzabeVar, zzzw zzzwVar) {
        zzg(new zzafq(this, zzabeVar, zzzwVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwi
    public final void zzb(zzzw zzzwVar) {
        if (this.zzb) {
            this.zza.zzb(zzzwVar);
        } else {
            zzg(new zzafo(this, zzzwVar));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwi
    public final void zzc(Object obj) {
        if (this.zzb) {
            this.zza.zzc(obj);
        } else {
            zzg(new zzafp(this, obj));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwi
    public final void zzd() {
        if (this.zzb) {
            this.zza.zzd();
        } else {
            zzg(new zzafr(this));
        }
    }

    public final void zzf() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                try {
                    if (this.zzc.isEmpty()) {
                        this.zzc = null;
                        this.zzb = true;
                        return;
                    } else {
                        list = this.zzc;
                        this.zzc = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }
}
