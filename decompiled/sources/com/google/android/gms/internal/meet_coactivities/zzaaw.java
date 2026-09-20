package com.google.android.gms.internal.meet_coactivities;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final class zzaaw implements Comparator {
    final /* synthetic */ zzaax zza;

    public zzaaw(zzaax zzaaxVar) {
        this.zza = zzaaxVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.zza.zza(obj);
        this.zza.zza(obj2);
        return obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
