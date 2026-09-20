package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class c2s implements i4t0 {

    /* JADX INFO: renamed from: c */
    public static final Object f33455c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile c9y f33456a;

    /* JADX INFO: renamed from: b */
    public volatile Object f33457b;

    /* JADX INFO: renamed from: a */
    public static i4t0 m31342a(c9y c9yVar) {
        if (c9yVar instanceof c2s) {
            return c9yVar;
        }
        c2s c2sVar = new c2s();
        c2sVar.f33457b = f33455c;
        c2sVar.f33456a = c9yVar;
        return c2sVar;
    }

    @Override // p204p.i4t0
    public final Object get() {
        Object obj;
        Object obj2 = this.f33457b;
        Object obj3 = f33455c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f33457b;
                if (obj == obj3) {
                    obj = this.f33456a.get();
                    Object obj4 = this.f33457b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f33457b = obj;
                    this.f33456a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
