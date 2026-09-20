package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.internal.zzcb;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf implements zzcb {
    private final zzcb zza;

    public zzaf(zzcb zzcbVar) {
        this.zza = zzcbVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* bridge */ /* synthetic */ Object zza() {
        String string;
        Context contextZzb = ((zzad) this.zza).zzb();
        try {
            Bundle bundle = contextZzb.getPackageManager().getApplicationInfo(contextZzb.getPackageName(), 128).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return new File(contextZzb.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
