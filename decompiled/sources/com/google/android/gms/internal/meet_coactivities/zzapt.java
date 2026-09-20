package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import p204p.c95;
import p204p.pf40;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzapt extends zzze {
    private static final Logger zzh = Logger.getLogger(zzapt.class.getName());
    protected boolean zze;
    protected zzxa zzg;
    private final zzyu zzj;
    private final Map zzi = new LinkedHashMap();
    protected final zzzg zzf = new zzaly();

    public zzapt(zzyu zzyuVar) {
        c95.m31848n(zzyuVar, "helper");
        this.zzj = zzyuVar;
        zzh.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzze
    public final zzabe zza(zzza zzzaVar) throws Throwable {
        zzapt zzaptVar;
        Throwable th;
        zzabe zzabeVarZze;
        zzaps zzapsVar;
        zzxn zzxnVar;
        try {
            this.zze = true;
            zzh.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddressesInternal", "Received resolution result: {0}", zzzaVar);
            HashMap map = new HashMap();
            Iterator it = zzzaVar.zze().iterator();
            while (it.hasNext()) {
                zzaps zzapsVar2 = new zzaps((zzxn) it.next());
                zzapr zzaprVar = (zzapr) this.zzi.get(zzapsVar2);
                if (zzaprVar != null) {
                    try {
                        map.put(zzapsVar2, zzaprVar);
                    } catch (Throwable th2) {
                        th = th2;
                        zzaptVar = this;
                        zzaptVar.zze = false;
                        throw th;
                    }
                } else {
                    zzaptVar = this;
                    try {
                        map.put(zzapsVar2, new zzapr(zzaptVar, zzapsVar2, this.zzf, null, new zzyt(zzyw.zzc())));
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        zzaptVar.zze = false;
                        throw th;
                    }
                }
            }
            zzaptVar = this;
            ArrayList arrayList = null;
            if (map.isEmpty()) {
                zzabeVarZze = zzabe.zzk.zze("NameResolver returned no usable address. ".concat(zzzaVar.toString()));
                zzb(zzabeVarZze);
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (!zzaptVar.zzi.containsKey(key)) {
                        zzaptVar.zzi.put(key, (zzapr) entry.getValue());
                    }
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    zzapr zzaprVar2 = (zzapr) zzaptVar.zzi.get(entry2.getKey());
                    Object key2 = entry2.getKey();
                    if (key2 instanceof zzxn) {
                        zzapsVar = new zzaps((zzxn) key2);
                    } else {
                        c95.m31844j(key2 instanceof zzaps, "key is wrong type");
                        zzapsVar = (zzaps) key2;
                    }
                    Iterator it2 = zzzaVar.zze().iterator();
                    do {
                        if (!it2.hasNext()) {
                            zzxnVar = null;
                            break;
                        }
                        zzxnVar = (zzxn) it2.next();
                    } while (!zzapsVar.equals(new zzaps(zzxnVar)));
                    c95.m31848n(zzxnVar, String.valueOf(key2).concat(" no longer present in load balancer children"));
                    zzyy zzyyVarZzc = zzzaVar.zzc();
                    zzyyVarZzc.zza(Collections.singletonList(zzxnVar));
                    zzvw zzvwVarZza = zzvz.zza();
                    zzvwVarZza.zzb(zzze.zzd, Boolean.TRUE);
                    zzyyVarZzc.zzb(zzvwVarZza.zzc());
                    zzyyVarZzc.zzc(null);
                    zzza zzzaVarZzd = zzyyVarZzc.zzd();
                    c95.m31848n(zzzaVarZzd, "Missing address list for child");
                    zzaprVar2.zzc.zzc(zzzaVarZzd);
                }
                zzabe zzabeVar = zzabe.zza;
                Set setKeySet = map.keySet();
                arrayList = new ArrayList();
                pf40 pf40VarM69791p = pf40.m69791p(zzaptVar.zzi.keySet());
                int size = pf40VarM69791p.size();
                for (int i = 0; i < size; i++) {
                    Object obj = pf40VarM69791p.get(i);
                    if (!setKeySet.contains(obj)) {
                        arrayList.add((zzapr) zzaptVar.zzi.remove(obj));
                    }
                }
                zzabeVarZze = zzabeVar;
            }
            if (zzabeVarZze.zzj()) {
                zzk();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((zzapr) it3.next()).zzg();
                }
            }
            zzaptVar.zze = false;
            return zzabeVarZze;
        } catch (Throwable th4) {
            th = th4;
            zzaptVar = this;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzze
    public final void zzb(zzabe zzabeVar) {
        if (this.zzg != zzxa.READY) {
            this.zzj.zze(zzxa.TRANSIENT_FAILURE, new zzyt(zzyw.zzb(zzabeVar)));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzze
    public final void zze() {
        zzh.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator it = this.zzi.values().iterator();
        while (it.hasNext()) {
            ((zzapr) it.next()).zzg();
        }
        this.zzi.clear();
    }

    public final zzyu zzg() {
        return this.zzj;
    }

    public final Collection zzh() {
        return this.zzi.values();
    }

    public abstract void zzk();
}
