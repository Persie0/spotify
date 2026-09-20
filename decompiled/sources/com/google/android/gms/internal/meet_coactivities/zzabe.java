package com.google.android.gms.internal.meet_coactivities;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import p204p.c95;
import p204p.edb;
import p204p.kh71;
import p204p.klh;
import p204p.m12;
import p204p.upf;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzabe {
    public static final zzabe zza;
    public static final zzabe zzb;
    public static final zzabe zzc;
    public static final zzabe zzd;
    public static final zzabe zze;
    public static final zzabe zzf;
    public static final zzabe zzg;
    public static final zzabe zzh;
    public static final zzabe zzi;
    public static final zzabe zzj;
    public static final zzabe zzk;
    private static final List zzl;
    private static final zzzv zzm;
    private final zzaaz zzn;
    private final String zzo;
    private final Throwable zzp;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        TreeMap treeMap = new TreeMap();
        zzaaz[] zzaazVarArrValues = zzaaz.values();
        int length = zzaazVarArrValues.length;
        boolean z = false;
        int i = 0;
        while (true) {
            zzaba zzabaVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (i >= length) {
                zzl = Collections.unmodifiableList(new ArrayList(treeMap.values()));
                zza = zzaaz.OK.zzb();
                zzb = zzaaz.CANCELLED.zzb();
                zzc = zzaaz.UNKNOWN.zzb();
                zzaaz.INVALID_ARGUMENT.zzb();
                zzd = zzaaz.DEADLINE_EXCEEDED.zzb();
                zzaaz.NOT_FOUND.zzb();
                zzaaz.ALREADY_EXISTS.zzb();
                zze = zzaaz.PERMISSION_DENIED.zzb();
                zzf = zzaaz.UNAUTHENTICATED.zzb();
                zzg = zzaaz.RESOURCE_EXHAUSTED.zzb();
                zzh = zzaaz.FAILED_PRECONDITION.zzb();
                zzaaz.ABORTED.zzb();
                zzaaz.OUT_OF_RANGE.zzb();
                zzi = zzaaz.UNIMPLEMENTED.zzb();
                zzj = zzaaz.INTERNAL.zzb();
                zzk = zzaaz.UNAVAILABLE.zzb();
                zzaaz.DATA_LOSS.zzb();
                new zzzu("grpc-status", z, new zzabb(zzabaVar), objArr3 == true ? 1 : 0);
                zzabd zzabdVar = new zzabd(objArr2 == true ? 1 : 0);
                zzm = zzabdVar;
                new zzzu("grpc-message", z, zzabdVar, objArr == true ? 1 : 0);
                return;
            }
            zzaaz zzaazVar = zzaazVarArrValues[i];
            zzabe zzabeVar = (zzabe) treeMap.put(Integer.valueOf(zzaazVar.zza()), new zzabe(zzaazVar, null, null));
            if (zzabeVar != null) {
                throw new IllegalStateException(edb.m38566o("Code value duplication between ", zzabeVar.zzn.name(), " & ", zzaazVar.name()));
            }
            i++;
        }
    }

    private zzabe(zzaaz zzaazVar, String str, Throwable th) {
        c95.m31848n(zzaazVar, "code");
        this.zzn = zzaazVar;
        this.zzo = str;
        this.zzp = th;
    }

    public static zzabe zzb(int i) {
        if (i >= 0) {
            List list = zzl;
            if (i < list.size()) {
                return (zzabe) list.get(i);
            }
        }
        return zzc.zze("Unknown code " + i);
    }

    public static zzabe zzc(Throwable th) {
        c95.m31848n(th, "t");
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof zzabf) {
                return ((zzabf) cause).zza();
            }
            if (cause instanceof zzabg) {
                return ((zzabg) cause).zza();
            }
        }
        return zzc.zzd(th);
    }

    public static String zzf(zzabe zzabeVar) {
        String str = zzabeVar.zzo;
        zzaaz zzaazVar = zzabeVar.zzn;
        return str == null ? zzaazVar.toString() : klh.m56834f(String.valueOf(zzaazVar), ": ", str);
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(this.zzn.name(), "code");
        m12VarM85614C.m60523w(this.zzo, "description");
        Throwable th = this.zzp;
        Object string = th;
        if (th != null) {
            Object obj = kh71.f122542a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        m12VarM85614C.m60523w(string, "cause");
        return m12VarM85614C.toString();
    }

    public final zzaaz zza() {
        return this.zzn;
    }

    public final zzabe zzd(Throwable th) {
        return upf.m83705v(this.zzp, th) ? this : new zzabe(this.zzn, this.zzo, th);
    }

    public final zzabe zze(String str) {
        return upf.m83705v(this.zzo, str) ? this : new zzabe(this.zzn, str, this.zzp);
    }

    public final String zzg() {
        return this.zzo;
    }

    public final Throwable zzh() {
        return this.zzp;
    }

    public final boolean zzj() {
        return zzaaz.OK == this.zzn;
    }
}
