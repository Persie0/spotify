package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzafc {
    private ArrayList zza = new ArrayList();
    private volatile zzxa zzb = zzxa.IDLE;

    public final void zza(zzxa zzxaVar) {
        c95.m31848n(zzxaVar, "newState");
        if (this.zzb == zzxaVar || this.zzb == zzxa.SHUTDOWN) {
            return;
        }
        this.zzb = zzxaVar;
        if (this.zza.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.zza;
        this.zza = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}
