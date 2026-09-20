package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe {
    private final Context zza;

    public zzbe(Context context) {
        this.zza = context;
    }

    private final SharedPreferences zze() {
        return this.zza.getSharedPreferences("playcore_split_install_internal", 0);
    }

    public final Set zza() {
        Set<String> hashSet;
        synchronized (zzbe.class) {
            try {
                hashSet = zze().getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }

    public final void zzb() {
        synchronized (zzbe.class) {
            zze().edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    public final void zzc(Collection collection) {
        synchronized (zzbe.class) {
            HashSet hashSet = new HashSet(zza());
            Iterator it = collection.iterator();
            boolean zAdd = false;
            while (it.hasNext()) {
                zAdd |= hashSet.add((String) it.next());
            }
            if (zAdd) {
                try {
                    zze().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void zzd(Collection collection) {
        synchronized (zzbe.class) {
            Set<String> setZza = zza();
            HashSet hashSet = new HashSet();
            boolean z = false;
            for (String str : setZza) {
                if (collection.contains(str)) {
                    z = true;
                } else {
                    hashSet.add(str);
                }
            }
            if (z) {
                try {
                    zze().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
    }
}
