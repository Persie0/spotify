package com.google.android.gms.internal.meet_coactivities;

import p204p.wuc;

/* JADX INFO: loaded from: classes4.dex */
public enum zzaaz {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);

    private final int zzs;
    private final byte[] zzt;

    zzaaz(int i) {
        this.zzs = i;
        this.zzt = Integer.toString(i).getBytes(wuc.f255135a);
    }

    public final int zza() {
        return this.zzs;
    }

    public final zzabe zzb() {
        return (zzabe) zzabe.zzl.get(this.zzs);
    }
}
