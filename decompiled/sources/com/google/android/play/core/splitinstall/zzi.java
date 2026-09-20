package com.google.android.play.core.splitinstall;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzi {
    private final Map zza = new HashMap();

    public final zzi zza(String str, String str2, String str3) {
        if (!this.zza.containsKey(str2)) {
            this.zza.put(str2, new HashMap());
        }
        ((Map) this.zza.get(str2)).put(str, str3);
        return this;
    }

    public final zzk zzb() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.zza.entrySet()) {
            map.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new zzk(Collections.unmodifiableMap(map), null);
    }
}
