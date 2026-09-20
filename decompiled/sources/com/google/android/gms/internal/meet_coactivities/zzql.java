package com.google.android.gms.internal.meet_coactivities;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzql extends zzst implements zzug {
    private zzql() {
        throw null;
    }

    public final zzql zza(Map map) {
        zzo();
        zzqq.zzf((zzqq) this.zza).putAll(map);
        return this;
    }

    public final zzql zzb(zzqm zzqmVar) {
        zzo();
        ((zzqq) this.zza).zzh = zzqmVar.zza();
        return this;
    }

    public final zzql zzc(zzqj zzqjVar) {
        zzo();
        zzqq.zzh((zzqq) this.zza, (zzqk) zzqjVar.zzk());
        return this;
    }

    public final zzql zzd(zzqk zzqkVar) {
        zzo();
        zzqq.zzh((zzqq) this.zza, zzqkVar);
        return this;
    }

    public /* synthetic */ zzql(zzpw zzpwVar) {
        super(zzqq.zzb);
    }
}
