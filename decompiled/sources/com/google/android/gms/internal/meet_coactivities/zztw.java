package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes.dex */
final class zztw implements zzus {
    private static final zzud zza = new zztu();
    private final zzud zzb;

    public zztw() {
        zzss zzssVarZza = zzss.zza();
        int i = zzun.zza;
        zztv zztvVar = new zztv(zzssVarZza, zza);
        byte[] bArr = zzth.zzb;
        this.zzb = zztvVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzus
    public final zzur zza(Class cls) {
        int i = zzut.zza;
        if (!zzsz.class.isAssignableFrom(cls)) {
            int i2 = zzun.zza;
        }
        zzuc zzucVarZzb = this.zzb.zzb(cls);
        if (zzucVarZzb.zzb()) {
            int i3 = zzun.zza;
            return zzuj.zzc(zzut.zzm(), zzsn.zza(), zzucVarZzb.zza());
        }
        int i4 = zzun.zza;
        return zzui.zzm(cls, zzucVarZzb, zzul.zza(), zzts.zza(), zzut.zzm(), zzucVarZzb.zzc() + (-1) != 1 ? zzsn.zza() : null, zzub.zza());
    }
}
