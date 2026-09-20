package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;
import p204p.s571;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfa extends IOException {
    public zzfa() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzfa(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbM77254m = s571.m77254m(j, "Pos: ", ", limit: ");
        sbM77254m.append(j2);
        sbM77254m.append(", len: ");
        sbM77254m.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbM77254m.toString()), indexOutOfBoundsException);
    }
}
