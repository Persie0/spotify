package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class a0y0 implements fr70, Serializable {

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater f11213c = AtomicReferenceFieldUpdater.newUpdater(a0y0.class, Object.class, "b");

    /* JADX INFO: renamed from: a */
    public volatile eh00 f11214a;

    /* JADX INFO: renamed from: b */
    public volatile Object f11215b;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new zq40(getValue());
    }

    @Override // p204p.fr70
    public final Object getValue() {
        Object obj = this.f11215b;
        hcj0 hcj0Var = hcj0.f89811P0;
        if (obj != hcj0Var) {
            return obj;
        }
        eh00 eh00Var = this.f11214a;
        if (eh00Var != null) {
            Object objInvoke = eh00Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11213c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, hcj0Var, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != hcj0Var) {
                }
            }
            this.f11214a = null;
            return objInvoke;
        }
        return this.f11215b;
    }

    public final String toString() {
        return this.f11215b != hcj0.f89811P0 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
