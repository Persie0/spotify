package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public class eg60 implements tf60, dwm0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f59229a = AtomicReferenceFieldUpdater.newUpdater(eg60.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f59230b = AtomicReferenceFieldUpdater.newUpdater(eg60.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public eg60(boolean z) {
        this._state$volatile = z ? i091.f97179g : i091.f97178f;
    }

    /* JADX INFO: renamed from: n0 */
    public static r3e m38774n0(ena0 ena0Var) {
        while (ena0Var.mo36481g()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ena0.f61114b;
            ena0 ena0VarM39482d = ena0Var.m39482d();
            if (ena0VarM39482d == null) {
                Object obj = atomicReferenceFieldUpdater.get(ena0Var);
                while (true) {
                    ena0Var = (ena0) obj;
                    if (!ena0Var.mo36481g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(ena0Var);
                }
            } else {
                ena0Var = ena0VarM39482d;
            }
        }
        while (true) {
            ena0Var = ena0Var.m39484f();
            if (!ena0Var.mo36481g()) {
                if (ena0Var instanceof r3e) {
                    return (r3e) ena0Var;
                }
                if (ena0Var instanceof dnj0) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static String m38775t0(Object obj) {
        if (!(obj instanceof zf60)) {
            if (obj instanceof in40) {
                return ((in40) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof ruf ? "Cancelled" : "Completed";
        }
        zf60 zf60Var = (zf60) obj;
        if (zf60Var.m96002d()) {
            return "Cancelling";
        }
        return zf60.f282240b.get(zf60Var) == 1 ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: A */
    public boolean mo30210A(Throwable th) {
        return m38778Q(th);
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: B */
    public final /* bridge */ huk mo26595B(iuk iukVar) {
        return mlg1.m62229v(this, iukVar);
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: D */
    public final /* bridge */ juk mo26596D(iuk iukVar) {
        return mlg1.m62233z(this, iukVar);
    }

    /* JADX INFO: renamed from: I */
    public Object m38776I(fbk fbkVar) {
        return m38777P(fbkVar);
    }

    @Override // p204p.tf60
    /* JADX INFO: renamed from: J */
    public final hwr mo26598J(boolean z, boolean z2, cv8 cv8Var) {
        return m38796i0(z2, z ? new ao50(cv8Var) : new j3e(cv8Var, 1));
    }

    @Override // p204p.tf60
    /* JADX INFO: renamed from: N */
    public final hwr mo26599N(gh00 gh00Var) {
        return m38796i0(true, new j3e(gh00Var, 1));
    }

    /* JADX INFO: renamed from: O */
    public void mo26008O(Object obj) {
        mo26007H(obj);
    }

    /* JADX INFO: renamed from: P */
    public final Object m38777P(fbk fbkVar) throws Throwable {
        Object obj;
        do {
            obj = f59229a.get(this);
            if (!(obj instanceof in40)) {
                if (obj instanceof ruf) {
                    throw ((ruf) obj).f202838a;
                }
                return i091.m49326H(obj);
            }
        } while (m38803s0(obj) < 0);
        xf60 xf60Var = new xf60(seg1.m77914f(fbkVar), this);
        xf60Var.m48222q();
        gga.m44670i(xf60Var, qlg1.m73190F(this, new pwr(xf60Var, 1)));
        return xf60Var.m48221p();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:40:0x0080, B:38:0x0076, B:39:0x007a), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:40:0x0080, B:38:0x0076, B:39:0x007a), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:40:0x0080, B:38:0x0076, B:39:0x007a), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0042, please report this as an issue */
    /* JADX INFO: renamed from: Q */
    public final boolean m38778Q(Object obj) {
        Throwable thM38784W;
        Object obj2;
        boolean z;
        Throwable thM96001c;
        C2617yl c2617yl;
        in40 in40Var;
        dnj0 dnj0VarM38792e0;
        Object objM38804u0;
        Object objM38804u1 = i091.f97173a;
        if (mo38791d0()) {
            do {
                Object obj3 = f59229a.get(this);
                if (obj3 instanceof in40) {
                    if (obj3 instanceof zf60) {
                        if (zf60.f282240b.get((zf60) obj3) == 1) {
                        }
                    }
                    objM38804u1 = m38804u0(obj3, new ruf(m38784W(obj), false));
                }
                objM38804u1 = i091.f97173a;
                break;
            } while (objM38804u1 == i091.f97175c);
            if (objM38804u1 != i091.f97174b) {
                if (objM38804u1 == i091.f97173a) {
                    thM38784W = null;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59229a;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof zf60) {
                            synchronized (obj2) {
                                if (zf60.f282242d.get((zf60) obj2) == i091.f97177e) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    c2617yl = i091.f97176d;
                                } else {
                                    boolean zM96002d = ((zf60) obj2).m96002d();
                                    if (obj == null || !zM96002d) {
                                        if (thM38784W == null) {
                                            thM38784W = m38784W(obj);
                                        }
                                        ((zf60) obj2).m96000a(thM38784W);
                                    }
                                    thM96001c = zM96002d ? null : ((zf60) obj2).m96001c();
                                    if (thM96001c != null) {
                                        m38799o0(((zf60) obj2).f282243a, thM96001c);
                                    }
                                    c2617yl = i091.f97173a;
                                }
                            }
                        } else if (obj2 instanceof in40) {
                            if (thM38784W == null) {
                                thM38784W = m38784W(obj);
                            }
                            in40Var = (in40) obj2;
                            if (in40Var.isActive()) {
                                dnj0VarM38792e0 = m38792e0(in40Var);
                                if (dnj0VarM38792e0 == null && oq40.m67598q(atomicReferenceFieldUpdater, this, in40Var, new zf60(dnj0VarM38792e0, thM38784W))) {
                                    m38799o0(dnj0VarM38792e0, thM38784W);
                                    c2617yl = i091.f97173a;
                                }
                            } else {
                                objM38804u0 = m38804u0(obj2, new ruf(thM38784W, false));
                                if (objM38804u0 != i091.f97173a) {
                                    throw new IllegalStateException(s571.m77249h(obj2, "Cannot happen in "));
                                }
                                if (objM38804u0 != i091.f97175c) {
                                    objM38804u1 = objM38804u0;
                                    break;
                                }
                            }
                        } else {
                            c2617yl = i091.f97176d;
                        }
                        objM38804u1 = c2617yl;
                        break;
                    }
                }
                if (objM38804u1 != i091.f97173a && objM38804u1 != i091.f97174b) {
                    if (objM38804u1 == i091.f97176d) {
                        return false;
                    }
                    mo26007H(objM38804u1);
                    return true;
                }
            }
        } else {
            if (objM38804u1 == i091.f97173a) {
                thM38784W = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f59229a;
                    obj2 = atomicReferenceFieldUpdater2.get(this);
                    if (obj2 instanceof zf60) {
                        synchronized (obj2) {
                            if (zf60.f282242d.get((zf60) obj2) == i091.f97177e) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                c2617yl = i091.f97176d;
                            } else {
                                boolean zM96002d2 = ((zf60) obj2).m96002d();
                                if (obj == null) {
                                    if (thM38784W == null) {
                                        thM38784W = m38784W(obj);
                                    }
                                    ((zf60) obj2).m96000a(thM38784W);
                                } else {
                                    if (thM38784W == null) {
                                        thM38784W = m38784W(obj);
                                    }
                                    ((zf60) obj2).m96000a(thM38784W);
                                }
                                if (zM96002d2) {
                                }
                                if (thM96001c != null) {
                                    m38799o0(((zf60) obj2).f282243a, thM96001c);
                                }
                                c2617yl = i091.f97173a;
                            }
                        }
                    } else if (obj2 instanceof in40) {
                        if (thM38784W == null) {
                            thM38784W = m38784W(obj);
                        }
                        in40Var = (in40) obj2;
                        if (in40Var.isActive()) {
                            dnj0VarM38792e0 = m38792e0(in40Var);
                            if (dnj0VarM38792e0 == null) {
                                continue;
                            } else {
                                m38799o0(dnj0VarM38792e0, thM38784W);
                                c2617yl = i091.f97173a;
                            }
                        } else {
                            objM38804u0 = m38804u0(obj2, new ruf(thM38784W, false));
                            if (objM38804u0 != i091.f97173a) {
                                throw new IllegalStateException(s571.m77249h(obj2, "Cannot happen in "));
                            }
                            if (objM38804u0 != i091.f97175c) {
                                objM38804u1 = objM38804u0;
                                break;
                            }
                        }
                    } else {
                        c2617yl = i091.f97176d;
                    }
                    objM38804u1 = c2617yl;
                    break;
                }
            }
            if (objM38804u1 != i091.f97173a) {
                if (objM38804u1 == i091.f97176d) {
                    return false;
                }
                mo26007H(objM38804u1);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: R */
    public void mo38779R(CancellationException cancellationException) {
        m38778Q(cancellationException);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m38780S(Throwable th) {
        if (mo26009j0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        q3e q3eVar = (q3e) f59230b.get(this);
        if (q3eVar == null || q3eVar == unj0.f232184a) {
            return z;
        }
        return q3eVar.mo72116a(th) || z;
    }

    /* JADX INFO: renamed from: T */
    public String mo38781T() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: U */
    public boolean mo38782U(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m38778Q(th) && mo38789b0();
    }

    /* JADX INFO: renamed from: V */
    public final void m38783V(in40 in40Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59230b;
        q3e q3eVar = (q3e) atomicReferenceFieldUpdater.get(this);
        if (q3eVar != null) {
            q3eVar.dispose();
            atomicReferenceFieldUpdater.set(this, unj0.f232184a);
        }
        CompletionHandlerException completionHandlerException = null;
        ruf rufVar = obj instanceof ruf ? (ruf) obj : null;
        Throwable th = rufVar != null ? rufVar.f202838a : null;
        if (in40Var instanceof vf60) {
            try {
                ((vf60) in40Var).mo25339j(th);
                return;
            } catch (Throwable th2) {
                mo38794g0(new CompletionHandlerException("Exception in completion handler " + in40Var + " for " + this, th2));
                return;
            }
        }
        dnj0 dnj0VarMo36480b = in40Var.mo36480b();
        if (dnj0VarMo36480b != null) {
            dnj0VarMo36480b.m39481c(new yo80(1), 1);
            for (ena0 ena0VarM39484f = (ena0) ena0.f61113a.get(dnj0VarMo36480b); !ena0VarM39484f.equals(dnj0VarMo36480b); ena0VarM39484f = ena0VarM39484f.m39484f()) {
                if (ena0VarM39484f instanceof vf60) {
                    try {
                        ((vf60) ena0VarM39484f).mo25339j(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            y85.m93061f(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + ena0VarM39484f + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                mo38794g0(completionHandlerException);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final Throwable m38784W(Object obj) {
        Throwable thM96001c;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(mo38781T(), null, this) : th;
        }
        eg60 eg60Var = (eg60) ((dwm0) obj);
        Object obj2 = f59229a.get(eg60Var);
        if (obj2 instanceof zf60) {
            thM96001c = ((zf60) obj2).m96001c();
        } else if (obj2 instanceof ruf) {
            thM96001c = ((ruf) obj2).f202838a;
        } else {
            if (obj2 instanceof in40) {
                throw new IllegalStateException(s571.m77249h(obj2, "Cannot be cancelling child in this state: "));
            }
            thM96001c = null;
        }
        CancellationException cancellationException = thM96001c instanceof CancellationException ? (CancellationException) thM96001c : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        eg60Var.getClass();
        return new JobCancellationException("Parent job is ".concat(m38775t0(obj2)), thM96001c, eg60Var);
    }

    /* JADX INFO: renamed from: X */
    public final Object m38785X(zf60 zf60Var, Object obj) {
        Throwable thM38788a0;
        ruf rufVar = obj instanceof ruf ? (ruf) obj : null;
        Throwable th = rufVar != null ? rufVar.f202838a : null;
        synchronized (zf60Var) {
            zf60Var.m96002d();
            ArrayList<Throwable> arrayListM96003e = zf60Var.m96003e(th);
            thM38788a0 = m38788a0(zf60Var, arrayListM96003e);
            if (thM38788a0 != null && arrayListM96003e.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM96003e.size()));
                for (Throwable th2 : arrayListM96003e) {
                    if (th2 != thM38788a0 && th2 != thM38788a0 && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        y85.m93061f(thM38788a0, th2);
                    }
                }
            }
        }
        if (thM38788a0 != null && thM38788a0 != th) {
            obj = new ruf(thM38788a0, false);
        }
        if (thM38788a0 != null && (m38780S(thM38788a0) || mo36070f0(thM38788a0))) {
            ruf rufVar2 = (ruf) obj;
            rufVar2.getClass();
            ruf.f202837b.compareAndSet(rufVar2, 0, 1);
        }
        mo38800p0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59229a;
        Object objM49352x = i091.m49352x(obj);
        while (!atomicReferenceFieldUpdater.compareAndSet(this, zf60Var, objM49352x) && atomicReferenceFieldUpdater.get(this) == zf60Var) {
        }
        m38783V(zf60Var, obj);
        return obj;
    }

    /* JADX INFO: renamed from: Y */
    public final Object m38786Y() throws Throwable {
        Object obj = f59229a.get(this);
        if (obj instanceof in40) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof ruf) {
            throw ((ruf) obj).f202838a;
        }
        return i091.m49326H(obj);
    }

    /* JADX INFO: renamed from: Z */
    public final Throwable m38787Z() {
        Object obj = f59229a.get(this);
        if (obj instanceof zf60) {
            Throwable thM96001c = ((zf60) obj).m96001c();
            if (thM96001c != null) {
                return thM96001c;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (obj instanceof in40) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (obj instanceof ruf) {
            return ((ruf) obj).f202838a;
        }
        return null;
    }

    @Override // p204p.tf60
    /* JADX INFO: renamed from: a */
    public final qsz0 mo26600a() {
        return new ek5(new bg60(null, this));
    }

    /* JADX INFO: renamed from: a0 */
    public final Throwable m38788a0(zf60 zf60Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (zf60Var.m96002d()) {
                return new JobCancellationException(mo38781T(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX INFO: renamed from: b0 */
    public boolean mo38789b0() {
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final x4b m38790c0() {
        cg60 cg60Var = cg60.f37583h;
        zn91.m96579u(3, cg60Var);
        dg60 dg60Var = dg60.f48743h;
        zn91.m96579u(3, dg60Var);
        return new x4b(this, cg60Var, dg60Var, (Object) null, 17);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean mo38791d0() {
        return this instanceof guf;
    }

    @Override // p204p.tf60
    /* JADX INFO: renamed from: e */
    public void mo26601e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo38781T(), null, this);
        }
        mo38779R(cancellationException);
    }

    /* JADX INFO: renamed from: e0 */
    public final dnj0 m38792e0(in40 in40Var) {
        dnj0 dnj0VarMo36480b = in40Var.mo36480b();
        if (dnj0VarMo36480b != null) {
            return dnj0VarMo36480b;
        }
        if (in40Var instanceof p9u) {
            return new dnj0();
        }
        if (in40Var instanceof vf60) {
            m38802r0((vf60) in40Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + in40Var).toString());
    }

    /* JADX INFO: renamed from: f */
    public Object m38793f() {
        return m38786Y();
    }

    /* JADX INFO: renamed from: f0 */
    public boolean mo36070f0(Throwable th) {
        return false;
    }

    @Override // p204p.huk
    public final iuk getKey() {
        return gk40.f80712X0;
    }

    @Override // p204p.tf60
    /* JADX INFO: renamed from: h */
    public final CancellationException mo26603h() {
        CancellationException cancellationException;
        Object obj = f59229a.get(this);
        if (!(obj instanceof zf60)) {
            if (obj instanceof in40) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof ruf)) {
                return new JobCancellationException(opo.m67555e(this).concat(" has completed normally"), null, this);
            }
            Throwable th = ((ruf) obj).f202838a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new JobCancellationException(mo38781T(), th, this) : cancellationException;
        }
        Throwable thM96001c = ((zf60) obj).m96001c();
        if (thM96001c == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = opo.m67555e(this).concat(" is cancelling");
        cancellationException = thM96001c instanceof CancellationException ? (CancellationException) thM96001c : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo38781T();
        }
        return new JobCancellationException(strConcat, thM96001c, this);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m38795h0(tf60 tf60Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59230b;
        unj0 unj0Var = unj0.f232184a;
        if (tf60Var == null) {
            atomicReferenceFieldUpdater.set(this, unj0Var);
            return;
        }
        tf60Var.start();
        q3e q3eVarMo26607x = tf60Var.mo26607x(this);
        atomicReferenceFieldUpdater.set(this, q3eVarMo26607x);
        if (mo26606t()) {
            q3eVarMo26607x.dispose();
            atomicReferenceFieldUpdater.set(this, unj0Var);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final hwr m38796i0(boolean z, vf60 vf60Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        boolean zM39481c;
        vf60Var.f240905d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f59229a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof p9u;
            unj0 unj0Var = unj0.f232184a;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof in40)) {
                    z2 = false;
                    break;
                }
                in40 in40Var = (in40) obj;
                dnj0 dnj0VarMo36480b = in40Var.mo36480b();
                if (dnj0VarMo36480b == null) {
                    m38802r0((vf60) obj);
                } else {
                    if (vf60Var.mo25338i()) {
                        zf60 zf60Var = in40Var instanceof zf60 ? (zf60) in40Var : null;
                        Throwable thM96001c = zf60Var != null ? zf60Var.m96001c() : null;
                        if (thM96001c == null) {
                            zM39481c = dnj0VarMo36480b.m39481c(vf60Var, 5);
                        } else if (z) {
                            vf60Var.mo25339j(thM96001c);
                            return unj0Var;
                        }
                    } else {
                        zM39481c = dnj0VarMo36480b.m39481c(vf60Var, 1);
                    }
                    if (zM39481c) {
                        break;
                    }
                }
            } else {
                p9u p9uVar = (p9u) obj;
                boolean z4 = p9uVar.f175303a;
                if (z4) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, vf60Var)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    dnj0 dnj0Var = new dnj0();
                    in40 ql40Var = dnj0Var;
                    if (!z4) {
                        ql40Var = new ql40(dnj0Var);
                    }
                    oq40.m67594m(atomicReferenceFieldUpdater, this, p9uVar, ql40Var);
                }
            }
            return unj0Var;
        }
        if (z2) {
            return vf60Var;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            ruf rufVar = obj2 instanceof ruf ? (ruf) obj2 : null;
            vf60Var.mo25339j(rufVar != null ? rufVar.f202838a : null);
        }
        return unj0Var;
    }

    @Override // p204p.tf60
    public boolean isActive() {
        Object obj = f59229a.get(this);
        return (obj instanceof in40) && ((in40) obj).isActive();
    }

    @Override // p204p.tf60
    public final boolean isCancelled() {
        Object obj = f59229a.get(this);
        if (obj instanceof ruf) {
            return true;
        }
        return (obj instanceof zf60) && ((zf60) obj).m96002d();
    }

    /* JADX INFO: renamed from: j0 */
    public boolean mo26009j0() {
        return this instanceof cs9;
    }

    @Override // p204p.tf60
    /* JADX INFO: renamed from: k */
    public final Object mo26604k(fbk fbkVar) {
        Object obj;
        w2a1 w2a1Var;
        do {
            obj = f59229a.get(this);
            boolean z = obj instanceof in40;
            w2a1Var = w2a1.f247311a;
            if (!z) {
                qlg1.m73220y(fbkVar.getContext());
                return w2a1Var;
            }
        } while (m38803s0(obj) < 0);
        hqb hqbVar = new hqb(1, seg1.m77914f(fbkVar));
        hqbVar.m48222q();
        gga.m44670i(hqbVar, qlg1.m73190F(this, new pwr(hqbVar, 2)));
        Object objM48221p = hqbVar.m48221p();
        yuk yukVar = yuk.f276404a;
        if (objM48221p != yukVar) {
            objM48221p = w2a1Var;
        }
        return objM48221p == yukVar ? objM48221p : w2a1Var;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m38797k0(Object obj) {
        Object objM38804u0;
        do {
            objM38804u0 = m38804u0(f59229a.get(this), obj);
            if (objM38804u0 == i091.f97173a) {
                return false;
            }
            if (objM38804u0 == i091.f97174b) {
                return true;
            }
        } while (objM38804u0 == i091.f97175c);
        mo26007H(objM38804u0);
        return true;
    }

    /* JADX INFO: renamed from: l0 */
    public final Object m38798l0(Object obj) {
        Object objM38804u0;
        do {
            objM38804u0 = m38804u0(f59229a.get(this), obj);
            if (objM38804u0 == i091.f97173a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                ruf rufVar = obj instanceof ruf ? (ruf) obj : null;
                throw new IllegalStateException(str, rufVar != null ? rufVar.f202838a : null);
            }
        } while (objM38804u0 == i091.f97175c);
        return objM38804u0;
    }

    /* JADX INFO: renamed from: m0 */
    public String mo30506m0() {
        return opo.m67555e(this);
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: o */
    public final /* bridge */ Object mo26605o(Object obj, th00 th00Var) {
        return mlg1.m62228u(this, obj, th00Var);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m38799o0(dnj0 dnj0Var, Throwable th) {
        dnj0Var.m39481c(new yo80(4), 4);
        CompletionHandlerException completionHandlerException = null;
        for (ena0 ena0VarM39484f = (ena0) ena0.f61113a.get(dnj0Var); !ena0VarM39484f.equals(dnj0Var); ena0VarM39484f = ena0VarM39484f.m39484f()) {
            if ((ena0VarM39484f instanceof vf60) && ((vf60) ena0VarM39484f).mo25338i()) {
                try {
                    ((vf60) ena0VarM39484f).mo25339j(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        y85.m93061f(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + ena0VarM39484f + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo38794g0(completionHandlerException);
        }
        m38780S(th);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m38802r0(vf60 vf60Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        dnj0 dnj0Var = new dnj0();
        vf60Var.getClass();
        ena0.f61114b.set(dnj0Var, vf60Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ena0.f61113a;
        atomicReferenceFieldUpdater2.set(dnj0Var, vf60Var);
        while (atomicReferenceFieldUpdater2.get(vf60Var) == vf60Var) {
            if (y8a0.m93107l(atomicReferenceFieldUpdater2, vf60Var, vf60Var, dnj0Var)) {
                dnj0Var.m39483e(vf60Var);
                break;
            }
        }
        ena0 ena0VarM39484f = vf60Var.m39484f();
        do {
            atomicReferenceFieldUpdater = f59229a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, vf60Var, ena0VarM39484f)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == vf60Var);
    }

    /* JADX INFO: renamed from: s0 */
    public final int m38803s0(Object obj) {
        boolean z = obj instanceof p9u;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59229a;
        if (z) {
            if (((p9u) obj).f175303a) {
                return 0;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i091.f97179g)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            mo38801q0();
            return 1;
        }
        if (!(obj instanceof ql40)) {
            return 0;
        }
        dnj0 dnj0Var = ((ql40) obj).f189733a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, dnj0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        mo38801q0();
        return 1;
    }

    @Override // p204p.tf60
    public final boolean start() {
        int iM38803s0;
        do {
            iM38803s0 = m38803s0(f59229a.get(this));
            if (iM38803s0 == 0) {
                return false;
            }
        } while (iM38803s0 != 1);
        return true;
    }

    @Override // p204p.tf60
    /* JADX INFO: renamed from: t */
    public final boolean mo26606t() {
        return !(f59229a.get(this) instanceof in40);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo30506m0() + '{' + m38775t0(f59229a.get(this)) + '}');
        sb.append('@');
        sb.append(opo.m67556f(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u0 */
    public final Object m38804u0(Object obj, Object obj2) {
        if (!(obj instanceof in40)) {
            return i091.f97173a;
        }
        if (((obj instanceof p9u) || (obj instanceof vf60)) && !(obj instanceof r3e) && !(obj2 instanceof ruf)) {
            in40 in40Var = (in40) obj;
            if (!oq40.m67595n(f59229a, this, in40Var, i091.m49352x(obj2))) {
                return i091.f97175c;
            }
            mo38800p0(obj2);
            m38783V(in40Var, obj2);
            return obj2;
        }
        in40 in40Var2 = (in40) obj;
        dnj0 dnj0VarM38792e0 = m38792e0(in40Var2);
        if (dnj0VarM38792e0 == null) {
            return i091.f97175c;
        }
        zf60 zf60Var = in40Var2 instanceof zf60 ? (zf60) in40Var2 : null;
        if (zf60Var == null) {
            zf60Var = new zf60(dnj0VarM38792e0, null);
        }
        synchronized (zf60Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = zf60.f282240b;
            if (atomicIntegerFieldUpdater.get(zf60Var) == 1) {
                return i091.f97173a;
            }
            atomicIntegerFieldUpdater.set(zf60Var, 1);
            if (zf60Var != in40Var2 && !oq40.m67596o(f59229a, this, in40Var2, zf60Var)) {
                return i091.f97175c;
            }
            boolean zM96002d = zf60Var.m96002d();
            ruf rufVar = obj2 instanceof ruf ? (ruf) obj2 : null;
            if (rufVar != null) {
                zf60Var.m96000a(rufVar.f202838a);
            }
            Throwable thM96001c = zM96002d ? null : zf60Var.m96001c();
            if (thM96001c != null) {
                m38799o0(dnj0VarM38792e0, thM96001c);
            }
            r3e r3eVarM38774n0 = m38774n0(dnj0VarM38792e0);
            if (r3eVarM38774n0 != null && m38805v0(zf60Var, r3eVarM38774n0, obj2)) {
                return i091.f97174b;
            }
            dnj0VarM38792e0.m39481c(new yo80(2), 2);
            r3e r3eVarM38774n1 = m38774n0(dnj0VarM38792e0);
            return (r3eVarM38774n1 == null || !m38805v0(zf60Var, r3eVarM38774n1, obj2)) ? m38785X(zf60Var, obj2) : i091.f97174b;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m38805v0(zf60 zf60Var, r3e r3eVar, Object obj) {
        while (qlg1.m73189E(r3eVar.f195489e, false, new yf60(this, zf60Var, r3eVar, obj)) == unj0.f232184a) {
            r3eVar = m38774n0(r3eVar);
            if (r3eVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p204p.tf60
    /* JADX INFO: renamed from: x */
    public final q3e mo26607x(eg60 eg60Var) {
        r3e r3eVar = new r3e(eg60Var);
        r3eVar.f240905d = this;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59229a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof p9u) {
                p9u p9uVar = (p9u) obj;
                boolean z = p9uVar.f175303a;
                if (!z) {
                    dnj0 dnj0Var = new dnj0();
                    in40 ql40Var = dnj0Var;
                    if (!z) {
                        ql40Var = new ql40(dnj0Var);
                    }
                    oq40.m67594m(atomicReferenceFieldUpdater, this, p9uVar, ql40Var);
                } else if (oq40.m67597p(atomicReferenceFieldUpdater, this, p9uVar, r3eVar)) {
                    break;
                }
            } else {
                boolean z2 = obj instanceof in40;
                unj0 unj0Var = unj0.f232184a;
                Throwable thM96001c = null;
                if (!z2) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    ruf rufVar = obj2 instanceof ruf ? (ruf) obj2 : null;
                    r3eVar.mo25339j(rufVar != null ? rufVar.f202838a : null);
                    return unj0Var;
                }
                dnj0 dnj0VarMo36480b = ((in40) obj).mo36480b();
                if (dnj0VarMo36480b != null) {
                    if (dnj0VarMo36480b.m39481c(r3eVar, 7)) {
                        break;
                    }
                    boolean zM39481c = dnj0VarMo36480b.m39481c(r3eVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof zf60) {
                        thM96001c = ((zf60) obj3).m96001c();
                    } else {
                        ruf rufVar2 = obj3 instanceof ruf ? (ruf) obj3 : null;
                        if (rufVar2 != null) {
                            thM96001c = rufVar2.f202838a;
                        }
                    }
                    r3eVar.mo25339j(thM96001c);
                    if (zM39481c) {
                        break;
                    }
                    return unj0Var;
                }
                m38802r0((vf60) obj);
            }
        }
        return r3eVar;
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: y */
    public final /* bridge */ juk mo26608y(juk jukVar) {
        return mlg1.m62205A(this, jukVar);
    }

    /* JADX INFO: renamed from: q0 */
    public void mo38801q0() {
    }

    /* JADX INFO: renamed from: H */
    public void mo26007H(Object obj) {
    }

    /* JADX INFO: renamed from: g0 */
    public void mo38794g0(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    /* JADX INFO: renamed from: p0 */
    public void mo38800p0(Object obj) {
    }
}
