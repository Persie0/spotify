package p204p;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uc60 {

    /* JADX INFO: renamed from: a */
    public static final boolean f228952a;

    /* JADX INFO: renamed from: b */
    public static final Method f228953b;

    /* JADX INFO: renamed from: c */
    public static final Method f228954c;

    /* JADX INFO: renamed from: d */
    public static final Object f228955d;

    /* JADX INFO: renamed from: e */
    public static final Object f228956e;

    static {
        boolean z = false;
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            Class<?> clsLoadClass = contextClassLoader.loadClass("java.nio.file.Files");
            Class<?> clsLoadClass2 = contextClassLoader.loadClass("java.nio.file.Path");
            Class<?> clsLoadClass3 = contextClassLoader.loadClass("java.nio.file.attribute.FileAttribute");
            Class<?> clsLoadClass4 = contextClassLoader.loadClass("java.nio.file.LinkOption");
            f228953b = clsLoadClass.getMethod("isSymbolicLink", clsLoadClass2);
            clsLoadClass.getMethod("delete", clsLoadClass2);
            clsLoadClass.getMethod("readSymbolicLink", clsLoadClass2);
            Object objNewInstance = Array.newInstance(clsLoadClass3, 0);
            f228956e = objNewInstance;
            clsLoadClass.getMethod("createSymbolicLink", clsLoadClass2, clsLoadClass2, objNewInstance.getClass());
            Object objNewInstance2 = Array.newInstance(clsLoadClass4, 0);
            f228955d = objNewInstance2;
            clsLoadClass.getMethod("exists", clsLoadClass2, objNewInstance2.getClass());
            f228954c = File.class.getMethod("toPath", null);
            clsLoadClass2.getMethod("toFile", null);
            z = true;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
        f228952a = z;
    }
}
