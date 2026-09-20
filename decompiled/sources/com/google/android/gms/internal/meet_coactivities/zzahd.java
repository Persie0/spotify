package com.google.android.gms.internal.meet_coactivities;

import com.google.common.base.VerifyException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p204p.c95;
import p204p.kh71;
import p204p.n0e1;
import p204p.u651;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahd extends zzaan {
    static final boolean zza;
    static final boolean zzb;
    protected static final boolean zzc;
    private static final Logger zzg;
    private static final Set zzh;
    private static final String zzi;
    private static final String zzj;
    private static final String zzk;
    private static final zzahc zzl;
    private static String zzm;
    private boolean zzA;
    private zzaaj zzB;
    final zzaau zzd;
    protected boolean zzf;
    private final String zzp;
    private final String zzq;
    private final int zzr;
    private final zzaop zzs;
    private final long zzt;
    private final zzabm zzu;
    private final u651 zzv;
    private boolean zzw;
    private Executor zzx;
    private final boolean zzy;
    private final zzaam zzz;
    private final Random zzn = new Random();
    protected volatile zzagv zze = zzagy.INSTANCE;
    private final AtomicReference zzo = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(zzahd.class.getName());
        zzg = logger;
        zzh = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        zzi = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        zzj = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        zzk = property3;
        zza = Boolean.parseBoolean(property);
        zzb = Boolean.parseBoolean(property2);
        zzc = Boolean.parseBoolean(property3);
        zzahc zzahcVar = null;
        try {
            try {
                try {
                    zzahc zzahcVar2 = (zzahc) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, zzahd.class.getClassLoader()).asSubclass(zzahc.class).getConstructor(null).newInstance(null);
                    if (zzahcVar2.zzb() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", zzahcVar2.zzb());
                    } else {
                        zzahcVar = zzahcVar2;
                    }
                } catch (Exception e) {
                    zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                }
            } catch (Exception e2) {
                zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
            }
        } catch (ClassCastException e3) {
            zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e3);
        } catch (ClassNotFoundException e4) {
            zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
        }
        zzl = zzahcVar;
    }

    public zzahd(String str, String str2, zzaag zzaagVar, zzaop zzaopVar, u651 u651Var, boolean z) {
        c95.m31848n(zzaagVar, "args");
        this.zzs = zzaopVar;
        c95.m31848n(str2, "name");
        URI uriCreate = URI.create("//".concat(str2));
        c95.m31845k(uriCreate.getHost() != null, "Invalid DNS name: %s", str2);
        String authority = uriCreate.getAuthority();
        c95.m31849o("nameUri (%s) doesn't have an authority", authority, uriCreate);
        this.zzp = authority;
        this.zzq = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.zzr = zzaagVar.zza();
        } else {
            this.zzr = uriCreate.getPort();
        }
        zzaau zzaauVarZzd = zzaagVar.zzd();
        c95.m31848n(zzaauVarZzd, "proxyDetector");
        this.zzd = zzaauVarZzd;
        long nanos = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j = 30;
            if (property != null) {
                try {
                    j = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    zzg.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
        }
        this.zzt = nanos;
        c95.m31848n(u651Var, "stopwatch");
        this.zzv = u651Var;
        zzabm zzabmVarZze = zzaagVar.zze();
        c95.m31848n(zzabmVarZze, "syncContext");
        this.zzu = zzabmVarZze;
        Executor executorZzf = zzaagVar.zzf();
        this.zzx = executorZzf;
        this.zzy = executorZzf == null;
        zzaam zzaamVarZzc = zzaagVar.zzc();
        c95.m31848n(zzaamVarZzc, "serviceConfigParser");
        this.zzz = zzaamVarZzc;
    }

    public static /* bridge */ /* synthetic */ zzxn zzg(zzahd zzahdVar) {
        zzaat zzaatVarZza = zzahdVar.zzd.zza(InetSocketAddress.createUnresolved(zzahdVar.zzq, zzahdVar.zzr));
        if (zzaatVarZza == null) {
            return null;
        }
        return new zzxn(Collections.singletonList(zzaatVarZza), zzvz.zza);
    }

    private static String zzm() {
        if (zzm == null) {
            try {
                zzm = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }
        return zzm;
    }

    private final void zzn() {
        if (this.zzA || this.zzw) {
            return;
        }
        if (this.zzf) {
            long j = this.zzt;
            if (j != 0) {
                if (j <= 0) {
                    return;
                }
                u651 u651Var = this.zzv;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                if (timeUnit.convert(u651Var.f227227a ? System.nanoTime() - u651Var.f227228b : 0L, timeUnit) <= this.zzt) {
                    return;
                }
            }
        }
        this.zzA = true;
        this.zzx.execute(new zzaha(this, this.zzB));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public final String zza() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public final void zzb() {
        c95.m31856v(this.zzB != null, "not started");
        zzn();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public final void zzc() {
        if (this.zzw) {
            return;
        }
        this.zzw = true;
        Executor executor = this.zzx;
        if (executor == null || !this.zzy) {
            return;
        }
        zzaoq.zzc(this.zzs, executor);
        this.zzx = null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public final void zzd(zzaaj zzaajVar) {
        c95.m31856v(this.zzB == null, "already started");
        if (this.zzy) {
            this.zzx = zzaoq.zza(this.zzs);
        }
        c95.m31848n(zzaajVar, "listener");
        this.zzB = zzaajVar;
        zzn();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c3 A[Catch: RuntimeException -> 0x015e, TryCatch #1 {RuntimeException -> 0x015e, blocks: (B:70:0x013a, B:71:0x0142, B:73:0x0148, B:76:0x0161, B:78:0x0169, B:80:0x016f, B:81:0x0173, B:83:0x0179, B:87:0x018a, B:89:0x0192, B:94:0x019f, B:97:0x01ab, B:99:0x01b3, B:101:0x01b9, B:102:0x01bd, B:104:0x01c3, B:106:0x01cf, B:111:0x01d9, B:112:0x01e8), top: B:144:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    /* JADX WARN: Code duplicated, block: B:168:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:? A[LOOP:5: B:102:0x01bd->B:170:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:89:0x0192 A[Catch: RuntimeException -> 0x015e, TryCatch #1 {RuntimeException -> 0x015e, blocks: (B:70:0x013a, B:71:0x0142, B:73:0x0148, B:76:0x0161, B:78:0x0169, B:80:0x016f, B:81:0x0173, B:83:0x0179, B:87:0x018a, B:89:0x0192, B:94:0x019f, B:97:0x01ab, B:99:0x01b3, B:101:0x01b9, B:102:0x01bd, B:104:0x01c3, B:106:0x01cf, B:111:0x01d9, B:112:0x01e8), top: B:144:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:93:0x019e  */
    /* JADX WARN: Code duplicated, block: B:96:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ab A[Catch: RuntimeException -> 0x015e, TryCatch #1 {RuntimeException -> 0x015e, blocks: (B:70:0x013a, B:71:0x0142, B:73:0x0148, B:76:0x0161, B:78:0x0169, B:80:0x016f, B:81:0x0173, B:83:0x0179, B:87:0x018a, B:89:0x0192, B:94:0x019f, B:97:0x01ab, B:99:0x01b3, B:101:0x01b9, B:102:0x01bd, B:104:0x01c3, B:106:0x01cf, B:111:0x01d9, B:112:0x01e8), top: B:144:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b3 A[Catch: RuntimeException -> 0x015e, TryCatch #1 {RuntimeException -> 0x015e, blocks: (B:70:0x013a, B:71:0x0142, B:73:0x0148, B:76:0x0161, B:78:0x0169, B:80:0x016f, B:81:0x0173, B:83:0x0179, B:87:0x018a, B:89:0x0192, B:94:0x019f, B:97:0x01ab, B:99:0x01b3, B:101:0x01b9, B:102:0x01bd, B:104:0x01c3, B:106:0x01cf, B:111:0x01d9, B:112:0x01e8), top: B:144:0x013a }] */
    public final zzagx zzi(boolean z) {
        zzahb zzahbVarZza;
        zzahc zzahcVar;
        zzaah zzaahVarZzb;
        Double dZzb;
        List listZzi;
        Map mapZzj;
        Iterator it;
        int iIntValue;
        boolean z2;
        zzaah zzaahVarZzb2 = null;
        zzagx zzagxVar = new zzagx(null);
        try {
            try {
                try {
                    List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(this.zzq)));
                    ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                    Iterator it2 = listUnmodifiableList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new zzxn(Collections.singletonList(new InetSocketAddress((InetAddress) it2.next(), this.zzr)), zzvz.zza));
                    }
                    zzagxVar.zzb = Collections.unmodifiableList(arrayList);
                    if (zzc) {
                        String str = this.zzq;
                        List<String> listZza = Collections.EMPTY_LIST;
                        boolean z3 = zza;
                        boolean z4 = zzb;
                        if (!z3) {
                            zzahbVarZza = null;
                        } else if (!"localhost".equalsIgnoreCase(str)) {
                            if (!str.contains(":")) {
                                boolean z5 = true;
                                for (int i = 0; i < str.length(); i++) {
                                    char cCharAt = str.charAt(i);
                                    if (cCharAt != '.') {
                                        z5 &= cCharAt >= '0' && cCharAt <= '9';
                                    }
                                }
                                if (!z5) {
                                    zzahbVarZza = (zzahb) this.zzo.get();
                                    if (zzahbVarZza == null) {
                                        zzahbVarZza = zzahcVar.zza();
                                    }
                                }
                            }
                            zzahbVarZza = null;
                        } else if (z4) {
                            zzahbVarZza = (zzahb) this.zzo.get();
                            if (zzahbVarZza == null && (zzahcVar = zzl) != null) {
                                zzahbVarZza = zzahcVar.zza();
                            }
                        } else {
                            zzahbVarZza = null;
                        }
                        if (zzahbVarZza != null) {
                            try {
                                listZza = zzahbVarZza.zza();
                            } catch (Exception e) {
                                zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "ServiceConfig resolution failure", (Throwable) e);
                            }
                        }
                        if (listZza.isEmpty()) {
                            zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "No TXT records found for {0}", new Object[]{this.zzq});
                        } else {
                            Random random = this.zzn;
                            String strZzm = zzm();
                            try {
                                ArrayList<Map> arrayList2 = new ArrayList();
                                for (String str2 : listZza) {
                                    if (str2.startsWith("grpc_config=")) {
                                        Object objZza = zzaiv.zza(str2.substring(12));
                                        if (!(objZza instanceof List)) {
                                            throw new ClassCastException("wrong type ".concat(String.valueOf(objZza)));
                                        }
                                        List list = (List) objZza;
                                        zzaiw.zzf(list);
                                        arrayList2.addAll(list);
                                    } else {
                                        zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "parseTxtResults", "Ignoring non service config {0}", new Object[]{str2});
                                    }
                                }
                                Map map = null;
                                for (Map map2 : arrayList2) {
                                    try {
                                        for (Map.Entry entry : map2.entrySet()) {
                                            n0e1.m63422b0(zzh.contains(entry.getKey()), "Bad key: %s", entry);
                                        }
                                        List listZzi2 = zzaiw.zzi(map2, "clientLanguage");
                                        if (listZzi2 == null || listZzi2.isEmpty()) {
                                            dZzb = zzaiw.zzb(map2, "percentage");
                                            if (dZzb == null) {
                                                listZzi = zzaiw.zzi(map2, "clientHostname");
                                                if (listZzi != null && !listZzi.isEmpty()) {
                                                    it = listZzi.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            map = null;
                                                        } else if (((String) it.next()).equals(strZzm)) {
                                                        }
                                                    }
                                                }
                                                mapZzj = zzaiw.zzj(map2, "serviceConfig");
                                                if (mapZzj != null) {
                                                    throw new VerifyException(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                }
                                                map = mapZzj;
                                            } else {
                                                iIntValue = dZzb.intValue();
                                                if (iIntValue >= 0 || iIntValue > 100) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                                n0e1.m63422b0(z2, "Bad percentage: %s", dZzb);
                                                if (random.nextInt(100) >= iIntValue) {
                                                    listZzi = zzaiw.zzi(map2, "clientHostname");
                                                    if (listZzi != null) {
                                                        it = listZzi.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                if (((String) it.next()).equals(strZzm)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    mapZzj = zzaiw.zzj(map2, "serviceConfig");
                                                    if (mapZzj != null) {
                                                        throw new VerifyException(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                    }
                                                    map = mapZzj;
                                                }
                                                map = null;
                                            }
                                        } else {
                                            Iterator it3 = listZzi2.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    if ("java".equalsIgnoreCase((String) it3.next())) {
                                                        dZzb = zzaiw.zzb(map2, "percentage");
                                                        if (dZzb == null) {
                                                            listZzi = zzaiw.zzi(map2, "clientHostname");
                                                            if (listZzi != null) {
                                                                it = listZzi.iterator();
                                                                while (true) {
                                                                    if (!it.hasNext()) {
                                                                        if (((String) it.next()).equals(strZzm)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            mapZzj = zzaiw.zzj(map2, "serviceConfig");
                                                            if (mapZzj != null) {
                                                                throw new VerifyException(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                            }
                                                            map = mapZzj;
                                                        } else {
                                                            iIntValue = dZzb.intValue();
                                                            if (iIntValue >= 0) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            n0e1.m63422b0(z2, "Bad percentage: %s", dZzb);
                                                            if (random.nextInt(100) >= iIntValue) {
                                                                listZzi = zzaiw.zzi(map2, "clientHostname");
                                                                if (listZzi != null) {
                                                                    it = listZzi.iterator();
                                                                    while (true) {
                                                                        if (!it.hasNext()) {
                                                                            if (((String) it.next()).equals(strZzm)) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                mapZzj = zzaiw.zzj(map2, "serviceConfig");
                                                                if (mapZzj != null) {
                                                                    throw new VerifyException(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                                }
                                                                map = mapZzj;
                                                            }
                                                        }
                                                    }
                                                }
                                                map = null;
                                            }
                                        }
                                        if (map != null) {
                                            break;
                                        }
                                    } catch (RuntimeException e2) {
                                        zzaahVarZzb = zzaah.zzb(zzabe.zzc.zze("failed to pick service config choice").zzd(e2));
                                    }
                                }
                                zzaahVarZzb = map == null ? null : zzaah.zza(map);
                            } catch (IOException e3) {
                                e = e3;
                                zzaahVarZzb = zzaah.zzb(zzabe.zzc.zze("failed to parse TXT records").zzd(e));
                            } catch (RuntimeException e4) {
                                e = e4;
                                zzaahVarZzb = zzaah.zzb(zzabe.zzc.zze("failed to parse TXT records").zzd(e));
                            }
                            if (zzaahVarZzb != null) {
                                zzaahVarZzb2 = zzaahVarZzb.zzc() != null ? zzaah.zzb(zzaahVarZzb.zzc()) : this.zzz.zza((Map) zzaahVarZzb.zzd());
                            }
                        }
                        zzagxVar.zzc = zzaahVarZzb2;
                    }
                    return zzagxVar;
                } catch (Exception e5) {
                    Object obj = kh71.f122542a;
                    if (e5 instanceof RuntimeException) {
                        throw ((RuntimeException) e5);
                    }
                    throw new RuntimeException(e5);
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveAddresses", "Address resolution failure", (Throwable) null);
                }
                throw th;
            }
        } catch (Exception e6) {
            zzagxVar.zza = zzabe.zzk.zze("Unable to resolve host ".concat(String.valueOf(this.zzq))).zzd(e6);
            return zzagxVar;
        }
    }
}
