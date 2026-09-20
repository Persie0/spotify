package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzalx extends zzze {
    private final zzyu zze;
    private zzzb zzf;
    private zzxa zzg = zzxa.IDLE;

    public zzalx(zzyu zzyuVar) {
        c95.m31848n(zzyuVar, "helper");
        this.zze = zzyuVar;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzalx zzalxVar, zzzb zzzbVar, zzxb zzxbVar) {
        zzzc zzaluVar;
        zzxa zzxaVarZza = zzxbVar.zza();
        if (zzxaVarZza == zzxa.SHUTDOWN) {
            return;
        }
        zzxa zzxaVar = zzxa.TRANSIENT_FAILURE;
        if (zzxaVarZza == zzxaVar || zzxaVarZza == zzxa.IDLE) {
            zzalxVar.zze.zzd();
        }
        if (zzalxVar.zzg == zzxaVar) {
            if (zzxaVarZza == zzxa.CONNECTING) {
                return;
            }
            if (zzxaVarZza == zzxa.IDLE) {
                zzalxVar.zzd();
                return;
            }
        }
        int iOrdinal = zzxaVarZza.ordinal();
        if (iOrdinal == 0) {
            zzaluVar = new zzalu(zzyw.zzc());
        } else if (iOrdinal == 1) {
            zzaluVar = new zzalu(zzyw.zzd(zzzbVar, null));
        } else if (iOrdinal == 2) {
            zzaluVar = new zzalu(zzyw.zzb(zzxbVar.zzd()));
        } else {
            if (iOrdinal != 3) {
                throw new IllegalArgumentException("Unsupported state:".concat(String.valueOf(zzxaVarZza)));
            }
            zzaluVar = new zzalw(zzalxVar, zzzbVar);
        }
        zzalxVar.zzh(zzxaVarZza, zzaluVar);
    }

    private final void zzh(zzxa zzxaVar, zzzc zzzcVar) {
        this.zzg = zzxaVar;
        this.zze.zze(zzxaVar, zzzcVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzze
    public final zzabe zza(zzza zzzaVar) {
        Boolean bool;
        List listZze = zzzaVar.zze();
        if (listZze.isEmpty()) {
            zzabe zzabeVarZze = zzabe.zzk.zze("NameResolver returned no usable address. addrs=" + String.valueOf(zzzaVar.zze()) + ", attrs=" + String.valueOf(zzzaVar.zza()));
            zzb(zzabeVarZze);
            return zzabeVarZze;
        }
        if ((zzzaVar.zzd() instanceof zzalt) && (bool = ((zzalt) zzzaVar.zzd()).zza) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(listZze);
            Collections.shuffle(arrayList, new Random());
            listZze = arrayList;
        }
        zzzb zzzbVar = this.zzf;
        if (zzzbVar == null) {
            zzyu zzyuVar = this.zze;
            zzyo zzyoVarZzb = zzyr.zzb();
            zzyoVarZzb.zzb(listZze);
            zzzb zzzbVarZza = zzyuVar.zza(zzyoVarZzb.zzc());
            zzzbVarZza.zzd(new zzals(this, zzzbVarZza));
            this.zzf = zzzbVarZza;
            zzh(zzxa.CONNECTING, new zzalu(zzyw.zzd(zzzbVarZza, null)));
            zzzbVarZza.zzb();
        } else {
            zzzbVar.zze(listZze);
        }
        return zzabe.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzze
    public final void zzb(zzabe zzabeVar) {
        zzzb zzzbVar = this.zzf;
        if (zzzbVar != null) {
            zzzbVar.zzc();
            this.zzf = null;
        }
        zzh(zzxa.TRANSIENT_FAILURE, new zzalu(zzyw.zzb(zzabeVar)));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzze
    public final void zzd() {
        zzzb zzzbVar = this.zzf;
        if (zzzbVar != null) {
            zzzbVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzze
    public final void zze() {
        zzzb zzzbVar = this.zzf;
        if (zzzbVar != null) {
            zzzbVar.zzc();
        }
    }
}
