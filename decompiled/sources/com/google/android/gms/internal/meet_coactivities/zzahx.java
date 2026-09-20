package com.google.android.gms.internal.meet_coactivities;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import p204p.c95;
import p204p.cuc;
import p204p.j561;
import p204p.kgg1;
import p204p.qg71;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahx {
    public static final zzzr zza;
    public static final zzzr zzb;
    public static final zzzr zzc;
    public static final zzzr zzd;
    public static final zzzr zze;
    static final zzzr zzf;
    public static final zzaau zzg;
    public static final zzwc zzh;
    public static final zzaop zzi;
    public static final zzaop zzj;
    public static final j561 zzk;
    private static final Logger zzl = Logger.getLogger(zzahx.class.getName());
    private static final Set zzm = Collections.unmodifiableSet(EnumSet.of(zzaaz.OK, zzaaz.INVALID_ARGUMENT, zzaaz.NOT_FOUND, zzaaz.ALREADY_EXISTS, zzaaz.FAILED_PRECONDITION, zzaaz.ABORTED, zzaaz.OUT_OF_RANGE, zzaaz.DATA_LOSS));
    private static final zzwr zzn;

    static {
        Charset.forName("US-ASCII");
        zza = zzzr.zzc("grpc-timeout", new zzahw());
        zzzp zzzpVar = zzzw.zza;
        zzb = zzzr.zzc("grpc-encoding", zzzpVar);
        zzahu zzahuVar = null;
        zzc = zzyl.zzb("grpc-accept-encoding", new zzahv(zzahuVar));
        zzd = zzzr.zzc("content-encoding", zzzpVar);
        zze = zzyl.zzb("accept-encoding", new zzahv(zzahuVar));
        zzf = zzzr.zzc("content-length", zzzpVar);
        zzzr.zzc("content-type", zzzpVar);
        zzzr.zzc("te", zzzpVar);
        zzzr.zzc("user-agent", zzzpVar);
        cuc.f42086c.getClass();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        zzg = new zzamc();
        zzh = zzwc.zza("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        zzn = new zzahq();
        zzi = new zzahr();
        zzj = new zzahs();
        zzk = new zzaht();
    }

    private zzahx() {
    }

    public static zzabe zza(zzabe zzabeVar) {
        c95.m31843i(zzabeVar != null);
        if (!zzm.contains(zzabeVar.zza())) {
            return zzabeVar;
        }
        return zzabe.zzj.zze("Inappropriate status code from control plane: " + String.valueOf(zzabeVar.zza()) + " " + zzabeVar.zzg()).zzd(zzabeVar.zzh());
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.meet_coactivities.zzaoy, java.lang.Object] */
    public static zzaex zzb(zzyw zzywVar, boolean z) {
        zzzb zzzbVarZze = zzywVar.zze();
        zzaex zzaexVarZzh = zzzbVarZze != null ? zzzbVarZze.zza().zzh() : null;
        if (zzaexVarZzh != null) {
            return zzaexVarZzh;
        }
        if (!zzywVar.zzf().zzj()) {
            if (zzywVar.zzg()) {
                return new zzahi(zza(zzywVar.zzf()), zzaev.DROPPED);
            }
            if (!z) {
                return new zzahi(zza(zzywVar.zzf()), zzaev.PROCESSED);
            }
        }
        return null;
    }

    public static String zzc(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory zzd(String str, boolean z) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new qg71(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null, bool);
    }

    public static void zze(zzaou zzaouVar) {
        while (true) {
            InputStream inputStreamZzf = zzaouVar.zzf();
            if (inputStreamZzf == null) {
                return;
            } else {
                zzf(inputStreamZzf);
            }
        }
    }

    public static void zzf(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            zzl.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e);
        }
    }

    public static boolean zzg(String str, boolean z) {
        String strTrim = System.getenv(str);
        if (strTrim == null) {
            strTrim = System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        return !kgg1.m56363z(strTrim) && Boolean.parseBoolean(strTrim);
    }

    public static zzwr[] zzh(zzwe zzweVar, zzzw zzzwVar, int i, boolean z) {
        List listZzm = zzweVar.zzm();
        int size = listZzm.size();
        zzwr[] zzwrVarArr = new zzwr[size + 1];
        zzwp zzwpVarZza = zzwq.zza();
        zzwpVarZza.zza(zzweVar);
        zzwpVarZza.zzc(i);
        zzwpVarZza.zzb(z);
        zzwq zzwqVarZzd = zzwpVarZza.zzd();
        for (int i2 = 0; i2 < listZzm.size(); i2++) {
            zzwrVarArr[i2] = ((zzwo) listZzm.get(i2)).zza(zzwqVarZzd, zzzwVar);
        }
        zzwrVarArr[size] = zzn;
        return zzwrVarArr;
    }
}
