package com.google.android.gms.internal.meet_coactivities;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zztm implements Map.Entry {
    private final Map.Entry zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzto) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzuf) {
            return ((zzto) this.zza.getValue()).zzc((zzuf) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzto zza() {
        return (zzto) this.zza.getValue();
    }
}
