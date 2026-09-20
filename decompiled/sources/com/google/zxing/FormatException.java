package com.google.zxing;

/* JADX INFO: loaded from: classes4.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: c */
    public static final FormatException f2487c;

    static {
        FormatException formatException = new FormatException();
        f2487c = formatException;
        formatException.setStackTrace(ReaderException.f2489b);
    }

    private FormatException() {
    }

    /* JADX INFO: renamed from: a */
    public static FormatException m2222a() {
        return ReaderException.f2488a ? new FormatException() : f2487c;
    }
}
