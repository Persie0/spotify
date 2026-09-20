package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzi {
    private static final Logger zza = Logger.getLogger(zzzi.class.getName());
    private static zzzi zzb;
    private static final Iterable zzc;
    private final LinkedHashSet zzd = new LinkedHashSet();
    private final LinkedHashMap zze = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            int i = zzaly.zzb;
            arrayList.add(zzaly.class);
        } catch (ClassNotFoundException e) {
            zza.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            int i2 = zzapx.f1876a;
            arrayList.add(zzapx.class);
        } catch (ClassNotFoundException e2) {
            zza.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        zzc = Collections.unmodifiableList(arrayList);
    }

    public static synchronized zzzi zzb() {
        try {
            if (zzb == null) {
                List<zzzg> listZza = zzaay.zza(zzzg.class, zzc, zzzg.class.getClassLoader(), new zzzh());
                zzb = new zzzi();
                for (zzzg zzzgVar : listZza) {
                    zza.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(zzzgVar)));
                    zzb.zzc(zzzgVar);
                }
                zzb.zzd();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb;
    }

    private final synchronized void zzc(zzzg zzzgVar) {
        zzzgVar.zze();
        this.zzd.add(zzzgVar);
    }

    private final synchronized void zzd() {
        try {
            this.zze.clear();
            for (zzzg zzzgVar : this.zzd) {
                String strZzd = zzzgVar.zzd();
                if (((zzzg) this.zze.get(strZzd)) != null) {
                    zzzgVar.zzb();
                } else {
                    this.zze.put(strZzd, zzzgVar);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzzg zza(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.zze;
        c95.m31848n(str, "policy");
        return (zzzg) linkedHashMap.get(str);
    }
}
