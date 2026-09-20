package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzld extends zzlt {
    public zzld(String str, Class cls, boolean z) {
        super("tags", cls, false);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzlt
    public final /* bridge */ /* synthetic */ void zzb(Object obj, zzls zzlsVar) {
        for (Map.Entry entry : ((zzow) obj).zzd().entrySet()) {
            if (((Set) entry.getValue()).isEmpty()) {
                zzlsVar.zza((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    zzlsVar.zza((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
