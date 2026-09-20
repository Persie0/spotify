package com.spotify.support.assertion;

/* JADX INFO: loaded from: classes2.dex */
public class Assertion$RecoverableAssertionError extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final String f6677a;

    public Assertion$RecoverableAssertionError(String str, String str2) {
        super(str);
        this.f6677a = str2;
    }

    public Assertion$RecoverableAssertionError(String str, Throwable th) {
        super(str, th);
        this.f6677a = null;
    }
}
