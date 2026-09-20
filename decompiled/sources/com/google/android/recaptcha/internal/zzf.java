package com.google.android.recaptcha.internal;

import java.util.Locale;
import java.util.Optional;
import p204p.nwf1;
import p204p.tmf1;
import p204p.u2h1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzf extends Exception {
    public zzf(nwf1 nwf1Var, Exception exc) {
        super(String.format(Locale.US, u2h1.m82254a("bk0="), Long.valueOf(nwf1Var.f159148a)), exc);
        Optional.empty();
        Optional.empty();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzf(nwf1 nwf1Var, tmf1 tmf1Var, long j) {
        Locale locale = Locale.US;
        Long lValueOf = Long.valueOf(j);
        super(String.format(locale, u2h1.m82254a("bk3t6gFTc30="), Long.valueOf(nwf1Var.f159148a), Long.valueOf(tmf1Var.f221722a), lValueOf));
        Optional.of(tmf1Var);
        Optional.of(lValueOf);
    }
}
