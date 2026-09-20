package com.google.android.gms.internal.meet_coactivities;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import p204p.bk60;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxm {
    static final bk60 zza = new bk60(String.valueOf(','));
    private static final zzxm zzb = new zzxm(zzwu.zza, false, new zzxm(new zzwt(), true, new zzxm()));
    private final Map zzc;
    private final byte[] zzd;

    private zzxm() {
        this.zzc = new LinkedHashMap(0);
        this.zzd = new byte[0];
    }

    public static zzxm zza() {
        return zzb;
    }

    public final byte[] zzb() {
        return this.zzd;
    }

    private zzxm(zzxk zzxkVar, boolean z, zzxm zzxmVar) {
        String strZza = zzxkVar.zza();
        c95.m31844j(!strZza.contains(","), "Comma is currently not allowed in message encoding");
        int size = zzxmVar.zzc.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zzxmVar.zzc.containsKey(zzxkVar.zza()) ? size : size + 1);
        for (zzxl zzxlVar : zzxmVar.zzc.values()) {
            String strZza2 = zzxlVar.zza.zza();
            if (!strZza2.equals(strZza)) {
                linkedHashMap.put(strZza2, new zzxl(zzxlVar.zza, zzxlVar.zzb));
            }
        }
        linkedHashMap.put(strZza, new zzxl(zzxkVar, z));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.zzc = mapUnmodifiableMap;
        bk60 bk60Var = zza;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((zzxl) entry.getValue()).zzb) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.zzd = bk60Var.m29645c(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}
