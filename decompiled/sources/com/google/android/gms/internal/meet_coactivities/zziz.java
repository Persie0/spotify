package com.google.android.gms.internal.meet_coactivities;

import p204p.b8e0;
import p204p.c8e0;
import p204p.hg40;
import p204p.o3a1;

/* JADX INFO: loaded from: classes.dex */
public final class zziz implements c8e0 {
    private final hg40 zza;

    public zziz(hg40 hg40Var) {
        this.zza = hg40Var;
    }

    @Override // p204p.c8e0
    public final void onMeetingStatusChange(b8e0 b8e0Var) {
        o3a1 it = this.zza.iterator();
        while (it.hasNext()) {
            ((c8e0) it.next()).onMeetingStatusChange(b8e0Var);
        }
    }
}
