package com.google.zxing;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReaderException extends Exception {

    /* JADX INFO: renamed from: a */
    public static final boolean f2488a;

    /* JADX INFO: renamed from: b */
    public static final StackTraceElement[] f2489b;

    static {
        f2488a = System.getProperty("surefire.test.class.path") != null;
        f2489b = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
