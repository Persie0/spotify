package com.google.android.gms.internal.meet_coactivities;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsa extends IOException {
    public zzsa() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzsa(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzsa(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
