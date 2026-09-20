package com.comscore.util.setup;

import com.comscore.android.util.jni.AndroidJniHelper;
import com.comscore.android.util.log.AndroidLogger;
import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.log.LogHelper;

/* JADX INFO: loaded from: classes.dex */
public class CustomPlatformSetup extends PlatformSetup {

    /* JADX INFO: renamed from: a */
    private static final String f1645a = "6.12.0+2409170215";

    @Override // com.comscore.util.setup.PlatformSetup
    public JniComScoreHelper createApplicationInfoHelper() {
        return new AndroidJniHelper();
    }

    @Override // com.comscore.util.setup.PlatformSetup
    public LogHelper createLogger() {
        return new AndroidLogger();
    }

    @Override // com.comscore.util.setup.PlatformSetup
    public String getJavaCodeVersion() {
        return f1645a;
    }
}
