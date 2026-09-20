package com.google.android.play.core.splitinstall;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class SplitInstallManagerFactory {
    private SplitInstallManagerFactory() {
    }

    public static SplitInstallManager create(Context context) {
        return zzu.zza(context).zza();
    }
}
