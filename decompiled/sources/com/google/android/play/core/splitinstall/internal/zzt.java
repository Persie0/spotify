package com.google.android.play.core.splitinstall.internal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p204p.qx41;

/* JADX INFO: loaded from: classes4.dex */
public final class zzt {
    protected final Set zza = new HashSet();

    public final synchronized void zza(qx41 qx41Var) {
        this.zza.add(qx41Var);
    }

    public final synchronized void zzb(qx41 qx41Var) {
        this.zza.remove(qx41Var);
    }

    public final synchronized void zzc(Object obj) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((qx41) it.next()).onStateUpdate(obj);
        }
    }
}
