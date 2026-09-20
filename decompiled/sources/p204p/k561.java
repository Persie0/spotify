package p204p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class k561 implements j561, Serializable {

    /* JADX INFO: renamed from: a */
    public transient Object f119420a = new Object();

    /* JADX INFO: renamed from: b */
    public final j561 f119421b;

    /* JADX INFO: renamed from: c */
    public volatile transient boolean f119422c;

    /* JADX INFO: renamed from: d */
    public transient Object f119423d;

    public k561(j561 j561Var) {
        this.f119421b = j561Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f119420a = new Object();
    }

    @Override // p204p.j561
    public final Object get() {
        if (!this.f119422c) {
            synchronized (this.f119420a) {
                try {
                    if (!this.f119422c) {
                        Object obj = this.f119421b.get();
                        this.f119423d = obj;
                        this.f119422c = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f119423d;
    }

    public final String toString() {
        return edb.m38568q(new StringBuilder("Suppliers.memoize("), this.f119422c ? edb.m38568q(new StringBuilder("<supplier that returned "), this.f119423d, ">") : this.f119421b, ")");
    }
}
