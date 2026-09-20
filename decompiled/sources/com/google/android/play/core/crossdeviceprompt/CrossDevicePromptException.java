package com.google.android.play.core.crossdeviceprompt;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import p204p.sif1;

/* JADX INFO: loaded from: classes4.dex */
public final class CrossDevicePromptException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    public CrossDevicePromptException(int i) {
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i);
        String str = (String) sif1.f209508a.get(Integer.valueOf(i));
        super(new Status(i, String.format(locale, "CrossDevicePrompt Error(%d): %s", numValueOf, str == null ? "" : str), null, null));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
