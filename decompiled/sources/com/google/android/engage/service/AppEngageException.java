package com.google.android.engage.service;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class AppEngageException extends ApiException {
    public AppEngageException(int i) {
        super(new Status(i, String.format(Locale.getDefault(), "App Engage Service Error: %d", Integer.valueOf(i)), null, null));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public final int getErrorCode() {
        return super.getStatusCode();
    }
}
