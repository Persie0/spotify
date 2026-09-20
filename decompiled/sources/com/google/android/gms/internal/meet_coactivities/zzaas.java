package com.google.android.gms.internal.meet_coactivities;

import p204p.m12;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzaas extends zzwj {
    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(zzf(), "delegate");
        return m12VarM85614C.toString();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public void zza(String str, Throwable th) {
        throw null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzb() {
        zzf().zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzc(int i) {
        zzf().zzc(i);
    }

    public abstract zzwj zzf();
}
