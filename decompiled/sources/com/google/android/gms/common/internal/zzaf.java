package com.google.android.gms.common.internal;

import p204p.ig31;
import p204p.lzi;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf extends Exception {

    /* JADX INFO: renamed from: a */
    public final lzi f1872a;

    public zzaf(lzi lziVar) {
        ig31.m50497o("ResolvableConnectionException can only be created with a connection result containing a resolution.", (lziVar.f138371b == 0 || lziVar.f138372c == null) ? false : true);
        this.f1872a = lziVar;
    }
}
