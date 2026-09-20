package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p204p.adl;
import p204p.dhc;
import p204p.ed91;
import p204p.o08;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory {
    public ed91 create(adl adlVar) {
        o08 o08Var = (o08) adlVar;
        return new dhc(o08Var.f160259a, o08Var.f160260b, o08Var.f160261c);
    }
}
