package p204p;

import android.app.ActivityManager;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k2n0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f118672a;

    static {
        ClassLoader classLoader;
        char[] cArr = l2n0.f129050d;
        f118672a = vie1.m85628j("robolectric", Build.FINGERPRINT) || !((classLoader = l2n0.class.getClassLoader()) == null || (classLoader.getResource("androidx/test/espresso/Espresso.class") == null && classLoader.getResource("org/junit/runner/Runner.class") == null && classLoader.getResource("androidx/test/platform/app/InstrumentationRegistry.class") == null)) || ActivityManager.isRunningInTestHarness();
    }
}
