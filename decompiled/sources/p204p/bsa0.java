package p204p;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bsa0 {

    /* JADX INFO: renamed from: a */
    public static volatile int f30271a;

    /* JADX INFO: renamed from: b */
    public static final u6l0 f30272b = new u6l0(1);

    /* JADX INFO: renamed from: c */
    public static final u6j0 f30273c = new u6j0(29);

    /* JADX INFO: renamed from: d */
    public static final boolean f30274d;

    /* JADX INFO: renamed from: e */
    public static final String[] f30275e;

    /* JADX INFO: renamed from: f */
    public static final String f30276f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f30274d = property == null ? false : property.equalsIgnoreCase("true");
        f30275e = new String[]{"1.6", "1.7"};
        f30276f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    /* JADX INFO: renamed from: a */
    public static LinkedHashSet m30424a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = bsa0.class.getClassLoader();
            String str = f30276f;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e) {
            System.err.println("Error getting resources from path");
            System.err.println("Reported exception:");
            e.printStackTrace();
            return linkedHashSet;
        }
    }

    /* JADX INFO: renamed from: b */
    public static xra0 m30425b(Class cls) {
        int i;
        xra0 xra0VarM30426c = m30426c(cls.getName());
        if (f30274d) {
            c0b1 c0b1Var = g0b1.f75327a;
            Class cls2 = null;
            if (c0b1Var == null) {
                if (g0b1.f75328b) {
                    c0b1Var = null;
                } else {
                    try {
                        c0b1Var = new c0b1();
                    } catch (SecurityException unused) {
                        c0b1Var = null;
                    }
                    g0b1.f75327a = c0b1Var;
                    g0b1.f75328b = true;
                }
            }
            if (c0b1Var != null) {
                Class[] classContext = c0b1Var.getClassContext();
                String name = g0b1.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                g0b1.m43281w("Detected logger name mismatch. Given name: \"" + xra0VarM30426c.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                g0b1.m43281w("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return xra0VarM30426c;
    }

    /* JADX INFO: renamed from: c */
    public static xra0 m30426c(String str) {
        zu30 zu30Var;
        if (f30271a == 0) {
            synchronized (bsa0.class) {
                try {
                    if (f30271a == 0) {
                        f30271a = 1;
                        m30428e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = f30271a;
        if (i == 1) {
            zu30Var = f30272b;
        } else {
            if (i == 2) {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i == 3) {
                zu30Var = uy41.f235152b.f235155a;
            } else {
                if (i != 4) {
                    throw new IllegalStateException("Unreachable code");
                }
                zu30Var = f30273c;
            }
        }
        return zu30Var.mo47169e(str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m30427d() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    /* JADX INFO: renamed from: e */
    public static final void m30428e() {
        LinkedHashSet linkedHashSetM30424a;
        try {
            try {
                if (m30427d()) {
                    linkedHashSetM30424a = null;
                } else {
                    linkedHashSetM30424a = m30424a();
                    m30431h(linkedHashSetM30424a);
                }
                uy41 uy41Var = uy41.f235152b;
                f30271a = 3;
                m30430g(linkedHashSetM30424a);
            } catch (Throwable th) {
                m30429f();
                throw th;
            }
        } catch (Exception e) {
            f30271a = 2;
            System.err.println("Failed to instantiate SLF4J LoggerFactory");
            System.err.println("Reported exception:");
            e.printStackTrace();
            throw new IllegalStateException("Unexpected initialization failure", e);
        } catch (NoClassDefFoundError e2) {
            String message = e2.getMessage();
            if (message == null || (!message.contains("org/slf4j/impl/StaticLoggerBinder") && !message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                f30271a = 2;
                System.err.println("Failed to instantiate SLF4J LoggerFactory");
                System.err.println("Reported exception:");
                e2.printStackTrace();
                throw e2;
            }
            f30271a = 4;
            g0b1.m43281w("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            g0b1.m43281w("Defaulting to no-operation (NOP) logger implementation");
            g0b1.m43281w("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e3) {
            String message2 = e3.getMessage();
            if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f30271a = 2;
                g0b1.m43281w("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                g0b1.m43281w("Your binding is version 1.5.5 or earlier.");
                g0b1.m43281w("Upgrade your binding to version 1.6.x.");
            }
            throw e3;
        }
        m30429f();
        if (f30271a == 3) {
            String[] strArr = f30275e;
            try {
                String str = uy41.f235154d;
                boolean z = false;
                for (String str2 : strArr) {
                    if (str.startsWith(str2)) {
                        z = true;
                    }
                }
                if (z) {
                    return;
                }
                g0b1.m43281w("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(strArr).toString());
                g0b1.m43281w("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            } catch (NoSuchFieldError unused) {
            } catch (Throwable th2) {
                System.err.println("Unexpected problem occured during version sanity check");
                System.err.println("Reported exception:");
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m30429f() {
        u6l0 u6l0Var = f30272b;
        synchronized (u6l0Var) {
            try {
                u6l0Var.f227382a = true;
                for (zu51 zu51Var : new ArrayList(((HashMap) u6l0Var.f227383b).values())) {
                    zu51Var.m97003t(m30426c(zu51Var.getName()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) f30272b.f227384c;
        int size = linkedBlockingQueue.size();
        ArrayList<av51> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (av51 av51Var : arrayList) {
                if (av51Var != null) {
                    zu51 zu51VarM27224a = av51Var.m27224a();
                    String name = zu51VarM27224a.getName();
                    if (zu51VarM27224a.m97001r()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!zu51VarM27224a.m97000q()) {
                        if (zu51VarM27224a.m96999c()) {
                            zu51VarM27224a.m97002s(av51Var);
                        } else {
                            g0b1.m43281w(name);
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (av51Var.m27224a().m96999c()) {
                        g0b1.m43281w("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        g0b1.m43281w("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        g0b1.m43281w("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!av51Var.m27224a().m97000q()) {
                        g0b1.m43281w("The following set of substitute loggers may have been accessed");
                        g0b1.m43281w("during the initialization phase. Logging calls during this");
                        g0b1.m43281w("phase were not honored. However, subsequent logging calls to these");
                        g0b1.m43281w("loggers will work as normally expected.");
                        g0b1.m43281w("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        u6l0 u6l0Var2 = f30272b;
        ((HashMap) u6l0Var2.f227383b).clear();
        ((LinkedBlockingQueue) u6l0Var2.f227384c).clear();
    }

    /* JADX INFO: renamed from: g */
    public static void m30430g(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        StringBuilder sb = new StringBuilder("Actual binding is of type [");
        uy41.f235152b.getClass();
        sb.append(uy41.f235153c);
        sb.append("]");
        g0b1.m43281w(sb.toString());
    }

    /* JADX INFO: renamed from: h */
    public static void m30431h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            g0b1.m43281w("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                g0b1.m43281w("Found binding in [" + ((URL) it.next()) + "]");
            }
            g0b1.m43281w("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
