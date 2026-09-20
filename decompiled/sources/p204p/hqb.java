package p204p;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: loaded from: classes2.dex */
public class hqb extends nsr implements fqb, zuk, d7d1 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f94082f = AtomicIntegerFieldUpdater.newUpdater(hqb.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f94083g = AtomicReferenceFieldUpdater.newUpdater(hqb.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f94084h = AtomicReferenceFieldUpdater.newUpdater(hqb.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d */
    public final fbk f94085d;

    /* JADX INFO: renamed from: e */
    public final juk f94086e;

    public hqb(int i, fbk fbkVar) {
        super(i);
        this.f94085d = fbkVar;
        this.f94086e = fbkVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = o90.f162903a;
    }

    /* JADX INFO: renamed from: D */
    public static Object m48205D(opj0 opj0Var, Object obj, int i, vh00 vh00Var) {
        if (!(obj instanceof ruf) && isg1.m51534n(i) && (vh00Var != null || (opj0Var instanceof yob))) {
            return new puf(obj, opj0Var instanceof yob ? (yob) opj0Var : null, vh00Var, (Throwable) null, 16);
        }
        return obj;
    }

    /* JADX INFO: renamed from: w */
    public static void m48206w(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: renamed from: A */
    public final void m48207A(Object obj, int i, vh00 vh00Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f94083g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof opj0)) {
                if (obj2 instanceof pqb) {
                    pqb pqbVar = (pqb) obj2;
                    if (pqb.f180249c.compareAndSet(pqbVar, 0, 1)) {
                        if (vh00Var != null) {
                            m48216j(vh00Var, pqbVar.f202838a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(s571.m77249h(obj, "Already resumed, but proposed with update "));
            }
            Object objM48205D = m48205D((opj0) obj2, obj, i, vh00Var);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM48205D)) {
                    if (!m48226v()) {
                        m48218m();
                    }
                    m48219n(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m48208B(luk lukVar, Object obj) {
        fbk fbkVar = this.f94085d;
        lsr lsrVar = fbkVar instanceof lsr ? (lsr) fbkVar : null;
        m48207A(obj, (lsrVar != null ? lsrVar.f136586d : null) == lukVar ? 4 : this.f157872c, null);
    }

    @Override // p204p.fqb
    /* JADX INFO: renamed from: C */
    public final C2617yl mo42412C(Object obj, vh00 vh00Var) {
        return m48209E(obj, vh00Var);
    }

    /* JADX INFO: renamed from: E */
    public final C2617yl m48209E(Object obj, vh00 vh00Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        opj0 opj0Var;
        do {
            atomicReferenceFieldUpdater = f94083g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof opj0)) {
                return null;
            }
            opj0Var = (opj0) obj2;
        } while (!m6b.m60999n(atomicReferenceFieldUpdater, this, opj0Var, m48205D(opj0Var, obj, this.f157872c, vh00Var)));
        boolean zM48226v = m48226v();
        C2617yl c2617yl = hxh.f96228a;
        if (!zM48226v) {
            m48218m();
        }
        return c2617yl;
    }

    @Override // p204p.fqb
    /* JADX INFO: renamed from: F */
    public final void mo42413F(Object obj) {
        m48219n(this.f157872c);
    }

    @Override // p204p.nsr
    /* JADX INFO: renamed from: a */
    public final void mo48210a(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f94083g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof opj0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof ruf) {
                return;
            }
            if (obj instanceof puf) {
                puf pufVar = (puf) obj;
                if (pufVar.f181439e != null) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (m6b.m60998m(atomicReferenceFieldUpdater, this, pufVar, puf.m71068a(pufVar, null, cancellationException, 15))) {
                    yob yobVar = pufVar.f181436b;
                    if (yobVar != null) {
                        m48215i(yobVar, cancellationException);
                    }
                    vh00 vh00Var = pufVar.f181437c;
                    if (vh00Var != null) {
                        m48216j(vh00Var, cancellationException, pufVar.f181435a);
                        return;
                    }
                    return;
                }
                cancellationException2 = cancellationException;
            } else {
                cancellationException2 = cancellationException;
                if (m6b.m60996k(atomicReferenceFieldUpdater, this, obj, new puf(obj, (yob) null, (vh00) null, cancellationException2, 14))) {
                    return;
                }
            }
            cancellationException = cancellationException2;
        }
    }

    @Override // p204p.d7d1
    /* JADX INFO: renamed from: b */
    public final void mo35195b(ffz0 ffz0Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f94082f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m48224t(ffz0Var);
    }

    @Override // p204p.nsr
    /* JADX INFO: renamed from: c */
    public final fbk mo48211c() {
        return this.f94085d;
    }

    @Override // p204p.nsr
    /* JADX INFO: renamed from: d */
    public final Throwable mo48212d(Object obj) {
        Throwable thMo48212d = super.mo48212d(obj);
        if (thMo48212d != null) {
            return thMo48212d;
        }
        return null;
    }

    @Override // p204p.nsr
    /* JADX INFO: renamed from: e */
    public final Object mo48213e(Object obj) {
        return obj instanceof puf ? ((puf) obj).f181435a : obj;
    }

    @Override // p204p.fqb
    /* JADX INFO: renamed from: g */
    public final void mo42414g(Object obj, vh00 vh00Var) {
        m48207A(obj, this.f157872c, vh00Var);
    }

    @Override // p204p.zuk
    public final zuk getCallerFrame() {
        fbk fbkVar = this.f94085d;
        if (fbkVar instanceof zuk) {
            return (zuk) fbkVar;
        }
        return null;
    }

    @Override // p204p.fbk
    public final juk getContext() {
        return this.f94086e;
    }

    @Override // p204p.nsr
    /* JADX INFO: renamed from: h */
    public final Object mo48214h() {
        return f94083g.get(this);
    }

    /* JADX INFO: renamed from: i */
    public final void m48215i(yob yobVar, Throwable th) {
        try {
            yobVar.mo28626a(th);
        } catch (Throwable th2) {
            srz.m79154l(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2), this.f94086e);
        }
    }

    @Override // p204p.fqb
    public final boolean isActive() {
        return f94083g.get(this) instanceof opj0;
    }

    /* JADX INFO: renamed from: j */
    public final void m48216j(vh00 vh00Var, Throwable th, Object obj) {
        juk jukVar = this.f94086e;
        try {
            vh00Var.mo24510D0(th, obj, jukVar);
        } catch (Throwable th2) {
            srz.m79154l(new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2), jukVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m48217k(ffz0 ffz0Var, Throwable th) {
        juk jukVar = this.f94086e;
        int i = f94082f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            ffz0Var.mo41559h(i, jukVar);
        } catch (Throwable th2) {
            srz.m79154l(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2), jukVar);
        }
    }

    @Override // p204p.fqb
    /* JADX INFO: renamed from: l */
    public final void mo42415l(gh00 gh00Var) {
        gga.m44674m(this, new xob(gh00Var, 1));
    }

    /* JADX INFO: renamed from: m */
    public final void m48218m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f94084h;
        hwr hwrVar = (hwr) atomicReferenceFieldUpdater.get(this);
        if (hwrVar == null) {
            return;
        }
        hwrVar.dispose();
        atomicReferenceFieldUpdater.set(this, unj0.f232184a);
    }

    /* JADX INFO: renamed from: n */
    public final void m48219n(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f94082f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                isg1.m51532l(this, i);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX INFO: renamed from: o */
    public Throwable mo48220o(eg60 eg60Var) {
        return eg60Var.mo26603h();
    }

    /* JADX INFO: renamed from: p */
    public final Object m48221p() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        tf60 tf60Var;
        boolean zM48226v = m48226v();
        do {
            atomicIntegerFieldUpdater = f94082f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zM48226v) {
                    m48228y();
                }
                Object obj = f94083g.get(this);
                if (obj instanceof ruf) {
                    throw ((ruf) obj).f202838a;
                }
                if (!isg1.m51534n(this.f157872c) || (tf60Var = (tf60) this.f94086e.mo26595B(gk40.f80712X0)) == null || tf60Var.isActive()) {
                    return mo48213e(obj);
                }
                CancellationException cancellationExceptionMo26603h = tf60Var.mo26603h();
                mo48210a(cancellationExceptionMo26603h);
                throw cancellationExceptionMo26603h;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((hwr) f94084h.get(this)) == null) {
            m48223s();
        }
        if (zM48226v) {
            m48228y();
        }
        return yuk.f276404a;
    }

    /* JADX INFO: renamed from: q */
    public final void m48222q() {
        hwr hwrVarM48223s = m48223s();
        if (hwrVarM48223s != null && m48225u()) {
            hwrVarM48223s.dispose();
            f94084h.set(this, unj0.f232184a);
        }
    }

    @Override // p204p.fqb
    /* JADX INFO: renamed from: r */
    public final boolean mo42416r(Throwable th) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f94083g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof opj0)) {
                return false;
            }
            boolean z = (obj instanceof yob) || (obj instanceof ffz0);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            pqb pqbVar = new pqb(cancellationException, z);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, pqbVar)) {
                    opj0 opj0Var = (opj0) obj;
                    if (opj0Var instanceof yob) {
                        m48215i((yob) obj, th);
                    } else if (opj0Var instanceof ffz0) {
                        m48217k((ffz0) obj, th);
                    }
                    if (!m48226v()) {
                        m48218m();
                    }
                    m48219n(this.f157872c);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // p204p.fbk
    public final void resumeWith(Object obj) {
        m48207A(rlg1.m75831A(obj), this.f157872c, null);
    }

    /* JADX INFO: renamed from: s */
    public final hwr m48223s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        tf60 tf60Var = (tf60) this.f94086e.mo26595B(gk40.f80712X0);
        if (tf60Var == null) {
            return null;
        }
        hwr hwrVarM73190F = qlg1.m73190F(tf60Var, new j3e(this, 0));
        do {
            atomicReferenceFieldUpdater = f94084h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, hwrVarM73190F)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return hwrVarM73190F;
    }

    /* JADX INFO: renamed from: t */
    public final void m48224t(opj0 opj0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f94083g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof o90) {
                if (m6b.m60997l(atomicReferenceFieldUpdater, this, (o90) obj, opj0Var)) {
                    return;
                }
            } else {
                if ((obj instanceof yob) || (obj instanceof ffz0)) {
                    m48206w(opj0Var, obj);
                    throw null;
                }
                if (obj instanceof ruf) {
                    ruf rufVar = (ruf) obj;
                    if (!ruf.f202837b.compareAndSet(rufVar, 0, 1)) {
                        m48206w(opj0Var, obj);
                        throw null;
                    }
                    if (obj instanceof pqb) {
                        Throwable th = rufVar.f202838a;
                        if (opj0Var instanceof yob) {
                            m48215i((yob) opj0Var, th);
                            return;
                        } else {
                            m48217k((ffz0) opj0Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof puf) {
                    puf pufVar = (puf) obj;
                    if (pufVar.f181436b != null) {
                        m48206w(opj0Var, obj);
                        throw null;
                    }
                    if (opj0Var instanceof ffz0) {
                        return;
                    }
                    yob yobVar = (yob) opj0Var;
                    Throwable th2 = pufVar.f181439e;
                    if (th2 != null) {
                        m48215i(yobVar, th2);
                        return;
                    } else if (m6b.m60998m(atomicReferenceFieldUpdater, this, pufVar, puf.m71068a(pufVar, yobVar, null, 29))) {
                        return;
                    }
                } else {
                    if (opj0Var instanceof ffz0) {
                        return;
                    }
                    if (m6b.m60996k(atomicReferenceFieldUpdater, this, obj, new puf(obj, (yob) opj0Var, (vh00) null, (Throwable) null, 28))) {
                        return;
                    }
                }
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo48227x());
        sb.append('(');
        sb.append(opo.m67573w(this.f94085d));
        sb.append("){");
        Object obj = f94083g.get(this);
        if (obj instanceof opj0) {
            str = "Active";
        } else {
            str = obj instanceof pqb ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(opo.m67556f(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m48225u() {
        return !(f94083g.get(this) instanceof opj0);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m48226v() {
        if (isg1.m51536p(this.f157872c)) {
            return lsr.f136585h.get((lsr) this.f94085d) != null;
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public String mo48227x() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: y */
    public final void m48228y() {
        fbk fbkVar = this.f94085d;
        Throwable th = null;
        lsr lsrVar = fbkVar instanceof lsr ? (lsr) fbkVar : null;
        if (lsrVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = lsr.f136585h;
            do {
                Object obj = atomicReferenceFieldUpdater.get(lsrVar);
                if (obj != vvx.f245350b) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(s571.m77249h(obj, "Inconsistent state "));
                    }
                    th = (Throwable) obj;
                    if (!nap.m64030w(atomicReferenceFieldUpdater, lsrVar, th)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    break;
                }
            } while (!nap.m64031x(atomicReferenceFieldUpdater, lsrVar, this));
            if (th == null) {
                return;
            }
            m48218m();
            mo42416r(th);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m48229z(Object obj, gh00 gh00Var) {
        m48207A(obj, this.f157872c, gh00Var != null ? new gqb(0, gh00Var) : null);
    }
}
