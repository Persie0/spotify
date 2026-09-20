package com.google.android.gms.internal.meet_coactivities;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import p204p.dcf1;
import p204p.mbg1;
import p204p.oaf1;
import p204p.pf40;
import p204p.red1;
import p204p.tve;
import p204p.xpg1;
import p204p.zhg1;

/* JADX INFO: loaded from: classes.dex */
public final class zzkf implements zzkm {
    private zzkf() {
        throw null;
    }

    public static zzkf zzc() {
        return zzkd.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzkm
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final tve zza(zzqi zzqiVar) {
        red1 red1VarM81607a = tve.m81607a();
        if (zzqiVar.zzh()) {
            zzqa zzqaVarZza = zzqiVar.zza();
            mbg1 mbg1VarM96130a = zhg1.m96130a();
            mbg1VarM96130a.m61401a(zzqaVarZza.zza());
            mbg1VarM96130a.m61402b(pf40.m69792q((xpg1[]) zzqaVarZza.zze().stream().map(new Function(this) { // from class: com.google.android.gms.internal.meet_coactivities.zzka
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    zzqc zzqcVar = (zzqc) obj;
                    String strZzd = zzqcVar.zzd();
                    if (strZzd == null) {
                        throw new NullPointerException("Null mediaId");
                    }
                    String strZzc = zzqcVar.zzc();
                    if (strZzc != null) {
                        return new xpg1(strZzd, strZzc);
                    }
                    throw new NullPointerException("Null entryId");
                }
            }).toArray(new IntFunction() { // from class: com.google.android.gms.internal.meet_coactivities.zzkb
                @Override // java.util.function.IntFunction
                public final Object apply(int i) {
                    return new xpg1[i];
                }
            })));
            red1VarM81607a.m75393j(mbg1VarM96130a.m61403c());
        }
        if (zzqiVar.zzj()) {
            zzqw zzqwVarZze = zzqiVar.zze();
            oaf1 oaf1VarM35650a = dcf1.m35650a();
            oaf1VarM35650a.m66548a(zzqwVarZze.zze());
            oaf1VarM35650a.m66549b(zzqwVarZze.zza());
            red1VarM81607a.m75394k(oaf1VarM35650a.m66550c());
        }
        return red1VarM81607a.m75395l();
    }

    public final zzqi zzd(tve tveVar) {
        zzqh zzqhVarZzb = zzqi.zzb();
        zhg1 zhg1VarMo79907b = tveVar.mo79907b();
        if (zhg1VarMo79907b != null) {
            final zzpz zzpzVarZzb = zzqa.zzb();
            zzpzVarZzb.zzb(zhg1VarMo79907b.m96131b());
            zhg1VarMo79907b.m96132c().forEach(new Consumer(this) { // from class: com.google.android.gms.internal.meet_coactivities.zzkc
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    xpg1 xpg1Var = (xpg1) obj;
                    zzqb zzqbVarZza = zzqc.zza();
                    zzqbVarZza.zzb(xpg1Var.f264635a);
                    zzqbVarZza.zza(xpg1Var.f264636b);
                    zzpzVarZzb.zza((zzqc) zzqbVarZza.zzk());
                }
            });
            zzqhVarZzb.zza((zzqa) zzpzVarZzb.zzk());
        }
        dcf1 dcf1VarMo79908c = tveVar.mo79908c();
        if (dcf1VarMo79908c != null) {
            zzqv zzqvVarZzb = zzqw.zzb();
            zzqvVarZzb.zza(dcf1VarMo79908c.m35651b());
            zzqvVarZzb.zzb(dcf1VarMo79908c.m35652c());
            zzqhVarZzb.zzb((zzqw) zzqvVarZzb.zzk());
        }
        return (zzqi) zzqhVarZzb.zzk();
    }

    public /* synthetic */ zzkf(zzke zzkeVar) {
    }
}
