package com.google.android.gms.internal.meet_coactivities;

import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p204p.ckr;
import p204p.fg90;
import p204p.n0e1;

/* JADX INFO: loaded from: classes.dex */
public final class zzir {
    public static final Executor zza = ckr.f39074a;

    public static fg90 zza(Optional optional) {
        return n0e1.m63399G(optional.isPresent() ? (ExecutorService) optional.get() : Executors.newSingleThreadExecutor());
    }
}
