package com.google.android.play.core.splitinstall;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: classes4.dex */
public class SplitInstallException extends ApiException {
    public SplitInstallException(@SplitInstallErrorCode int i) {
        super(new Status(i, String.format("Split Install Error(%d): %s", Integer.valueOf(i), com.google.android.play.core.splitinstall.model.zza.zzb(i)), null, null));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    @SplitInstallErrorCode
    public int getErrorCode() {
        return super.getStatusCode();
    }
}
