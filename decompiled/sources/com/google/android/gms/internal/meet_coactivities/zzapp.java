package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.ScheduledExecutorService;
import p204p.m12;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzapp extends zzyu {
    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(zzf(), "delegate");
        return m12VarM85614C.toString();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public final zzzb zza(zzyr zzyrVar) {
        return zzf().zza(zzyrVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public final zzabm zzb() {
        return zzf().zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public final ScheduledExecutorService zzc() {
        return zzf().zzc();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public final void zzd() {
        zzf().zzd();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public void zze(zzxa zzxaVar, zzzc zzzcVar) {
        throw null;
    }

    public abstract zzyu zzf();
}
