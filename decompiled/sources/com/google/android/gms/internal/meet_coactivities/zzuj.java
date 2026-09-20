package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzuj implements zzur {
    private final zzuf zza;
    private final zzvf zzb;
    private final boolean zzc;
    private final zzsl zzd;

    private zzuj(zzvf zzvfVar, zzsl zzslVar, zzuf zzufVar) {
        this.zzb = zzvfVar;
        this.zzc = zzufVar instanceof zzsv;
        this.zzd = zzslVar;
        this.zza = zzufVar;
    }

    public static zzuj zzc(zzvf zzvfVar, zzsl zzslVar, zzuf zzufVar) {
        return new zzuj(zzvfVar, zzslVar, zzufVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final int zza(Object obj) {
        int iZzb = ((zzsz) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzsv) obj).zzb.zzd() : iZzb;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final int zzb(Object obj) {
        int iHashCode = ((zzsz) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzsv) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final Object zze() {
        zzuf zzufVar = this.zza;
        return zzufVar instanceof zzsz ? ((zzsz) zzufVar).zzD() : zzufVar.zzR().zzm();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final void zzg(Object obj, Object obj2) {
        zzut.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzut.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final void zzh(Object obj, zzuq zzuqVar, zzsk zzskVar) {
        this.zzb.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzrf zzrfVar) {
        zzsz zzszVar = (zzsz) obj;
        if (zzszVar.zzc == zzvg.zzc()) {
            zzszVar.zzc = zzvg.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final void zzj(Object obj, zzvs zzvsVar) {
        Iterator itZzf = ((zzsv) obj).zzb.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzso zzsoVar = (zzso) entry.getKey();
            if (zzsoVar.zzc() != zzvr.MESSAGE || zzsoVar.zze() || zzsoVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zztm) {
                zzvsVar.zzx(zzsoVar.zza(), ((zztm) entry).zza().zzb());
            } else {
                zzvsVar.zzx(zzsoVar.zza(), entry.getValue());
            }
        }
        ((zzsz) obj).zzc.zzk(zzvsVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzsz) obj).zzc.equals(((zzsz) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzsv) obj).zzb.equals(((zzsv) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final boolean zzl(Object obj) {
        return ((zzsv) obj).zzb.zzj();
    }
}
