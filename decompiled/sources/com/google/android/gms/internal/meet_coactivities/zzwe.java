package com.google.android.gms.internal.meet_coactivities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p204p.c95;
import p204p.m12;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzwe {
    public static final zzwe zza;
    private final zzxj zzb;
    private final Executor zzc;
    private final Object[][] zzd;
    private final List zze;
    private final Boolean zzf;
    private final Integer zzg;
    private final Integer zzh;

    static {
        zzwb zzwbVar = new zzwb();
        zzwbVar.zzc = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        zzwbVar.zzd = Collections.EMPTY_LIST;
        zza = new zzwe(zzwbVar, null);
    }

    public /* synthetic */ zzwe(zzwb zzwbVar, zzwd zzwdVar) {
        this.zzb = zzwbVar.zza;
        this.zzc = zzwbVar.zzb;
        this.zzd = zzwbVar.zzc;
        this.zze = zzwbVar.zzd;
        this.zzf = zzwbVar.zze;
        this.zzg = zzwbVar.zzf;
        this.zzh = zzwbVar.zzg;
    }

    private static zzwb zzp(zzwe zzweVar) {
        zzwb zzwbVar = new zzwb();
        zzwbVar.zza = zzweVar.zzb;
        zzwbVar.zzb = zzweVar.zzc;
        zzwbVar.zzc = zzweVar.zzd;
        zzwbVar.zzd = zzweVar.zze;
        zzwbVar.zze = zzweVar.zzf;
        zzwbVar.zzf = zzweVar.zzg;
        zzwbVar.zzg = zzweVar.zzh;
        return zzwbVar;
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(this.zzb, "deadline");
        m12VarM85614C.m60523w(null, "authority");
        m12VarM85614C.m60523w(null, "callCredentials");
        Executor executor = this.zzc;
        m12VarM85614C.m60523w(executor != null ? executor.getClass() : null, "executor");
        m12VarM85614C.m60523w(null, "compressorName");
        m12VarM85614C.m60523w(Arrays.deepToString(this.zzd), "customOptions");
        m12VarM85614C.m60524x("waitForReady", zzo());
        m12VarM85614C.m60523w(this.zzg, "maxInboundMessageSize");
        m12VarM85614C.m60523w(this.zzh, "maxOutboundMessageSize");
        m12VarM85614C.m60523w(this.zze, "streamTracerFactories");
        return m12VarM85614C.toString();
    }

    public final zzwe zza(zzxj zzxjVar) {
        zzwb zzwbVarZzp = zzp(this);
        zzwbVarZzp.zza = zzxjVar;
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzwe zzb(Executor executor) {
        zzwb zzwbVarZzp = zzp(this);
        zzwbVarZzp.zzb = executor;
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzwe zzc(int i) {
        c95.m31842h("invalid maxsize %s", i, i >= 0);
        zzwb zzwbVarZzp = zzp(this);
        zzwbVarZzp.zzf = Integer.valueOf(i);
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzwe zzd(int i) {
        c95.m31842h("invalid maxsize %s", i, i >= 0);
        zzwb zzwbVarZzp = zzp(this);
        zzwbVarZzp.zzg = Integer.valueOf(i);
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzwe zze(zzwc zzwcVar, Object obj) {
        c95.m31848n(zzwcVar, "key");
        c95.m31848n(obj, "value");
        zzwb zzwbVarZzp = zzp(this);
        int i = 0;
        while (true) {
            Object[][] objArr = this.zzd;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (zzwcVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.zzd.length + (i == -1 ? 1 : 0), 2);
        zzwbVarZzp.zzc = objArr2;
        Object[][] objArr3 = this.zzd;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i == -1) {
            zzwbVarZzp.zzc[this.zzd.length] = new Object[]{zzwcVar, obj};
        } else {
            zzwbVarZzp.zzc[i] = new Object[]{zzwcVar, obj};
        }
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzwe zzf(zzwo zzwoVar) {
        ArrayList arrayList = new ArrayList(this.zze.size() + 1);
        arrayList.addAll(this.zze);
        arrayList.add(zzwoVar);
        zzwb zzwbVarZzp = zzp(this);
        zzwbVarZzp.zzd = Collections.unmodifiableList(arrayList);
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzwe zzg() {
        zzwb zzwbVarZzp = zzp(this);
        zzwbVarZzp.zze = Boolean.TRUE;
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzwe zzh() {
        zzwb zzwbVarZzp = zzp(this);
        zzwbVarZzp.zze = Boolean.FALSE;
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzxj zzi() {
        return this.zzb;
    }

    public final Integer zzj() {
        return this.zzg;
    }

    public final Integer zzk() {
        return this.zzh;
    }

    public final Object zzl(zzwc zzwcVar) {
        c95.m31848n(zzwcVar, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.zzd;
            if (i >= objArr.length) {
                zzwc.zzb(zzwcVar);
                return null;
            }
            if (zzwcVar.equals(objArr[i][0])) {
                return this.zzd[i][1];
            }
            i++;
        }
    }

    public final List zzm() {
        return this.zze;
    }

    public final Executor zzn() {
        return this.zzc;
    }

    public final boolean zzo() {
        return Boolean.TRUE.equals(this.zzf);
    }
}
