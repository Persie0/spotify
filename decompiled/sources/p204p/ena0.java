package p204p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class ena0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f61113a = AtomicReferenceFieldUpdater.newUpdater(ena0.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f61114b = AtomicReferenceFieldUpdater.newUpdater(ena0.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f61115c = AtomicReferenceFieldUpdater.newUpdater(ena0.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: c */
    public final boolean m39481c(ena0 ena0Var, int i) {
        ena0 ena0VarM39482d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            ena0VarM39482d = m39482d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f61114b;
            if (ena0VarM39482d == null) {
                Object obj = atomicReferenceFieldUpdater2.get(this);
                while (true) {
                    ena0VarM39482d = (ena0) obj;
                    if (!ena0VarM39482d.mo36481g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater2.get(ena0VarM39482d);
                }
            }
            if (ena0VarM39482d instanceof yo80) {
                return (((yo80) ena0VarM39482d).f274599d & i) == 0 && ena0VarM39482d.m39481c(ena0Var, i);
            }
            atomicReferenceFieldUpdater2.set(ena0Var, ena0VarM39482d);
            atomicReferenceFieldUpdater = f61113a;
            atomicReferenceFieldUpdater.set(ena0Var, this);
        } while (!y8a0.m93108m(atomicReferenceFieldUpdater, ena0VarM39482d, this, ena0Var));
        ena0Var.m39483e(this);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final ena0 m39482d() {
        ena0 ena0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f61114b;
            ena0 ena0Var2 = (ena0) atomicReferenceFieldUpdater2.get(this);
            ena0Var = ena0Var2;
            while (true) {
                ena0 ena0Var3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f61113a;
                    obj = atomicReferenceFieldUpdater.get(ena0Var);
                    if (obj == this) {
                        if (ena0Var2 != ena0Var && !y8a0.m93108m(atomicReferenceFieldUpdater2, this, ena0Var2, ena0Var)) {
                            break;
                        }
                        break;
                    }
                    if (mo36481g()) {
                        return null;
                    }
                    if (!(obj instanceof njw0)) {
                        ena0Var3 = ena0Var;
                        ena0Var = (ena0) obj;
                    } else {
                        if (ena0Var3 != null) {
                            break;
                        }
                        ena0Var = (ena0) atomicReferenceFieldUpdater2.get(ena0Var);
                    }
                }
                if (!y8a0.m93108m(atomicReferenceFieldUpdater, ena0Var3, ena0Var, ((njw0) obj).f154662a)) {
                    break;
                }
                ena0Var = ena0Var3;
            }
        }
        return ena0Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m39483e(ena0 ena0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ena0 ena0Var2;
        do {
            atomicReferenceFieldUpdater = f61114b;
            ena0Var2 = (ena0) atomicReferenceFieldUpdater.get(ena0Var);
            if (f61113a.get(this) != ena0Var) {
                return;
            }
        } while (!y8a0.m93108m(atomicReferenceFieldUpdater, ena0Var, ena0Var2, this));
        if (mo36481g()) {
            ena0Var.m39482d();
        }
    }

    /* JADX INFO: renamed from: f */
    public final ena0 m39484f() {
        ena0 ena0Var;
        Object obj = f61113a.get(this);
        njw0 njw0Var = obj instanceof njw0 ? (njw0) obj : null;
        return (njw0Var == null || (ena0Var = njw0Var.f154662a) == null) ? (ena0) obj : ena0Var;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo36481g() {
        return f61113a.get(this) instanceof njw0;
    }

    public String toString() {
        return new l6t(this) + '@' + opo.m67556f(this);
    }
}
