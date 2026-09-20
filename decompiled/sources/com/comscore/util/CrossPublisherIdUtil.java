package com.comscore.util;

import android.os.Looper;
import com.comscore.util.log.Logger;
import com.comscore.util.setup.Setup;

/* JADX INFO: loaded from: classes.dex */
public class CrossPublisherIdUtil {

    /* JADX INFO: loaded from: classes3.dex */
    public static class GeneratedCrossPublisherId {

        /* JADX INFO: renamed from: a */
        private String f1608a;

        /* JADX INFO: renamed from: b */
        private boolean f1609b;

        public GeneratedCrossPublisherId(String str, boolean z) {
            this.f1608a = str;
            this.f1609b = z;
        }

        public String getValue() {
            return this.f1608a;
        }

        public boolean isChanged() {
            return this.f1609b;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface Listener {
        void onCrossPublisherIdRequested(String str, boolean z);
    }

    public static GeneratedCrossPublisherId getGeneratedCrossPublisherDeviceId() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        if (!Setup.isSetUpFinished()) {
            Logger.m1415e("Library not initialised. Unable to retrieve the crosspublisher ID");
            return null;
        }
        try {
            String generatedCrossPublisherUniqueDeviceIdNative = getGeneratedCrossPublisherUniqueDeviceIdNative();
            return new GeneratedCrossPublisherId(generatedCrossPublisherUniqueDeviceIdNative.substring(2), generatedCrossPublisherUniqueDeviceIdNative.charAt(0) == '1');
        } catch (UnsatisfiedLinkError e) {
            Logger.m1418e("Error using the native library: ", e);
            return null;
        }
    }

    private static native String getGeneratedCrossPublisherUniqueDeviceIdNative();

    public static String getMD5CrossPublisherDeviceId() {
        if (!Setup.isSetUpFinished()) {
            Logger.m1415e("Library not initialised. Unable to retrieve the MD5 crosspublisher ID");
            return null;
        }
        try {
            return getMD5CrossPublisherDeviceIdNative();
        } catch (UnsatisfiedLinkError e) {
            Logger.m1418e("Error using the native library: ", e);
            return null;
        }
    }

    private static native String getMD5CrossPublisherDeviceIdNative();

    public static void requestCrossPublisherId(Listener listener) {
        if (!Setup.isSetUpFinished()) {
            Logger.m1415e("Library not initialised. Unable to retrieve the crosspublisher ID");
            return;
        }
        try {
            requestCrossPublisherIdNative(listener);
        } catch (UnsatisfiedLinkError e) {
            Logger.m1418e("Error using the native library: ", e);
        }
    }

    private static native void requestCrossPublisherIdNative(Listener listener);
}
