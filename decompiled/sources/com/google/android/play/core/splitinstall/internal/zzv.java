package com.google.android.play.core.splitinstall.internal;

import p204p.ev61;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzv implements Runnable {
    private final ev61 zza;

    public zzv() {
        this.zza = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzc();
        } catch (Exception e) {
            zzb(e);
        }
    }

    public final ev61 zza() {
        return this.zza;
    }

    public final void zzb(Exception exc) {
        ev61 ev61Var = this.zza;
        if (ev61Var != null) {
            ev61Var.m40098c(exc);
        }
    }

    public abstract void zzc();

    public zzv(ev61 ev61Var) {
        this.zza = ev61Var;
    }
}
