package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import java.util.List;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzwn {
    public static zzwf zza(zzwf zzwfVar, List list) {
        c95.m31848n(zzwfVar, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzwfVar = new zzwm(zzwfVar, (zzwk) it.next(), null);
        }
        return zzwfVar;
    }
}
