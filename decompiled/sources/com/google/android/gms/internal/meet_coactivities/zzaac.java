package com.google.android.gms.internal.meet_coactivities;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p204p.c95;
import p204p.dq60;
import p204p.m12;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaac {
    private final zzaaa zza;
    private final String zzb;
    private final String zzc;
    private final zzzz zzd;
    private final zzzz zze;
    private final boolean zzf;

    public zzaac(zzaaa zzaaaVar, String str, zzzz zzzzVar, zzzz zzzzVar2, Object obj, boolean z, boolean z2, boolean z3, zzaab zzaabVar) {
        new AtomicReferenceArray(2);
        c95.m31848n(zzaaaVar, "type");
        this.zza = zzaaaVar;
        c95.m31848n(str, "fullMethodName");
        this.zzb = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.zzc = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        c95.m31848n(zzzzVar, "requestMarshaller");
        this.zzd = zzzzVar;
        c95.m31848n(zzzzVar2, "responseMarshaller");
        this.zze = zzzzVar2;
        this.zzf = z3;
    }

    public static zzzy zza(zzzz zzzzVar, zzzz zzzzVar2) {
        zzzy zzzyVar = new zzzy(null);
        zzzyVar.zzb(null);
        zzzyVar.zzc(null);
        return zzzyVar;
    }

    public static String zze(String str, String str2) {
        c95.m31848n(str, "fullServiceName");
        c95.m31848n(str2, "methodName");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return dq60.m36616p("/", str2, sb);
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(this.zzb, "fullMethodName");
        m12VarM85614C.m60523w(this.zza, "type");
        m12VarM85614C.m60524x("idempotent", false);
        m12VarM85614C.m60524x("safe", false);
        m12VarM85614C.m60524x("sampledToLocalTracing", this.zzf);
        m12VarM85614C.m60523w(this.zzd, "requestMarshaller");
        m12VarM85614C.m60523w(this.zze, "responseMarshaller");
        m12VarM85614C.m60523w(null, "schemaDescriptor");
        m12VarM85614C.f138796b = true;
        return m12VarM85614C.toString();
    }

    public final zzaaa zzb() {
        return this.zza;
    }

    public final InputStream zzc(Object obj) {
        return this.zzd.zza(obj);
    }

    public final Object zzd(InputStream inputStream) {
        return this.zze.zzb(inputStream);
    }

    public final String zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zzc;
    }
}
