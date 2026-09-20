package com.google.android.gms.internal.meet_coactivities;

import p196j$.time.Duration;
import p204p.rve;
import p204p.tve;

/* JADX INFO: loaded from: classes4.dex */
interface zzif extends rve, zzhe {
    /* synthetic */ void notifyBuffering(Duration duration);

    /* synthetic */ void notifyEnded(Duration duration);

    /* synthetic */ void notifyPauseState(boolean z, Duration duration);

    /* synthetic */ void notifyPlayoutRate(double d, Duration duration);

    /* synthetic */ void notifyQueueUpdate(tve tveVar);

    /* synthetic */ void notifyReady(Duration duration);

    /* synthetic */ void notifySeekToTimestamp(Duration duration);

    /* synthetic */ void notifySwitchedToMedia(String str, String str2, Duration duration);

    @Override // p204p.rve
    /* synthetic */ void notifySwitchedToMedia(String str, String str2, Duration duration, tve tveVar);
}
