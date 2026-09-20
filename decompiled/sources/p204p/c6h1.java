package p204p;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class c6h1 {

    /* JADX INFO: renamed from: b */
    public static final c6h1 f34541b = new c6h1();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f34542a = new AtomicReference(new k7h1(new y3d1(21)));

    /* JADX INFO: renamed from: a */
    public final synchronized void m31565a(f7h1 f7h1Var) {
        AtomicReference atomicReference = this.f34542a;
        y3d1 y3d1Var = new y3d1((k7h1) atomicReference.get());
        y3d1Var.m92758h(f7h1Var);
        atomicReference.set(new k7h1(y3d1Var));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m31566b(m7h1 m7h1Var) {
        AtomicReference atomicReference = this.f34542a;
        y3d1 y3d1Var = new y3d1((k7h1) atomicReference.get());
        HashMap map = (HashMap) y3d1Var.f268898c;
        Class clsZza = m7h1Var.zza();
        if (map.containsKey(clsZza)) {
            m7h1 m7h1Var2 = (m7h1) map.get(clsZza);
            if (!m7h1Var2.equals(m7h1Var) || !m7h1Var.equals(m7h1Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
            }
        } else {
            map.put(clsZza, m7h1Var);
        }
        atomicReference.set(new k7h1(y3d1Var));
    }
}
