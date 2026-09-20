package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.internal.zzby;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class FakeSplitInstallManagerFactory {
    private static FakeSplitInstallManager zza;

    private FakeSplitInstallManagerFactory() {
    }

    public static FakeSplitInstallManager create(Context context) {
        try {
            File fileZzb = com.google.android.play.core.splitinstall.zzu.zza(context).zzb();
            if (fileZzb == null) {
                throw new LocalTestingException("Failed to retrieve local testing directory path");
            }
            if (fileZzb.exists()) {
                return create(context, fileZzb);
            }
            throw new LocalTestingException(String.format("Local testing directory not found: %s", fileZzb));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static FakeSplitInstallManager createNewInstance(Context context, final File file) {
        SplitCompat.install(context);
        return new FakeSplitInstallManager(context, file, new com.google.android.play.core.splitinstall.zzs(context, context.getPackageName()), new zzby() { // from class: com.google.android.play.core.splitinstall.testing.zzs
            @Override // com.google.android.play.core.splitinstall.internal.zzby
            public final Object zza() {
                return zzaa.zza(file);
            }
        });
    }

    public static synchronized FakeSplitInstallManager create(Context context, File file) {
        try {
            FakeSplitInstallManager fakeSplitInstallManager = zza;
            if (fakeSplitInstallManager == null) {
                zza = createNewInstance(context, file);
            } else if (!fakeSplitInstallManager.zzc().getAbsolutePath().equals(file.getAbsolutePath())) {
                throw new RuntimeException("Different module directories used to initialize FakeSplitInstallManager: '" + zza.zzc().getAbsolutePath() + "' and '" + file.getAbsolutePath() + "'");
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }
}
