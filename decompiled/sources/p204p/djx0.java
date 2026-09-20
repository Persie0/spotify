package p204p;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class djx0 extends ck90 {

    /* JADX INFO: renamed from: L0 */
    public final qjx0 f49768L0;

    /* JADX INFO: renamed from: M0 */
    public final AtomicBoolean f49769M0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: N0 */
    public final AtomicBoolean f49770N0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: O0 */
    public final AtomicBoolean f49771O0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: P0 */
    public final juk f49772P0;

    /* JADX INFO: renamed from: Q0 */
    public final n1e1 f49773Q0;

    /* JADX INFO: renamed from: Y */
    public final ljx0 f49774Y;

    /* JADX INFO: renamed from: Z */
    public final ndy f49775Z;

    public djx0(ljx0 ljx0Var, ndy ndyVar, String[] strArr, n1e1 n1e1Var) {
        juk jukVar;
        this.f49774Y = ljx0Var;
        this.f49775Z = ndyVar;
        this.f49768L0 = new qjx0(strArr, this);
        if (ljx0Var.m59188r()) {
            jukVar = ljx0Var.f134165b;
            if (jukVar == null) {
                wj50.m88260d0("transactionContext");
                throw null;
            }
        } else {
            jukVar = dau.f47107a;
        }
        this.f49772P0 = jukVar;
        this.f49773Q0 = n1e1Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8 A[Catch: all -> 0x0031, Exception -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0034, blocks: (B:12:0x0029, B:44:0x00b8), top: B:64:0x0029, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7 A[LOOP:0: B:42:0x00b2->B:48:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x0029, B:42:0x00b2, B:44:0x00b8, B:52:0x00d4, B:49:0x00ca, B:50:0x00d1), top: B:62:0x0023, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00b0 -> B:42:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00df -> B:57:0x00e0). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: n */
    public static final Object m36238n(djx0 djx0Var, ibk ibkVar) {
        rjx0 rjx0Var;
        int i;
        Object obj;
        Object objCall;
        yuk yukVar;
        AtomicBoolean atomicBoolean = djx0Var.f49769M0;
        AtomicBoolean atomicBoolean2 = djx0Var.f49770N0;
        if (ibkVar instanceof rjx0) {
            rjx0Var = (rjx0) ibkVar;
            int i2 = rjx0Var.f199918d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rjx0Var.f199918d = i2 - Integer.MIN_VALUE;
            } else {
                rjx0Var = new rjx0(djx0Var, ibkVar);
            }
        } else {
            rjx0Var = new rjx0(djx0Var, ibkVar);
        }
        Object obj2 = rjx0Var.f199916b;
        int i3 = rjx0Var.f199918d;
        fbk fbkVar = null;
        try {
            if (i3 == 0) {
                bga.m29073P(obj2);
                if (djx0Var.f49771O0.compareAndSet(false, true)) {
                    wl50 wl50VarM59185k = djx0Var.f49774Y.m59185k();
                    xjd1 xjd1Var = new xjd1(wl50VarM59185k, djx0Var.f49768L0);
                    LinkedHashMap linkedHashMap = wl50VarM59185k.f252468c;
                    ck91 ck91Var = wl50VarM59185k.f252467b;
                    pqm0 pqm0VarM33111g = ck91Var.m33111g(xjd1Var.m83352a());
                    String[] strArr = (String[]) pqm0VarM33111g.f180350a;
                    int[] iArr = (int[]) pqm0VarM33111g.f180351b;
                    hqk0 hqk0Var = new hqk0(xjd1Var, iArr, strArr);
                    ReentrantLock reentrantLock = wl50VarM59185k.f252469d;
                    reentrantLock.lock();
                    try {
                        hqk0 hqk0Var2 = linkedHashMap.containsKey(xjd1Var) ? (hqk0) kkc0.m56692e0(xjd1Var, linkedHashMap) : (hqk0) linkedHashMap.put(xjd1Var, hqk0Var);
                        reentrantLock.unlock();
                        if (hqk0Var2 == null && ck91Var.f38898h.m30265a(iArr)) {
                            kif1.m56504m(new cj40(wl50VarM59185k, fbkVar, 3));
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                if (atomicBoolean2.compareAndSet(false, true)) {
                    obj = null;
                    i = 0;
                    while (atomicBoolean.compareAndSet(true, false)) {
                        rjx0Var.f199915a = 1;
                        rjx0Var.f199918d = 1;
                        objCall = djx0Var.f49773Q0.call();
                        yukVar = yuk.f276404a;
                        if (objCall == yukVar) {
                            return yukVar;
                        }
                        obj = objCall;
                        i = 1;
                    }
                    if (i != 0) {
                        djx0Var.m33101j(obj);
                    }
                    atomicBoolean2.set(false);
                } else {
                    i = 0;
                }
                if (i != 0) {
                }
                return w2a1.f247311a;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = rjx0Var.f199915a;
            try {
                bga.m29073P(obj2);
                obj = obj2;
                i = i4;
                while (atomicBoolean.compareAndSet(true, false)) {
                    rjx0Var.f199915a = 1;
                    rjx0Var.f199918d = 1;
                    objCall = djx0Var.f49773Q0.call();
                    yukVar = yuk.f276404a;
                    if (objCall == yukVar) {
                        return yukVar;
                    }
                    obj = objCall;
                    i = 1;
                }
                if (i != 0) {
                    djx0Var.m33101j(obj);
                }
                atomicBoolean2.set(false);
                if (i != 0 || !atomicBoolean.get()) {
                    return w2a1.f247311a;
                }
                if (atomicBoolean2.compareAndSet(false, true)) {
                    obj = null;
                    i = 0;
                    while (atomicBoolean.compareAndSet(true, false)) {
                        rjx0Var.f199915a = 1;
                        rjx0Var.f199918d = 1;
                        objCall = djx0Var.f49773Q0.call();
                        yukVar = yuk.f276404a;
                        if (objCall == yukVar) {
                            return yukVar;
                        }
                        obj = objCall;
                        i = 1;
                    }
                    if (i != 0) {
                        djx0Var.m33101j(obj);
                    }
                    atomicBoolean2.set(false);
                } else {
                    i = 0;
                }
                if (i != 0) {
                }
                return w2a1.f247311a;
            } catch (Exception e) {
                throw new RuntimeException("Exception while computing database live data.", e);
            }
        } catch (Throwable th2) {
            atomicBoolean2.set(false);
            throw th2;
        }
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: h */
    public final void mo15625h() {
        ((Set) this.f49775Z.f152866c).add(this);
        c9k c9kVar = this.f49774Y.f134164a;
        fbk fbkVar = null;
        if (c9kVar == null) {
            wj50.m88260d0("coroutineScope");
            throw null;
        }
        x0h1.m89578u(c9kVar, this.f49772P0, 0, new pjx0(this, fbkVar, 1), 2);
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: i */
    public final void mo15626i() {
        ((Set) this.f49775Z.f152866c).remove(this);
    }
}
