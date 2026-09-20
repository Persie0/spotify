package com.google.android.gms.internal.meet_coactivities;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p204p.c95;
import p204p.jf40;
import p204p.pf40;
import p204p.pmf0;
import p204p.wsv0;

/* JADX INFO: loaded from: classes4.dex */
final class zzalr extends zzze {
    private static final Logger zze = Logger.getLogger(zzalr.class.getName());
    private final zzyu zzf;
    private zzall zzh;
    private zzabl zzk;
    private zzxa zzl;
    private zzxa zzm;
    private final boolean zzn;
    private final Map zzg = new HashMap();
    private int zzi = 0;
    private boolean zzj = true;

    public zzalr(zzyu zzyuVar) {
        zzxa zzxaVar = zzxa.IDLE;
        this.zzl = zzxaVar;
        this.zzm = zzxaVar;
        int i = zzaly.zzb;
        this.zzn = zzahx.zzg("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS", false);
        c95.m31848n(zzyuVar, "helper");
        this.zzf = zzyuVar;
    }

    private final void zzm() {
        zzabl zzablVar = this.zzk;
        if (zzablVar != null) {
            zzablVar.zza();
            this.zzk = null;
        }
    }

    private final void zzn() {
        if (this.zzn) {
            zzabl zzablVar = this.zzk;
            if (zzablVar == null || !zzablVar.zzb()) {
                try {
                    zzabm zzabmVarZzb = this.zzf.zzb();
                    this.zzk = zzabmVarZzb.zza(new zzali(this), 250L, TimeUnit.MILLISECONDS, this.zzf.zzc());
                } catch (NullPointerException unused) {
                }
            }
        }
    }

    private final void zzo(zzxa zzxaVar, zzzc zzzcVar) {
        if (zzxaVar == this.zzm && (zzxaVar == zzxa.IDLE || zzxaVar == zzxa.CONNECTING)) {
            return;
        }
        this.zzm = zzxaVar;
        this.zzf.zze(zzxaVar, zzzcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(zzalq zzalqVar) {
        zzxa zzxaVar = zzalqVar.zzb;
        zzxa zzxaVar2 = zzxa.READY;
        if (zzxaVar != zzxaVar2) {
            return;
        }
        if (zzalq.zzb(zzalqVar) == zzxaVar2) {
            zzo(zzxaVar2, new zzyt(zzyw.zzd(zzalqVar.zza, null)));
            return;
        }
        zzxa zzxaVarZzb = zzalq.zzb(zzalqVar);
        zzxa zzxaVar3 = zzxa.TRANSIENT_FAILURE;
        if (zzxaVarZzb == zzxaVar3) {
            zzo(zzxaVar3, new zzaln(zzyw.zzb(zzalqVar.zzc.zzb.zzd())));
        } else if (this.zzm != zzxaVar3) {
            zzo(zzalq.zzb(zzalqVar), new zzaln(zzyw.zzc()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    private static final SocketAddress zzq(zzzb zzzbVar) {
        boolean z;
        zzakm zzakmVar = (zzakm) zzzbVar;
        zzakmVar.zzj.zzd.zzd();
        c95.m31856v(zzakmVar.zzg, "not started");
        List list = zzakmVar.zze;
        if (list != null) {
            z = list.size() == 1;
        }
        c95.m31857w(z, "%s does not have exactly one group", list);
        return (SocketAddress) ((zzxn) list.get(0)).zzb().get(0);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzze
    public final zzabe zza(zzza zzzaVar) {
        zzxa zzxaVar;
        Boolean bool;
        if (this.zzl == zzxa.SHUTDOWN) {
            return zzabe.zzh.zze("Already shut down");
        }
        List listZze = zzzaVar.zze();
        if (listZze.isEmpty()) {
            zzabe zzabeVarZze = zzabe.zzk.zze("NameResolver returned no usable address. addrs=" + String.valueOf(zzzaVar.zze()) + ", attrs=" + String.valueOf(zzzaVar.zza()));
            zzb(zzabeVarZze);
            return zzabeVarZze;
        }
        Iterator it = listZze.iterator();
        while (it.hasNext()) {
            if (((zzxn) it.next()) == null) {
                zzabe zzabeVarZze2 = zzabe.zzk.zze("NameResolver returned address list with null endpoint. addrs=" + String.valueOf(zzzaVar.zze()) + ", attrs=" + String.valueOf(zzzaVar.zza()));
                zzb(zzabeVarZze2);
                return zzabeVarZze2;
            }
        }
        this.zzj = true;
        if ((zzzaVar.zzd() instanceof zzalm) && (bool = ((zzalm) zzzaVar.zzd()).zza) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(listZze);
            Collections.shuffle(arrayList, new Random());
            listZze = arrayList;
        }
        jf40 jf40VarM69788m = pf40.m69788m();
        jf40VarM69788m.m28987e(listZze);
        wsv0 wsv0VarM53150g = jf40VarM69788m.m53150g();
        zzall zzallVar = this.zzh;
        if (zzallVar == null) {
            this.zzh = new zzall(wsv0VarM53150g);
        } else if (this.zzl == zzxa.READY) {
            SocketAddress socketAddressZzc = zzallVar.zzc();
            this.zzh.zze(wsv0VarM53150g);
            if (this.zzh.zzh(socketAddressZzc)) {
                zzzb zzzbVarZze = ((zzalq) this.zzg.get(socketAddressZzc)).zze();
                zzall zzallVar2 = this.zzh;
                zzzbVarZze.zze(Collections.singletonList(new zzxn(Collections.singletonList(zzallVar2.zzc()), zzallVar2.zzb())));
                return zzabe.zza;
            }
            this.zzh.zzd();
        } else {
            zzallVar.zze(wsv0VarM53150g);
        }
        HashSet<SocketAddress> hashSet = new HashSet(this.zzg.keySet());
        HashSet hashSet2 = new HashSet();
        int i = wsv0VarM53150g.f254765d;
        for (int i2 = 0; i2 < i; i2++) {
            hashSet2.addAll(((zzxn) wsv0VarM53150g.get(i2)).zzb());
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((zzalq) this.zzg.remove(socketAddress)).zze().zzc();
            }
        }
        if (hashSet.size() == 0 || (zzxaVar = this.zzl) == zzxa.CONNECTING || zzxaVar == zzxa.READY) {
            zzxa zzxaVar2 = zzxa.CONNECTING;
            this.zzl = zzxaVar2;
            zzo(zzxaVar2, new zzaln(zzyw.zzc()));
            zzm();
            zzd();
        } else {
            zzxa zzxaVar3 = zzxa.IDLE;
            if (zzxaVar == zzxaVar3) {
                zzo(zzxaVar3, new zzalp(this, this));
            } else if (zzxaVar == zzxa.TRANSIENT_FAILURE) {
                zzm();
                zzd();
            }
        }
        return zzabe.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzze
    public final void zzb(zzabe zzabeVar) {
        Iterator it = this.zzg.values().iterator();
        while (it.hasNext()) {
            ((zzalq) it.next()).zze().zzc();
        }
        this.zzg.clear();
        zzo(zzxa.TRANSIENT_FAILURE, new zzaln(zzyw.zzb(zzabeVar)));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzze
    public final void zzd() {
        final zzzb zzzbVarZza;
        zzall zzallVar = this.zzh;
        if (zzallVar == null || !zzallVar.zzg() || this.zzl == zzxa.SHUTDOWN) {
            return;
        }
        SocketAddress socketAddressZzc = this.zzh.zzc();
        if (this.zzg.containsKey(socketAddressZzc)) {
            zzzbVarZza = ((zzalq) this.zzg.get(socketAddressZzc)).zze();
        } else {
            zzvz zzvzVarZzb = this.zzh.zzb();
            zzalk zzalkVar = new zzalk(this, null);
            zzyu zzyuVar = this.zzf;
            zzyo zzyoVarZzb = zzyr.zzb();
            zzyoVarZzb.zzb(pmf0.m70336v(new zzxn(Collections.singletonList(socketAddressZzc), zzvzVarZzb)));
            zzyoVarZzb.zza(zzze.zzb, zzalkVar);
            zzzbVarZza = zzyuVar.zza(zzyoVarZzb.zzc());
            zzalq zzalqVar = new zzalq(zzzbVarZza, zzxa.IDLE, zzalkVar);
            zzalkVar.zzc = zzalqVar;
            this.zzg.put(socketAddressZzc, zzalqVar);
            if (((zzakm) zzzbVarZza).zza.zza().zzc(zzze.zzc) == null) {
                zzalkVar.zzb = zzxb.zzb(zzxa.READY);
            }
            zzzbVarZza.zzd(new zzzd() { // from class: com.google.android.gms.internal.meet_coactivities.zzalh
                @Override // com.google.android.gms.internal.meet_coactivities.zzzd
                public final void zza(zzxb zzxbVar) {
                    this.zza.zzl(zzzbVarZza, zzxbVar);
                }
            });
        }
        int iOrdinal = ((zzalq) this.zzg.get(socketAddressZzc)).zzc().ordinal();
        if (iOrdinal == 0) {
            if (this.zzn) {
                zzn();
                return;
            } else {
                zzzbVarZza.zzb();
                return;
            }
        }
        if (iOrdinal == 1) {
            zze.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer", "requestConnection", "Requesting a connection even though we have a READY subchannel");
            return;
        }
        if (iOrdinal == 2) {
            this.zzh.zzf();
            zzd();
        } else {
            if (iOrdinal != 3) {
                return;
            }
            zzzbVarZza.zzb();
            zzalq.zzg((zzalq) this.zzg.get(socketAddressZzc), zzxa.CONNECTING);
            zzn();
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzze
    public final void zze() {
        zze.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(this.zzg.size()));
        zzxa zzxaVar = zzxa.SHUTDOWN;
        this.zzl = zzxaVar;
        this.zzm = zzxaVar;
        zzm();
        Iterator it = this.zzg.values().iterator();
        while (it.hasNext()) {
            ((zzalq) it.next()).zze().zzc();
        }
        this.zzg.clear();
    }

    public final void zzl(zzzb zzzbVar, zzxb zzxbVar) {
        zzxa zzxaVarZza = zzxbVar.zza();
        zzalq zzalqVar = (zzalq) this.zzg.get(zzq(zzzbVar));
        if (zzalqVar == null || zzalqVar.zze() != zzzbVar || zzxaVarZza == zzxa.SHUTDOWN) {
            return;
        }
        zzxa zzxaVar = zzxa.IDLE;
        if (zzxaVarZza == zzxaVar) {
            this.zzf.zzd();
        }
        zzalq.zzg(zzalqVar, zzxaVarZza);
        zzxa zzxaVar2 = this.zzl;
        zzxa zzxaVar3 = zzxa.TRANSIENT_FAILURE;
        if (zzxaVar2 == zzxaVar3 || this.zzm == zzxaVar3) {
            if (zzxaVarZza == zzxa.CONNECTING) {
                return;
            }
            if (zzxaVarZza == zzxaVar) {
                zzd();
                return;
            }
        }
        int iOrdinal = zzxaVarZza.ordinal();
        if (iOrdinal == 0) {
            zzxa zzxaVar4 = zzxa.CONNECTING;
            this.zzl = zzxaVar4;
            zzo(zzxaVar4, new zzaln(zzyw.zzc()));
            return;
        }
        if (iOrdinal == 1) {
            zzm();
            for (zzalq zzalqVar2 : this.zzg.values()) {
                if (!zzalqVar2.zze().equals(zzalqVar.zza)) {
                    zzalqVar2.zze().zzc();
                }
            }
            this.zzg.clear();
            zzxa zzxaVar5 = zzxa.READY;
            zzalq.zzg(zzalqVar, zzxaVar5);
            this.zzg.put(zzq(zzalqVar.zza), zzalqVar);
            this.zzh.zzh(zzq(zzzbVar));
            this.zzl = zzxaVar5;
            zzp(zzalqVar);
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new IllegalArgumentException("Unsupported state:".concat(String.valueOf(zzxaVarZza)));
            }
            this.zzh.zzd();
            this.zzl = zzxaVar;
            zzo(zzxaVar, new zzalp(this, this));
            return;
        }
        if (this.zzh.zzg() && ((zzalq) this.zzg.get(this.zzh.zzc())).zze() == zzzbVar && this.zzh.zzf()) {
            zzm();
            zzd();
        }
        zzall zzallVar = this.zzh;
        if (zzallVar == null || zzallVar.zzg() || this.zzg.size() < this.zzh.zza()) {
            return;
        }
        Iterator it = this.zzg.values().iterator();
        while (it.hasNext()) {
            if (!((zzalq) it.next()).zzh()) {
                return;
            }
        }
        zzxa zzxaVar6 = zzxa.TRANSIENT_FAILURE;
        this.zzl = zzxaVar6;
        zzo(zzxaVar6, new zzaln(zzyw.zzb(zzxbVar.zzd())));
        int i = this.zzi + 1;
        this.zzi = i;
        if (i >= this.zzh.zza() || this.zzj) {
            this.zzj = false;
            this.zzi = 0;
            this.zzf.zzd();
        }
    }
}
