package com.google.android.gms.common.api;

import p204p.gey;

/* JADX INFO: loaded from: classes3.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a */
    public final gey f1846a;

    public UnsupportedApiCallException(gey geyVar) {
        this.f1846a = geyVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f1846a));
    }
}
