package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzajr implements Runnable {
    final /* synthetic */ zzakp zza;

    public /* synthetic */ zzajr(zzakp zzakpVar, zzajq zzajqVar) {
        this.zza = zzakpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzakp zzakpVar = this.zza;
        if (zzakpVar.zzE == null) {
            return;
        }
        zzakp.zzO(zzakpVar);
    }
}
