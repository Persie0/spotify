package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p204p.btv0;
import p204p.xf40;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaar {
    private static final Logger zza = Logger.getLogger(zzaar.class.getName());
    private static zzaar zzb;
    private String zzc = "unknown";
    private final LinkedHashSet zzd = new LinkedHashSet();
    private xf40 zze = btv0.f30940g;

    public static synchronized zzaar zzb() {
        if (zzb == null) {
            ArrayList arrayList = new ArrayList();
            try {
                int i = zzahe.f1875a;
                arrayList.add(zzahe.class);
            } catch (ClassNotFoundException e) {
                zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
            }
            List<zzaao> listZza = zzaay.zza(zzaao.class, Collections.unmodifiableList(arrayList), zzaao.class.getClassLoader(), new zzaaq(null));
            if (listZza.isEmpty()) {
                zza.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
            }
            zzb = new zzaar();
            for (zzaao zzaaoVar : listZza) {
                zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(zzaaoVar)));
                zzb.zzf(zzaaoVar);
            }
            zzb.zzg();
        }
        return zzb;
    }

    private final synchronized void zzf(zzaao zzaaoVar) {
        zzaaoVar.zze();
        this.zzd.add(zzaaoVar);
    }

    private final synchronized void zzg() {
        try {
            HashMap map = new HashMap();
            String strZzb = "unknown";
            byte b = -2147483648;
            for (zzaao zzaaoVar : this.zzd) {
                String strZzb2 = zzaaoVar.zzb();
                if (((zzaao) map.get(strZzb2)) != null) {
                    zzaaoVar.zzc();
                } else {
                    map.put(strZzb2, zzaaoVar);
                }
                zzaaoVar.zzc();
                if (b < 5) {
                    zzaaoVar.zzc();
                    strZzb = zzaaoVar.zzb();
                }
                b = 5;
            }
            this.zze = xf40.m90451c(map);
            this.zzc = strZzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzaao zza(String str) {
        if (str == null) {
            return null;
        }
        return (zzaao) zzd().get(str.toLowerCase(Locale.US));
    }

    public final synchronized String zzc() {
        return this.zzc;
    }

    public final synchronized Map zzd() {
        return this.zze;
    }

    public final synchronized void zze(zzaao zzaaoVar) {
        zzf(zzaaoVar);
        zzg();
    }
}
