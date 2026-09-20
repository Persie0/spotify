package p204p;

import dalvik.system.PathClassLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class urf1 extends PathClassLoader {
    public urf1(ClassLoader classLoader, String str) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
