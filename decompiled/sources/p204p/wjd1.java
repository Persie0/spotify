package p204p;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public final class wjd1 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f251945a;

    /* JADX INFO: renamed from: b */
    public final int f251946b;

    public wjd1(ClassLoader classLoader) {
        this.f251945a = new WeakReference(classLoader);
        this.f251946b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wjd1) && this.f251945a.get() == ((wjd1) obj).f251945a.get();
    }

    public final int hashCode() {
        return this.f251946b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f251945a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
