package com.comscore.util;

/* JADX INFO: loaded from: classes.dex */
public class ObfuscationChecker {

    /* JADX INFO: renamed from: a */
    private static final String f1610a = "com.comscore.util";

    /* JADX INFO: renamed from: b */
    private static final String f1611b = "ObfuscationChecker";

    public boolean isCodeObfuscated() {
        return (f1610a.equals(getClass().getPackage().getName()) && f1611b.equals(getClass().getSimpleName())) ? false : true;
    }
}
