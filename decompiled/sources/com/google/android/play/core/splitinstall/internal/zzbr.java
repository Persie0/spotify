package com.google.android.play.core.splitinstall.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzbr {
    public static Context zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
