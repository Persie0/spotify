package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzagt implements zzaew {
    private final zzaew zza;
    private volatile boolean zzb;
    private List zzc = new ArrayList();

    public zzagt(zzaew zzaewVar) {
        this.zza = zzaewVar;
    }

    private final void zzc(Runnable runnable) {
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

    public final void zzb() {
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

    @Override // com.google.android.gms.internal.meet_coactivities.zzaew
    public final void zzd(zzabe zzabeVar, zzaev zzaevVar, zzzw zzzwVar) {
        zzc(new zzags(this, zzabeVar, zzaevVar, zzzwVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaew
    public final void zze(zzzw zzzwVar) {
        zzc(new zzagr(this, zzzwVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaov
    public final void zzf(zzaou zzaouVar) {
        if (this.zzb) {
            this.zza.zzf(zzaouVar);
        } else {
            zzc(new zzagp(this, zzaouVar));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaov
    public final void zzg() {
        if (this.zzb) {
            this.zza.zzg();
        } else {
            zzc(new zzagq(this));
        }
    }
}
