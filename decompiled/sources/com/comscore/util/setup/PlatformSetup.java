package com.comscore.util.setup;

import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.log.LogHelper;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlatformSetup {
    public String buildNativeLibraryName(String str) {
        return null;
    }

    public String buildNativeLibraryPath(String str) {
        return null;
    }

    public abstract JniComScoreHelper createApplicationInfoHelper();

    public abstract LogHelper createLogger();

    public abstract String getJavaCodeVersion();

    public boolean shouldLoadCppLibrary() {
        return true;
    }
}
