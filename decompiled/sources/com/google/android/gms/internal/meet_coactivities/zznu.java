package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes.dex */
public final class zznu {
    private final zzpf zza;
    private final String zzb;

    public zznu(zzpf zzpfVar, String str) {
        zzpj.zza(zzpfVar, "parser");
        this.zza = zzpfVar;
        zzpj.zza(str, "message");
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zznu) {
            zznu zznuVar = (zznu) obj;
            if (this.zza.equals(zznuVar.zza) && this.zzb.equals(zznuVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return str.hashCode() ^ this.zza.hashCode();
    }

    public final zzpf zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
