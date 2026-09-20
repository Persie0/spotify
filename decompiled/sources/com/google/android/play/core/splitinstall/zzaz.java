package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p204p.ev61;

/* JADX INFO: loaded from: classes4.dex */
final class zzaz extends zzbb {
    public zzaz(zzbc zzbcVar, ev61 ev61Var) {
        super(zzbcVar, ev61Var);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzh(List list) {
        super.zzh(list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(SplitInstallSessionState.zzd((Bundle) it.next()));
        }
        this.zza.m40099d(arrayList);
    }
}
