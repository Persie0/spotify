package com.google.android.gms.internal.meet_coactivities;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zznh extends AbstractSet {
    final /* synthetic */ zznl zza;

    public zznh(zznl zznlVar) {
        this.zza = zznlVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzng(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.zzd;
    }
}
