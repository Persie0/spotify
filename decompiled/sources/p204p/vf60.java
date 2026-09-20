package p204p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vf60 extends ena0 implements hwr, in40 {

    /* JADX INFO: renamed from: d */
    public eg60 f240905d;

    @Override // p204p.in40
    /* JADX INFO: renamed from: b */
    public final dnj0 mo36480b() {
        return null;
    }

    @Override // p204p.hwr
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        Object obj2;
        ena0 ena0Var;
        njw0 njw0Var;
        eg60 eg60VarM85348h = m85348h();
        do {
            atomicReferenceFieldUpdater = eg60.f59229a;
            obj = atomicReferenceFieldUpdater.get(eg60VarM85348h);
            if (!(obj instanceof vf60)) {
                if (!(obj instanceof in40) || ((in40) obj).mo36480b() == null) {
                    return;
                }
                do {
                    atomicReferenceFieldUpdater2 = ena0.f61113a;
                    obj2 = atomicReferenceFieldUpdater2.get(this);
                    if (obj2 instanceof njw0) {
                        return;
                    }
                    if (obj2 == this) {
                        return;
                    }
                    ena0Var = (ena0) obj2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = ena0.f61115c;
                    njw0Var = (njw0) atomicReferenceFieldUpdater3.get(ena0Var);
                    if (njw0Var == null) {
                        njw0Var = new njw0(ena0Var);
                        atomicReferenceFieldUpdater3.set(ena0Var, njw0Var);
                    }
                } while (!y8a0.m93106k(atomicReferenceFieldUpdater2, this, obj2, njw0Var));
                ena0Var.m39482d();
                return;
            }
            if (obj != this) {
                return;
            }
        } while (!oq40.m67599r(atomicReferenceFieldUpdater, eg60VarM85348h, (vf60) obj));
    }

    public tf60 getParent() {
        return m85348h();
    }

    /* JADX INFO: renamed from: h */
    public final eg60 m85348h() {
        eg60 eg60Var = this.f240905d;
        if (eg60Var != null) {
            return eg60Var;
        }
        wj50.m88260d0("job");
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo25338i();

    @Override // p204p.in40
    public final boolean isActive() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo25339j(Throwable th);

    @Override // p204p.ena0
    public final String toString() {
        return opo.m67555e(this) + '@' + opo.m67556f(this) + "[job@" + opo.m67556f(m85348h()) + ']';
    }
}
