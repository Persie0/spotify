package com.google.android.gms.internal.meet_coactivities;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import p204p.jue;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzgl implements Supplier {
    public final /* synthetic */ zzgm zza;
    public final /* synthetic */ jue zzb;

    public /* synthetic */ zzgl(zzgm zzgmVar, jue jueVar) {
        this.zza = zzgmVar;
        this.zzb = jueVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        zzjo zzjoVar = (zzjo) this.zza.zzc;
        final jue jueVar = this.zzb;
        return zzjoVar.zza(new UnaryOperator() { // from class: com.google.android.gms.internal.meet_coactivities.zzgk
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return zzjz.zzd(jueVar);
            }
        });
    }
}
