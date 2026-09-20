package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzlo extends Exception {
    public zzlo(Throwable th, zzme zzmeVar, StackTraceElement[] stackTraceElementArr) {
        super(zzmeVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
