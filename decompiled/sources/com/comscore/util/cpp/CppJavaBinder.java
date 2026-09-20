package com.comscore.util.cpp;

import com.comscore.util.log.Logger;
import com.comscore.util.setup.Setup;

/* JADX INFO: loaded from: classes.dex */
public abstract class CppJavaBinder {

    /* JADX INFO: renamed from: a */
    private int f1612a = 0;

    static {
        Setup.setUp();
    }

    public abstract void destroyCppObject();

    public void finalize() throws Throwable {
        super.finalize();
        destroyCppObject();
    }

    public int getExceptionCounter() {
        return this.f1612a;
    }

    public void printException(Throwable th) {
        Logger.m1418e("Error using the native library: ", th);
        this.f1612a++;
    }
}
