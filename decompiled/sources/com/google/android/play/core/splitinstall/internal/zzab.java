package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzab extends zzv {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzae zzb;

    public zzab(zzae zzaeVar, IBinder iBinder) {
        this.zzb = zzaeVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        this.zzb.zza.zzn = zzbn.zzb(this.zza);
        zzaf.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        Iterator it = this.zzb.zza.zze.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.zzb.zza.zze.clear();
    }
}
