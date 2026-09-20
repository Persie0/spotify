package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class zzapw extends zzapt {
    protected zzzc zzh;
    private final AtomicInteger zzi;

    public zzapw(zzyu zzyuVar) {
        super(zzyuVar);
        this.zzi = new AtomicInteger(new Random().nextInt());
        this.zzh = new zzapu();
    }

    private final void zzm(zzxa zzxaVar, zzzc zzzcVar) {
        if (zzxaVar == this.zzg && zzzcVar.equals(this.zzh)) {
            return;
        }
        zzg().zze(zzxaVar, zzzcVar);
        this.zzg = zzxaVar;
        this.zzh = zzzcVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapt
    public final void zzk() {
        ArrayList arrayList = new ArrayList();
        for (zzapr zzaprVar : zzh()) {
            if (zzaprVar.zza() == zzxa.READY) {
                arrayList.add(zzaprVar);
            }
        }
        if (!arrayList.isEmpty()) {
            zzm(zzxa.READY, zzl(arrayList));
            return;
        }
        Iterator it = zzh().iterator();
        while (it.hasNext()) {
            zzxa zzxaVarZza = ((zzapr) it.next()).zza();
            zzxa zzxaVar = zzxa.CONNECTING;
            if (zzxaVarZza == zzxaVar || zzxaVarZza == zzxa.IDLE) {
                zzm(zzxaVar, new zzapu());
                return;
            }
        }
        zzm(zzxa.TRANSIENT_FAILURE, zzl(zzh()));
    }

    public final zzzc zzl(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzapr) it.next()).zzb());
        }
        return new zzapv(arrayList, this.zzi);
    }
}
