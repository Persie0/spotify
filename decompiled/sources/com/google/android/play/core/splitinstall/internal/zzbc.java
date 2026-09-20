package com.google.android.play.core.splitinstall.internal;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
final class zzbc implements zzar {
    @Override // com.google.android.play.core.splitinstall.internal.zzar
    public final boolean zza(Object obj, File file, File file2) {
        try {
            return !((Boolean) zzbk.zzf(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
