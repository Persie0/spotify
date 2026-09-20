package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import p204p.s571;
import p204p.u0f1;

/* JADX INFO: loaded from: classes4.dex */
public class StandardIntegrityException extends ApiException {

    /* JADX INFO: renamed from: a */
    public final Throwable f2331a;

    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    /* JADX WARN: Illegal instructions before constructor call */
    public StandardIntegrityException(int i, Exception exc) {
        String strM77252k;
        Locale locale = Locale.ROOT;
        HashMap map = u0f1.f225476a;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            HashMap map2 = u0f1.f225477b;
            if (map2.containsKey(numValueOf)) {
                strM77252k = s571.m77252k((String) map.get(numValueOf), " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#", (String) map2.get(numValueOf), ")");
            } else {
                strM77252k = "";
            }
        } else {
            strM77252k = "";
        }
        super(new Status(i, "Standard Integrity API error (" + i + "): " + strM77252k + ".", null, null));
        if (i == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f2331a = exc;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f2331a;
    }

    public final int getErrorCode() {
        return super.getStatusCode();
    }
}
